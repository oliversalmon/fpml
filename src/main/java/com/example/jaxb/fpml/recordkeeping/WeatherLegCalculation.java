
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type to capture details of the calculation of the Payment Amount on a Weather Index Transaction.
 * 
 * <p>Java class for WeatherLegCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherLegCalculation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementLevel" type="{http://www.fpml.org/FpML-5/recordkeeping}WeatherSettlementLevelEnum"/>
 *         &lt;element name="referenceLevelEqualsZero" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="calculationDate" type="{http://www.fpml.org/FpML-5/recordkeeping}Period" minOccurs="0"/>
 *         &lt;element name="businessDays" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenter" minOccurs="0"/>
 *         &lt;element name="dataCorrection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="correctionPeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}Period" minOccurs="0"/>
 *         &lt;element name="maximumPaymentAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney" minOccurs="0"/>
 *         &lt;element name="maximumTransactionPaymentAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney" minOccurs="0"/>
 *         &lt;element name="rounding" type="{http://www.fpml.org/FpML-5/recordkeeping}Rounding" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherLegCalculation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "settlementLevel",
    "referenceLevelEqualsZero",
    "calculationDate",
    "businessDays",
    "dataCorrection",
    "correctionPeriod",
    "maximumPaymentAmount",
    "maximumTransactionPaymentAmount",
    "rounding"
})
public class WeatherLegCalculation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected WeatherSettlementLevelEnum settlementLevel;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected boolean referenceLevelEqualsZero;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period calculationDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenter businessDays;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean dataCorrection;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period correctionPeriod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney maximumPaymentAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney maximumTransactionPaymentAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Rounding rounding;

    /**
     * Gets the value of the settlementLevel property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherSettlementLevelEnum }
     *     
     */
    public WeatherSettlementLevelEnum getSettlementLevel() {
        return settlementLevel;
    }

    /**
     * Sets the value of the settlementLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherSettlementLevelEnum }
     *     
     */
    public void setSettlementLevel(WeatherSettlementLevelEnum value) {
        this.settlementLevel = value;
    }

    /**
     * Gets the value of the referenceLevelEqualsZero property.
     * 
     */
    public boolean isReferenceLevelEqualsZero() {
        return referenceLevelEqualsZero;
    }

    /**
     * Sets the value of the referenceLevelEqualsZero property.
     * 
     */
    public void setReferenceLevelEqualsZero(boolean value) {
        this.referenceLevelEqualsZero = value;
    }

    /**
     * Gets the value of the calculationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getCalculationDate() {
        return calculationDate;
    }

    /**
     * Sets the value of the calculationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setCalculationDate(Period value) {
        this.calculationDate = value;
    }

    /**
     * Gets the value of the businessDays property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenter }
     *     
     */
    public BusinessCenter getBusinessDays() {
        return businessDays;
    }

    /**
     * Sets the value of the businessDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenter }
     *     
     */
    public void setBusinessDays(BusinessCenter value) {
        this.businessDays = value;
    }

    /**
     * Gets the value of the dataCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataCorrection() {
        return dataCorrection;
    }

    /**
     * Sets the value of the dataCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataCorrection(Boolean value) {
        this.dataCorrection = value;
    }

    /**
     * Gets the value of the correctionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getCorrectionPeriod() {
        return correctionPeriod;
    }

    /**
     * Sets the value of the correctionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setCorrectionPeriod(Period value) {
        this.correctionPeriod = value;
    }

    /**
     * Gets the value of the maximumPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getMaximumPaymentAmount() {
        return maximumPaymentAmount;
    }

    /**
     * Sets the value of the maximumPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setMaximumPaymentAmount(NonNegativeMoney value) {
        this.maximumPaymentAmount = value;
    }

    /**
     * Gets the value of the maximumTransactionPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getMaximumTransactionPaymentAmount() {
        return maximumTransactionPaymentAmount;
    }

    /**
     * Sets the value of the maximumTransactionPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setMaximumTransactionPaymentAmount(NonNegativeMoney value) {
        this.maximumTransactionPaymentAmount = value;
    }

    /**
     * Gets the value of the rounding property.
     * 
     * @return
     *     possible object is
     *     {@link Rounding }
     *     
     */
    public Rounding getRounding() {
        return rounding;
    }

    /**
     * Sets the value of the rounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rounding }
     *     
     */
    public void setRounding(Rounding value) {
        this.rounding = value;
    }

}
