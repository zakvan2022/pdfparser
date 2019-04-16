//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.13 at 09:07:28 PM EST 
//


package com.accure.mismo.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attGroup ref="{}attlist._UNIT"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "_UNIT")
public class UNIT {

    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "UnitIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String unitIdentifier;
    @XmlAttribute(name = "LevelCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String levelCount;
    @XmlAttribute(name = "FloorIdentifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String floorIdentifier;
    @XmlAttribute(name = "SquareFeetCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String squareFeetCount;
    @XmlAttribute(name = "AgeYearsCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String ageYearsCount;
    @XmlAttribute(name = "EffectiveAgeYearsCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String effectiveAgeYearsCount;
    @XmlAttribute(name = "ExteriorWallsDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String exteriorWallsDescription;
    @XmlAttribute(name = "RoofSurfaceDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String roofSurfaceDescription;
    @XmlAttribute(name = "AdditionalImprovementName")
    @XmlSchemaType(name = "anySimpleType")
    protected String additionalImprovementName;
    @XmlAttribute(name = "AdditionalImprovementDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String additionalImprovementDescription;
    @XmlAttribute(name = "_SharesCount")
    @XmlSchemaType(name = "anySimpleType")
    protected String sharesCount;

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
     * Gets the value of the unitIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitIdentifier() {
        return unitIdentifier;
    }

    /**
     * Sets the value of the unitIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitIdentifier(String value) {
        this.unitIdentifier = value;
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
     * Gets the value of the floorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorIdentifier() {
        return floorIdentifier;
    }

    /**
     * Sets the value of the floorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorIdentifier(String value) {
        this.floorIdentifier = value;
    }

    /**
     * Gets the value of the squareFeetCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSquareFeetCount() {
        return squareFeetCount;
    }

    /**
     * Sets the value of the squareFeetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSquareFeetCount(String value) {
        this.squareFeetCount = value;
    }

    /**
     * Gets the value of the ageYearsCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeYearsCount() {
        return ageYearsCount;
    }

    /**
     * Sets the value of the ageYearsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeYearsCount(String value) {
        this.ageYearsCount = value;
    }

    /**
     * Gets the value of the effectiveAgeYearsCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveAgeYearsCount() {
        return effectiveAgeYearsCount;
    }

    /**
     * Sets the value of the effectiveAgeYearsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveAgeYearsCount(String value) {
        this.effectiveAgeYearsCount = value;
    }

    /**
     * Gets the value of the exteriorWallsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExteriorWallsDescription() {
        return exteriorWallsDescription;
    }

    /**
     * Sets the value of the exteriorWallsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExteriorWallsDescription(String value) {
        this.exteriorWallsDescription = value;
    }

    /**
     * Gets the value of the roofSurfaceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoofSurfaceDescription() {
        return roofSurfaceDescription;
    }

    /**
     * Sets the value of the roofSurfaceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoofSurfaceDescription(String value) {
        this.roofSurfaceDescription = value;
    }

    /**
     * Gets the value of the additionalImprovementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalImprovementName() {
        return additionalImprovementName;
    }

    /**
     * Sets the value of the additionalImprovementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalImprovementName(String value) {
        this.additionalImprovementName = value;
    }

    /**
     * Gets the value of the additionalImprovementDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalImprovementDescription() {
        return additionalImprovementDescription;
    }

    /**
     * Sets the value of the additionalImprovementDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalImprovementDescription(String value) {
        this.additionalImprovementDescription = value;
    }

    /**
     * Gets the value of the sharesCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharesCount() {
        return sharesCount;
    }

    /**
     * Sets the value of the sharesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharesCount(String value) {
        this.sharesCount = value;
    }

}