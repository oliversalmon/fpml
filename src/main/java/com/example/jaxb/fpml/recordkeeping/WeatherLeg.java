
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A weather leg of a Commodity Swap defines Weather Index Swap transactions. Weather Index Swap transactions are OTC derivative transactions which settle financially based on an index calculated from observations of temperature, precipitation and other weather-related measurements at weather stations throughout the world. Sub-Annex C of the 2005 ISDA Commodity Definitions provides definitions and terms for a number of types of weather indices. These indices include: HDD (heating degree days), CDD (cooling degree days), CPD (critical precipitation days). Weather Index Swap transactions result in a cash flow to one of the two counterparties each Calculation Period depending on the relationship between the Settlement Level and the Weather Index Level. A Weather Index swap transaction always consists of a commodity swap element as a parent to two weatherLeg elements.
 * 
 * <p>Java class for WeatherLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FinancialSwapLeg">
 *       &lt;sequence>
 *         &lt;element name="weatherIndexLevel" type="{http://www.fpml.org/FpML-5/recordkeeping}WeatherIndex"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}WeatherCalculationPeriod.model"/>
 *         &lt;element name="weatherNotionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney"/>
 *         &lt;element name="calculation" type="{http://www.fpml.org/FpML-5/recordkeeping}WeatherLegCalculation"/>
 *         &lt;element name="paymentDates" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityRelativePaymentDates" minOccurs="0"/>
 *         &lt;element name="weatherIndexData" type="{http://www.fpml.org/FpML-5/recordkeeping}WeatherIndexData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "weatherIndexLevel",
    "weatherCalculationPeriods",
    "weatherCalculationPeriodsReference",
    "weatherNotionalAmount",
    "calculation",
    "paymentDates",
    "weatherIndexData"
})
public class WeatherLeg
    extends FinancialSwapLeg
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected WeatherIndex weatherIndexLevel;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected WeatherCalculationPeriods weatherCalculationPeriods;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodsReference weatherCalculationPeriodsReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected NonNegativeMoney weatherNotionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected WeatherLegCalculation calculation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityRelativePaymentDates paymentDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected WeatherIndexData weatherIndexData;

    /**
     * Gets the value of the weatherIndexLevel property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherIndex }
     *     
     */
    public WeatherIndex getWeatherIndexLevel() {
        return weatherIndexLevel;
    }

    /**
     * Sets the value of the weatherIndexLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherIndex }
     *     
     */
    public void setWeatherIndexLevel(WeatherIndex value) {
        this.weatherIndexLevel = value;
    }

    /**
     * Gets the value of the weatherCalculationPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherCalculationPeriods }
     *     
     */
    public WeatherCalculationPeriods getWeatherCalculationPeriods() {
        return weatherCalculationPeriods;
    }

    /**
     * Sets the value of the weatherCalculationPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherCalculationPeriods }
     *     
     */
    public void setWeatherCalculationPeriods(WeatherCalculationPeriods value) {
        this.weatherCalculationPeriods = value;
    }

    /**
     * Gets the value of the weatherCalculationPeriodsReference property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodsReference }
     *     
     */
    public CalculationPeriodsReference getWeatherCalculationPeriodsReference() {
        return weatherCalculationPeriodsReference;
    }

    /**
     * Sets the value of the weatherCalculationPeriodsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodsReference }
     *     
     */
    public void setWeatherCalculationPeriodsReference(CalculationPeriodsReference value) {
        this.weatherCalculationPeriodsReference = value;
    }

    /**
     * Gets the value of the weatherNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getWeatherNotionalAmount() {
        return weatherNotionalAmount;
    }

    /**
     * Sets the value of the weatherNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setWeatherNotionalAmount(NonNegativeMoney value) {
        this.weatherNotionalAmount = value;
    }

    /**
     * Gets the value of the calculation property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherLegCalculation }
     *     
     */
    public WeatherLegCalculation getCalculation() {
        return calculation;
    }

    /**
     * Sets the value of the calculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherLegCalculation }
     *     
     */
    public void setCalculation(WeatherLegCalculation value) {
        this.calculation = value;
    }

    /**
     * Gets the value of the paymentDates property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityRelativePaymentDates }
     *     
     */
    public CommodityRelativePaymentDates getPaymentDates() {
        return paymentDates;
    }

    /**
     * Sets the value of the paymentDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityRelativePaymentDates }
     *     
     */
    public void setPaymentDates(CommodityRelativePaymentDates value) {
        this.paymentDates = value;
    }

    /**
     * Gets the value of the weatherIndexData property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherIndexData }
     *     
     */
    public WeatherIndexData getWeatherIndexData() {
        return weatherIndexData;
    }

    /**
     * Sets the value of the weatherIndexData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherIndexData }
     *     
     */
    public void setWeatherIndexData(WeatherIndexData value) {
        this.weatherIndexData = value;
    }

}
