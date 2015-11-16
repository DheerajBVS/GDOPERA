//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.Amount;


/**
 * represents room upsell on a hotel stay
 * 
 * <p>Java class for UpsellRoom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpsellRoom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstAmount" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="UpsellOfferId" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ToRateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToRoomCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToRoomName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ToDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpsellAmount" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="UpsellTotalAmount" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="UpsellRankingOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MembershipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MembershipLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpsellRoom", propOrder = {
    "roomCategory",
    "firstAmount",
    "totalAmount",
    "upsellOfferId",
    "toRateCode",
    "toRoomCategory",
    "toRoomName",
    "toDescription",
    "toShortDescription",
    "upsellAmount",
    "upsellTotalAmount",
    "upsellRankingOrder",
    "membershipType",
    "membershipLevel"
})
public class UpsellRoom {

    @XmlElement(name = "RoomCategory", required = true)
    protected String roomCategory;
    @XmlElement(name = "FirstAmount")
    protected Amount firstAmount;
    @XmlElement(name = "TotalAmount")
    protected Amount totalAmount;
    @XmlElement(name = "UpsellOfferId")
    protected Double upsellOfferId;
    @XmlElement(name = "ToRateCode")
    protected String toRateCode;
    @XmlElement(name = "ToRoomCategory", required = true)
    protected String toRoomCategory;
    @XmlElement(name = "ToRoomName", required = true)
    protected String toRoomName;
    @XmlElement(name = "ToDescription")
    protected String toDescription;
    @XmlElement(name = "ToShortDescription")
    protected String toShortDescription;
    @XmlElement(name = "UpsellAmount")
    protected Amount upsellAmount;
    @XmlElement(name = "UpsellTotalAmount")
    protected Amount upsellTotalAmount;
    @XmlElement(name = "UpsellRankingOrder")
    protected Integer upsellRankingOrder;
    @XmlElement(name = "MembershipType")
    protected String membershipType;
    @XmlElement(name = "MembershipLevel")
    protected String membershipLevel;

    /**
     * Gets the value of the roomCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomCategory() {
        return roomCategory;
    }

    /**
     * Sets the value of the roomCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomCategory(String value) {
        this.roomCategory = value;
    }

    /**
     * Gets the value of the firstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getFirstAmount() {
        return firstAmount;
    }

    /**
     * Sets the value of the firstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setFirstAmount(Amount value) {
        this.firstAmount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTotalAmount(Amount value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the upsellOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUpsellOfferId() {
        return upsellOfferId;
    }

    /**
     * Sets the value of the upsellOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUpsellOfferId(Double value) {
        this.upsellOfferId = value;
    }

    /**
     * Gets the value of the toRateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRateCode() {
        return toRateCode;
    }

    /**
     * Sets the value of the toRateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRateCode(String value) {
        this.toRateCode = value;
    }

    /**
     * Gets the value of the toRoomCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRoomCategory() {
        return toRoomCategory;
    }

    /**
     * Sets the value of the toRoomCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRoomCategory(String value) {
        this.toRoomCategory = value;
    }

    /**
     * Gets the value of the toRoomName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRoomName() {
        return toRoomName;
    }

    /**
     * Sets the value of the toRoomName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRoomName(String value) {
        this.toRoomName = value;
    }

    /**
     * Gets the value of the toDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToDescription() {
        return toDescription;
    }

    /**
     * Sets the value of the toDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDescription(String value) {
        this.toDescription = value;
    }

    /**
     * Gets the value of the toShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToShortDescription() {
        return toShortDescription;
    }

    /**
     * Sets the value of the toShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToShortDescription(String value) {
        this.toShortDescription = value;
    }

    /**
     * Gets the value of the upsellAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getUpsellAmount() {
        return upsellAmount;
    }

    /**
     * Sets the value of the upsellAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setUpsellAmount(Amount value) {
        this.upsellAmount = value;
    }

    /**
     * Gets the value of the upsellTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getUpsellTotalAmount() {
        return upsellTotalAmount;
    }

    /**
     * Sets the value of the upsellTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setUpsellTotalAmount(Amount value) {
        this.upsellTotalAmount = value;
    }

    /**
     * Gets the value of the upsellRankingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUpsellRankingOrder() {
        return upsellRankingOrder;
    }

    /**
     * Sets the value of the upsellRankingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUpsellRankingOrder(Integer value) {
        this.upsellRankingOrder = value;
    }

    /**
     * Gets the value of the membershipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * Sets the value of the membershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipType(String value) {
        this.membershipType = value;
    }

    /**
     * Gets the value of the membershipLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipLevel() {
        return membershipLevel;
    }

    /**
     * Sets the value of the membershipLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipLevel(String value) {
        this.membershipLevel = value;
    }

}
