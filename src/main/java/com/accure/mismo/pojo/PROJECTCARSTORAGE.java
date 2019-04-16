//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.13 at 09:07:28 PM EST 
//


package com.accure.mismo.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}CAR_STORAGE_LOCATION" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist.PROJECT_CAR_STORAGE"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "carstoragelocation"
})
@XmlRootElement(name = "PROJECT_CAR_STORAGE")
public class PROJECTCARSTORAGE {

    @XmlElement(name = "CAR_STORAGE_LOCATION")
    protected List<CARSTORAGELOCATION> carstoragelocation;
    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "AdequateIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String adequateIndicator;
    @XmlAttribute(name = "_AdequacyEffectOnMarketabilityDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String adequacyEffectOnMarketabilityDescription;
    @XmlAttribute(name = "GuestParkingIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String guestParkingIndicator;
    @XmlAttribute(name = "GuestParkingSpacesCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String guestParkingSpacesCount;
    @XmlAttribute(name = "ParkingSpacesCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String parkingSpacesCount;
    @XmlAttribute(name = "_Description")
    @XmlSchemaType(name = "anySimpleType")
    protected String description;
    @XmlAttribute(name = "_SpacesToUnitsRatioNumber")
    @XmlSchemaType(name = "anySimpleType")
    protected String spacesToUnitsRatioNumber;

    /**
     * Gets the value of the carstoragelocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carstoragelocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCARSTORAGELOCATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CARSTORAGELOCATION }
     * 
     * 
     */
    public List<CARSTORAGELOCATION> getCARSTORAGELOCATION() {
        if (carstoragelocation == null) {
            carstoragelocation = new ArrayList<CARSTORAGELOCATION>();
        }
        return this.carstoragelocation;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the adequateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdequateIndicator() {
        return adequateIndicator;
    }

    /**
     * Sets the value of the adequateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdequateIndicator(String value) {
        this.adequateIndicator = value;
    }

    /**
     * Gets the value of the adequacyEffectOnMarketabilityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdequacyEffectOnMarketabilityDescription() {
        return adequacyEffectOnMarketabilityDescription;
    }

    /**
     * Sets the value of the adequacyEffectOnMarketabilityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdequacyEffectOnMarketabilityDescription(String value) {
        this.adequacyEffectOnMarketabilityDescription = value;
    }

    /**
     * Gets the value of the guestParkingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestParkingIndicator() {
        return guestParkingIndicator;
    }

    /**
     * Sets the value of the guestParkingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestParkingIndicator(String value) {
        this.guestParkingIndicator = value;
    }

    /**
     * Gets the value of the guestParkingSpacesCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestParkingSpacesCount() {
        return guestParkingSpacesCount;
    }

    /**
     * Sets the value of the guestParkingSpacesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestParkingSpacesCount(String value) {
        this.guestParkingSpacesCount = value;
    }

    /**
     * Gets the value of the parkingSpacesCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingSpacesCount() {
        return parkingSpacesCount;
    }

    /**
     * Sets the value of the parkingSpacesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingSpacesCount(String value) {
        this.parkingSpacesCount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the spacesToUnitsRatioNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpacesToUnitsRatioNumber() {
        return spacesToUnitsRatioNumber;
    }

    /**
     * Sets the value of the spacesToUnitsRatioNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpacesToUnitsRatioNumber(String value) {
        this.spacesToUnitsRatioNumber = value;
    }

}
