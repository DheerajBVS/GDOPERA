//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:48:57 PM IST 
//


package com.micros.webservices.og._4_3.availability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateCodeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateCodeInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ratePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ratePlanIndicator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="corporateCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ratePlanStatusCode" type="{http://webservices.micros.com/og/4.3/Availability/}StatusCodeIndicator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateCodeInformation")
public class RateCodeInformation {

    @XmlAttribute(name = "ratePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "ratePlanIndicator")
    protected String ratePlanIndicator;
    @XmlAttribute(name = "corporateCode")
    protected String corporateCode;
    @XmlAttribute(name = "ratePlanStatusCode")
    protected StatusCodeIndicator ratePlanStatusCode;

    /**
     * Gets the value of the ratePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * Sets the value of the ratePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * Gets the value of the ratePlanIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanIndicator() {
        return ratePlanIndicator;
    }

    /**
     * Sets the value of the ratePlanIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanIndicator(String value) {
        this.ratePlanIndicator = value;
    }

    /**
     * Gets the value of the corporateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateCode() {
        return corporateCode;
    }

    /**
     * Sets the value of the corporateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateCode(String value) {
        this.corporateCode = value;
    }

    /**
     * Gets the value of the ratePlanStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeIndicator }
     *     
     */
    public StatusCodeIndicator getRatePlanStatusCode() {
        return ratePlanStatusCode;
    }

    /**
     * Sets the value of the ratePlanStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeIndicator }
     *     
     */
    public void setRatePlanStatusCode(StatusCodeIndicator value) {
        this.ratePlanStatusCode = value;
    }

}