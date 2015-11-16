//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.resvadvanced;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.Amount;
import com.micros.webservices.og._4_3.hotelcommon.DailyChargeList;


/**
 * <p>Java class for ExpectedCharges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpectedCharges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalCharges" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="CurrentBalance" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="DailyCharges" type="{http://webservices.micros.com/og/4.3/HotelCommon/}DailyChargeList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedCharges", propOrder = {
    "totalCharges",
    "currentBalance",
    "dailyCharges"
})
public class ExpectedCharges {

    @XmlElement(name = "TotalCharges")
    protected Amount totalCharges;
    @XmlElement(name = "CurrentBalance")
    protected Amount currentBalance;
    @XmlElement(name = "DailyCharges")
    protected DailyChargeList dailyCharges;

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
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCurrentBalance(Amount value) {
        this.currentBalance = value;
    }

    /**
     * Gets the value of the dailyCharges property.
     * 
     * @return
     *     possible object is
     *     {@link DailyChargeList }
     *     
     */
    public DailyChargeList getDailyCharges() {
        return dailyCharges;
    }

    /**
     * Sets the value of the dailyCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyChargeList }
     *     
     */
    public void setDailyCharges(DailyChargeList value) {
        this.dailyCharges = value;
    }

}
