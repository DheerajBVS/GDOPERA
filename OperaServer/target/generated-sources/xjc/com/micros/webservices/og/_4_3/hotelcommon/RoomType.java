//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.hotelcommon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RoomType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomTypeDescription" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" minOccurs="0"/>
 *         &lt;element name="RoomTypeShortDescription" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" minOccurs="0"/>
 *         &lt;element name="RoomNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoomToChargeDescription" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" minOccurs="0"/>
 *         &lt;element name="RoomToChargeShortDescription" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" minOccurs="0"/>
 *         &lt;element name="AmenityInfo" type="{http://webservices.micros.com/og/4.3/HotelCommon/}AmenityInfo" minOccurs="0"/>
 *         &lt;element name="RoomFeatures" type="{http://webservices.micros.com/og/4.3/HotelCommon/}RoomFeatureList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="roomTypeCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="roomClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="feature" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="upgradeFromCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="invBlockCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberOfUnits" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="isRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="roomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="roomToChargeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="roomToChargeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="roomStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pseudoRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="roomServiceStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minimumRoomsAvailable" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomType", propOrder = {
    "roomTypeDescription",
    "roomTypeShortDescription",
    "roomNumber",
    "roomToChargeDescription",
    "roomToChargeShortDescription",
    "amenityInfo",
    "roomFeatures"
})
public class RoomType {

