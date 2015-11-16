//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:48:57 PM IST 
//


package com.micros.webservices.og._4_3.meetingroom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.Amount;
import com.micros.webservices.og._4_3.hotelcommon.Paragraph;


/**
 * <p>Java class for CateringRateCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CateringRateCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RateDescription" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" minOccurs="0"/>
 *         &lt;element name="Rate" type="{http://webservices.micros.com/og/4.3/MeetingRoom/}CateringRate" minOccurs="0"/>
 *         &lt;element name="MinimumRevenue" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="rateType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="hourlyRate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="participateInMinimumRevenue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CateringRateCode", propOrder = {
    "rateCode",
    "rateDescription",
    "rate",
    "minimumRevenue"
})
public class CateringRateCode {

    @XmlElement(name = "RateCode", required = true)
    protected String rateCode;
    @XmlElement(name = "RateDescription")
    protected Paragraph rateDescription;
    @XmlElement(name = "Rate")
    protected CateringRate rate;
    @XmlElement(name = "MinimumRevenue")
    protected Amount minimumRevenue;
    @XmlAttribute(name = "rateType")
    protected String rateType;
    @XmlAttribute(name = "hourlyRate")
    protected Boolean hourlyRate;
    @XmlAttribute(name = "participateInMinimumRevenue")
    protected Boolean participateInMinimumRevenue;

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the rateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Paragraph }
     *     
     */
    public Paragraph getRateDescription() {
        return rateDescription;
    }

    /**
     * Sets the value of the rateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paragraph }
     *     
     */
    public void setRateDescription(Paragraph value) {
        this.rateDescription = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link CateringRate }
     *     
     */
    public CateringRate getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CateringRate }
     *     
     */
    public void setRate(CateringRate value) {
        this.rate = value;
    }

    /**
     * Gets the value of the minimumRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getMinimumRevenue() {
        return minimumRevenue;
    }

    /**
     * Sets the value of the minimumRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setMinimumRevenue(Amount value) {
        this.minimumRevenue = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateType(String value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the hourlyRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHourlyRate() {
        return hourlyRate;
    }

    /**
     * Sets the value of the hourlyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHourlyRate(Boolean value) {
        this.hourlyRate = value;
    }

    /**
     * Gets the value of the participateInMinimumRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParticipateInMinimumRevenue() {
        return participateInMinimumRevenue;
    }

    /**
     * Sets the value of the participateInMinimumRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParticipateInMinimumRevenue(Boolean value) {
        this.participateInMinimumRevenue = value;
    }

}
