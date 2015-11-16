//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:48:57 PM IST 
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
import com.micros.webservices.og._4_3.common.InternalID;
import com.micros.webservices.og._4_3.common.UniqueID;
import com.micros.webservices.og._4_3.hotelcommon.Paragraph;


/**
 * <p>Java class for MenuItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MenuItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MenuItemID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID"/>
 *         &lt;element name="Description" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" minOccurs="0"/>
 *         &lt;element name="Charges" type="{http://webservices.micros.com/og/4.3/MeetingRoom/}CateringRate" minOccurs="0"/>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InternalBookedID" type="{http://webservices.micros.com/og/4.3/Common/}InternalID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name3" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="restriction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="beverage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="priceIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MenuItem", propOrder = {
    "menuItemID",
    "description",
    "charges",
    "eventType",
    "internalBookedID"
})
@XmlSeeAlso({
    com.micros.webservices.og._4_3.meetingroom.MeetingEventBase.MenuItems.class,
    com.micros.webservices.og._4_3.meetingroom.PackageAddon.MenuItems.class
})
public class MenuItem {

    @XmlElement(name = "MenuItemID", required = true)
    protected UniqueID menuItemID;
    @XmlElement(name = "Description")
    protected Paragraph description;
    @XmlElement(name = "Charges")
    protected CateringRate charges;
    @XmlElement(name = "EventType")
    protected List<String> eventType;
    @XmlElement(name = "InternalBookedID")
    protected InternalID internalBookedID;
    @XmlAttribute(name = "name1")
    protected String name1;
    @XmlAttribute(name = "name2")
    protected String name2;
    @XmlAttribute(name = "name3")
    protected String name3;
    @XmlAttribute(name = "restriction")
    protected String restriction;
    @XmlAttribute(name = "beverage")
    protected Boolean beverage;
    @XmlAttribute(name = "priceIncluded")
    protected Boolean priceIncluded;

    /**
     * Gets the value of the menuItemID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getMenuItemID() {
        return menuItemID;
    }

    /**
     * Sets the value of the menuItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setMenuItemID(UniqueID value) {
        this.menuItemID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Paragraph }
     *     
     */
    public Paragraph getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paragraph }
     *     
     */
    public void setDescription(Paragraph value) {
        this.description = value;
    }

    /**
     * Gets the value of the charges property.
     * 
     * @return
     *     possible object is
     *     {@link CateringRate }
     *     
     */
    public CateringRate getCharges() {
        return charges;
    }

    /**
     * Sets the value of the charges property.
     * 
     * @param value
     *     allowed object is
     *     {@link CateringRate }
     *     
     */
    public void setCharges(CateringRate value) {
        this.charges = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEventType() {
        if (eventType == null) {
            eventType = new ArrayList<String>();
        }
        return this.eventType;
    }

    /**
     * Gets the value of the internalBookedID property.
     * 
     * @return
     *     possible object is
     *     {@link InternalID }
     *     
     */
    public InternalID getInternalBookedID() {
        return internalBookedID;
    }

    /**
     * Sets the value of the internalBookedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalID }
     *     
     */
    public void setInternalBookedID(InternalID value) {
        this.internalBookedID = value;
    }

    /**
     * Gets the value of the name1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * Sets the value of the name1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * Gets the value of the name2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * Sets the value of the name2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * Gets the value of the name3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName3() {
        return name3;
    }

    /**
     * Sets the value of the name3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName3(String value) {
        this.name3 = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestriction(String value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the beverage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeverage() {
        return beverage;
    }

    /**
     * Sets the value of the beverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeverage(Boolean value) {
        this.beverage = value;
    }

    /**
     * Gets the value of the priceIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceIncluded() {
        return priceIncluded;
    }

    /**
     * Sets the value of the priceIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceIncluded(Boolean value) {
        this.priceIncluded = value;
    }

}
