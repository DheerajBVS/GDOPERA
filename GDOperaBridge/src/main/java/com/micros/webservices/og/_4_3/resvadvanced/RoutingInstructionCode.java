//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 10:00:49 AM IST 
//


package com.micros.webservices.og._4_3.resvadvanced;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutingInstructionCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingInstructionCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstructionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TCGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TCSubGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IsTransactionCode" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingInstructionCode", propOrder = {
    "instructionCode",
    "tcGroup",
    "tcSubGroup"
})
public class RoutingInstructionCode {

    @XmlElement(name = "InstructionCode", required = true)
    protected String instructionCode;
    @XmlElement(name = "TCGroup")
    protected String tcGroup;
    @XmlElement(name = "TCSubGroup")
    protected String tcSubGroup;
    @XmlAttribute(name = "IsTransactionCode")
    protected Boolean isTransactionCode;

    /**
     * Gets the value of the instructionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionCode() {
        return instructionCode;
    }

    /**
     * Sets the value of the instructionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionCode(String value) {
        this.instructionCode = value;
    }

    /**
     * Gets the value of the tcGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCGroup() {
        return tcGroup;
    }

    /**
     * Sets the value of the tcGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCGroup(String value) {
        this.tcGroup = value;
    }

    /**
     * Gets the value of the tcSubGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCSubGroup() {
        return tcSubGroup;
    }

    /**
     * Sets the value of the tcSubGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCSubGroup(String value) {
        this.tcSubGroup = value;
    }

    /**
     * Gets the value of the isTransactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTransactionCode() {
        return isTransactionCode;
    }

    /**
     * Sets the value of the isTransactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTransactionCode(Boolean value) {
        this.isTransactionCode = value;
    }

}
