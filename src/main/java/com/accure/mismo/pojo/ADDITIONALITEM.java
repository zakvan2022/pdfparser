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
 *       &lt;attGroup ref="{}attlist._ADDITIONAL_ITEM"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "_ADDITIONAL_ITEM")
public class ADDITIONALITEM {

    @XmlAttribute(name = "_ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "StructureAdditionalGeneralItemName")
    @XmlSchemaType(name = "anySimpleType")
    protected String structureAdditionalGeneralItemName;
    @XmlAttribute(name = "StructureAdditionalGeneralItemDescription")
    @XmlSchemaType(name = "anySimpleType")
    protected String structureAdditionalGeneralItemDescription;

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
     * Gets the value of the structureAdditionalGeneralItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructureAdditionalGeneralItemName() {
        return structureAdditionalGeneralItemName;
    }

    /**
     * Sets the value of the structureAdditionalGeneralItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructureAdditionalGeneralItemName(String value) {
        this.structureAdditionalGeneralItemName = value;
    }

    /**
     * Gets the value of the structureAdditionalGeneralItemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructureAdditionalGeneralItemDescription() {
        return structureAdditionalGeneralItemDescription;
    }

    /**
     * Sets the value of the structureAdditionalGeneralItemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructureAdditionalGeneralItemDescription(String value) {
        this.structureAdditionalGeneralItemDescription = value;
    }

}
