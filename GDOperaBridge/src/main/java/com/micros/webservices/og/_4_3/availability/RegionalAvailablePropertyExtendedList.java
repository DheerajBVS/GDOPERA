//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:48:57 PM IST 
//


package com.micros.webservices.og._4_3.availability;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionalAvailablePropertyExtendedList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionalAvailablePropertyExtendedList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegionalAvailableProperty" type="{http://webservices.micros.com/og/4.3/Availability/}RegionalAvailablePropertyExtended" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionalAvailablePropertyExtendedList", propOrder = {
    "regionalAvailableProperty"
})
public class RegionalAvailablePropertyExtendedList {

    @XmlElement(name = "RegionalAvailableProperty", required = true)
    protected List<RegionalAvailablePropertyExtended> regionalAvailableProperty;

    /**
     * Gets the value of the regionalAvailableProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionalAvailableProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionalAvailableProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionalAvailablePropertyExtended }
     * 
     * 
     */
    public List<RegionalAvailablePropertyExtended> getRegionalAvailableProperty() {
        if (regionalAvailableProperty == null) {
            regionalAvailableProperty = new ArrayList<RegionalAvailablePropertyExtended>();
        }
        return this.regionalAvailableProperty;
    }

}
