//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.housekeeping;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseKeepingRoomStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HouseKeepingRoomStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLEAN"/>
 *     &lt;enumeration value="DIRTY"/>
 *     &lt;enumeration value="OUTOFORDER"/>
 *     &lt;enumeration value="PICKUP"/>
 *     &lt;enumeration value="INSPECTED"/>
 *     &lt;enumeration value="OUTOFSERVICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HouseKeepingRoomStatus")
@XmlEnum
public enum HouseKeepingRoomStatus {

    CLEAN,
    DIRTY,
    OUTOFORDER,
    PICKUP,
    INSPECTED,
    OUTOFSERVICE;

    public String value() {
        return name();
    }

    public static HouseKeepingRoomStatus fromValue(String v) {
        return valueOf(v);
    }

}
