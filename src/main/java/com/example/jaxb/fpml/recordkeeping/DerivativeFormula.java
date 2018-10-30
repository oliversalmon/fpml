
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A formula for computing a complex derivative from partial derivatives. Its value is the sum of the terms divided by the product of the denominator terms.
 * 
 * <p>Java class for DerivativeFormula complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivativeFormula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="term" type="{http://www.fpml.org/FpML-5/recordkeeping}FormulaTerm" minOccurs="0"/>
 *         &lt;element name="denominatorTerm" type="{http://www.fpml.org/FpML-5/recordkeeping}DenominatorTerm" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeFormula", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "term",
    "denominatorTerm"
})
public class DerivativeFormula {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FormulaTerm term;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DenominatorTerm denominatorTerm;

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link FormulaTerm }
     *     
     */
    public FormulaTerm getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormulaTerm }
     *     
     */
    public void setTerm(FormulaTerm value) {
        this.term = value;
    }

    /**
     * Gets the value of the denominatorTerm property.
     * 
     * @return
     *     possible object is
     *     {@link DenominatorTerm }
     *     
     */
    public DenominatorTerm getDenominatorTerm() {
        return denominatorTerm;
    }

    /**
     * Sets the value of the denominatorTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DenominatorTerm }
     *     
     */
    public void setDenominatorTerm(DenominatorTerm value) {
        this.denominatorTerm = value;
    }

}
