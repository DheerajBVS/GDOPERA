//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:53:58 PM IST 
//


package com.micros.webservices.og._4_3.hotelcommon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides detailed information regarding attractions.
 * 
 * <p>Java class for AttractionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttractionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attraction" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AttractionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AttractionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AttractionInformation" type="{http://webservices.micros.com/og/4.3/HotelCommon/}AttractionInfoList" minOccurs="0"/>
 *                   &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="DistanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DrivingTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="HoursOfOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;element name="PriceRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttractionsType", propOrder = {
    "attraction"
})
public class AttractionsType {

    @XmlElement(name = "Attraction")
    protected List<AttractionsType.Attraction> attraction;

    /**
     * Gets the value of the attraction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attraction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttraction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttractionsType.Attraction }
     * 
     * 
     */
    public List<AttractionsType.Attraction> getAttraction() {
        if (attraction == null) {
            attraction = new ArrayList<AttractionsType.Attraction>();
        }
        return this.attraction;
    }


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
     *         &lt;element name="AttractionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AttractionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AttractionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AttractionInformation" type="{http://webservices.micros.com/og/4.3/HotelCommon/}AttractionInfoList" minOccurs="0"/>
     *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="DistanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DrivingTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="HoursOfOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *         &lt;element name="PriceRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "attractionCode",
        "attractionName",
        "attractionType",
        "attractionInformation",
        "distance",
        "distanceType",
        "drivingTime",
        "city",
        "state",
        "zipCode",
        "hoursOfOperation",
        "latitude",
        "longitude",
        "priceRange",
        "displaySequence"
    })
    public static class Attraction {

        @XmlElement(name = "AttractionCode")
        protected String attractionCode;
        @XmlElement(name = "AttractionName")
        protected String attractionName;
        @XmlElement(name = "AttractionType")
        protected String attractionType;
        @XmlElement(name = "AttractionInformation")
        protected AttractionInfoList attractionInformation;
        @XmlElement(name = "Distance")
        protected Double distance;
        @XmlElement(name = "DistanceType")
        protected String distanceType;
        @XmlElement(name = "DrivingTime")
        protected String drivingTime;
        @XmlElement(name = "City")
        protected String city;
        @XmlElement(name = "State")
        protected String state;
        @XmlElement(name = "ZipCode")
        protected String zipCode;
        @XmlElement(name = "HoursOfOperation")
        protected String hoursOfOperation;
        @XmlElement(name = "Latitude")
        protected Double latitude;
        @XmlElement(name = "Longitude")
        protected Double longitude;
        @XmlElement(name = "PriceRange")
        protected String priceRange;
        @XmlElement(name = "DisplaySequence")
        protected Integer displaySequence;

        /**
         * Gets the value of the attractionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttractionCode() {
            return attractionCode;
        }

        /**
         * Sets the value of the attractionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttractionCode(String value) {
            this.attractionCode = value;
        }

        /**
         * Gets the value of the attractionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttractionName() {
            return attractionName;
        }

        /**
         * Sets the value of the attractionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttractionName(String value) {
            this.attractionName = value;
        }

        /**
         * Gets the value of the attractionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttractionType() {
            return attractionType;
        }

        /**
         * Sets the value of the attractionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttractionType(String value) {
            this.attractionType = value;
        }

        /**
         * Gets the value of the attractionInformation property.
         * 
         * @return
         *     possible object is
         *     {@link AttractionInfoList }
         *     
         */
        public AttractionInfoList getAttractionInformation() {
            return attractionInformation;
        }

        /**
         * Sets the value of the attractionInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttractionInfoList }
         *     
         */
        public void setAttractionInformation(AttractionInfoList value) {
            this.attractionInformation = value;
        }

        /**
         * Gets the value of the distance property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getDistance() {
            return distance;
        }

        /**
         * Sets the value of the distance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setDistance(Double value) {
            this.distance = value;
        }

        /**
         * Gets the value of the distanceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceType() {
            return distanceType;
        }

        /**
         * Sets the value of the distanceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceType(String value) {
            this.distanceType = value;
        }

        /**
         * Gets the value of the drivingTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDrivingTime() {
            return drivingTime;
        }

        /**
         * Sets the value of the drivingTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDrivingTime(String value) {
            this.drivingTime = value;
        }

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
        }

        /**
         * Gets the value of the zipCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZipCode() {
            return zipCode;
        }

        /**
         * Sets the value of the zipCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZipCode(String value) {
            this.zipCode = value;
        }

        /**
         * Gets the value of the hoursOfOperation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHoursOfOperation() {
            return hoursOfOperation;
        }

        /**
         * Sets the value of the hoursOfOperation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHoursOfOperation(String value) {
            this.hoursOfOperation = value;
        }

        /**
         * Gets the value of the latitude property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getLatitude() {
            return latitude;
        }

        /**
         * Sets the value of the latitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setLatitude(Double value) {
            this.latitude = value;
        }

        /**
         * Gets the value of the longitude property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getLongitude() {
            return longitude;
        }

        /**
         * Sets the value of the longitude property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setLongitude(Double value) {
            this.longitude = value;
        }

        /**
         * Gets the value of the priceRange property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceRange() {
            return priceRange;
        }

        /**
         * Sets the value of the priceRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceRange(String value) {
            this.priceRange = value;
        }

        /**
         * Gets the value of the displaySequence property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDisplaySequence() {
            return displaySequence;
        }

        /**
         * Sets the value of the displaySequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDisplaySequence(Integer value) {
            this.displaySequence = value;
        }

    }

}
