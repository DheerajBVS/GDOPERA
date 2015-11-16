//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 10:00:49 AM IST 
//


package com.micros.webservices.og._4_3.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TierPointsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TierPointsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseStayPoints" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaseNightsPoints" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaseRevenuePoints" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BonusStayPoints" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BonusNightsPoints" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BonusRevenuePoints" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NextTierPoints" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaseStayPointsRange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaseNightsPointsRange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BaseRevenuePointsRange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BonusStayPointsRange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BonusNightsPointsRange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BonusRevenuePointsRange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TierPointsInfo", propOrder = {
    "baseStayPoints",
    "baseNightsPoints",
    "baseRevenuePoints",
    "bonusStayPoints",
    "bonusNightsPoints",
    "bonusRevenuePoints",
    "nextTierPoints",
    "baseStayPointsRange",
    "baseNightsPointsRange",
    "baseRevenuePointsRange",
    "bonusStayPointsRange",
    "bonusNightsPointsRange",
    "bonusRevenuePointsRange"
})
public class TierPointsInfo {

    @XmlElement(name = "BaseStayPoints")
    protected Double baseStayPoints;
    @XmlElement(name = "BaseNightsPoints")
    protected Double baseNightsPoints;
    @XmlElement(name = "BaseRevenuePoints")
    protected Double baseRevenuePoints;
    @XmlElement(name = "BonusStayPoints")
    protected Double bonusStayPoints;
    @XmlElement(name = "BonusNightsPoints")
    protected Double bonusNightsPoints;
    @XmlElement(name = "BonusRevenuePoints")
    protected Double bonusRevenuePoints;
    @XmlElement(name = "NextTierPoints")
    protected Double nextTierPoints;
    @XmlElement(name = "BaseStayPointsRange")
    protected Double baseStayPointsRange;
    @XmlElement(name = "BaseNightsPointsRange")
    protected Double baseNightsPointsRange;
    @XmlElement(name = "BaseRevenuePointsRange")
    protected Double baseRevenuePointsRange;
    @XmlElement(name = "BonusStayPointsRange")
    protected Double bonusStayPointsRange;
    @XmlElement(name = "BonusNightsPointsRange")
    protected Double bonusNightsPointsRange;
    @XmlElement(name = "BonusRevenuePointsRange")
    protected Double bonusRevenuePointsRange;

    /**
     * Gets the value of the baseStayPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseStayPoints() {
        return baseStayPoints;
    }

    /**
     * Sets the value of the baseStayPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseStayPoints(Double value) {
        this.baseStayPoints = value;
    }

    /**
     * Gets the value of the baseNightsPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseNightsPoints() {
        return baseNightsPoints;
    }

    /**
     * Sets the value of the baseNightsPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseNightsPoints(Double value) {
        this.baseNightsPoints = value;
    }

    /**
     * Gets the value of the baseRevenuePoints property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseRevenuePoints() {
        return baseRevenuePoints;
    }

    /**
     * Sets the value of the baseRevenuePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseRevenuePoints(Double value) {
        this.baseRevenuePoints = value;
    }

    /**
     * Gets the value of the bonusStayPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBonusStayPoints() {
        return bonusStayPoints;
    }

    /**
     * Sets the value of the bonusStayPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBonusStayPoints(Double value) {
        this.bonusStayPoints = value;
    }

    /**
     * Gets the value of the bonusNightsPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBonusNightsPoints() {
        return bonusNightsPoints;
    }

    /**
     * Sets the value of the bonusNightsPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBonusNightsPoints(Double value) {
        this.bonusNightsPoints = value;
    }

    /**
     * Gets the value of the bonusRevenuePoints property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBonusRevenuePoints() {
        return bonusRevenuePoints;
    }

    /**
     * Sets the value of the bonusRevenuePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBonusRevenuePoints(Double value) {
        this.bonusRevenuePoints = value;
    }

    /**
     * Gets the value of the nextTierPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNextTierPoints() {
        return nextTierPoints;
    }

    /**
     * Sets the value of the nextTierPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNextTierPoints(Double value) {
        this.nextTierPoints = value;
    }

    /**
     * Gets the value of the baseStayPointsRange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseStayPointsRange() {
        return baseStayPointsRange;
    }

    /**
     * Sets the value of the baseStayPointsRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseStayPointsRange(Double value) {
        this.baseStayPointsRange = value;
    }

    /**
     * Gets the value of the baseNightsPointsRange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseNightsPointsRange() {
        return baseNightsPointsRange;
    }

    /**
     * Sets the value of the baseNightsPointsRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseNightsPointsRange(Double value) {
        this.baseNightsPointsRange = value;
    }

    /**
     * Gets the value of the baseRevenuePointsRange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseRevenuePointsRange() {
        return baseRevenuePointsRange;
    }

    /**
     * Sets the value of the baseRevenuePointsRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseRevenuePointsRange(Double value) {
        this.baseRevenuePointsRange = value;
    }

    /**
     * Gets the value of the bonusStayPointsRange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBonusStayPointsRange() {
        return bonusStayPointsRange;
    }

    /**
     * Sets the value of the bonusStayPointsRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBonusStayPointsRange(Double value) {
        this.bonusStayPointsRange = value;
    }

    /**
     * Gets the value of the bonusNightsPointsRange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBonusNightsPointsRange() {
        return bonusNightsPointsRange;
    }

    /**
     * Sets the value of the bonusNightsPointsRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBonusNightsPointsRange(Double value) {
        this.bonusNightsPointsRange = value;
    }

    /**
     * Gets the value of the bonusRevenuePointsRange property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBonusRevenuePointsRange() {
        return bonusRevenuePointsRange;
    }

    /**
     * Sets the value of the bonusRevenuePointsRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBonusRevenuePointsRange(Double value) {
        this.bonusRevenuePointsRange = value;
    }

}