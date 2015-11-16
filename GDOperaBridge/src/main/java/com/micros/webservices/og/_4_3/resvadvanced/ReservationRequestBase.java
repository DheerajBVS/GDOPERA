//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 10:00:49 AM IST 
//


package com.micros.webservices.og._4_3.resvadvanced;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.micros.webservices.og._4_3.common.KeyTrack;
import com.micros.webservices.og._4_3.common.UniqueIDList;
import com.micros.webservices.og._4_3.hotelcommon.HotelReference;


/**
 * <p>Java class for ReservationRequestBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationRequestBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelReference" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelReference"/>
 *         &lt;element name="KeyTrack" type="{http://webservices.micros.com/og/4.3/Common/}KeyTrack" minOccurs="0"/>
 *         &lt;element name="ReservationID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueIDList" minOccurs="0"/>
 *         &lt;element name="CheckOutTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationRequestBase", propOrder = {
    "hotelReference",
    "keyTrack",
    "reservationID",
    "checkOutTime"
})
public class ReservationRequestBase {

    @XmlElement(name = "HotelReference", required = true)
    protected HotelReference hotelReference;
    @XmlElement(name = "KeyTrack")
    protected KeyTrack keyTrack;
    @XmlElement(name = "ReservationID")
    protected UniqueIDList reservationID;
    @XmlElement(name = "CheckOutTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar checkOutTime;

    /**
     * Gets the value of the hotelReference property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReference }
     *     
     */
    public HotelReference getHotelReference() {
        return hotelReference;
    }

    /**
     * Sets the value of the hotelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReference }
     *     
     */
    public void setHotelReference(HotelReference value) {
        this.hotelReference = value;
    }

    /**
     * Gets the value of the keyTrack property.
     * 
     * @return
     *     possible object is
     *     {@link KeyTrack }
     *     
     */
    public KeyTrack getKeyTrack() {
        return keyTrack;
    }

    /**
     * Sets the value of the keyTrack property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyTrack }
     *     
     */
    public void setKeyTrack(KeyTrack value) {
        this.keyTrack = value;
    }

    /**
     * Gets the value of the reservationID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDList }
     *     
     */
    public UniqueIDList getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDList }
     *     
     */
    public void setReservationID(UniqueIDList value) {
        this.reservationID = value;
    }

    /**
     * Gets the value of the checkOutTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOutTime() {
        return checkOutTime;
    }

    /**
     * Sets the value of the checkOutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOutTime(XMLGregorianCalendar value) {
        this.checkOutTime = value;
    }

}
