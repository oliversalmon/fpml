
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A generic credit curve definition.
 * 
 * <p>Java class for CreditCurve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCurve">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PricingStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CreditCurveCharacteristics.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCurve", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "referenceEntity",
    "creditEntityReference",
    "creditEvents",
    "seniority",
    "secured",
    "obligationCurrency",
    "obligations",
    "deliverableObligations"
})
public class CreditCurve
    extends PricingStructure
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected LegalEntity referenceEntity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected LegalEntityReference creditEntityReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CreditEvents creditEvents;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CreditSeniority seniority;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean secured;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Currency obligationCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Obligations obligations;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DeliverableObligations deliverableObligations;

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
     * Gets the value of the creditEvents property.
     * 
     * @return
     *     possible object is
     *     {@link CreditEvents }
     *     
     */
    public CreditEvents getCreditEvents() {
        return creditEvents;
    }

    /**
     * Sets the value of the creditEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditEvents }
     *     
     */
    public void setCreditEvents(CreditEvents value) {
        this.creditEvents = value;
    }

    /**
     * Gets the value of the seniority property.
     * 
     * @return
     *     possible object is
     *     {@link CreditSeniority }
     *     
     */
    public CreditSeniority getSeniority() {
        return seniority;
    }

    /**
     * Sets the value of the seniority property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSeniority }
     *     
     */
    public void setSeniority(CreditSeniority value) {
        this.seniority = value;
    }

    /**
     * Gets the value of the secured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecured() {
        return secured;
    }

    /**
     * Sets the value of the secured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecured(Boolean value) {
        this.secured = value;
    }

    /**
     * Gets the value of the obligationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getObligationCurrency() {
        return obligationCurrency;
    }

    /**
     * Sets the value of the obligationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setObligationCurrency(Currency value) {
        this.obligationCurrency = value;
    }

    /**
     * Gets the value of the obligations property.
     * 
     * @return
     *     possible object is
     *     {@link Obligations }
     *     
     */
    public Obligations getObligations() {
        return obligations;
    }

    /**
     * Sets the value of the obligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligations }
     *     
     */
    public void setObligations(Obligations value) {
        this.obligations = value;
    }

    /**
     * Gets the value of the deliverableObligations property.
     * 
     * @return
     *     possible object is
     *     {@link DeliverableObligations }
     *     
     */
    public DeliverableObligations getDeliverableObligations() {
        return deliverableObligations;
    }

    /**
     * Sets the value of the deliverableObligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliverableObligations }
     *     
     */
    public void setDeliverableObligations(DeliverableObligations value) {
        this.deliverableObligations = value;
    }

}
