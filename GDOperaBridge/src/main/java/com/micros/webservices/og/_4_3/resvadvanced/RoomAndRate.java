//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 10:00:49 AM IST 
//


package com.micros.webservices.og._4_3.resvadvanced;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.hotelcommon.Rate;
import com.micros.webservices.og._4_3.hotelcommon.RatePlan;
import com.micros.webservices.og._4_3.hotelcommon.RoomType;


/**
 * <p>Java class for RoomAndRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomAndRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePlan" type="{http://webservices.micros.com/og/4.3/HotelCommon/}RatePlan" minOccurs="0"/>
 *         &lt;element name="RoomType" type="{http://webservices.micros.com/og/4.3/HotelCommon/}RoomType" minOccurs="0"/>
 *         &lt;element name="Rate" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Rate" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomAndRate", propOrder = {
    "ratePlan",
    "roomType",
    "rate"
})
public class RoomAndRate {

    @XmlElement(name = "RatePlan")
    protected RatePlan ratePlan;
    @XmlElement(name = "RoomType")
    protected RoomType roomType;
    @XmlElement(name = "Rate")
    protected Rate rate;
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * Gets the value of the ratePlan property.
     * 
     * @return
     *     possible object is
     *     {@link RatePlan }
     *     
     */
    public RatePlan getRatePlan() {
        return ratePlan;
    }

    /**
     * Sets the value of the ratePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePlan }
     *     
     */
    public void setRatePlan(RatePlan value) {
        this.ratePlan = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link RoomType }
     *     
     */
    public RoomType getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomType }
     *     
     */
    public void setRoomType(RoomType value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setRate(Rate value) {
        this.rate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
