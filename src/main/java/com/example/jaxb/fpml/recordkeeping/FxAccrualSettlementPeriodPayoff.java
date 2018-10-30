
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Payoff region
 * 
 * <p>Java class for FxAccrualSettlementPeriodPayoff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAccrualSettlementPeriodPayoff">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payoffRegionReference" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualPayoffRegionReference" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="strike" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *             &lt;element name="counterCurrencyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="averageStrikeFixingDates" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementPeriodFixingDates"/>
 *         &lt;/choice>
 *         &lt;element name="averageRateFixingDates" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementPeriodFixingDates" minOccurs="0"/>
 *         &lt;element name="lowerBound" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="upperBound" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="leverage" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementPeriodLeverage" minOccurs="0"/>
 *         &lt;element name="payoffCap" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxAccrualSettlementPeriodPayoff", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "payoffRegionReference",
    "strike",
    "counterCurrencyAmount",
    "averageStrikeFixingDates",
    "averageRateFixingDates",
    "lowerBound",
    "upperBound",
    "leverage",
    "payoffCap"
})
public class FxAccrualSettlementPeriodPayoff {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxAccrualPayoffRegionReference payoffRegionReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal strike;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal counterCurrencyAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SettlementPeriodFixingDates averageStrikeFixingDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SettlementPeriodFixingDates averageRateFixingDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal lowerBound;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal upperBound;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SettlementPeriodLeverage leverage;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal payoffCap;

    /**
     * Gets the value of the payoffRegionReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxAccrualPayoffRegionReference }
     *     
     */
    public FxAccrualPayoffRegionReference getPayoffRegionReference() {
        return payoffRegionReference;
    }

    /**
     * Sets the value of the payoffRegionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxAccrualPayoffRegionReference }
     *     
     */
    public void setPayoffRegionReference(FxAccrualPayoffRegionReference value) {
        this.payoffRegionReference = value;
    }

    /**
     * Gets the value of the strike property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrike() {
        return strike;
    }

    /**
     * Sets the value of the strike property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrike(BigDecimal value) {
        this.strike = value;
    }

    /**
     * Gets the value of the counterCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCounterCurrencyAmount() {
        return counterCurrencyAmount;
    }

    /**
     * Sets the value of the counterCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCounterCurrencyAmount(BigDecimal value) {
        this.counterCurrencyAmount = value;
    }

    /**
     * Gets the value of the averageStrikeFixingDates property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementPeriodFixingDates }
     *     
     */
    public SettlementPeriodFixingDates getAverageStrikeFixingDates() {
        return averageStrikeFixingDates;
    }

    /**
     * Sets the value of the averageStrikeFixingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementPeriodFixingDates }
     *     
     */
    public void setAverageStrikeFixingDates(SettlementPeriodFixingDates value) {
        this.averageStrikeFixingDates = value;
    }

    /**
     * Gets the value of the averageRateFixingDates property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementPeriodFixingDates }
     *     
     */
    public SettlementPeriodFixingDates getAverageRateFixingDates() {
        return averageRateFixingDates;
    }

    /**
     * Sets the value of the averageRateFixingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementPeriodFixingDates }
     *     
     */
    public void setAverageRateFixingDates(SettlementPeriodFixingDates value) {
        this.averageRateFixingDates = value;
    }

    /**
     * Gets the value of the lowerBound property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowerBound() {
        return lowerBound;
    }

    /**
     * Sets the value of the lowerBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowerBound(BigDecimal value) {
        this.lowerBound = value;
    }

    /**
     * Gets the value of the upperBound property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpperBound() {
        return upperBound;
    }

    /**
     * Sets the value of the upperBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpperBound(BigDecimal value) {
        this.upperBound = value;
    }

    /**
     * Gets the value of the leverage property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementPeriodLeverage }
     *     
     */
    public SettlementPeriodLeverage getLeverage() {
        return leverage;
    }

    /**
     * Sets the value of the leverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementPeriodLeverage }
     *     
     */
    public void setLeverage(SettlementPeriodLeverage value) {
        this.leverage = value;
    }

    /**
     * Gets the value of the payoffCap property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayoffCap() {
        return payoffCap;
    }

    /**
     * Sets the value of the payoffCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPayoffCap(BigDecimal value) {
        this.payoffCap = value;
    }

}
