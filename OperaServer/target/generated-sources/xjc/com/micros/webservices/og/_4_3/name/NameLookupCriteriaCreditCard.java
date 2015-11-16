//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.name;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameLookupCriteriaCreditCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameLookupCriteriaCreditCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;choice>
 *           &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="LookupVaultedCardData" type="{http://webservices.micros.com/og/4.3/Name/}LookupVaultedCardType"/>
 *         &lt;/choice>
 *         &lt;element name="NativeName" type="{http://webservices.micros.com/og/4.3/Name/}NativeName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameLookupCriteriaCreditCard", propOrder = {
    "lastName",
    "firstName",
    "cardCode",
    "cardNumber",
    "lookupVaultedCardData",
    "nativeName"
})
public class NameLookupCriteriaCreditCard {

    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "CardCode", required = true)
    protected String cardCode;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "LookupVaultedCardData")
    protected LookupVaultedCardType lookupVaultedCardData;
    @XmlElement(name = "NativeName")
    protected NativeName nativeName;

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the cardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * Sets the value of the cardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the lookupVaultedCardData property.
     * 
     * @return
     *     possible object is
     *     {@link LookupVaultedCardType }
     *     
     */
    public LookupVaultedCardType getLookupVaultedCardData() {
        return lookupVaultedCardData;
    }

    /**
     * Sets the value of the lookupVaultedCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupVaultedCardType }
     *     
     */
    public void setLookupVaultedCardData(LookupVaultedCardType value) {
        this.lookupVaultedCardData = value;
    }

    /**
     * Gets the value of the nativeName property.
     * 
     * @return
     *     possible object is
     *     {@link NativeName }
     *     
     */
    public NativeName getNativeName() {
        return nativeName;
    }

    /**
     * Sets the value of the nativeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeName }
     *     
     */
    public void setNativeName(NativeName value) {
        this.nativeName = value;
    }

}
