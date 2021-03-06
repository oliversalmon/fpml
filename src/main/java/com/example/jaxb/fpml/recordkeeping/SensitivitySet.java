
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A collection of sensitivities. References a definition that explains the meaning/type of the sensitivities.
 * 
 * <p>Java class for SensitivitySet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SensitivitySet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *         &lt;element name="definitionReference" type="{http://www.fpml.org/FpML-5/recordkeeping}SensitivitySetDefinitionReference" minOccurs="0"/>
 *         &lt;element name="sensitivity" type="{http://www.fpml.org/FpML-5/recordkeeping}Sensitivity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensitivitySet", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "name",
    "definitionReference",
    "sensitivity"
})
public class SensitivitySet {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String name;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SensitivitySetDefinitionReference definitionReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Sensitivity> sensitivity;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the definitionReference property.
     * 
     * @return
     *     possible object is
     *     {@link SensitivitySetDefinitionReference }
     *     
     */
    public SensitivitySetDefinitionReference getDefinitionReference() {
        return definitionReference;
    }

    /**
     * Sets the value of the definitionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitivitySetDefinitionReference }
     *     
     */
    public void setDefinitionReference(SensitivitySetDefinitionReference value) {
        this.definitionReference = value;
    }

    /**
     * Gets the value of the sensitivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sensitivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSensitivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sensitivity }
     * 
     * 
     */
    public List<Sensitivity> getSensitivity() {
        if (sensitivity == null) {
            sensitivity = new ArrayList<Sensitivity>();
        }
        return this.sensitivity;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

}
