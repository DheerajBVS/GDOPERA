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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RequiredPointsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredPointsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PointsBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PointsEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PointsRequired" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RuleSchedule" type="{http://webservices.micros.com/og/4.3/Membership/}RuleSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredPointsInfo", propOrder = {
    "pointsBeginDate",
    "pointsEndDate",
    "pointsRequired",
    "ruleSchedule"
})
public class RequiredPointsInfo {

    @XmlElement(name = "PointsBeginDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pointsBeginDate;
    @XmlElement(name = "PointsEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pointsEndDate;
    @XmlElement(name = "PointsRequired")
    protected Double pointsRequired;
    @XmlElement(name = "RuleSchedule")
    protected RuleSchedule ruleSchedule;

    /**
     * Gets the value of the pointsBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPointsBeginDate() {
        return pointsBeginDate;
    }

    /**
     * Sets the value of the pointsBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPointsBeginDate(XMLGregorianCalendar value) {
        this.pointsBeginDate = value;
    }

    /**
     * Gets the value of the pointsEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPointsEndDate() {
        return pointsEndDate;
    }

    /**
     * Sets the value of the pointsEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPointsEndDate(XMLGregorianCalendar value) {
        this.pointsEndDate = value;
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
     * Gets the value of the ruleSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link RuleSchedule }
     *     
     */
    public RuleSchedule getRuleSchedule() {
        return ruleSchedule;
    }

    /**
     * Sets the value of the ruleSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleSchedule }
     *     
     */
    public void setRuleSchedule(RuleSchedule value) {
        this.ruleSchedule = value;
    }

}
