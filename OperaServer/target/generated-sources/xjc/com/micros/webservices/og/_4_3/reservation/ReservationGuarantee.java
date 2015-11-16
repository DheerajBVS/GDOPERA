//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.CreditCard;
import com.micros.webservices.og._4_3.hotelcommon.Paragraph;


/**
 * <p>Java class for ReservationGuarantee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationGuarantee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuaranteeInfo" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" minOccurs="0"/>
 *         &lt;element name="GuaranteeCreditCard" type="{http://webservices.micros.com/og/4.3/Common/}CreditCard" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="guaranteeType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationGuarantee", propOrder = {
    "guaranteeInfo",
    "guaranteeCreditCard"
})
public class ReservationGuarantee {

    @XmlElement(name = "GuaranteeInfo")
    protected Paragraph guaranteeInfo;
    @XmlElement(name = "GuaranteeCreditCard")
    protected CreditCard guaranteeCreditCard;
    @XmlAttribute(name = "guaranteeType", required = true)
    protected String guaranteeType;

    /**
     * Gets the value of the guaranteeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Paragraph }
     *     
     */
    public Paragraph getGuaranteeInfo() {
        return guaranteeInfo;
    }

    /**
     * Sets the value of the guaranteeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paragraph }
     *     
     */
    public void setGuaranteeInfo(Paragraph value) {
        this.guaranteeInfo = value;
    }

    /**
     * Gets the value of the guaranteeCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getGuaranteeCreditCard() {
        return guaranteeCreditCard;
    }

    /**
     * Sets the value of the guaranteeCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setGuaranteeCreditCard(CreditCard value) {
        this.guaranteeCreditCard = value;
    }

    /**
     * Gets the value of the guaranteeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeType() {
        return guaranteeType;
    }

    /**
     * Sets the value of the guaranteeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeType(String value) {
        this.guaranteeType = value;
    }

}
