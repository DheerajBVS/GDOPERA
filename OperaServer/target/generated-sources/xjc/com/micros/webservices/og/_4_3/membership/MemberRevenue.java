//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.micros.webservices.og._4_3.common.Amount;


/**
 * <p>Java class for MemberRevenue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberRevenue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="RevenueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevenueTypeLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalRevenueAmount" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="CentralRevenueAmount" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="QualifiedLocalRevenueAmount" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="QualifiedCentralRevenueAmount" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberRevenue", propOrder = {
    "transactionDate",
    "revenueType",
    "revenueTypeLabel",
    "localRevenueAmount",
    "centralRevenueAmount",
    "qualifiedLocalRevenueAmount",
    "qualifiedCentralRevenueAmount"
})
public class MemberRevenue {

    @XmlElement(name = "TransactionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "RevenueType")
    protected String revenueType;
    @XmlElement(name = "RevenueTypeLabel")
    protected String revenueTypeLabel;
    @XmlElement(name = "LocalRevenueAmount")
    protected Amount localRevenueAmount;
    @XmlElement(name = "CentralRevenueAmount")
    protected Amount centralRevenueAmount;
    @XmlElement(name = "QualifiedLocalRevenueAmount")
    protected Amount qualifiedLocalRevenueAmount;
    @XmlElement(name = "QualifiedCentralRevenueAmount")
    protected Amount qualifiedCentralRevenueAmount;

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the revenueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueType() {
        return revenueType;
    }

    /**
     * Sets the value of the revenueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueType(String value) {
        this.revenueType = value;
    }

    /**
     * Gets the value of the revenueTypeLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueTypeLabel() {
        return revenueTypeLabel;
    }

    /**
     * Sets the value of the revenueTypeLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueTypeLabel(String value) {
        this.revenueTypeLabel = value;
    }

    /**
     * Gets the value of the localRevenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getLocalRevenueAmount() {
        return localRevenueAmount;
    }

    /**
     * Sets the value of the localRevenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setLocalRevenueAmount(Amount value) {
        this.localRevenueAmount = value;
    }

    /**
     * Gets the value of the centralRevenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCentralRevenueAmount() {
        return centralRevenueAmount;
    }

    /**
     * Sets the value of the centralRevenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCentralRevenueAmount(Amount value) {
        this.centralRevenueAmount = value;
    }

    /**
     * Gets the value of the qualifiedLocalRevenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getQualifiedLocalRevenueAmount() {
        return qualifiedLocalRevenueAmount;
    }

    /**
     * Sets the value of the qualifiedLocalRevenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setQualifiedLocalRevenueAmount(Amount value) {
        this.qualifiedLocalRevenueAmount = value;
    }

    /**
     * Gets the value of the qualifiedCentralRevenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getQualifiedCentralRevenueAmount() {
        return qualifiedCentralRevenueAmount;
    }

    /**
     * Sets the value of the qualifiedCentralRevenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setQualifiedCentralRevenueAmount(Amount value) {
        this.qualifiedCentralRevenueAmount = value;
    }

}
