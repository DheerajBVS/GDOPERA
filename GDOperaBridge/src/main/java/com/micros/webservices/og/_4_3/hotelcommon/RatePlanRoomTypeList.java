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
 * <p>Java class for RatePlanRoomTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RatePlanRoomTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatePlanRoomTypes" type="{http://webservices.micros.com/og/4.3/HotelCommon/}RatePlanRoomTypes" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatePlanRoomTypeList", propOrder = {
    "ratePlanRoomTypes"
})
public class RatePlanRoomTypeList {

    @XmlElement(name = "RatePlanRoomTypes", required = true)
    protected List<RatePlanRoomTypes> ratePlanRoomTypes;

    /**
     * Gets the value of the ratePlanRoomTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlanRoomTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlanRoomTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatePlanRoomTypes }
     * 
     * 
     */
    public List<RatePlanRoomTypes> getRatePlanRoomTypes() {
        if (ratePlanRoomTypes == null) {
            ratePlanRoomTypes = new ArrayList<RatePlanRoomTypes>();
        }
        return this.ratePlanRoomTypes;
    }

}
