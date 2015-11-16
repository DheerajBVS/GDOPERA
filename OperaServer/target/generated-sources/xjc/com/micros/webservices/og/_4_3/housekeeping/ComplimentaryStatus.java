//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.16 at 01:21:05 PM IST 
//


package com.micros.webservices.og._4_3.housekeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplimentaryStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplimentaryStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComplimentaryArrivalsRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ComplimentaryArrivalsPersons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ComplimentaryArrivalsVIP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ComplimentaryStayOversRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ComplimentaryStayOversPersons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ComplimentaryStayOversVIP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ComplimentaryDeparturesRoom" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ComplimentaryDeparturesPersons" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ComplimentaryDeparturesVIP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplimentaryStatus", propOrder = {
    "complimentaryArrivalsRoom",
    "complimentaryArrivalsPersons",
    "complimentaryArrivalsVIP",
    "complimentaryStayOversRoom",
    "complimentaryStayOversPersons",
    "complimentaryStayOversVIP",
    "complimentaryDeparturesRoom",
    "complimentaryDeparturesPersons",
    "complimentaryDeparturesVIP"
})
public class ComplimentaryStatus {

    @XmlElement(name = "ComplimentaryArrivalsRoom")
    protected Integer complimentaryArrivalsRoom;
    @XmlElement(name = "ComplimentaryArrivalsPersons")
    protected Integer complimentaryArrivalsPersons;
    @XmlElement(name = "ComplimentaryArrivalsVIP")
    protected Integer complimentaryArrivalsVIP;
    @XmlElement(name = "ComplimentaryStayOversRoom")
    protected Integer complimentaryStayOversRoom;
    @XmlElement(name = "ComplimentaryStayOversPersons")
    protected Integer complimentaryStayOversPersons;
    @XmlElement(name = "ComplimentaryStayOversVIP")
    protected Integer complimentaryStayOversVIP;
    @XmlElement(name = "ComplimentaryDeparturesRoom")
    protected Integer complimentaryDeparturesRoom;
    @XmlElement(name = "ComplimentaryDeparturesPersons")
    protected Integer complimentaryDeparturesPersons;
    @XmlElement(name = "ComplimentaryDeparturesVIP")
    protected Integer complimentaryDeparturesVIP;

    /**
     * Gets the value of the complimentaryArrivalsRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComplimentaryArrivalsRoom() {
        return complimentaryArrivalsRoom;
    }

    /**
     * Sets the value of the complimentaryArrivalsRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComplimentaryArrivalsRoom(Integer value) {
        this.complimentaryArrivalsRoom = value;
    }

    /**
     * Gets the value of the complimentaryArrivalsPersons property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComplimentaryArrivalsPersons() {
        return complimentaryArrivalsPersons;
    }

    /**
     * Sets the value of the complimentaryArrivalsPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComplimentaryArrivalsPersons(Integer value) {
        this.complimentaryArrivalsPersons = value;
    }

    /**
     * Gets the value of the complimentaryArrivalsVIP property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComplimentaryArrivalsVIP() {
        return complimentaryArrivalsVIP;
    }

    /**
     * Sets the value of the complimentaryArrivalsVIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComplimentaryArrivalsVIP(Integer value) {
        this.complimentaryArrivalsVIP = value;
    }

    /**
     * Gets the value of the complimentaryStayOversRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComplimentaryStayOversRoom() {
        return complimentaryStayOversRoom;
    }

    /**
     * Sets the value of the complimentaryStayOversRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComplimentaryStayOversRoom(Integer value) {
        this.complimentaryStayOversRoom = value;
    }

    /**
     * Gets the value of the complimentaryStayOversPersons property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComplimentaryStayOversPersons() {
        return complimentaryStayOversPersons;
    }

    /**
     * Sets the value of the complimentaryStayOversPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComplimentaryStayOversPersons(Integer value) {
        this.complimentaryStayOversPersons = value;
    }

    /**
     * Gets the value of the complimentaryStayOversVIP property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComplimentaryStayOversVIP() {
        return complimentaryStayOversVIP;
    }

    /**
     * Sets the value of the complimentaryStayOversVIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComplimentaryStayOversVIP(Integer value) {
        this.complimentaryStayOversVIP = value;
    }

    /**
     * Gets the value of the complimentaryDeparturesRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComplimentaryDeparturesRoom() {
        return complimentaryDeparturesRoom;
    }

    /**
     * Sets the value of the complimentaryDeparturesRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComplimentaryDeparturesRoom(Integer value) {
        this.complimentaryDeparturesRoom = value;
    }

    /**
     * Gets the value of the complimentaryDeparturesPersons property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComplimentaryDeparturesPersons() {
        return complimentaryDeparturesPersons;
    }

    /**
     * Sets the value of the complimentaryDeparturesPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComplimentaryDeparturesPersons(Integer value) {
        this.complimentaryDeparturesPersons = value;
    }

    /**
     * Gets the value of the complimentaryDeparturesVIP property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComplimentaryDeparturesVIP() {
        return complimentaryDeparturesVIP;
    }

    /**
     * Sets the value of the complimentaryDeparturesVIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComplimentaryDeparturesVIP(Integer value) {
        this.complimentaryDeparturesVIP = value;
    }

}
