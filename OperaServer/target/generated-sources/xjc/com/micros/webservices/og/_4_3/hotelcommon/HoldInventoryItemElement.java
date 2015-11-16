//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.hotelcommon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.micros.webservices.og._4_3.common.UniqueID;


/**
 * <p>Java class for HoldInventoryItemElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HoldInventoryItemElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ItemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ItemEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ItemHoldID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldInventoryItemElement", propOrder = {
    "itemCode",
    "itemName",
    "quantity",
    "itemStartDate",
    "itemEndDate",
    "itemHoldID"
})
public class HoldInventoryItemElement {

    @XmlElement(name = "ItemCode", required = true)
    protected String itemCode;
    @XmlElement(name = "ItemName", required = true)
    protected String itemName;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "ItemStartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar itemStartDate;
    @XmlElement(name = "ItemEndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar itemEndDate;
    @XmlElement(name = "ItemHoldID", required = true)
    protected UniqueID itemHoldID;

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the itemStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItemStartDate() {
        return itemStartDate;
    }

    /**
     * Sets the value of the itemStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItemStartDate(XMLGregorianCalendar value) {
        this.itemStartDate = value;
    }

    /**
     * Gets the value of the itemEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItemEndDate() {
        return itemEndDate;
    }

    /**
     * Sets the value of the itemEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItemEndDate(XMLGregorianCalendar value) {
        this.itemEndDate = value;
    }

    /**
     * Gets the value of the itemHoldID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getItemHoldID() {
        return itemHoldID;
    }

    /**
     * Sets the value of the itemHoldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setItemHoldID(UniqueID value) {
        this.itemHoldID = value;
    }

}
