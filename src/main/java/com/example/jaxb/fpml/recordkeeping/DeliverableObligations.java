
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliverableObligations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliverableObligations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accruedInterest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.fpml.org/FpML-5/recordkeeping}ObligationCategoryEnum" minOccurs="0"/>
 *         &lt;element name="notSubordinated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="specifiedCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}SpecifiedCurrency" minOccurs="0"/>
 *         &lt;element name="notSovereignLender" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notDomesticCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}NotDomesticCurrency" minOccurs="0"/>
 *         &lt;element name="notDomesticLaw" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="listed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notContingent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notDomesticIssuance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="assignableLoan" type="{http://www.fpml.org/FpML-5/recordkeeping}PCDeliverableObligationCharac" minOccurs="0"/>
 *         &lt;element name="consentRequiredLoan" type="{http://www.fpml.org/FpML-5/recordkeeping}PCDeliverableObligationCharac" minOccurs="0"/>
 *         &lt;element name="directLoanParticipation" type="{http://www.fpml.org/FpML-5/recordkeeping}LoanParticipation" minOccurs="0"/>
 *         &lt;element name="transferable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maximumMaturity" type="{http://www.fpml.org/FpML-5/recordkeeping}Period" minOccurs="0"/>
 *         &lt;element name="acceleratedOrMatured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notBearer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="fullFaithAndCreditObLiability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="generalFundObligationLiability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="revenueObligationLiability" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
 *         &lt;element name="indirectLoanParticipation" type="{http://www.fpml.org/FpML-5/recordkeeping}LoanParticipation" minOccurs="0"/>
 *         &lt;element name="excluded" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *         &lt;element name="othReferenceEntityObligations" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliverableObligations", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "accruedInterest",
    "category",
    "notSubordinated",
    "specifiedCurrency",
    "notSovereignLender",
    "notDomesticCurrency",
    "notDomesticLaw",
    "listed",
    "notContingent",
    "notDomesticIssuance",
    "assignableLoan",
    "consentRequiredLoan",
    "directLoanParticipation",
    "transferable",
    "maximumMaturity",
    "acceleratedOrMatured",
    "notBearer",
    "fullFaithAndCreditObLiability",
    "generalFundObligationLiability",
    "revenueObligationLiability",
    "indirectLoanParticipation",
    "excluded",
    "othReferenceEntityObligations"
})
public class DeliverableObligations {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean accruedInterest;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected ObligationCategoryEnum category;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean notSubordinated;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SpecifiedCurrency specifiedCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean notSovereignLender;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NotDomesticCurrency notDomesticCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean notDomesticLaw;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean listed;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean notContingent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean notDomesticIssuance;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PCDeliverableObligationCharac assignableLoan;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PCDeliverableObligationCharac consentRequiredLoan;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected LoanParticipation directLoanParticipation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean transferable;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period maximumMaturity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean acceleratedOrMatured;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean notBearer;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean fullFaithAndCreditObLiability;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean generalFundObligationLiability;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean revenueObligationLiability;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected LoanParticipation indirectLoanParticipation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String excluded;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String othReferenceEntityObligations;

