//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 10:00:49 AM IST 
//


package com.micros.webservices.og._4_3.resvadvanced;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutingInstructionCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingInstructionCodes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoutingInstructionCode" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}RoutingInstructionCode" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingInstructionCodes", propOrder = {
    "routingInstructionCode"
})
public class RoutingInstructionCodes {

    @XmlElement(name = "RoutingInstructionCode", required = true)
    protected List<RoutingInstructionCode> routingInstructionCode;

    /**
     * Gets the value of the routingInstructionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingInstructionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingInstructionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingInstructionCode }
     * 
     * 
     */
    public List<RoutingInstructionCode> getRoutingInstructionCode() {
        if (routingInstructionCode == null) {
            routingInstructionCode = new ArrayList<RoutingInstructionCode>();
        }
        return this.routingInstructionCode;
    }

}