    @XmlElement(name = "RoomTypeDescription")
    protected Paragraph roomTypeDescription;
    @XmlElement(name = "RoomTypeShortDescription")
    protected Paragraph roomTypeShortDescription;
    @XmlElement(name = "RoomNumber")
    protected List<String> roomNumber;
    @XmlElement(name = "RoomToChargeDescription")
    protected Paragraph roomToChargeDescription;
    @XmlElement(name = "RoomToChargeShortDescription")
    protected Paragraph roomToChargeShortDescription;
    @XmlElement(name = "AmenityInfo")
    protected AmenityInfo amenityInfo;
    @XmlElement(name = "RoomFeatures")
    protected RoomFeatureList roomFeatures;
    @XmlAttribute(name = "roomTypeCode", required = true)
    protected String roomTypeCode;
    @XmlAttribute(name = "roomClass")
    protected String roomClass;
    @XmlAttribute(name = "feature")
    protected String feature;
    @XmlAttribute(name = "upgradeFromCode")
    protected String upgradeFromCode;
    @XmlAttribute(name = "invBlockCode")
    protected String invBlockCode;
    @XmlAttribute(name = "numberOfUnits")
    protected Integer numberOfUnits;
    @XmlAttribute(name = "isRoom")
    protected Boolean isRoom;
    @XmlAttribute(name = "effectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "expirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlAttribute(name = "roomTypeName")
    protected String roomTypeName;
    @XmlAttribute(name = "roomToChargeCode")
    protected String roomToChargeCode;
    @XmlAttribute(name = "roomToChargeName")
    protected String roomToChargeName;
    @XmlAttribute(name = "roomStatus")
    protected String roomStatus;
    @XmlAttribute(name = "pseudoRoom")
    protected Boolean pseudoRoom;
    @XmlAttribute(name = "roomServiceStatus")
    protected String roomServiceStatus;
    @XmlAttribute(name = "minimumRoomsAvailable")
    protected Integer minimumRoomsAvailable;

    /**
     * Gets the value of the roomTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Paragraph }
     *     
     */
    public Paragraph getRoomTypeDescription() {
        return roomTypeDescription;
    }

    /**
     * Sets the value of the roomTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paragraph }
     *     
     */
    public void setRoomTypeDescription(Paragraph value) {
        this.roomTypeDescription = value;
    }

    /**
     * Gets the value of the roomTypeShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Paragraph }
     *     
     */
    public Paragraph getRoomTypeShortDescription() {
        return roomTypeShortDescription;
    }

    /**
     * Sets the value of the roomTypeShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paragraph }
     *     
     */
    public void setRoomTypeShortDescription(Paragraph value) {
        this.roomTypeShortDescription = value;
    }

    /**
     * Gets the value of the roomNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoomNumber() {
        if (roomNumber == null) {
            roomNumber = new ArrayList<String>();
        }
        return this.roomNumber;
    }

    /**
     * Gets the value of the roomToChargeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Paragraph }
     *     
     */
    public Paragraph getRoomToChargeDescription() {
        return roomToChargeDescription;
    }

    /**
     * Sets the value of the roomToChargeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paragraph }
     *     
     */
    public void setRoomToChargeDescription(Paragraph value) {
        this.roomToChargeDescription = value;
    }

    /**
     * Gets the value of the roomToChargeShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Paragraph }
     *     
     */
    public Paragraph getRoomToChargeShortDescription() {
        return roomToChargeShortDescription;
    }

    /**
     * Sets the value of the roomToChargeShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paragraph }
     *     
     */
    public void setRoomToChargeShortDescription(Paragraph value) {
        this.roomToChargeShortDescription = value;
    }

    /**
     * Gets the value of the amenityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AmenityInfo }
     *     
     */
    public AmenityInfo getAmenityInfo() {
        return amenityInfo;
    }

    /**
     * Sets the value of the amenityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmenityInfo }
     *     
     */
    public void setAmenityInfo(AmenityInfo value) {
        this.amenityInfo = value;
    }

    /**
     * Gets the value of the roomFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link RoomFeatureList }
     *     
     */
    public RoomFeatureList getRoomFeatures() {
        return roomFeatures;
    }

    /**
     * Sets the value of the roomFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomFeatureList }
     *     
     */
    public void setRoomFeatures(RoomFeatureList value) {
        this.roomFeatures = value;
    }

    /**
     * Gets the value of the roomTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    /**
     * Sets the value of the roomTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeCode(String value) {
        this.roomTypeCode = value;
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
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature(String value) {
        this.feature = value;
    }

    /**
     * Gets the value of the upgradeFromCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeFromCode() {
        return upgradeFromCode;
    }

    /**
     * Sets the value of the upgradeFromCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeFromCode(String value) {
        this.upgradeFromCode = value;
    }

    /**
     * Gets the value of the invBlockCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvBlockCode() {
        return invBlockCode;
    }

    /**
     * Sets the value of the invBlockCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvBlockCode(String value) {
        this.invBlockCode = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfUnits(Integer value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the isRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRoom() {
        return isRoom;
    }

    /**
     * Sets the value of the isRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRoom(Boolean value) {
        this.isRoom = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the roomTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeName() {
        return roomTypeName;
    }

    /**
     * Sets the value of the roomTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeName(String value) {
        this.roomTypeName = value;
    }

    /**
     * Gets the value of the roomToChargeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomToChargeCode() {
        return roomToChargeCode;
    }

    /**
     * Sets the value of the roomToChargeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomToChargeCode(String value) {
        this.roomToChargeCode = value;
    }

    /**
     * Gets the value of the roomToChargeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomToChargeName() {
        return roomToChargeName;
    }

    /**
     * Sets the value of the roomToChargeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomToChargeName(String value) {
        this.roomToChargeName = value;
    }

    /**
     * Gets the value of the roomStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomStatus() {
        return roomStatus;
    }

    /**
     * Sets the value of the roomStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomStatus(String value) {
        this.roomStatus = value;
    }

    /**
     * Gets the value of the pseudoRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPseudoRoom() {
        return pseudoRoom;
    }

    /**
     * Sets the value of the pseudoRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPseudoRoom(Boolean value) {
        this.pseudoRoom = value;
    }

    /**
     * Gets the value of the roomServiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomServiceStatus() {
        return roomServiceStatus;
    }

    /**
     * Sets the value of the roomServiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomServiceStatus(String value) {
        this.roomServiceStatus = value;
    }

    /**
     * Gets the value of the minimumRoomsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumRoomsAvailable() {
        return minimumRoomsAvailable;
    }

    /**
     * Sets the value of the minimumRoomsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumRoomsAvailable(Integer value) {
        this.minimumRoomsAvailable = value;
    }

}
