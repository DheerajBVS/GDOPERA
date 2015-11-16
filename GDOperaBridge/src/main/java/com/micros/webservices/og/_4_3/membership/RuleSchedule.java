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
import com.micros.webservices.og._4_3.common.DescriptiveText;


/**
 * <p>Java class for RuleSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://webservices.micros.com/og/4.3/Common/}DescriptiveText"/>
 *         &lt;element name="PointsSchedule" type="{http://webservices.micros.com/og/4.3/Membership/}PointsSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleSchedule", propOrder = {
    "code",
    "description",
    "pointsSchedule"
})
public class RuleSchedule {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Description", required = true)
    protected DescriptiveText description;
    @XmlElement(name = "PointsSchedule")
    protected PointsSchedule pointsSchedule;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptiveText }
     *     
     */
    public DescriptiveText getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptiveText }
     *     
     */
    public void setDescription(DescriptiveText value) {
        this.description = value;
    }

    /**
     * Gets the value of the pointsSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link PointsSchedule }
     *     
     */
    public PointsSchedule getPointsSchedule() {
        return pointsSchedule;
    }

    /**
     * Sets the value of the pointsSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointsSchedule }
     *     
     */
    public void setPointsSchedule(PointsSchedule value) {
        this.pointsSchedule = value;
    }

}
