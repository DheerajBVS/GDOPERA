//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.resvadvanced;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.hotelcommon.CancelTerm;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationRequest" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}ReservationRequestBase"/>
 *         &lt;element name="Printer" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}Printer" minOccurs="0"/>
 *         &lt;element name="CancelTerm" type="{http://webservices.micros.com/og/4.3/HotelCommon/}CancelTerm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservationRequest",
    "printer",
    "cancelTerm"
})
@XmlRootElement(name = "CancelCheckInRequest")
public class CancelCheckInRequest {

    @XmlElement(name = "ReservationRequest", required = true)
    protected ReservationRequestBase reservationRequest;
    @XmlElement(name = "Printer")
    protected Printer printer;
    @XmlElement(name = "CancelTerm")
    protected CancelTerm cancelTerm;

    /**
     * Gets the value of the reservationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationRequestBase }
     *     
     */
    public ReservationRequestBase getReservationRequest() {
        return reservationRequest;
    }

    /**
     * Sets the value of the reservationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationRequestBase }
     *     
     */
    public void setReservationRequest(ReservationRequestBase value) {
        this.reservationRequest = value;
    }

    /**
     * Gets the value of the printer property.
     * 
     * @return
     *     possible object is
     *     {@link Printer }
     *     
     */
    public Printer getPrinter() {
        return printer;
    }

    /**
     * Sets the value of the printer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Printer }
     *     
     */
    public void setPrinter(Printer value) {
        this.printer = value;
    }

    /**
     * Gets the value of the cancelTerm property.
     * 
     * @return
     *     possible object is
     *     {@link CancelTerm }
     *     
     */
    public CancelTerm getCancelTerm() {
        return cancelTerm;
    }

    /**
     * Sets the value of the cancelTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelTerm }
     *     
     */
    public void setCancelTerm(CancelTerm value) {
        this.cancelTerm = value;
    }

}
