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
 *         &lt;element ref="{}ROOM_TYPE_SUMMARY" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}attlist._UNIT_GROUP"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "roomtypesummary"
})
@XmlRootElement(name = "_UNIT_GROUP")
public class UNITGROUP {

    @XmlElement(name = "ROOM_TYPE_SUMMARY")
    protected List<ROOMTYPESUMMARY> roomtypesummary;
    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "UnitType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unitType;
    @XmlAttribute(name = "LevelCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String levelCount;
    @XmlAttribute(name = "GrossLivingAreaSquareFeetCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String grossLivingAreaSquareFeetCount;
    @XmlAttribute(name = "LivingUnitCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String livingUnitCount;
    @XmlAttribute(name = "TotalRoomCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String totalRoomCount;
    @XmlAttribute(name = "TotalBedroomCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String totalBedroomCount;
    @XmlAttribute(name = "TotalBathroomCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String totalBathroomCount;
    @XmlAttribute(name = "SquareFeetPerUnitCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String squareFeetPerUnitCount;

    /**
     * Gets the value of the roomtypesummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomtypesummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getROOMTYPESUMMARY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ROOMTYPESUMMARY }
     * 
     * 
     */
    public List<ROOMTYPESUMMARY> getROOMTYPESUMMARY() {
        if (roomtypesummary == null) {
            roomtypesummary = new ArrayList<ROOMTYPESUMMARY>();
        }
        return this.roomtypesummary;
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
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType(String value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the levelCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelCount() {
        return levelCount;
    }

    /**
     * Sets the value of the levelCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelCount(String value) {
        this.levelCount = value;
    }

    /**
     * Gets the value of the grossLivingAreaSquareFeetCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossLivingAreaSquareFeetCount() {
        return grossLivingAreaSquareFeetCount;
    }

    /**
     * Sets the value of the grossLivingAreaSquareFeetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossLivingAreaSquareFeetCount(String value) {
        this.grossLivingAreaSquareFeetCount = value;
    }

    /**
     * Gets the value of the livingUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivingUnitCount() {
        return livingUnitCount;
    }

    /**
     * Sets the value of the livingUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivingUnitCount(String value) {
        this.livingUnitCount = value;
    }

    /**
     * Gets the value of the totalRoomCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalRoomCount() {
        return totalRoomCount;
    }

    /**
     * Sets the value of the totalRoomCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRoomCount(String value) {
        this.totalRoomCount = value;
    }

    /**
     * Gets the value of the totalBedroomCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBedroomCount() {
        return totalBedroomCount;
    }

    /**
     * Sets the value of the totalBedroomCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBedroomCount(String value) {
        this.totalBedroomCount = value;
    }

    /**
     * Gets the value of the totalBathroomCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalBathroomCount() {
        return totalBathroomCount;
    }

    /**
     * Sets the value of the totalBathroomCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalBathroomCount(String value) {
        this.totalBathroomCount = value;
    }

    /**
     * Gets the value of the squareFeetPerUnitCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSquareFeetPerUnitCount() {
        return squareFeetPerUnitCount;
    }

    /**
     * Sets the value of the squareFeetPerUnitCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSquareFeetPerUnitCount(String value) {
        this.squareFeetPerUnitCount = value;
    }

}