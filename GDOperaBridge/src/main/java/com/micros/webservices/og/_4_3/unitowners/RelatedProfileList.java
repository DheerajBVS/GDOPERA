//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:53:58 PM IST 
//


package com.micros.webservices.og._4_3.unitowners;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedProfileList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedProfileList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelatedProfiles" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://webservices.micros.com/og/4.3/UnitOwners/}RelatedProfile">
 *                 &lt;attribute name="recordId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="systemStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedProfileList", propOrder = {
    "relatedProfiles"
})
public class RelatedProfileList {

    @XmlElement(name = "RelatedProfiles", required = true)
    protected List<RelatedProfileList.RelatedProfiles> relatedProfiles;

    /**
     * Gets the value of the relatedProfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedProfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedProfileList.RelatedProfiles }
     * 
     * 
     */
    public List<RelatedProfileList.RelatedProfiles> getRelatedProfiles() {
        if (relatedProfiles == null) {
            relatedProfiles = new ArrayList<RelatedProfileList.RelatedProfiles>();
        }
        return this.relatedProfiles;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://webservices.micros.com/og/4.3/UnitOwners/}RelatedProfile">
     *       &lt;attribute name="recordId" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="systemStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RelatedProfiles
        extends RelatedProfile
    {

        @XmlAttribute(name = "recordId")
        protected Long recordId;
        @XmlAttribute(name = "systemStatus")
        protected String systemStatus;

        /**
         * Gets the value of the recordId property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getRecordId() {
            return recordId;
        }

        /**
         * Sets the value of the recordId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setRecordId(Long value) {
            this.recordId = value;
        }

        /**
         * Gets the value of the systemStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSystemStatus() {
            return systemStatus;
        }

        /**
         * Sets the value of the systemStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSystemStatus(String value) {
            this.systemStatus = value;
        }

    }

}