
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the conditions governing the payment of dividends to the receiver of the equity return. With the exception of the dividend payout ratio, which is defined for each of the underlying components.
 * 
 * <p>Java class for DividendConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DividendConditions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dividendReinvestment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dividendEntitlement" type="{http://www.fpml.org/FpML-5/recordkeeping}DividendEntitlementEnum" minOccurs="0"/>
 *         &lt;element name="dividendAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}DividendAmountTypeEnum" minOccurs="0"/>
 *         &lt;element name="dividendPaymentDate" type="{http://www.fpml.org/FpML-5/recordkeeping}DividendPaymentDate" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="dividendPeriodEffectiveDate" type="{http://www.fpml.org/FpML-5/recordkeeping}DateReference" minOccurs="0"/>
 *             &lt;element name="dividendPeriodEndDate" type="{http://www.fpml.org/FpML-5/recordkeeping}DateReference" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="dividendPeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}DividendPeriodEnum"/>
 *         &lt;/choice>
 *         &lt;element name="extraOrdinaryDividends" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;element name="excessDividendAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}DividendAmountTypeEnum" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CurrencyAndDeterminationMethod.model" minOccurs="0"/>
 *         &lt;element name="dividendFxTriggerDate" type="{http://www.fpml.org/FpML-5/recordkeeping}DividendPaymentDate" minOccurs="0"/>
 *         &lt;element name="interestAccrualsMethod" type="{http://www.fpml.org/FpML-5/recordkeeping}InterestAccrualsCompoundingMethod" minOccurs="0"/>
 *         &lt;element name="numberOfIndexUnits" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeDecimal" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}DeclaredCashAndCashEquivalentDividendPercentage.model"/>
 *         &lt;element name="nonCashDividendTreatment" type="{http://www.fpml.org/FpML-5/recordkeeping}NonCashDividendTreatmentEnum" minOccurs="0"/>
 *         &lt;element name="dividendComposition" type="{http://www.fpml.org/FpML-5/recordkeeping}DividendCompositionEnum" minOccurs="0"/>
 *         &lt;element name="specialDividends" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DividendConditions", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "dividendReinvestment",
    "dividendEntitlement",
    "dividendAmount",
    "dividendPaymentDate",
    "dividendPeriodEffectiveDate",
    "dividendPeriodEndDate",
    "dividendPeriod",
    "extraOrdinaryDividends",
    "excessDividendAmount",
    "currency",
    "determinationMethod",
    "currencyReference",
    "dividendFxTriggerDate",
    "interestAccrualsMethod",
    "numberOfIndexUnits",
    "declaredCashDividendPercentage",
    "declaredCashEquivalentDividendPercentage",
    "nonCashDividendTreatment",
    "dividendComposition",
    "specialDividends"
})
public class DividendConditions {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean dividendReinvestment;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected DividendEntitlementEnum dividendEntitlement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected DividendAmountTypeEnum dividendAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DividendPaymentDate dividendPaymentDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DateReference dividendPeriodEffectiveDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DateReference dividendPeriodEndDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected DividendPeriodEnum dividendPeriod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference extraOrdinaryDividends;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected DividendAmountTypeEnum excessDividendAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedCurrency currency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DeterminationMethod determinationMethod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedCurrencyReference currencyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DividendPaymentDate dividendFxTriggerDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected InterestAccrualsCompoundingMethod interestAccrualsMethod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal numberOfIndexUnits;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal declaredCashDividendPercentage;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal declaredCashEquivalentDividendPercentage;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected NonCashDividendTreatmentEnum nonCashDividendTreatment;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected DividendCompositionEnum dividendComposition;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean specialDividends;

    /**
     * Gets the value of the dividendReinvestment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDividendReinvestment() {
        return dividendReinvestment;
    }

    /**
     * Sets the value of the dividendReinvestment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDividendReinvestment(Boolean value) {
        this.dividendReinvestment = value;
    }

    /**
     * Gets the value of the dividendEntitlement property.
     * 
     * @return
     *     possible object is
     *     {@link DividendEntitlementEnum }
     *     
     */
    public DividendEntitlementEnum getDividendEntitlement() {
        return dividendEntitlement;
    }

    /**
     * Sets the value of the dividendEntitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendEntitlementEnum }
     *     
     */
    public void setDividendEntitlement(DividendEntitlementEnum value) {
        this.dividendEntitlement = value;
    }

    /**
     * Gets the value of the dividendAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DividendAmountTypeEnum }
     *     
     */
    public DividendAmountTypeEnum getDividendAmount() {
        return dividendAmount;
    }

    /**
     * Sets the value of the dividendAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendAmountTypeEnum }
     *     
     */
    public void setDividendAmount(DividendAmountTypeEnum value) {
        this.dividendAmount = value;
    }

    /**
     * Gets the value of the dividendPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DividendPaymentDate }
     *     
     */
    public DividendPaymentDate getDividendPaymentDate() {
        return dividendPaymentDate;
    }

    /**
     * Sets the value of the dividendPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendPaymentDate }
     *     
     */
    public void setDividendPaymentDate(DividendPaymentDate value) {
        this.dividendPaymentDate = value;
    }

