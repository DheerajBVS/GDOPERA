//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.hotelcommon;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.micros.webservices.og._4_3.common.DescriptiveText;


/**
 * <p>Java class for ScreenItemElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScreenItemElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ScreenId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://webservices.micros.com/og/4.3/Common/}DescriptiveText" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Caption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ToolTip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScreenItemElement", propOrder = {
    "id",
    "screenId",
    "description",
    "caption",
    "toolTip"
})
public class ScreenItemElement {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "ScreenId", required = true)
    protected String screenId;
    @XmlElement(name = "Description")
    protected List<DescriptiveText> description;
    @XmlElement(name = "Caption")
    protected String caption;
    @XmlElement(name = "ToolTip")
    protected String toolTip;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the screenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * Sets the value of the screenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenId(String value) {
        this.screenId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptiveText }
     * 
     * 
     */
    public List<DescriptiveText> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptiveText>();
        }
        return this.description;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaption(String value) {
        this.caption = value;
    }

    /**
     * Gets the value of the toolTip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolTip() {
        return toolTip;
    }

    /**
     * Sets the value of the toolTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolTip(String value) {
        this.toolTip = value;
    }

}