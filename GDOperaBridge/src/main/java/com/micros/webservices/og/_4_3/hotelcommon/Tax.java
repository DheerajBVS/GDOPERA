//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:53:58 PM IST 
//


package com.micros.webservices.og._4_3.hotelcommon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxDescription" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{http://webservices.micros.com/og/4.3/HotelCommon/}FeeTaxType" />
 *       &lt;attribute name="otherType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="taxCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="amount" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax", propOrder = {
    "taxDescription"
})
public class Tax {

    @XmlElement(name = "TaxDescription")
    protected Paragraph taxDescription;
    @XmlAttribute(name = "type")
    protected FeeTaxType type;
    @XmlAttribute(name = "otherType")
    protected String otherType;
    @XmlAttribute(name = "taxCode")
    protected String taxCode;
    @XmlAttribute(name = "amount")
    protected Double amount;
    @XmlAttribute(name = "currencyCode")
    protected String currencyCode;

    /**
     * Gets the value of the taxDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Paragraph }
     *     
     */
    public Paragraph getTaxDescription() {
        return taxDescription;
    }

    /**
     * Sets the value of the taxDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paragraph }
     *     
     */
    public void setTaxDescription(Paragraph value) {
        this.taxDescription = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link FeeTaxType }
     *     
     */
    public FeeTaxType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeTaxType }
     *     
     */
    public void setType(FeeTaxType value) {
        this.type = value;
    }

    /**
     * Gets the value of the otherType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherType() {
        return otherType;
    }

    /**
     * Sets the value of the otherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherType(String value) {
        this.otherType = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmount(Double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

}