    /**
     * Gets the value of the dividendPeriodEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateReference }
     *     
     */
    public DateReference getDividendPeriodEffectiveDate() {
        return dividendPeriodEffectiveDate;
    }

    /**
     * Sets the value of the dividendPeriodEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateReference }
     *     
     */
    public void setDividendPeriodEffectiveDate(DateReference value) {
        this.dividendPeriodEffectiveDate = value;
    }

    /**
     * Gets the value of the dividendPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateReference }
     *     
     */
    public DateReference getDividendPeriodEndDate() {
        return dividendPeriodEndDate;
    }

    /**
     * Sets the value of the dividendPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateReference }
     *     
     */
    public void setDividendPeriodEndDate(DateReference value) {
        this.dividendPeriodEndDate = value;
    }

    /**
     * Gets the value of the dividendPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DividendPeriodEnum }
     *     
     */
    public DividendPeriodEnum getDividendPeriod() {
        return dividendPeriod;
    }

    /**
     * Sets the value of the dividendPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendPeriodEnum }
     *     
     */
    public void setDividendPeriod(DividendPeriodEnum value) {
        this.dividendPeriod = value;
    }

    /**
     * Gets the value of the extraOrdinaryDividends property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getExtraOrdinaryDividends() {
        return extraOrdinaryDividends;
    }

    /**
     * Sets the value of the extraOrdinaryDividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setExtraOrdinaryDividends(PartyReference value) {
        this.extraOrdinaryDividends = value;
    }

    /**
     * Gets the value of the excessDividendAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DividendAmountTypeEnum }
     *     
     */
    public DividendAmountTypeEnum getExcessDividendAmount() {
        return excessDividendAmount;
    }

    /**
     * Sets the value of the excessDividendAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendAmountTypeEnum }
     *     
     */
    public void setExcessDividendAmount(DividendAmountTypeEnum value) {
        this.excessDividendAmount = value;
    }

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
     * Gets the value of the dividendFxTriggerDate property.
     * 
     * @return
     *     possible object is
     *     {@link DividendPaymentDate }
     *     
     */
    public DividendPaymentDate getDividendFxTriggerDate() {
        return dividendFxTriggerDate;
    }

    /**
     * Sets the value of the dividendFxTriggerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendPaymentDate }
     *     
     */
    public void setDividendFxTriggerDate(DividendPaymentDate value) {
        this.dividendFxTriggerDate = value;
    }

    /**
     * Gets the value of the interestAccrualsMethod property.
     * 
     * @return
     *     possible object is
     *     {@link InterestAccrualsCompoundingMethod }
     *     
     */
    public InterestAccrualsCompoundingMethod getInterestAccrualsMethod() {
        return interestAccrualsMethod;
    }

    /**
     * Sets the value of the interestAccrualsMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestAccrualsCompoundingMethod }
     *     
     */
    public void setInterestAccrualsMethod(InterestAccrualsCompoundingMethod value) {
        this.interestAccrualsMethod = value;
    }

    /**
     * Gets the value of the numberOfIndexUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumberOfIndexUnits() {
        return numberOfIndexUnits;
    }

    /**
     * Sets the value of the numberOfIndexUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumberOfIndexUnits(BigDecimal value) {
        this.numberOfIndexUnits = value;
    }

    /**
     * Gets the value of the declaredCashDividendPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeclaredCashDividendPercentage() {
        return declaredCashDividendPercentage;
    }

    /**
     * Sets the value of the declaredCashDividendPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeclaredCashDividendPercentage(BigDecimal value) {
        this.declaredCashDividendPercentage = value;
    }

    /**
     * Gets the value of the declaredCashEquivalentDividendPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeclaredCashEquivalentDividendPercentage() {
        return declaredCashEquivalentDividendPercentage;
    }

    /**
     * Sets the value of the declaredCashEquivalentDividendPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeclaredCashEquivalentDividendPercentage(BigDecimal value) {
        this.declaredCashEquivalentDividendPercentage = value;
    }

    /**
     * Gets the value of the nonCashDividendTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link NonCashDividendTreatmentEnum }
     *     
     */
    public NonCashDividendTreatmentEnum getNonCashDividendTreatment() {
        return nonCashDividendTreatment;
    }

    /**
     * Sets the value of the nonCashDividendTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonCashDividendTreatmentEnum }
     *     
     */
    public void setNonCashDividendTreatment(NonCashDividendTreatmentEnum value) {
        this.nonCashDividendTreatment = value;
    }

    /**
     * Gets the value of the dividendComposition property.
     * 
     * @return
     *     possible object is
     *     {@link DividendCompositionEnum }
     *     
     */
    public DividendCompositionEnum getDividendComposition() {
        return dividendComposition;
    }

    /**
     * Sets the value of the dividendComposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendCompositionEnum }
     *     
     */
    public void setDividendComposition(DividendCompositionEnum value) {
        this.dividendComposition = value;
    }

    /**
     * Gets the value of the specialDividends property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialDividends() {
        return specialDividends;
    }

    /**
     * Sets the value of the specialDividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialDividends(Boolean value) {
        this.specialDividends = value;
    }

}
