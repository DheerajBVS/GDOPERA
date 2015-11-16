//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * represents the breakdown of points
 * 
 * <p>Java class for Points complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Points">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *       &lt;attribute name="basePoints" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="bonusPoints" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="miscPoints" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Points", propOrder = {
    "value"
})
public class Points {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "basePoints")
    protected Double basePoints;
    @XmlAttribute(name = "bonusPoints")
    protected Double bonusPoints;
    @XmlAttribute(name = "miscPoints")
    protected Double miscPoints;

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the basePoints property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBasePoints() {
        return basePoints;
    }

    /**
     * Sets the value of the basePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBasePoints(Double value) {
        this.basePoints = value;
    }

    /**
     * Gets the value of the bonusPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBonusPoints() {
        return bonusPoints;
    }

    /**
     * Sets the value of the bonusPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBonusPoints(Double value) {
        this.bonusPoints = value;
    }

    /**
     * Gets the value of the miscPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMiscPoints() {
        return miscPoints;
    }

    /**
     * Sets the value of the miscPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMiscPoints(Double value) {
        this.miscPoints = value;
    }

}
