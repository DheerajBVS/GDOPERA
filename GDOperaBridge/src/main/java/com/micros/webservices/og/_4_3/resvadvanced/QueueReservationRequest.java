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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.RequestActionType;


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
 *         &lt;element name="ActionType" type="{http://webservices.micros.com/og/4.3/Common/}RequestActionType"/>
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
    "actionType"
})
@XmlRootElement(name = "QueueReservationRequest")
public class QueueReservationRequest {

    @XmlElement(name = "ReservationRequest", required = true)
    protected ReservationRequestBase reservationRequest;
    @XmlElement(name = "ActionType", required = true)
    @XmlSchemaType(name = "string")
    protected RequestActionType actionType;

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
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestActionType }
     *     
     */
    public RequestActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestActionType }
     *     
     */
    public void setActionType(RequestActionType value) {
        this.actionType = value;
    }

}