
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A description of how a numerical derivative is computed.
 * 
 * <p>Java class for DerivativeCalculationProcedure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivativeCalculationProcedure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="method" type="{http://www.fpml.org/FpML-5/recordkeeping}DerivativeCalculationMethod" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}DerivativeCalculationParameters.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeCalculationProcedure", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "method",
    "perturbationAmount",
    "averaged",
    "perturbationType",
    "derivativeFormula",
    "replacementMarketInput"
})
public class DerivativeCalculationProcedure {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DerivativeCalculationMethod method;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal perturbationAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean averaged;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PerturbationType perturbationType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String derivativeFormula;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PricingStructureReference replacementMarketInput;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeCalculationMethod }
     *     
     */
    public DerivativeCalculationMethod getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeCalculationMethod }
     *     
     */
    public void setMethod(DerivativeCalculationMethod value) {
        this.method = value;
    }

    /**
     * Gets the value of the perturbationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerturbationAmount() {
        return perturbationAmount;
    }

    /**
     * Sets the value of the perturbationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPerturbationAmount(BigDecimal value) {
        this.perturbationAmount = value;
    }

    /**
     * Gets the value of the averaged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAveraged() {
        return averaged;
    }

    /**
     * Sets the value of the averaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAveraged(Boolean value) {
        this.averaged = value;
    }

    /**
     * Gets the value of the perturbationType property.
     * 
     * @return
     *     possible object is
     *     {@link PerturbationType }
     *     
     */
    public PerturbationType getPerturbationType() {
        return perturbationType;
    }

    /**
     * Sets the value of the perturbationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerturbationType }
     *     
     */
    public void setPerturbationType(PerturbationType value) {
        this.perturbationType = value;
    }

    /**
     * Gets the value of the derivativeFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivativeFormula() {
        return derivativeFormula;
    }

    /**
     * Sets the value of the derivativeFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivativeFormula(String value) {
        this.derivativeFormula = value;
    }

    /**
     * Gets the value of the replacementMarketInput property.
     * 
     * @return
     *     possible object is
     *     {@link PricingStructureReference }
     *     
     */
    public PricingStructureReference getReplacementMarketInput() {
        return replacementMarketInput;
    }

    /**
     * Sets the value of the replacementMarketInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingStructureReference }
     *     
     */
    public void setReplacementMarketInput(PricingStructureReference value) {
        this.replacementMarketInput = value;
    }

}
