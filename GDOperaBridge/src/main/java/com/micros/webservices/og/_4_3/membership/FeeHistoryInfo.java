//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 10:00:49 AM IST 
//


package com.micros.webservices.og._4_3.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.micros.webservices.og._4_3.common.UniqueID;


/**
 * <p>Java class for FeeHistoryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeHistoryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="OriginalExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NewExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Fee" type="{http://webservices.micros.com/og/4.3/Membership/}Fee" minOccurs="0"/>
 *         &lt;element name="OriginalMembershipLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewMembershipLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MembershipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MembershipNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NameId" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="EnrollmentAction" type="{http://webservices.micros.com/og/4.3/Membership/}EnrollmentActions" minOccurs="0"/>
 *         &lt;element name="InActiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeHistoryInfo", propOrder = {
    "paymentDate",
    "originalExpirationDate",
    "newExpirationDate",
    "fee",
    "originalMembershipLevel",
    "newMembershipLevel",
    "membershipType",
    "membershipNumber",
    "nameId",
    "enrollmentAction",
    "inActiveDate"
})
public class FeeHistoryInfo {

    @XmlElement(name = "PaymentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "OriginalExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar originalExpirationDate;
    @XmlElement(name = "NewExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar newExpirationDate;
    @XmlElement(name = "Fee")
    protected Fee fee;
    @XmlElement(name = "OriginalMembershipLevel")
    protected String originalMembershipLevel;
    @XmlElement(name = "NewMembershipLevel")
    protected String newMembershipLevel;
    @XmlElement(name = "MembershipType")
    protected String membershipType;
    @XmlElement(name = "MembershipNumber", required = true)
    protected String membershipNumber;
    @XmlElement(name = "NameId")
    protected UniqueID nameId;
    @XmlElement(name = "EnrollmentAction")
    @XmlSchemaType(name = "string")
    protected EnrollmentActions enrollmentAction;
    @XmlElement(name = "InActiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inActiveDate;

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the originalExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalExpirationDate() {
        return originalExpirationDate;
    }

    /**
     * Sets the value of the originalExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalExpirationDate(XMLGregorianCalendar value) {
        this.originalExpirationDate = value;
    }

    /**
     * Gets the value of the newExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewExpirationDate() {
        return newExpirationDate;
    }

    /**
     * Sets the value of the newExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewExpirationDate(XMLGregorianCalendar value) {
        this.newExpirationDate = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link Fee }
     *     
     */
    public Fee getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fee }
     *     
     */
    public void setFee(Fee value) {
        this.fee = value;
    }

    /**
     * Gets the value of the originalMembershipLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalMembershipLevel() {
        return originalMembershipLevel;
    }

    /**
     * Sets the value of the originalMembershipLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalMembershipLevel(String value) {
        this.originalMembershipLevel = value;
    }

    /**
     * Gets the value of the newMembershipLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMembershipLevel() {
        return newMembershipLevel;
    }

    /**
     * Sets the value of the newMembershipLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMembershipLevel(String value) {
        this.newMembershipLevel = value;
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
     * Gets the value of the nameId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getNameId() {
        return nameId;
    }

    /**
     * Sets the value of the nameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setNameId(UniqueID value) {
        this.nameId = value;
    }

    /**
     * Gets the value of the enrollmentAction property.
     * 
     * @return
     *     possible object is
     *     {@link EnrollmentActions }
     *     
     */
    public EnrollmentActions getEnrollmentAction() {
        return enrollmentAction;
    }

    /**
     * Sets the value of the enrollmentAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnrollmentActions }
     *     
     */
    public void setEnrollmentAction(EnrollmentActions value) {
        this.enrollmentAction = value;
    }

    /**
     * Gets the value of the inActiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInActiveDate() {
        return inActiveDate;
    }

    /**
     * Sets the value of the inActiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInActiveDate(XMLGregorianCalendar value) {
        this.inActiveDate = value;
    }

}
