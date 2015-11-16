//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:48:57 PM IST 
//


package com.micros.webservices.og._4_3.availability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.hotelcommon.ExtendedHotelInfo;
import com.micros.webservices.og._4_3.hotelcommon.HotelContact;
import com.micros.webservices.og._4_3.hotelcommon.HotelReference;


/**
 * <p>Java class for RegionalAvailableProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionalAvailableProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelReference" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelReference"/>
 *         &lt;element name="PropertyStatus" type="{http://webservices.micros.com/og/4.3/Availability/}PropertyStatusCode"/>
 *         &lt;element name="MinMaxRate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://webservices.micros.com/og/4.3/HotelCommon/}MinMaxRate">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="isNegotiatedRateAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NumberToSell" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HotelContact" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelContact" minOccurs="0"/>
 *         &lt;element name="HotelExtendedInformation" type="{http://webservices.micros.com/og/4.3/HotelCommon/}ExtendedHotelInfo" minOccurs="0"/>
 *         &lt;element name="MinimumRate" type="{http://webservices.micros.com/og/4.3/Availability/}MinMaxRateExtended" minOccurs="0"/>
 *         &lt;element name="MaximumRate" type="{http://webservices.micros.com/og/4.3/Availability/}MinMaxRateExtended" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionalAvailableProperty", propOrder = {
    "hotelReference",
    "propertyStatus",
    "minMaxRate",
    "isNegotiatedRateAvailable",
    "numberToSell",
    "hotelContact",
    "hotelExtendedInformation",
    "minimumRate",
    "maximumRate"
})
public class RegionalAvailableProperty {

    @XmlElement(name = "HotelReference", required = true)
    protected HotelReference hotelReference;
    @XmlElement(name = "PropertyStatus", required = true)
    protected PropertyStatusCode propertyStatus;
    @XmlElement(name = "MinMaxRate")
    protected RegionalAvailableProperty.MinMaxRate minMaxRate;
    protected Boolean isNegotiatedRateAvailable;
    @XmlElement(name = "NumberToSell")
    protected Integer numberToSell;
    @XmlElement(name = "HotelContact")
    protected HotelContact hotelContact;
    @XmlElement(name = "HotelExtendedInformation")
    protected ExtendedHotelInfo hotelExtendedInformation;
    @XmlElement(name = "MinimumRate")
    protected MinMaxRateExtended minimumRate;
    @XmlElement(name = "MaximumRate")
    protected MinMaxRateExtended maximumRate;

    /**
     * Gets the value of the hotelReference property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReference }
     *     
     */
    public HotelReference getHotelReference() {
        return hotelReference;
    }

    /**
     * Sets the value of the hotelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReference }
     *     
     */
    public void setHotelReference(HotelReference value) {
        this.hotelReference = value;
    }

    /**
     * Gets the value of the propertyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyStatusCode }
     *     
     */
    public PropertyStatusCode getPropertyStatus() {
        return propertyStatus;
    }

    /**
     * Sets the value of the propertyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyStatusCode }
     *     
     */
    public void setPropertyStatus(PropertyStatusCode value) {
        this.propertyStatus = value;
    }

    /**
     * Gets the value of the minMaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalAvailableProperty.MinMaxRate }
     *     
     */
    public RegionalAvailableProperty.MinMaxRate getMinMaxRate() {
        return minMaxRate;
    }

    /**
     * Sets the value of the minMaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalAvailableProperty.MinMaxRate }
     *     
     */
    public void setMinMaxRate(RegionalAvailableProperty.MinMaxRate value) {
        this.minMaxRate = value;
    }

    /**
     * Gets the value of the isNegotiatedRateAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNegotiatedRateAvailable() {
        return isNegotiatedRateAvailable;
    }

    /**
     * Sets the value of the isNegotiatedRateAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNegotiatedRateAvailable(Boolean value) {
        this.isNegotiatedRateAvailable = value;
    }

    /**
     * Gets the value of the numberToSell property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberToSell() {
        return numberToSell;
    }

    /**
     * Sets the value of the numberToSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberToSell(Integer value) {
        this.numberToSell = value;
    }

    /**
     * Gets the value of the hotelContact property.
     * 
     * @return
     *     possible object is
     *     {@link HotelContact }
     *     
     */
    public HotelContact getHotelContact() {
        return hotelContact;
    }

    /**
     * Sets the value of the hotelContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelContact }
     *     
     */
    public void setHotelContact(HotelContact value) {
        this.hotelContact = value;
    }

    /**
     * Gets the value of the hotelExtendedInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedHotelInfo }
     *     
     */
    public ExtendedHotelInfo getHotelExtendedInformation() {
        return hotelExtendedInformation;
    }

    /**
     * Sets the value of the hotelExtendedInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedHotelInfo }
     *     
     */
    public void setHotelExtendedInformation(ExtendedHotelInfo value) {
        this.hotelExtendedInformation = value;
    }

    /**
     * Gets the value of the minimumRate property.
     * 
     * @return
     *     possible object is
     *     {@link MinMaxRateExtended }
     *     
     */
    public MinMaxRateExtended getMinimumRate() {
        return minimumRate;
    }

    /**
     * Sets the value of the minimumRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinMaxRateExtended }
     *     
     */
    public void setMinimumRate(MinMaxRateExtended value) {
        this.minimumRate = value;
    }

    /**
     * Gets the value of the maximumRate property.
     * 
     * @return
     *     possible object is
     *     {@link MinMaxRateExtended }
     *     
     */
    public MinMaxRateExtended getMaximumRate() {
        return maximumRate;
    }

    /**
     * Sets the value of the maximumRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinMaxRateExtended }
     *     
     */
    public void setMaximumRate(MinMaxRateExtended value) {
        this.maximumRate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://webservices.micros.com/og/4.3/HotelCommon/}MinMaxRate">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MinMaxRate
        extends com.micros.webservices.og._4_3.hotelcommon.MinMaxRate
    {


    }

}
