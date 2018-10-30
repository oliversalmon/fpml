
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining ISDA 2002 Equity Derivative Representations.
 * 
 * <p>Java class for Representations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Representations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nonReliance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="agreementsRegardingHedging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indexDisclaimer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="additionalAcknowledgements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Representations", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "nonReliance",
    "agreementsRegardingHedging",
    "indexDisclaimer",
    "additionalAcknowledgements"
})
public class Representations {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean nonReliance;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean agreementsRegardingHedging;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean indexDisclaimer;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean additionalAcknowledgements;

    /**
     * Gets the value of the nonReliance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonReliance() {
        return nonReliance;
    }

    /**
     * Sets the value of the nonReliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonReliance(Boolean value) {
        this.nonReliance = value;
    }

    /**
     * Gets the value of the agreementsRegardingHedging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgreementsRegardingHedging() {
        return agreementsRegardingHedging;
    }

    /**
     * Sets the value of the agreementsRegardingHedging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgreementsRegardingHedging(Boolean value) {
        this.agreementsRegardingHedging = value;
    }

    /**
     * Gets the value of the indexDisclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndexDisclaimer() {
        return indexDisclaimer;
    }

    /**
     * Sets the value of the indexDisclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndexDisclaimer(Boolean value) {
        this.indexDisclaimer = value;
    }

    /**
     * Gets the value of the additionalAcknowledgements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalAcknowledgements() {
        return additionalAcknowledgements;
    }

    /**
     * Sets the value of the additionalAcknowledgements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalAcknowledgements(Boolean value) {
        this.additionalAcknowledgements = value;
    }

}
