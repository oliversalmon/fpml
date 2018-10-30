
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the amount that will paid or received on each of the payment dates. This type is used to define both the Equity Amount and the Interest Amount.
 * 
 * <p>Java class for LegAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegAmount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CurrencyAndDeterminationMethod.model" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="referenceAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}ReferenceAmount"/>
 *           &lt;element name="formula" type="{http://www.fpml.org/FpML-5/recordkeeping}Formula"/>
 *           &lt;element name="encodedDescription" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;/choice>
 *         &lt;element name="calculationDates" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableRelativeOrPeriodicDates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegAmount", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "currency",
    "determinationMethod",
    "currencyReference",
    "referenceAmount",
    "formula",
    "encodedDescription",
    "calculationDates"
})
@XmlSeeAlso({
    ReturnSwapAmount.class
})
public class LegAmount {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedCurrency currency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DeterminationMethod determinationMethod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedCurrencyReference currencyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReferenceAmount referenceAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Formula formula;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected byte[] encodedDescription;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableRelativeOrPeriodicDates calculationDates;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public IdentifiedCurrency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public void setCurrency(IdentifiedCurrency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the determinationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeterminationMethod }
     *     
     */
    public DeterminationMethod getDeterminationMethod() {
        return determinationMethod;
    }

    /**
     * Sets the value of the determinationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeterminationMethod }
     *     
     */
    public void setDeterminationMethod(DeterminationMethod value) {
        this.determinationMethod = value;
    }

    /**
     * Gets the value of the currencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedCurrencyReference }
     *     
     */
    public IdentifiedCurrencyReference getCurrencyReference() {
        return currencyReference;
    }

    /**
     * Sets the value of the currencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedCurrencyReference }
     *     
     */
    public void setCurrencyReference(IdentifiedCurrencyReference value) {
        this.currencyReference = value;
    }

    /**
     * Gets the value of the referenceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceAmount }
     *     
     */
    public ReferenceAmount getReferenceAmount() {
        return referenceAmount;
    }

    /**
     * Sets the value of the referenceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceAmount }
     *     
     */
    public void setReferenceAmount(ReferenceAmount value) {
        this.referenceAmount = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link Formula }
     *     
     */
    public Formula getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link Formula }
     *     
     */
    public void setFormula(Formula value) {
        this.formula = value;
    }

    /**
     * Gets the value of the encodedDescription property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncodedDescription() {
        return encodedDescription;
    }

    /**
     * Sets the value of the encodedDescription property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncodedDescription(byte[] value) {
        this.encodedDescription = value;
    }

    /**
     * Gets the value of the calculationDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableRelativeOrPeriodicDates }
     *     
     */
    public AdjustableRelativeOrPeriodicDates getCalculationDates() {
        return calculationDates;
    }

    /**
     * Sets the value of the calculationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableRelativeOrPeriodicDates }
     *     
     */
    public void setCalculationDates(AdjustableRelativeOrPeriodicDates value) {
        this.calculationDates = value;
    }

}
