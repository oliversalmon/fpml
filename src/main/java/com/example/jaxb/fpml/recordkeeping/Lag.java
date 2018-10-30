
package com.example.jaxb.fpml.recordkeeping;

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
 * An observation period that is offset from a Calculation Period.
 * 
 * <p>Java class for Lag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Lag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lagDuration" type="{http://www.fpml.org/FpML-5/recordkeeping}Period" minOccurs="0"/>
 *         &lt;element name="firstObservationDateOffset" type="{http://www.fpml.org/FpML-5/recordkeeping}Period" minOccurs="0"/>
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
@XmlType(name = "Lag", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "lagDuration",
    "firstObservationDateOffset"
})
public class Lag {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period lagDuration;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period firstObservationDateOffset;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the lagDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getLagDuration() {
        return lagDuration;
    }

    /**
     * Sets the value of the lagDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setLagDuration(Period value) {
        this.lagDuration = value;
    }

    /**
     * Gets the value of the firstObservationDateOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getFirstObservationDateOffset() {
        return firstObservationDateOffset;
    }

    /**
     * Sets the value of the firstObservationDateOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setFirstObservationDateOffset(Period value) {
        this.firstObservationDateOffset = value;
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
