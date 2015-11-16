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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.hotelcommon.MinMaxRate;
import com.micros.webservices.og._4_3.hotelcommon.Paragraph;


/**
 * <p>Java class for FunctionSpace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionSpace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RoomDescription" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" minOccurs="0"/>
 *         &lt;element name="RateRange" type="{http://webservices.micros.com/og/4.3/HotelCommon/}MinMaxRate" minOccurs="0"/>
 *         &lt;element name="RateDetails" type="{http://webservices.micros.com/og/4.3/MeetingRoom/}CateringRateCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SetupStyles" type="{http://webservices.micros.com/og/4.3/MeetingRoom/}SetupStyle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WebBookable" type="{http://webservices.micros.com/og/4.3/MeetingRoom/}WebBookableType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="locationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="locationDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spaceType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="spaceDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="floor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="floorDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="handicapFacility" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionSpace", propOrder = {
    "room",
    "roomDescription",
    "rateRange",
    "rateDetails",
    "setupStyles",
    "webBookable"
})
@XmlSeeAlso({
    com.micros.webservices.og._4_3.meetingroom.AvailableProperty.FunctionSpace.class
})
public class FunctionSpace {

    @XmlElement(name = "Room", required = true)
    protected String room;
    @XmlElement(name = "RoomDescription")
    protected Paragraph roomDescription;
    @XmlElement(name = "RateRange")
    protected MinMaxRate rateRange;
    @XmlElement(name = "RateDetails")
    protected List<CateringRateCode> rateDetails;
    @XmlElement(name = "SetupStyles")
    protected List<SetupStyle> setupStyles;
    @XmlElement(name = "WebBookable")
    protected WebBookableType webBookable;
    @XmlAttribute(name = "locationType")
    protected String locationType;
    @XmlAttribute(name = "locationDescription")
    protected String locationDescription;
    @XmlAttribute(name = "spaceType")
    protected String spaceType;
    @XmlAttribute(name = "spaceDescription")
    protected String spaceDescription;
    @XmlAttribute(name = "floor")
    protected String floor;
    @XmlAttribute(name = "floorDescription")
    protected String floorDescription;
    @XmlAttribute(name = "shortDescription")
    protected String shortDescription;
    @XmlAttribute(name = "handicapFacility")
    protected Boolean handicapFacility;

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
    }

    /**
     * Gets the value of the roomDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Paragraph }
     *     
     */
    public Paragraph getRoomDescription() {
        return roomDescription;
    }

    /**
     * Sets the value of the roomDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paragraph }
     *     
     */
    public void setRoomDescription(Paragraph value) {
        this.roomDescription = value;
    }

    /**
     * Gets the value of the rateRange property.
     * 
     * @return
     *     possible object is
     *     {@link MinMaxRate }
     *     
     */
    public MinMaxRate getRateRange() {
        return rateRange;
    }

    /**
     * Sets the value of the rateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinMaxRate }
     *     
     */
    public void setRateRange(MinMaxRate value) {
        this.rateRange = value;
    }

    /**
     * Gets the value of the rateDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CateringRateCode }
     * 
     * 
     */
    public List<CateringRateCode> getRateDetails() {
        if (rateDetails == null) {
            rateDetails = new ArrayList<CateringRateCode>();
        }
        return this.rateDetails;
    }

    /**
     * Gets the value of the setupStyles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setupStyles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetupStyles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetupStyle }
     * 
     * 
     */
    public List<SetupStyle> getSetupStyles() {
        if (setupStyles == null) {
            setupStyles = new ArrayList<SetupStyle>();
        }
        return this.setupStyles;
    }

    /**
     * Gets the value of the webBookable property.
     * 
     * @return
     *     possible object is
     *     {@link WebBookableType }
     *     
     */
    public WebBookableType getWebBookable() {
        return webBookable;
    }

    /**
     * Sets the value of the webBookable property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebBookableType }
     *     
     */
    public void setWebBookable(WebBookableType value) {
        this.webBookable = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDescription(String value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the spaceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpaceType() {
        return spaceType;
    }

    /**
     * Sets the value of the spaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpaceType(String value) {
        this.spaceType = value;
    }

    /**
     * Gets the value of the spaceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpaceDescription() {
        return spaceDescription;
    }

    /**
     * Sets the value of the spaceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpaceDescription(String value) {
        this.spaceDescription = value;
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
     * Gets the value of the floorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorDescription() {
        return floorDescription;
    }

    /**
     * Sets the value of the floorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorDescription(String value) {
        this.floorDescription = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the handicapFacility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHandicapFacility() {
        return handicapFacility;
    }

    /**
     * Sets the value of the handicapFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandicapFacility(Boolean value) {
        this.handicapFacility = value;
    }

}
