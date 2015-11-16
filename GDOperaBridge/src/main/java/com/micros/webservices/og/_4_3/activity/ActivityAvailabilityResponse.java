//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:38:37 PM IST 
//


package com.micros.webservices.og._4_3.activity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.ResultStatus;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://webservices.micros.com/og/4.3/Common/}ResultStatus"/>
 *         &lt;element name="ActivityAvailabilities" type="{http://webservices.micros.com/og/4.3/Activity/}AvailabilityList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result",
    "activityAvailabilities"
})
@XmlRootElement(name = "ActivityAvailabilityResponse")
public class ActivityAvailabilityResponse {

    @XmlElement(name = "Result", required = true)
    protected ResultStatus result;
    @XmlElement(name = "ActivityAvailabilities")
    protected AvailabilityList activityAvailabilities;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultStatus }
     *     
     */
    public ResultStatus getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStatus }
     *     
     */
    public void setResult(ResultStatus value) {
        this.result = value;
    }

    /**
     * Gets the value of the activityAvailabilities property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityList }
     *     
     */
    public AvailabilityList getActivityAvailabilities() {
        return activityAvailabilities;
    }

    /**
     * Sets the value of the activityAvailabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityList }
     *     
     */
    public void setActivityAvailabilities(AvailabilityList value) {
        this.activityAvailabilities = value;
    }

}