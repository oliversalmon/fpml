
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining exercise procedures for equity options.
 * 
 * <p>Java class for EquityExerciseValuationSettlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityExerciseValuationSettlement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="equityEuropeanExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityEuropeanExercise"/>
 *           &lt;element name="equityAmericanExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityAmericanExercise"/>
 *           &lt;element name="equityBermudaExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityBermudaExercise"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="automaticExercise" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *             &lt;element name="makeWholeProvisions" type="{http://www.fpml.org/FpML-5/recordkeeping}MakeWholeProvisions" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="prePayment" type="{http://www.fpml.org/FpML-5/recordkeeping}PrePayment"/>
 *         &lt;/choice>
 *         &lt;element name="equityValuation" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityValuation" minOccurs="0"/>
 *         &lt;element name="settlementDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;element name="settlementCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}Currency" minOccurs="0"/>
 *         &lt;element name="settlementPriceSource" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementPriceSource" minOccurs="0"/>
 *         &lt;element name="settlementType" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementTypeEnum" minOccurs="0"/>
 *         &lt;element name="settlementMethodElectionDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;element name="settlementMethodElectingPartyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;element name="settlementPriceDefaultElection" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementPriceDefaultElection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityExerciseValuationSettlement", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "equityEuropeanExercise",
    "equityAmericanExercise",
    "equityBermudaExercise",
    "automaticExercise",
    "makeWholeProvisions",
    "prePayment",
    "equityValuation",
    "settlementDate",
    "settlementCurrency",
    "settlementPriceSource",
    "settlementType",
    "settlementMethodElectionDate",
    "settlementMethodElectingPartyReference",
    "settlementPriceDefaultElection"
})
public class EquityExerciseValuationSettlement {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EquityEuropeanExercise equityEuropeanExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EquityAmericanExercise equityAmericanExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EquityBermudaExercise equityBermudaExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean automaticExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MakeWholeProvisions makeWholeProvisions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PrePayment prePayment;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EquityValuation equityValuation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDate settlementDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Currency settlementCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SettlementPriceSource settlementPriceSource;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected SettlementTypeEnum settlementType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDate settlementMethodElectionDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference settlementMethodElectingPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SettlementPriceDefaultElection settlementPriceDefaultElection;

    /**
     * Gets the value of the equityEuropeanExercise property.
     * 
     * @return
     *     possible object is
     *     {@link EquityEuropeanExercise }
     *     
     */
    public EquityEuropeanExercise getEquityEuropeanExercise() {
        return equityEuropeanExercise;
    }

    /**
     * Sets the value of the equityEuropeanExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityEuropeanExercise }
     *     
     */
    public void setEquityEuropeanExercise(EquityEuropeanExercise value) {
        this.equityEuropeanExercise = value;
    }

    /**
     * Gets the value of the equityAmericanExercise property.
     * 
     * @return
     *     possible object is
     *     {@link EquityAmericanExercise }
     *     
     */
    public EquityAmericanExercise getEquityAmericanExercise() {
        return equityAmericanExercise;
    }

    /**
     * Sets the value of the equityAmericanExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityAmericanExercise }
     *     
     */
    public void setEquityAmericanExercise(EquityAmericanExercise value) {
        this.equityAmericanExercise = value;
    }

    /**
     * Gets the value of the equityBermudaExercise property.
     * 
     * @return
     *     possible object is
     *     {@link EquityBermudaExercise }
     *     
     */
    public EquityBermudaExercise getEquityBermudaExercise() {
        return equityBermudaExercise;
    }

    /**
     * Sets the value of the equityBermudaExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityBermudaExercise }
     *     
     */
    public void setEquityBermudaExercise(EquityBermudaExercise value) {
        this.equityBermudaExercise = value;
    }

    /**
     * Gets the value of the automaticExercise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticExercise() {
        return automaticExercise;
    }

    /**
     * Sets the value of the automaticExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticExercise(Boolean value) {
        this.automaticExercise = value;
    }

    /**
     * Gets the value of the makeWholeProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link MakeWholeProvisions }
     *     
     */
    public MakeWholeProvisions getMakeWholeProvisions() {
        return makeWholeProvisions;
    }

    /**
     * Sets the value of the makeWholeProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MakeWholeProvisions }
     *     
     */
    public void setMakeWholeProvisions(MakeWholeProvisions value) {
        this.makeWholeProvisions = value;
    }

    /**
     * Gets the value of the prePayment property.
     * 
     * @return
     *     possible object is
     *     {@link PrePayment }
     *     
     */
    public PrePayment getPrePayment() {
        return prePayment;
    }

    /**
     * Sets the value of the prePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePayment }
     *     
     */
    public void setPrePayment(PrePayment value) {
        this.prePayment = value;
    }

    /**
     * Gets the value of the equityValuation property.
     * 
     * @return
     *     possible object is
     *     {@link EquityValuation }
     *     
     */
    public EquityValuation getEquityValuation() {
        return equityValuation;
    }

    /**
     * Sets the value of the equityValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityValuation }
     *     
     */
    public void setEquityValuation(EquityValuation value) {
        this.equityValuation = value;
    }

    /**
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setSettlementDate(AdjustableOrRelativeDate value) {
        this.settlementDate = value;
    }

    /**
     * Gets the value of the settlementCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getSettlementCurrency() {
        return settlementCurrency;
    }

    /**
     * Sets the value of the settlementCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setSettlementCurrency(Currency value) {
        this.settlementCurrency = value;
    }

    /**
     * Gets the value of the settlementPriceSource property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementPriceSource }
     *     
     */
    public SettlementPriceSource getSettlementPriceSource() {
        return settlementPriceSource;
    }

    /**
     * Sets the value of the settlementPriceSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementPriceSource }
     *     
     */
    public void setSettlementPriceSource(SettlementPriceSource value) {
        this.settlementPriceSource = value;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public SettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public void setSettlementType(SettlementTypeEnum value) {
        this.settlementType = value;
    }

    /**
     * Gets the value of the settlementMethodElectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getSettlementMethodElectionDate() {
        return settlementMethodElectionDate;
    }

    /**
     * Sets the value of the settlementMethodElectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setSettlementMethodElectionDate(AdjustableOrRelativeDate value) {
        this.settlementMethodElectionDate = value;
    }

    /**
     * Gets the value of the settlementMethodElectingPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getSettlementMethodElectingPartyReference() {
        return settlementMethodElectingPartyReference;
    }

    /**
     * Sets the value of the settlementMethodElectingPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setSettlementMethodElectingPartyReference(PartyReference value) {
        this.settlementMethodElectingPartyReference = value;
    }

    /**
     * Gets the value of the settlementPriceDefaultElection property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementPriceDefaultElection }
     *     
     */
    public SettlementPriceDefaultElection getSettlementPriceDefaultElection() {
        return settlementPriceDefaultElection;
    }

    /**
     * Sets the value of the settlementPriceDefaultElection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementPriceDefaultElection }
     *     
     */
    public void setSettlementPriceDefaultElection(SettlementPriceDefaultElection value) {
        this.settlementPriceDefaultElection = value;
    }

}
