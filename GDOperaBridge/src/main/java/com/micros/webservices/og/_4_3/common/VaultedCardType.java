//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:53:58 PM IST 
//


package com.micros.webservices.og._4_3.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VaultedCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VaultedCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="vaultedCardID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastFourDigits" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VaultedCardType")
public class VaultedCardType {

    @XmlAttribute(name = "vaultedCardID", required = true)
    protected String vaultedCardID;
    @XmlAttribute(name = "lastFourDigits", required = true)
    protected String lastFourDigits;

    /**
     * Gets the value of the vaultedCardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVaultedCardID() {
        return vaultedCardID;
    }

    /**
     * Sets the value of the vaultedCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVaultedCardID(String value) {
        this.vaultedCardID = value;
    }

    /**
     * Gets the value of the lastFourDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastFourDigits() {
        return lastFourDigits;
    }

    /**
     * Sets the value of the lastFourDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastFourDigits(String value) {
        this.lastFourDigits = value;
    }

}
