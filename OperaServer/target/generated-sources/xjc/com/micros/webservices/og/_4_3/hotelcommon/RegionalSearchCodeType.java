//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.hotelcommon;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionalSearchCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegionalSearchCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CITY"/>
 *     &lt;enumeration value="CHAIN"/>
 *     &lt;enumeration value="CRO"/>
 *     &lt;enumeration value="REGION"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="AIRPORT"/>
 *     &lt;enumeration value="ATTRACTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegionalSearchCodeType")
@XmlEnum
public enum RegionalSearchCodeType {

    CITY,
    CHAIN,
    CRO,
    REGION,
    OTHER,
    AIRPORT,
    ATTRACTION;

    public String value() {
        return name();
    }

    public static RegionalSearchCodeType fromValue(String v) {
        return valueOf(v);
    }

}