//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.meetingroom;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.hotelcommon.Charge;


/**
 * <p>Java class for RevenueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevenueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseRate" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Charge" maxOccurs="unbounded"/>
 *         &lt;element name="TaxesAndFees" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Charge" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="taxInclusive" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="revenueCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="revenueName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contributeToMinimumRevenuew" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevenueType", propOrder = {
    "baseRate",
    "taxesAndFees"
})
public class RevenueType {

    @XmlElement(name = "BaseRate", required = true)
    protected List<Charge> baseRate;
    @XmlElement(name = "TaxesAndFees")
    protected List<Charge> taxesAndFees;
    @XmlAttribute(name = "taxInclusive", required = true)
    protected boolean taxInclusive;
    @XmlAttribute(name = "revenueCode", required = true)
    protected String revenueCode;
    @XmlAttribute(name = "revenueName")
    protected String revenueName;
    @XmlAttribute(name = "contributeToMinimumRevenuew")
    protected Boolean contributeToMinimumRevenuew;

    /**
     * Gets the value of the baseRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge }
     * 
     * 
     */
    public List<Charge> getBaseRate() {
        if (baseRate == null) {
            baseRate = new ArrayList<Charge>();
        }
        return this.baseRate;
    }

    /**
     * Gets the value of the taxesAndFees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxesAndFees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxesAndFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge }
     * 
     * 
     */
    public List<Charge> getTaxesAndFees() {
        if (taxesAndFees == null) {
            taxesAndFees = new ArrayList<Charge>();
        }
        return this.taxesAndFees;
    }

    /**
     * Gets the value of the taxInclusive property.
     * 
     */
    public boolean isTaxInclusive() {
        return taxInclusive;
    }

    /**
     * Sets the value of the taxInclusive property.
     * 
     */
    public void setTaxInclusive(boolean value) {
        this.taxInclusive = value;
    }

    /**
     * Gets the value of the revenueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueCode() {
        return revenueCode;
    }

    /**
     * Sets the value of the revenueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueCode(String value) {
        this.revenueCode = value;
    }

    /**
     * Gets the value of the revenueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueName() {
        return revenueName;
    }

    /**
     * Sets the value of the revenueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueName(String value) {
        this.revenueName = value;
    }

    /**
     * Gets the value of the contributeToMinimumRevenuew property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContributeToMinimumRevenuew() {
        return contributeToMinimumRevenuew;
    }

    /**
     * Sets the value of the contributeToMinimumRevenuew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContributeToMinimumRevenuew(Boolean value) {
        this.contributeToMinimumRevenuew = value;
    }

}