    /**
     * Gets the value of the accruedInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccruedInterest() {
        return accruedInterest;
    }

    /**
     * Sets the value of the accruedInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccruedInterest(Boolean value) {
        this.accruedInterest = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ObligationCategoryEnum }
     *     
     */
    public ObligationCategoryEnum getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObligationCategoryEnum }
     *     
     */
    public void setCategory(ObligationCategoryEnum value) {
        this.category = value;
    }

    /**
     * Gets the value of the notSubordinated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotSubordinated() {
        return notSubordinated;
    }

    /**
     * Sets the value of the notSubordinated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotSubordinated(Boolean value) {
        this.notSubordinated = value;
    }

    /**
     * Gets the value of the specifiedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedCurrency }
     *     
     */
    public SpecifiedCurrency getSpecifiedCurrency() {
        return specifiedCurrency;
    }

    /**
     * Sets the value of the specifiedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedCurrency }
     *     
     */
    public void setSpecifiedCurrency(SpecifiedCurrency value) {
        this.specifiedCurrency = value;
    }

    /**
     * Gets the value of the notSovereignLender property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotSovereignLender() {
        return notSovereignLender;
    }

    /**
     * Sets the value of the notSovereignLender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotSovereignLender(Boolean value) {
        this.notSovereignLender = value;
    }

    /**
     * Gets the value of the notDomesticCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link NotDomesticCurrency }
     *     
     */
    public NotDomesticCurrency getNotDomesticCurrency() {
        return notDomesticCurrency;
    }

    /**
     * Sets the value of the notDomesticCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotDomesticCurrency }
     *     
     */
    public void setNotDomesticCurrency(NotDomesticCurrency value) {
        this.notDomesticCurrency = value;
    }

    /**
     * Gets the value of the notDomesticLaw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotDomesticLaw() {
        return notDomesticLaw;
    }

    /**
     * Sets the value of the notDomesticLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotDomesticLaw(Boolean value) {
        this.notDomesticLaw = value;
    }

    /**
     * Gets the value of the listed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListed() {
        return listed;
    }

    /**
     * Sets the value of the listed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListed(Boolean value) {
        this.listed = value;
    }

    /**
     * Gets the value of the notContingent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotContingent() {
        return notContingent;
    }

    /**
     * Sets the value of the notContingent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotContingent(Boolean value) {
        this.notContingent = value;
    }

    /**
     * Gets the value of the notDomesticIssuance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotDomesticIssuance() {
        return notDomesticIssuance;
    }

    /**
     * Sets the value of the notDomesticIssuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotDomesticIssuance(Boolean value) {
        this.notDomesticIssuance = value;
    }

    /**
     * Gets the value of the assignableLoan property.
     * 
     * @return
     *     possible object is
     *     {@link PCDeliverableObligationCharac }
     *     
     */
    public PCDeliverableObligationCharac getAssignableLoan() {
        return assignableLoan;
    }

    /**
     * Sets the value of the assignableLoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCDeliverableObligationCharac }
     *     
     */
    public void setAssignableLoan(PCDeliverableObligationCharac value) {
        this.assignableLoan = value;
    }

    /**
     * Gets the value of the consentRequiredLoan property.
     * 
     * @return
     *     possible object is
     *     {@link PCDeliverableObligationCharac }
     *     
     */
    public PCDeliverableObligationCharac getConsentRequiredLoan() {
        return consentRequiredLoan;
    }

    /**
     * Sets the value of the consentRequiredLoan property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCDeliverableObligationCharac }
     *     
     */
    public void setConsentRequiredLoan(PCDeliverableObligationCharac value) {
        this.consentRequiredLoan = value;
    }

    /**
     * Gets the value of the directLoanParticipation property.
     * 
     * @return
     *     possible object is
     *     {@link LoanParticipation }
     *     
     */
    public LoanParticipation getDirectLoanParticipation() {
        return directLoanParticipation;
    }

    /**
     * Sets the value of the directLoanParticipation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanParticipation }
     *     
     */
    public void setDirectLoanParticipation(LoanParticipation value) {
        this.directLoanParticipation = value;
    }

    /**
     * Gets the value of the transferable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferable() {
        return transferable;
    }

    /**
     * Sets the value of the transferable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferable(Boolean value) {
        this.transferable = value;
    }

    /**
     * Gets the value of the maximumMaturity property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getMaximumMaturity() {
        return maximumMaturity;
    }

    /**
     * Sets the value of the maximumMaturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setMaximumMaturity(Period value) {
        this.maximumMaturity = value;
    }

    /**
     * Gets the value of the acceleratedOrMatured property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceleratedOrMatured() {
        return acceleratedOrMatured;
    }

    /**
     * Sets the value of the acceleratedOrMatured property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceleratedOrMatured(Boolean value) {
        this.acceleratedOrMatured = value;
    }

    /**
     * Gets the value of the notBearer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotBearer() {
        return notBearer;
    }

    /**
     * Sets the value of the notBearer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotBearer(Boolean value) {
        this.notBearer = value;
    }

    /**
     * Gets the value of the fullFaithAndCreditObLiability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullFaithAndCreditObLiability() {
        return fullFaithAndCreditObLiability;
    }

    /**
     * Sets the value of the fullFaithAndCreditObLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullFaithAndCreditObLiability(Boolean value) {
        this.fullFaithAndCreditObLiability = value;
    }

    /**
     * Gets the value of the generalFundObligationLiability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeneralFundObligationLiability() {
        return generalFundObligationLiability;
    }

    /**
     * Sets the value of the generalFundObligationLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeneralFundObligationLiability(Boolean value) {
        this.generalFundObligationLiability = value;
    }

    /**
     * Gets the value of the revenueObligationLiability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevenueObligationLiability() {
        return revenueObligationLiability;
    }

    /**
     * Sets the value of the revenueObligationLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRevenueObligationLiability(Boolean value) {
        this.revenueObligationLiability = value;
    }

    /**
     * Gets the value of the indirectLoanParticipation property.
     * 
     * @return
     *     possible object is
     *     {@link LoanParticipation }
     *     
     */
    public LoanParticipation getIndirectLoanParticipation() {
        return indirectLoanParticipation;
    }

    /**
     * Sets the value of the indirectLoanParticipation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanParticipation }
     *     
     */
    public void setIndirectLoanParticipation(LoanParticipation value) {
        this.indirectLoanParticipation = value;
    }

    /**
     * Gets the value of the excluded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcluded(String value) {
        this.excluded = value;
    }

    /**
     * Gets the value of the othReferenceEntityObligations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthReferenceEntityObligations() {
        return othReferenceEntityObligations;
    }

    /**
     * Sets the value of the othReferenceEntityObligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthReferenceEntityObligations(String value) {
        this.othReferenceEntityObligations = value;
    }

}
