
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleCreditDefaultSwap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleCreditDefaultSwap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}UnderlyingAsset">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CreditEntity.model"/>
 *         &lt;element name="term" type="{http://www.fpml.org/FpML-5/recordkeeping}Period" minOccurs="0"/>
 *         &lt;element name="paymentFrequency" type="{http://www.fpml.org/FpML-5/recordkeeping}Period" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleCreditDefaultSwap", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "referenceEntity",
    "creditEntityReference",
    "term",
    "paymentFrequency"
})
public class SimpleCreditDefaultSwap
    extends UnderlyingAsset
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected LegalEntity referenceEntity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected LegalEntityReference creditEntityReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period term;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period paymentFrequency;

    /**
     * Gets the value of the referenceEntity property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntity }
     *     
     */
    public LegalEntity getReferenceEntity() {
        return referenceEntity;
    }

    /**
     * Sets the value of the referenceEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntity }
     *     
     */
    public void setReferenceEntity(LegalEntity value) {
        this.referenceEntity = value;
    }

    /**
     * Gets the value of the creditEntityReference property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityReference }
     *     
     */
    public LegalEntityReference getCreditEntityReference() {
        return creditEntityReference;
    }

    /**
     * Sets the value of the creditEntityReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityReference }
     *     
     */
    public void setCreditEntityReference(LegalEntityReference value) {
        this.creditEntityReference = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setTerm(Period value) {
        this.term = value;
    }

    /**
     * Gets the value of the paymentFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPaymentFrequency() {
        return paymentFrequency;
    }

    /**
     * Sets the value of the paymentFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPaymentFrequency(Period value) {
        this.paymentFrequency = value;
    }

}
