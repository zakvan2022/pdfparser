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
 *       &lt;attGroup ref="{}attlist._TYPICAL_TO_NEIGHBORHOOD"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "_TYPICAL_TO_NEIGHBORHOOD")
public class TYPICALTONEIGHBORHOOD {

    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "StructureFeatureType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String structureFeatureType;
    @XmlAttribute(name = "StructureFeatureTypeOtherDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String structureFeatureTypeOtherDescription;
    @XmlAttribute(name = "_ExistsIndicator")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String existsIndicator;
    @XmlAttribute(name = "_AtypicalDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String atypicalDescription;

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
     * Gets the value of the structureFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructureFeatureType() {
        return structureFeatureType;
    }

    /**
     * Sets the value of the structureFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructureFeatureType(String value) {
        this.structureFeatureType = value;
    }

    /**
     * Gets the value of the structureFeatureTypeOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructureFeatureTypeOtherDescription() {
        return structureFeatureTypeOtherDescription;
    }

    /**
     * Sets the value of the structureFeatureTypeOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructureFeatureTypeOtherDescription(String value) {
        this.structureFeatureTypeOtherDescription = value;
    }

    /**
     * Gets the value of the existsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistsIndicator() {
        return existsIndicator;
    }

    /**
     * Sets the value of the existsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistsIndicator(String value) {
        this.existsIndicator = value;
    }

    /**
     * Gets the value of the atypicalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtypicalDescription() {
        return atypicalDescription;
    }

    /**
     * Sets the value of the atypicalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtypicalDescription(String value) {
        this.atypicalDescription = value;
    }

}
