//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 10:00:49 AM IST 
//


package com.micros.webservices.og._4_3.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * represents room upgrade on a hotel stay
 * 
 * <p>Java class for UpgradeRoom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpgradeRoom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="awardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromRoomCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toRoomCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pointsRequired" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="pointsAvailable" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeRoom", propOrder = {
    "awardType",
    "fromRoomCategory",
    "toRoomCategory",
    "pointsRequired",
    "pointsAvailable"
})
public class UpgradeRoom {

    @XmlElement(required = true)
    protected String awardType;
    protected String fromRoomCategory;
    @XmlElement(required = true)
    protected String toRoomCategory;
    protected Double pointsRequired;
    protected Double pointsAvailable;

    /**
     * Gets the value of the awardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardType() {
        return awardType;
    }

    /**
     * Sets the value of the awardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardType(String value) {
        this.awardType = value;
    }

    /**
     * Gets the value of the fromRoomCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromRoomCategory() {
        return fromRoomCategory;
    }

    /**
     * Sets the value of the fromRoomCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromRoomCategory(String value) {
        this.fromRoomCategory = value;
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
     * Gets the value of the pointsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPointsRequired() {
        return pointsRequired;
    }

    /**
     * Sets the value of the pointsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPointsRequired(Double value) {
        this.pointsRequired = value;
    }

    /**
     * Gets the value of the pointsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPointsAvailable() {
        return pointsAvailable;
    }

    /**
     * Sets the value of the pointsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPointsAvailable(Double value) {
        this.pointsAvailable = value;
    }

}
