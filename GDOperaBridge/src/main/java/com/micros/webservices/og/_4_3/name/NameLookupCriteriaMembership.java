//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:53:58 PM IST 
//


package com.micros.webservices.og._4_3.name;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameLookupCriteriaMembership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameLookupCriteriaMembership">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MembershipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MembershipNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NativeName" type="{http://webservices.micros.com/og/4.3/Name/}NativeName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameLookupCriteriaMembership", propOrder = {
    "lastName",
    "firstName",
    "membershipType",
    "membershipNumber",
    "nativeName"
})
public class NameLookupCriteriaMembership {

    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MembershipType")
    protected String membershipType;
    @XmlElement(name = "MembershipNumber")
    protected String membershipNumber;
    @XmlElement(name = "NativeName")
    protected NativeName nativeName;

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the membershipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * Sets the value of the membershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipType(String value) {
        this.membershipType = value;
    }

    /**
     * Gets the value of the membershipNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipNumber() {
        return membershipNumber;
    }

    /**
     * Sets the value of the membershipNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipNumber(String value) {
        this.membershipNumber = value;
    }

    /**
     * Gets the value of the nativeName property.
     * 
     * @return
     *     possible object is
     *     {@link NativeName }
     *     
     */
    public NativeName getNativeName() {
        return nativeName;
    }

    /**
     * Sets the value of the nativeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeName }
     *     
     */
    public void setNativeName(NativeName value) {
        this.nativeName = value;
    }

}
