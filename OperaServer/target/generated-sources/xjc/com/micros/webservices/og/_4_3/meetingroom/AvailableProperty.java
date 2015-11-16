//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.meetingroom;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.availability.PropertyStatusCode;
import com.micros.webservices.og._4_3.hotelcommon.ExtendedHotelInfo;
import com.micros.webservices.og._4_3.hotelcommon.HotelContact;
import com.micros.webservices.og._4_3.hotelcommon.HotelReference;


/**
 * <p>Java class for AvailableProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailableProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelReference" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelReference"/>
 *         &lt;element name="PropertyStatus" type="{http://webservices.micros.com/og/4.3/Availability/}PropertyStatusCode" minOccurs="0"/>
 *         &lt;element name="FunctionSpace" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://webservices.micros.com/og/4.3/MeetingRoom/}FunctionSpace">
 *                 &lt;attribute name="avaliablityString" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelContact" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelContact" minOccurs="0"/>
 *         &lt;element name="HotelExtendedInformation" type="{http://webservices.micros.com/og/4.3/HotelCommon/}ExtendedHotelInfo" minOccurs="0"/>
 *         &lt;element name="MarketingText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="propertyType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableProperty", propOrder = {
    "hotelReference",
    "propertyStatus",
    "functionSpace",
    "hotelContact",
    "hotelExtendedInformation",
    "marketingText"
})
public class AvailableProperty {

    @XmlElement(name = "HotelReference", required = true)
    protected HotelReference hotelReference;
    @XmlElement(name = "PropertyStatus")
    protected PropertyStatusCode propertyStatus;
    @XmlElement(name = "FunctionSpace")
    protected List<AvailableProperty.FunctionSpace> functionSpace;
    @XmlElement(name = "HotelContact")
    protected HotelContact hotelContact;
    @XmlElement(name = "HotelExtendedInformation")
    protected ExtendedHotelInfo hotelExtendedInformation;
    @XmlElement(name = "MarketingText")
    protected String marketingText;
    @XmlAttribute(name = "propertyType")
    protected String propertyType;

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
     * Gets the value of the functionSpace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionSpace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionSpace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailableProperty.FunctionSpace }
     * 
     * 
     */
    public List<AvailableProperty.FunctionSpace> getFunctionSpace() {
        if (functionSpace == null) {
            functionSpace = new ArrayList<AvailableProperty.FunctionSpace>();
        }
        return this.functionSpace;
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
     * Gets the value of the marketingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingText() {
        return marketingText;
    }

    /**
     * Sets the value of the marketingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingText(String value) {
        this.marketingText = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyType(String value) {
        this.propertyType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://webservices.micros.com/og/4.3/MeetingRoom/}FunctionSpace">
     *       &lt;attribute name="avaliablityString" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FunctionSpace
        extends com.micros.webservices.og._4_3.meetingroom.FunctionSpace
    {

        @XmlAttribute(name = "avaliablityString")
        protected String avaliablityString;

        /**
         * Gets the value of the avaliablityString property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvaliablityString() {
            return avaliablityString;
        }

        /**
         * Sets the value of the avaliablityString property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvaliablityString(String value) {
            this.avaliablityString = value;
        }

    }

}
