//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.26 at 10:00:49 AM IST 
//


package com.micros.webservices.og._4_3.membership;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.micros.webservices.og._4_3.common.UniqueID;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MembershipID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID"/>
 *       &lt;/sequence>
 *       &lt;attribute name="evaluationDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="evaluationType" use="required" type="{http://webservices.micros.com/og/4.3/Membership/}EvaluationTypes" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "membershipID"
})
@XmlRootElement(name = "FetchMemberTierWizardRequest")
public class FetchMemberTierWizardRequest {

    @XmlElement(name = "MembershipID", required = true)
    protected UniqueID membershipID;
    @XmlAttribute(name = "evaluationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evaluationDate;
    @XmlAttribute(name = "evaluationType", required = true)
    protected EvaluationTypes evaluationType;

    /**
     * Gets the value of the membershipID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getMembershipID() {
        return membershipID;
    }

    /**
     * Sets the value of the membershipID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setMembershipID(UniqueID value) {
        this.membershipID = value;
    }

    /**
     * Gets the value of the evaluationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvaluationDate() {
        return evaluationDate;
    }

    /**
     * Sets the value of the evaluationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvaluationDate(XMLGregorianCalendar value) {
        this.evaluationDate = value;
    }

    /**
     * Gets the value of the evaluationType property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationTypes }
     *     
     */
    public EvaluationTypes getEvaluationType() {
        return evaluationType;
    }

    /**
     * Sets the value of the evaluationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationTypes }
     *     
     */
    public void setEvaluationType(EvaluationTypes value) {
        this.evaluationType = value;
    }

}
