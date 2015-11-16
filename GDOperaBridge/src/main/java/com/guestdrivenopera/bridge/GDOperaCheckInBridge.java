package com.guestdrivenopera.bridge;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.gd.gdpojo.CheckInCompl;
import com.gd.gdpojo.CheckInReq;
import com.gd.gdpojo.CheckInResp;
import com.gd.gdpojo.GDKeyTrack;
import com.gd.gdpojo.Result;
import com.micros.webservices.og._4_3.common.KeyTrack;
import com.micros.webservices.og._4_3.core.EndPoint;
import com.micros.webservices.og._4_3.core.OGHeader;
import com.micros.webservices.og._4_3.hotelcommon.HotelReference;
import com.micros.webservices.og._4_3.resvadvanced.CheckInRequest;
import com.micros.webservices.og._4_3.resvadvanced.ReservationRequestBase;

/**
 * Bridges the GuestDriven and the Opera PMS by transforming the GD specific
 * request to Opera specific request and Opera specific response to GD Specific
 * response
 * 
 * @author Dheeraj
 */

public class GDOperaCheckInBridge {
	CheckInRequest check;
	HotelReference hotelRef;
	ReservationRequestBase reservReq;
	KeyTrack keyTrack;
	JAXBContext jaxbContext;
	Marshaller jaxbMarshaller;
	OGHeader oHead;
	EndPoint origin, destination;
	OGHeader.Authentication authentication;
	OGHeader.Authentication.UserCredentials userCredentials;
	StringWriter sw;
	String soapString;
	SOAPMessage request;
	MessageFactory factory;
	SOAPMessage soapMsg;
	SOAPPart part;
	SOAPEnvelope envelope;
	SOAPBody body;
	SOAPHeader header;
	SOAPMessage soapResponse;
	CheckInResp checkInResp;

	// Method for Construction, call to the method that dispatches the SOAP
	// Message to the server and returns GD Specific Response
	public CheckInResp checkInSoapCall(CheckInReq checkInReq, String pmsUrl) {
		// Instantiating objects which are part of SOAP Header
		oHead = new OGHeader();
		origin = new EndPoint();
		destination = new EndPoint();
		authentication = new OGHeader.Authentication();
		userCredentials = new OGHeader.Authentication.UserCredentials();

		// Instantiating objects which are part of SOAP Body
		check = new CheckInRequest();
		hotelRef = new HotelReference();
		reservReq = new ReservationRequestBase();
		keyTrack = new KeyTrack();

		// Initializing objects which are part of SOAP Header
		origin.setEntityID("AA");
		origin.setSystemType("GDS");
		destination.setEntityID("TI");
		destination.setSystemType("ORS");
		userCredentials.setUserName("guestdrivenuser");
		userCredentials.setUserPassword("guestdrivenpassword");
		userCredentials.setDomain("guestdrivendomain");
		authentication.setUserCredentials(userCredentials);
		oHead.setOrigin(origin);
		oHead.setDestination(destination);
		oHead.setAuthentication(authentication);

		// Initializing objects which are part of SOAP Body
		hotelRef.setHotelCode(checkInReq.getReservationRequest()
				.getHotelReference().getHotelCode());
		keyTrack.setKey1Track(checkInReq.getReservationRequest().getKeyTrack()
				.getKeyTrack1());
		reservReq.setHotelReference(hotelRef);
		reservReq.setKeyTrack(keyTrack);
		check.setReservationRequest(reservReq);

		try {

			// Constructing SOAP Message
			factory = MessageFactory.newInstance();
			soapMsg = factory.createMessage();
			part = soapMsg.getSOAPPart();
			envelope = part.getEnvelope();
			body = envelope.getBody();
			header = envelope.getHeader();
			envelope.setAttribute("xmlns:soap",
					"http://schemas.xmlsoap.org/soap/envelope/");
			envelope.setAttribute("xmlns:xsi",
					"http://www.w3.org/2001/XMLSchema-instance");
			envelope.setAttribute("xmlns:xsd",
					"http://www.w3.org/2001/XMLSchema");
			jaxbContext = JAXBContext.newInstance(CheckInRequest.class);
			jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(check, body);
			jaxbContext = JAXBContext.newInstance(OGHeader.class);
			jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(oHead, header);
			soapMsg.saveChanges();

			// Sending SOAP Message to the server
			soapResponse = sendSoapRequest(soapMsg, pmsUrl);

			// Transforming Opera SOAP Response to GD Specific Response
			checkInResp = transformSoapResponse(soapResponse);
		} catch (SOAPException | JAXBException e) {

			e.printStackTrace();
		}

		return checkInResp;
	}

	// Method that transforms SOAP Response to GD Specific Response
	public CheckInResp transformSoapResponse(SOAPMessage response) {
		GDKeyTrack gdKeyTrack = new GDKeyTrack();
		CheckInCompl checkInCompl = new CheckInCompl();
		Result result = new Result();
		CheckInResp checkInResp = new CheckInResp();
		try {
			NodeList keyTrackList = response
					.getSOAPBody()
					.getElementsByTagNameNS(
							"http://webservices.micros.com/og/4.3/ResvAdvanced/",
							"KeyTrack");
			Node key1Track = keyTrackList.item(0).getAttributes()
					.getNamedItem("Key1Track");
			if (keyTrackList != null) {
				if (key1Track != null) {
					gdKeyTrack.setKeyTrack1(key1Track.getNodeValue());
					checkInCompl.setKeyTrack(gdKeyTrack);
				}
			}

			NodeList resultList = response
					.getSOAPBody()
					.getElementsByTagNameNS(
							"http://webservices.micros.com/og/4.3/ResvAdvanced/",
							"Result");
			if (resultList != null) {
				Node result1 = resultList.item(0).getAttributes()
						.getNamedItem("resultStatusFlag");
				if (result1 != null) {
					Result res = new Result();
					res.setResultStatusFlag(result1.getNodeValue());
				}
				checkInResp.setCheckInComplete(checkInCompl);
				checkInResp.setResult(result);
			}
		} catch (SOAPException e) {
			e.printStackTrace();
		}
		return checkInResp;
	}

	// Method that sends SOAP Request to server
	public SOAPMessage sendSoapRequest(SOAPMessage request, String pmsUrl) {
		try {
			// Create SOAP Connection
			SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory
					.newInstance();
			SOAPConnection soapConnection = soapConnectionFactory
					.createConnection();

			// Send SOAP Message to SOAP Server
			String url = pmsUrl; // "http://localhost:8080/ows/resvadv/resvadvanced.wsdl";
			soapResponse = soapConnection.call(request, url);

			// Closing SOAP Connection
			soapConnection.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return soapResponse;
	}

}
