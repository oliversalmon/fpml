
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a set of disruption events and the fallbacks they will invoke
 * 
 * <p>Java class for FxDisruptionProvisions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxDisruptionProvisions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="events" type="{http://www.fpml.org/FpML-5/recordkeeping}FxDisruptionEvents" minOccurs="0"/>
 *         &lt;element name="fallbacks" type="{http://www.fpml.org/FpML-5/recordkeeping}FxDisruptionFallbacks" minOccurs="0"/>
 *         &lt;element name="applicableTerms" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTemplateTerms" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxDisruptionProvisions", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "events",
    "fallbacks",
    "applicableTerms"
})
public class FxDisruptionProvisions {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxDisruptionEvents events;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxDisruptionFallbacks fallbacks;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxTemplateTerms applicableTerms;

    /**
     * Gets the value of the events property.
     * 
     * @return
     *     possible object is
     *     {@link FxDisruptionEvents }
     *     
     */
    public FxDisruptionEvents getEvents() {
        return events;
    }

    /**
     * Sets the value of the events property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxDisruptionEvents }
     *     
     */
    public void setEvents(FxDisruptionEvents value) {
        this.events = value;
    }

    /**
     * Gets the value of the fallbacks property.
     * 
     * @return
     *     possible object is
     *     {@link FxDisruptionFallbacks }
     *     
     */
    public FxDisruptionFallbacks getFallbacks() {
        return fallbacks;
    }

    /**
     * Sets the value of the fallbacks property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxDisruptionFallbacks }
     *     
     */
    public void setFallbacks(FxDisruptionFallbacks value) {
        this.fallbacks = value;
    }

    /**
     * Gets the value of the applicableTerms property.
     * 
     * @return
     *     possible object is
     *     {@link FxTemplateTerms }
     *     
     */
    public FxTemplateTerms getApplicableTerms() {
        return applicableTerms;
    }

    /**
     * Sets the value of the applicableTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTemplateTerms }
     *     
     */
    public void setApplicableTerms(FxTemplateTerms value) {
        this.applicableTerms = value;
    }

}
