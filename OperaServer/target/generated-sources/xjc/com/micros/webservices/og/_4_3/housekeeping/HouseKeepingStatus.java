//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.housekeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.hotelcommon.RoomFeatureList;


/**
 * <p>Java class for HouseKeepingStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseKeepingStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomStatus" type="{http://webservices.micros.com/og/4.3/HouseKeeping/}HouseKeepingRoomStatus" minOccurs="0"/>
 *         &lt;element name="FOStatus" type="{http://webservices.micros.com/og/4.3/HouseKeeping/}HouseKeepingFOStatus" minOccurs="0"/>
 *         &lt;element name="ReservationStatus" type="{http://webservices.micros.com/og/4.3/HouseKeeping/}HouseKeepingReservationStatus" minOccurs="0"/>
 *         &lt;element name="RoomClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Section" type="{http://webservices.micros.com/og/4.3/HouseKeeping/}HouseKeepingSection" minOccurs="0"/>
 *         &lt;element name="Features" type="{http://webservices.micros.com/og/4.3/HotelCommon/}RoomFeatureList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseKeepingStatus", propOrder = {
    "roomNo",
    "roomType",
    "roomStatus",
    "foStatus",
    "reservationStatus",
    "roomClass",
    "floor",
    "section",
    "features"
})
public class HouseKeepingStatus {

    @XmlElement(name = "RoomNo")
    protected String roomNo;
    @XmlElement(name = "RoomType")
    protected String roomType;
    @XmlElement(name = "RoomStatus")
    protected HouseKeepingRoomStatus roomStatus;
    @XmlElement(name = "FOStatus")
    protected HouseKeepingFOStatus foStatus;
    @XmlElement(name = "ReservationStatus")
    protected HouseKeepingReservationStatus reservationStatus;
    @XmlElement(name = "RoomClass")
    protected String roomClass;
    @XmlElement(name = "Floor")
    protected String floor;
    @XmlElement(name = "Section")
    protected HouseKeepingSection section;
    @XmlElement(name = "Features")
    protected RoomFeatureList features;

    /**
     * Gets the value of the roomNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * Sets the value of the roomNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNo(String value) {
        this.roomNo = value;
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
     * Gets the value of the roomStatus property.
     * 
     * @return
     *     possible object is
     *     {@link HouseKeepingRoomStatus }
     *     
     */
    public HouseKeepingRoomStatus getRoomStatus() {
        return roomStatus;
    }

    /**
     * Sets the value of the roomStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseKeepingRoomStatus }
     *     
     */
    public void setRoomStatus(HouseKeepingRoomStatus value) {
        this.roomStatus = value;
    }

    /**
     * Gets the value of the foStatus property.
     * 
     * @return
     *     possible object is
     *     {@link HouseKeepingFOStatus }
     *     
     */
    public HouseKeepingFOStatus getFOStatus() {
        return foStatus;
    }

    /**
     * Sets the value of the foStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseKeepingFOStatus }
     *     
     */
    public void setFOStatus(HouseKeepingFOStatus value) {
        this.foStatus = value;
    }

    /**
     * Gets the value of the reservationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link HouseKeepingReservationStatus }
     *     
     */
    public HouseKeepingReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    /**
     * Sets the value of the reservationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseKeepingReservationStatus }
     *     
     */
    public void setReservationStatus(HouseKeepingReservationStatus value) {
        this.reservationStatus = value;
    }

    /**
     * Gets the value of the roomClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomClass() {
        return roomClass;
    }

    /**
     * Sets the value of the roomClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomClass(String value) {
        this.roomClass = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link HouseKeepingSection }
     *     
     */
    public HouseKeepingSection getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseKeepingSection }
     *     
     */
    public void setSection(HouseKeepingSection value) {
        this.section = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link RoomFeatureList }
     *     
     */
    public RoomFeatureList getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomFeatureList }
     *     
     */
    public void setFeatures(RoomFeatureList value) {
        this.features = value;
    }

}
