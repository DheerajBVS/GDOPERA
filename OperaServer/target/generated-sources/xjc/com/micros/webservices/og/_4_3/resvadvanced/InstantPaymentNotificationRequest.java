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
 *         &lt;element name="MessageLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "messageLine",
    "isValid"
})
@XmlRootElement(name = "InstantPaymentNotificationRequest")
public class InstantPaymentNotificationRequest {

    @XmlElement(name = "MessageLine", required = true)
    protected String messageLine;
    @XmlElement(name = "IsValid")
    protected boolean isValid;

    /**
     * Gets the value of the messageLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageLine() {
        return messageLine;
    }

    /**
     * Sets the value of the messageLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageLine(String value) {
        this.messageLine = value;
    }

    /**
     * Gets the value of the isValid property.
     * 
     */
    public boolean isIsValid() {
        return isValid;
    }

    /**
     * Sets the value of the isValid property.
     * 
     */
    public void setIsValid(boolean value) {
        this.isValid = value;
    }

}
