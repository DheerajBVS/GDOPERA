//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.22 at 04:53:58 PM IST 
//


package com.micros.webservices.og._4_3.hotelcommon;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of MeetingRoom objects that provide the codes and description of the meeting rooms in the hotel.
 * 
 * <p>Java class for MeetingRoomsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetingRoomsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeetingRoom" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Codes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Code" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Charge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Description" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" maxOccurs="5" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Description" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Irregular" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PropertySystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RoomName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MeetingRoomCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MeetingRoomCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="SmallestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="LargestRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="TotalRoomSpace" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="LargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="SecondLargestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="SmallestSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRoomsType", propOrder = {
    "meetingRoom"
})
public class MeetingRoomsType {

    @XmlElement(name = "MeetingRoom")
    protected List<MeetingRoomsType.MeetingRoom> meetingRoom;
    @XmlAttribute(name = "MeetingRoomCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger meetingRoomCount;
    @XmlAttribute(name = "SmallestRoomSpace")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger smallestRoomSpace;
    @XmlAttribute(name = "LargestRoomSpace")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger largestRoomSpace;
    @XmlAttribute(name = "TotalRoomSpace")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalRoomSpace;
    @XmlAttribute(name = "LargestSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger largestSeatingCapacity;
    @XmlAttribute(name = "SecondLargestSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger secondLargestSeatingCapacity;
    @XmlAttribute(name = "SmallestSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger smallestSeatingCapacity;

    /**
     * Gets the value of the meetingRoom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meetingRoom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetingRoom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingRoomsType.MeetingRoom }
     * 
     * 
     */
    public List<MeetingRoomsType.MeetingRoom> getMeetingRoom() {
        if (meetingRoom == null) {
            meetingRoom = new ArrayList<MeetingRoomsType.MeetingRoom>();
        }
        return this.meetingRoom;
    }

    /**
     * Gets the value of the meetingRoomCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeetingRoomCount() {
        return meetingRoomCount;
    }

    /**
     * Sets the value of the meetingRoomCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeetingRoomCount(BigInteger value) {
        this.meetingRoomCount = value;
    }

    /**
     * Gets the value of the smallestRoomSpace property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSmallestRoomSpace() {
        return smallestRoomSpace;
    }

    /**
     * Sets the value of the smallestRoomSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSmallestRoomSpace(BigInteger value) {
        this.smallestRoomSpace = value;
    }

    /**
     * Gets the value of the largestRoomSpace property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLargestRoomSpace() {
        return largestRoomSpace;
    }

    /**
     * Sets the value of the largestRoomSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLargestRoomSpace(BigInteger value) {
        this.largestRoomSpace = value;
    }

    /**
     * Gets the value of the totalRoomSpace property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalRoomSpace() {
        return totalRoomSpace;
    }

    /**
     * Sets the value of the totalRoomSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalRoomSpace(BigInteger value) {
        this.totalRoomSpace = value;
    }

    /**
     * Gets the value of the largestSeatingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLargestSeatingCapacity() {
        return largestSeatingCapacity;
    }

    /**
     * Sets the value of the largestSeatingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLargestSeatingCapacity(BigInteger value) {
        this.largestSeatingCapacity = value;
    }

    /**
     * Gets the value of the secondLargestSeatingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSecondLargestSeatingCapacity() {
        return secondLargestSeatingCapacity;
    }

    /**
     * Sets the value of the secondLargestSeatingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSecondLargestSeatingCapacity(BigInteger value) {
        this.secondLargestSeatingCapacity = value;
    }

    /**
     * Gets the value of the smallestSeatingCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSmallestSeatingCapacity() {
        return smallestSeatingCapacity;
    }

    /**
     * Sets the value of the smallestSeatingCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSmallestSeatingCapacity(BigInteger value) {
        this.smallestSeatingCapacity = value;
    }


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
     *         &lt;element name="Codes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Charge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Description" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" maxOccurs="5" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Description" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Irregular" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PropertySystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RoomName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MeetingRoomCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codes",
        "description"
    })
    public static class MeetingRoom {

        @XmlElement(name = "Codes")
        protected MeetingRoomsType.MeetingRoom.Codes codes;
        @XmlElement(name = "Description")
        protected Paragraph description;
        @XmlAttribute(name = "Irregular")
        protected Boolean irregular;
        @XmlAttribute(name = "PropertySystemName")
        protected String propertySystemName;
        @XmlAttribute(name = "RoomName")
        protected String roomName;
        @XmlAttribute(name = "Sort")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger sort;
        @XmlAttribute(name = "MeetingRoomCapacity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger meetingRoomCapacity;

        /**
         * Gets the value of the codes property.
         * 
         * @return
         *     possible object is
         *     {@link MeetingRoomsType.MeetingRoom.Codes }
         *     
         */
        public MeetingRoomsType.MeetingRoom.Codes getCodes() {
            return codes;
        }

        /**
         * Sets the value of the codes property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeetingRoomsType.MeetingRoom.Codes }
         *     
         */
        public void setCodes(MeetingRoomsType.MeetingRoom.Codes value) {
            this.codes = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link Paragraph }
         *     
         */
        public Paragraph getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link Paragraph }
         *     
         */
        public void setDescription(Paragraph value) {
            this.description = value;
        }

        /**
         * Gets the value of the irregular property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIrregular() {
            return irregular;
        }

        /**
         * Sets the value of the irregular property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIrregular(Boolean value) {
            this.irregular = value;
        }

        /**
         * Gets the value of the propertySystemName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPropertySystemName() {
            return propertySystemName;
        }

        /**
         * Sets the value of the propertySystemName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPropertySystemName(String value) {
            this.propertySystemName = value;
        }

        /**
         * Gets the value of the roomName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomName() {
            return roomName;
        }

        /**
         * Sets the value of the roomName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomName(String value) {
            this.roomName = value;
        }

        /**
         * Gets the value of the sort property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSort() {
            return sort;
        }

        /**
         * Sets the value of the sort property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSort(BigInteger value) {
            this.sort = value;
        }

        /**
         * Gets the value of the meetingRoomCapacity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMeetingRoomCapacity() {
            return meetingRoomCapacity;
        }

        /**
         * Sets the value of the meetingRoomCapacity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMeetingRoomCapacity(BigInteger value) {
            this.meetingRoomCapacity = value;
        }


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
         *         &lt;element name="Code" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Charge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Description" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" maxOccurs="5" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
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
        @XmlType(name = "", propOrder = {
            "code"
        })
        public static class Codes {

            @XmlElement(name = "Code", required = true)
            protected List<MeetingRoomsType.MeetingRoom.Codes.Code> code;

            /**
             * Gets the value of the code property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the code property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MeetingRoomsType.MeetingRoom.Codes.Code }
             * 
             * 
             */
            public List<MeetingRoomsType.MeetingRoom.Codes.Code> getCode() {
                if (code == null) {
                    code = new ArrayList<MeetingRoomsType.MeetingRoom.Codes.Code>();
                }
                return this.code;
            }


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
             *         &lt;element name="Charge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Description" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" maxOccurs="5" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "charge",
                "description"
            })
            public static class Code {

                @XmlElement(name = "Charge")
                protected String charge;
                @XmlElement(name = "Description")
                protected List<Paragraph> description;
                @XmlAttribute(name = "Code")
                protected String code;

                /**
                 * Gets the value of the charge property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCharge() {
                    return charge;
                }

                /**
                 * Sets the value of the charge property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCharge(String value) {
                    this.charge = value;
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
                 * {@link Paragraph }
                 * 
                 * 
                 */
                public List<Paragraph> getDescription() {
                    if (description == null) {
                        description = new ArrayList<Paragraph>();
                    }
                    return this.description;
                }

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

            }

        }

    }

}
