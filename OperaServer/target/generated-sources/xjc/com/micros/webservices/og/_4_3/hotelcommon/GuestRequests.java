//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.hotelcommon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GuestRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comments" type="{http://webservices.micros.com/og/4.3/HotelCommon/}ReservationCommentList" minOccurs="0"/>
 *         &lt;element name="Specials" type="{http://webservices.micros.com/og/4.3/HotelCommon/}SpecialRequestList" minOccurs="0"/>
 *         &lt;element name="Traces" type="{http://webservices.micros.com/og/4.3/HotelCommon/}ReservationTracesList" minOccurs="0"/>
 *         &lt;element name="Features" type="{http://webservices.micros.com/og/4.3/HotelCommon/}RoomFeatureList" minOccurs="0"/>
 *         &lt;element name="Alerts" type="{http://webservices.micros.com/og/4.3/HotelCommon/}ReservationAlertList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRequests", propOrder = {
    "comments",
    "specials",
    "traces",
    "features",
    "alerts"
})
public class GuestRequests {

    @XmlElement(name = "Comments")
    protected ReservationCommentList comments;
    @XmlElement(name = "Specials")
    protected SpecialRequestList specials;
    @XmlElement(name = "Traces")
    protected ReservationTracesList traces;
    @XmlElement(name = "Features")
    protected RoomFeatureList features;
    @XmlElement(name = "Alerts")
    protected ReservationAlertList alerts;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationCommentList }
     *     
     */
    public ReservationCommentList getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationCommentList }
     *     
     */
    public void setComments(ReservationCommentList value) {
        this.comments = value;
    }

    /**
     * Gets the value of the specials property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequestList }
     *     
     */
    public SpecialRequestList getSpecials() {
        return specials;
    }

    /**
     * Sets the value of the specials property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequestList }
     *     
     */
    public void setSpecials(SpecialRequestList value) {
        this.specials = value;
    }

    /**
     * Gets the value of the traces property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationTracesList }
     *     
     */
    public ReservationTracesList getTraces() {
        return traces;
    }

    /**
     * Sets the value of the traces property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationTracesList }
     *     
     */
    public void setTraces(ReservationTracesList value) {
        this.traces = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link RoomFeatureList }
     *     
     */
    public RoomFeatureList getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomFeatureList }
     *     
     */
    public void setFeatures(RoomFeatureList value) {
        this.features = value;
    }

    /**
     * Gets the value of the alerts property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationAlertList }
     *     
     */
    public ReservationAlertList getAlerts() {
        return alerts;
    }

    /**
     * Sets the value of the alerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationAlertList }
     *     
     */
    public void setAlerts(ReservationAlertList value) {
        this.alerts = value;
    }

}
