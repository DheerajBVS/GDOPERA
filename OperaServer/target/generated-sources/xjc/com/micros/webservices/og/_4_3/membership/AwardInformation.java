//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * represents a award information for requested timespan
 * 
 * <p>Java class for AwardInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AwardInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Resort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AwardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToRoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToRoomTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PointsRequired" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CancelPenaltyDays" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CancelPenaltyCharge" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CancelPenaltyPoints" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardInformation", propOrder = {
    "resort",
    "awardCode",
    "description",
    "beginDate",
    "endDate",
    "product",
    "productDescription",
    "roomType",
    "roomDescription",
    "toRoomType",
    "toRoomTypeDescription",
    "rateCode",
    "rateDescription",
    "pointsRequired",
    "cancelPenaltyDays",
    "cancelPenaltyCharge",
    "cancelPenaltyPoints"
})
public class AwardInformation {

    @XmlElement(name = "Resort")
    protected String resort;
    @XmlElement(name = "AwardCode")
    protected String awardCode;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "BeginDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Product")
    protected String product;
    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "RoomType")
    protected String roomType;
    @XmlElement(name = "RoomDescription")
    protected String roomDescription;
    @XmlElement(name = "ToRoomType")
    protected String toRoomType;
    @XmlElement(name = "ToRoomTypeDescription")
    protected String toRoomTypeDescription;
    @XmlElement(name = "RateCode")
    protected String rateCode;
    @XmlElement(name = "RateDescription")
    protected String rateDescription;
    @XmlElement(name = "PointsRequired")
    protected Double pointsRequired;
    @XmlElement(name = "CancelPenaltyDays")
    protected Double cancelPenaltyDays;
    @XmlElement(name = "CancelPenaltyCharge")
    protected Double cancelPenaltyCharge;
    @XmlElement(name = "CancelPenaltyPoints")
    protected Double cancelPenaltyPoints;

    /**
     * Gets the value of the resort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResort() {
        return resort;
    }

    /**
     * Sets the value of the resort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResort(String value) {
        this.resort = value;
    }

    /**
     * Gets the value of the awardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardCode() {
        return awardCode;
    }

    /**
     * Sets the value of the awardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardCode(String value) {
        this.awardCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the roomDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    /**
     * Sets the value of the roomDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomDescription(String value) {
        this.roomDescription = value;
    }

    /**
     * Gets the value of the toRoomType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRoomType() {
        return toRoomType;
    }

    /**
     * Sets the value of the toRoomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRoomType(String value) {
        this.toRoomType = value;
    }

    /**
     * Gets the value of the toRoomTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRoomTypeDescription() {
        return toRoomTypeDescription;
    }

    /**
     * Sets the value of the toRoomTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRoomTypeDescription(String value) {
        this.toRoomTypeDescription = value;
    }

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
     *     {@link String }
     *     
     */
    public String getRateDescription() {
        return rateDescription;
    }

    /**
     * Sets the value of the rateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateDescription(String value) {
        this.rateDescription = value;
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
     * Gets the value of the cancelPenaltyDays property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCancelPenaltyDays() {
        return cancelPenaltyDays;
    }

    /**
     * Sets the value of the cancelPenaltyDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCancelPenaltyDays(Double value) {
        this.cancelPenaltyDays = value;
    }

    /**
     * Gets the value of the cancelPenaltyCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCancelPenaltyCharge() {
        return cancelPenaltyCharge;
    }

    /**
     * Sets the value of the cancelPenaltyCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCancelPenaltyCharge(Double value) {
        this.cancelPenaltyCharge = value;
    }

    /**
     * Gets the value of the cancelPenaltyPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCancelPenaltyPoints() {
        return cancelPenaltyPoints;
    }

    /**
     * Sets the value of the cancelPenaltyPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCancelPenaltyPoints(Double value) {
        this.cancelPenaltyPoints = value;
    }

}
