//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:47:43 PM IST 
//


package com.micros.webservices.og._4_3.housekeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TurnDownStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TurnDownStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TurnDownRequired" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TurnDownNotRequired" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TurnDownCompleted" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TurnDownStatus", propOrder = {
    "turnDownRequired",
    "turnDownNotRequired",
    "turnDownCompleted"
})
public class TurnDownStatus {

    @XmlElement(name = "TurnDownRequired")
    protected Integer turnDownRequired;
    @XmlElement(name = "TurnDownNotRequired")
    protected Integer turnDownNotRequired;
    @XmlElement(name = "TurnDownCompleted")
    protected Integer turnDownCompleted;

    /**
     * Gets the value of the turnDownRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTurnDownRequired() {
        return turnDownRequired;
    }

    /**
     * Sets the value of the turnDownRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTurnDownRequired(Integer value) {
        this.turnDownRequired = value;
    }

    /**
     * Gets the value of the turnDownNotRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTurnDownNotRequired() {
        return turnDownNotRequired;
    }

    /**
     * Sets the value of the turnDownNotRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTurnDownNotRequired(Integer value) {
        this.turnDownNotRequired = value;
    }

    /**
     * Gets the value of the turnDownCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTurnDownCompleted() {
        return turnDownCompleted;
    }

    /**
     * Sets the value of the turnDownCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTurnDownCompleted(Integer value) {
        this.turnDownCompleted = value;
    }

}