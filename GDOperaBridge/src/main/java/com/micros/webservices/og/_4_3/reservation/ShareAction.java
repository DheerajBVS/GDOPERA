//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 10:00:49 AM IST 
//


package com.micros.webservices.og._4_3.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShareAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShareAllocation" type="{http://webservices.micros.com/og/4.3/Reservation/}SharerType" minOccurs="0"/>
 *         &lt;element name="ActionType" type="{http://webservices.micros.com/og/4.3/Reservation/}ShareActionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareAction", propOrder = {
    "shareAllocation",
    "actionType"
})
public class ShareAction {

    @XmlElement(name = "ShareAllocation")
    @XmlSchemaType(name = "string")
    protected SharerType shareAllocation;
    @XmlElement(name = "ActionType")
    @XmlSchemaType(name = "string")
    protected ShareActionType actionType;

    /**
     * Gets the value of the shareAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link SharerType }
     *     
     */
    public SharerType getShareAllocation() {
        return shareAllocation;
    }

    /**
     * Sets the value of the shareAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharerType }
     *     
     */
    public void setShareAllocation(SharerType value) {
        this.shareAllocation = value;
    }

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link ShareActionType }
     *     
     */
    public ShareActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareActionType }
     *     
     */
    public void setActionType(ShareActionType value) {
        this.actionType = value;
    }

}
