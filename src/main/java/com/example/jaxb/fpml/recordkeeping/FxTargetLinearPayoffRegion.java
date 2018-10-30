
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A fixing region in which the payoff varies linearly with the fixing value.
 * 
 * <p>Java class for FxTargetLinearPayoffRegion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTargetLinearPayoffRegion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetPayoffRegion">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxExchangedCurrency.model"/>
 *         &lt;element name="strike" type="{http://www.fpml.org/FpML-5/recordkeeping}FxStrike"/>
 *         &lt;element name="counterCurrencyAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeAmountSchedule" minOccurs="0"/>
 *         &lt;element name="lowerBound" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetRegionLowerBound" minOccurs="0"/>
 *         &lt;element name="upperBound" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetRegionUpperBound" minOccurs="0"/>
 *         &lt;element name="leverage" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetLeverage" minOccurs="0"/>
 *         &lt;element name="payoffCap" type="{http://www.fpml.org/FpML-5/recordkeeping}FxPayoffCap" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTargetLinearPayoffRegion", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "exchangedCurrency1",
    "exchangedCurrency2",
    "strike",
    "counterCurrencyAmount",
    "lowerBound",
    "upperBound",
    "leverage",
    "payoffCap"
})
public class FxTargetLinearPayoffRegion
    extends FxTargetPayoffRegion
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FxExchangedCurrency exchangedCurrency1;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FxExchangedCurrency exchangedCurrency2;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FxStrike strike;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeAmountSchedule counterCurrencyAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxTargetRegionLowerBound lowerBound;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxTargetRegionUpperBound upperBound;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxTargetLeverage leverage;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FxPayoffCap> payoffCap;

    /**
     * Gets the value of the exchangedCurrency1 property.
     * 
     * @return
     *     possible object is
     *     {@link FxExchangedCurrency }
     *     
     */
    public FxExchangedCurrency getExchangedCurrency1() {
        return exchangedCurrency1;
    }

    /**
     * Sets the value of the exchangedCurrency1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxExchangedCurrency }
     *     
     */
    public void setExchangedCurrency1(FxExchangedCurrency value) {
        this.exchangedCurrency1 = value;
    }

    /**
     * Gets the value of the exchangedCurrency2 property.
     * 
     * @return
     *     possible object is
     *     {@link FxExchangedCurrency }
     *     
     */
    public FxExchangedCurrency getExchangedCurrency2() {
        return exchangedCurrency2;
    }

    /**
     * Sets the value of the exchangedCurrency2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxExchangedCurrency }
     *     
     */
    public void setExchangedCurrency2(FxExchangedCurrency value) {
        this.exchangedCurrency2 = value;
    }

    /**
     * Gets the value of the strike property.
     * 
     * @return
     *     possible object is
     *     {@link FxStrike }
     *     
     */
    public FxStrike getStrike() {
        return strike;
    }

    /**
     * Sets the value of the strike property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxStrike }
     *     
     */
    public void setStrike(FxStrike value) {
        this.strike = value;
    }

    /**
     * Gets the value of the counterCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeAmountSchedule }
     *     
     */
    public NonNegativeAmountSchedule getCounterCurrencyAmount() {
        return counterCurrencyAmount;
    }

    /**
     * Sets the value of the counterCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeAmountSchedule }
     *     
     */
    public void setCounterCurrencyAmount(NonNegativeAmountSchedule value) {
        this.counterCurrencyAmount = value;
    }

    /**
     * Gets the value of the lowerBound property.
     * 
     * @return
     *     possible object is
     *     {@link FxTargetRegionLowerBound }
     *     
     */
    public FxTargetRegionLowerBound getLowerBound() {
        return lowerBound;
    }

    /**
     * Sets the value of the lowerBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTargetRegionLowerBound }
     *     
     */
    public void setLowerBound(FxTargetRegionLowerBound value) {
        this.lowerBound = value;
    }

    /**
     * Gets the value of the upperBound property.
     * 
     * @return
     *     possible object is
     *     {@link FxTargetRegionUpperBound }
     *     
     */
    public FxTargetRegionUpperBound getUpperBound() {
        return upperBound;
    }

    /**
     * Sets the value of the upperBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTargetRegionUpperBound }
     *     
     */
    public void setUpperBound(FxTargetRegionUpperBound value) {
        this.upperBound = value;
    }

    /**
     * Gets the value of the leverage property.
     * 
     * @return
     *     possible object is
     *     {@link FxTargetLeverage }
     *     
     */
    public FxTargetLeverage getLeverage() {
        return leverage;
    }

    /**
     * Sets the value of the leverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTargetLeverage }
     *     
     */
    public void setLeverage(FxTargetLeverage value) {
        this.leverage = value;
    }

    /**
     * Gets the value of the payoffCap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payoffCap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayoffCap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxPayoffCap }
     * 
     * 
     */
    public List<FxPayoffCap> getPayoffCap() {
        if (payoffCap == null) {
            payoffCap = new ArrayList<FxPayoffCap>();
        }
        return this.payoffCap;
    }

}
