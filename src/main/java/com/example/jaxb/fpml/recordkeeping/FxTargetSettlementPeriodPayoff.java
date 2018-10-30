
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Payoff region
 * 
 * <p>Java class for FxTargetSettlementPeriodPayoff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTargetSettlementPeriodPayoff">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payoffRegionReference" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetPayoffRegionReference" minOccurs="0"/>
 *         &lt;element name="strike" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="counterCurrencyAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "FxTargetSettlementPeriodPayoff", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "payoffRegionReference",
    "strike",
    "counterCurrencyAmount",
    "lowerBound",
    "upperBound",
    "leverage",
    "payoffCap"
})
public class FxTargetSettlementPeriodPayoff {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxTargetPayoffRegionReference payoffRegionReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected BigDecimal strike;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal counterCurrencyAmount;
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
     *     {@link FxTargetPayoffRegionReference }
     *     
     */
    public FxTargetPayoffRegionReference getPayoffRegionReference() {
        return payoffRegionReference;
    }

    /**
     * Sets the value of the payoffRegionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTargetPayoffRegionReference }
     *     
     */
    public void setPayoffRegionReference(FxTargetPayoffRegionReference value) {
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
