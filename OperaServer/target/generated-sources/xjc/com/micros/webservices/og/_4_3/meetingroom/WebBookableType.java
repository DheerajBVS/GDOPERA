//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.meetingroom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WebBookableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebBookableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="isWebBookable" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="marketingText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebBookableType")
public class WebBookableType {

    @XmlAttribute(name = "isWebBookable", required = true)
    protected boolean isWebBookable;
    @XmlAttribute(name = "marketingText")
    protected String marketingText;

    /**
     * Gets the value of the isWebBookable property.
     * 
     */
    public boolean isIsWebBookable() {
        return isWebBookable;
    }

    /**
     * Sets the value of the isWebBookable property.
     * 
     */
    public void setIsWebBookable(boolean value) {
        this.isWebBookable = value;
    }

    /**
     * Gets the value of the marketingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingText() {
        return marketingText;
    }

    /**
     * Sets the value of the marketingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingText(String value) {
        this.marketingText = value;
    }

}