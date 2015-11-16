//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.meetingroom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.Amount;


/**
 * <p>Java class for Revenue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Revenue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalCharges" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="DepositAmount" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="PaidAmount" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="Balance" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="RoomRevenue" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="CateringRevenue" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Revenue", propOrder = {
    "totalCharges",
    "depositAmount",
    "paidAmount",
    "balance",
    "roomRevenue",
    "cateringRevenue"
})
public class Revenue {

    @XmlElement(name = "TotalCharges")
    protected Amount totalCharges;
    @XmlElement(name = "DepositAmount")
    protected Amount depositAmount;
    @XmlElement(name = "PaidAmount")
    protected Amount paidAmount;
    @XmlElement(name = "Balance")
    protected Amount balance;
    @XmlElement(name = "RoomRevenue")
    protected Amount roomRevenue;
    @XmlElement(name = "CateringRevenue")
    protected Amount cateringRevenue;

    /**
     * Gets the value of the totalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTotalCharges() {
        return totalCharges;
    }

    /**
     * Sets the value of the totalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTotalCharges(Amount value) {
        this.totalCharges = value;
    }

    /**
     * Gets the value of the depositAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getDepositAmount() {
        return depositAmount;
    }

    /**
     * Sets the value of the depositAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setDepositAmount(Amount value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the paidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getPaidAmount() {
        return paidAmount;
    }

    /**
     * Sets the value of the paidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setPaidAmount(Amount value) {
        this.paidAmount = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setBalance(Amount value) {
        this.balance = value;
    }

    /**
     * Gets the value of the roomRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getRoomRevenue() {
        return roomRevenue;
    }

    /**
     * Sets the value of the roomRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setRoomRevenue(Amount value) {
        this.roomRevenue = value;
    }

    /**
     * Gets the value of the cateringRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCateringRevenue() {
        return cateringRevenue;
    }

    /**
     * Sets the value of the cateringRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCateringRevenue(Amount value) {
        this.cateringRevenue = value;
    }

}
