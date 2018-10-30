
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The substitution of a pricing input (e.g. curve) for another, used in generating prices and risks for valuation scenarios.
 * 
 * <p>Java class for PricingInputReplacement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingInputReplacement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originalInputReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PricingStructureReference" minOccurs="0"/>
 *         &lt;element name="replacementInputReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PricingStructureReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingInputReplacement", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "originalInputReference",
    "replacementInputReference"
})
public class PricingInputReplacement {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PricingStructureReference originalInputReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PricingStructureReference replacementInputReference;

    /**
     * Gets the value of the originalInputReference property.
     * 
     * @return
     *     possible object is
     *     {@link PricingStructureReference }
     *     
     */
    public PricingStructureReference getOriginalInputReference() {
        return originalInputReference;
    }

    /**
     * Sets the value of the originalInputReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingStructureReference }
     *     
     */
    public void setOriginalInputReference(PricingStructureReference value) {
        this.originalInputReference = value;
    }

    /**
     * Gets the value of the replacementInputReference property.
     * 
     * @return
     *     possible object is
     *     {@link PricingStructureReference }
     *     
     */
    public PricingStructureReference getReplacementInputReference() {
        return replacementInputReference;
    }

    /**
     * Sets the value of the replacementInputReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingStructureReference }
     *     
     */
    public void setReplacementInputReference(PricingStructureReference value) {
        this.replacementInputReference = value;
    }

}
