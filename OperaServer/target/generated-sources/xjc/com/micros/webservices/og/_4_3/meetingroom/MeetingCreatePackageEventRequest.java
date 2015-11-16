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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.hotelcommon.CreditCardPayment;


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
 *         &lt;element name="PackageEvent" type="{http://webservices.micros.com/og/4.3/MeetingRoom/}PackageEvent"/>
 *         &lt;element name="CreditCard" type="{http://webservices.micros.com/og/4.3/HotelCommon/}CreditCardPayment" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="bookAsInquiry" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="onSiteContact" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="depositOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "packageEvent",
    "creditCard"
})
@XmlRootElement(name = "MeetingCreatePackageEventRequest")
public class MeetingCreatePackageEventRequest {

    @XmlElement(name = "PackageEvent", required = true)
    protected PackageEvent packageEvent;
    @XmlElement(name = "CreditCard")
    protected CreditCardPayment creditCard;
    @XmlAttribute(name = "bookAsInquiry")
    protected Boolean bookAsInquiry;
    @XmlAttribute(name = "onSiteContact")
    protected String onSiteContact;
    @XmlAttribute(name = "depositOnly")
    protected Boolean depositOnly;

    /**
     * Gets the value of the packageEvent property.
     * 
     * @return
     *     possible object is
     *     {@link PackageEvent }
     *     
     */
    public PackageEvent getPackageEvent() {
        return packageEvent;
    }

    /**
     * Sets the value of the packageEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageEvent }
     *     
     */
    public void setPackageEvent(PackageEvent value) {
        this.packageEvent = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardPayment }
     *     
     */
    public CreditCardPayment getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardPayment }
     *     
     */
    public void setCreditCard(CreditCardPayment value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the bookAsInquiry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBookAsInquiry() {
        return bookAsInquiry;
    }

    /**
     * Sets the value of the bookAsInquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBookAsInquiry(Boolean value) {
        this.bookAsInquiry = value;
    }

    /**
     * Gets the value of the onSiteContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnSiteContact() {
        return onSiteContact;
    }

    /**
     * Sets the value of the onSiteContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnSiteContact(String value) {
        this.onSiteContact = value;
    }

    /**
     * Gets the value of the depositOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepositOnly() {
        return depositOnly;
    }

    /**
     * Sets the value of the depositOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepositOnly(Boolean value) {
        this.depositOnly = value;
    }

}