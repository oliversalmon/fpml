
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherIndexData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherIndexData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceLevel" type="{http://www.fpml.org/FpML-5/recordkeeping}ReferenceLevel"/>
 *         &lt;element name="dataProvider" type="{http://www.fpml.org/FpML-5/recordkeeping}DataProvider" minOccurs="0"/>
 *         &lt;element name="finalEditedData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="weatherStation" type="{http://www.fpml.org/FpML-5/recordkeeping}WeatherStation"/>
 *         &lt;element name="weatherStationFallback" type="{http://www.fpml.org/FpML-5/recordkeeping}WeatherStation" minOccurs="0"/>
 *         &lt;element name="weatherStationSecondFallback" type="{http://www.fpml.org/FpML-5/recordkeeping}WeatherStation" minOccurs="0"/>
 *         &lt;element name="alternativeDataProvider" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="synopticDataFallback" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adjustmentToFallbackWeatherStation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="primaryDisruptionFallbacks" type="{http://www.fpml.org/FpML-5/recordkeeping}DisruptionFallback" minOccurs="0"/>
 *         &lt;element name="secondaryDisruptionFallbacks" type="{http://www.fpml.org/FpML-5/recordkeeping}DisruptionFallback" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherIndexData", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "referenceLevel",
    "dataProvider",
    "finalEditedData",
    "weatherStation",
    "weatherStationFallback",
    "weatherStationSecondFallback",
    "alternativeDataProvider",
    "synopticDataFallback",
    "adjustmentToFallbackWeatherStation",
    "primaryDisruptionFallbacks",
    "secondaryDisruptionFallbacks"
})
public class WeatherIndexData {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected ReferenceLevel referenceLevel;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DataProvider dataProvider;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean finalEditedData;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected WeatherStation weatherStation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected WeatherStation weatherStationFallback;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected WeatherStation weatherStationSecondFallback;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean alternativeDataProvider;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean synopticDataFallback;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean adjustmentToFallbackWeatherStation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DisruptionFallback primaryDisruptionFallbacks;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DisruptionFallback secondaryDisruptionFallbacks;

    /**
     * Gets the value of the referenceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLevel }
     *     
     */
    public ReferenceLevel getReferenceLevel() {
        return referenceLevel;
    }

    /**
     * Sets the value of the referenceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLevel }
     *     
     */
    public void setReferenceLevel(ReferenceLevel value) {
        this.referenceLevel = value;
    }

    /**
     * Gets the value of the dataProvider property.
     * 
     * @return
     *     possible object is
     *     {@link DataProvider }
     *     
     */
    public DataProvider getDataProvider() {
        return dataProvider;
    }

    /**
     * Sets the value of the dataProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProvider }
     *     
     */
    public void setDataProvider(DataProvider value) {
        this.dataProvider = value;
    }

    /**
     * Gets the value of the finalEditedData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinalEditedData() {
        return finalEditedData;
    }

    /**
     * Sets the value of the finalEditedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalEditedData(Boolean value) {
        this.finalEditedData = value;
    }

    /**
     * Gets the value of the weatherStation property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherStation }
     *     
     */
    public WeatherStation getWeatherStation() {
        return weatherStation;
    }

    /**
     * Sets the value of the weatherStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherStation }
     *     
     */
    public void setWeatherStation(WeatherStation value) {
        this.weatherStation = value;
    }

    /**
     * Gets the value of the weatherStationFallback property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherStation }
     *     
     */
    public WeatherStation getWeatherStationFallback() {
        return weatherStationFallback;
    }

    /**
     * Sets the value of the weatherStationFallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherStation }
     *     
     */
    public void setWeatherStationFallback(WeatherStation value) {
        this.weatherStationFallback = value;
    }

    /**
     * Gets the value of the weatherStationSecondFallback property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherStation }
     *     
     */
    public WeatherStation getWeatherStationSecondFallback() {
        return weatherStationSecondFallback;
    }

    /**
     * Sets the value of the weatherStationSecondFallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherStation }
     *     
     */
    public void setWeatherStationSecondFallback(WeatherStation value) {
        this.weatherStationSecondFallback = value;
    }

    /**
     * Gets the value of the alternativeDataProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlternativeDataProvider() {
        return alternativeDataProvider;
    }

    /**
     * Sets the value of the alternativeDataProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlternativeDataProvider(Boolean value) {
        this.alternativeDataProvider = value;
    }

    /**
     * Gets the value of the synopticDataFallback property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSynopticDataFallback() {
        return synopticDataFallback;
    }

    /**
     * Sets the value of the synopticDataFallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSynopticDataFallback(Boolean value) {
        this.synopticDataFallback = value;
    }

    /**
     * Gets the value of the adjustmentToFallbackWeatherStation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjustmentToFallbackWeatherStation() {
        return adjustmentToFallbackWeatherStation;
    }

    /**
     * Sets the value of the adjustmentToFallbackWeatherStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdjustmentToFallbackWeatherStation(Boolean value) {
        this.adjustmentToFallbackWeatherStation = value;
    }

    /**
     * Gets the value of the primaryDisruptionFallbacks property.
     * 
     * @return
     *     possible object is
     *     {@link DisruptionFallback }
     *     
     */
    public DisruptionFallback getPrimaryDisruptionFallbacks() {
        return primaryDisruptionFallbacks;
    }

    /**
     * Sets the value of the primaryDisruptionFallbacks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisruptionFallback }
     *     
     */
    public void setPrimaryDisruptionFallbacks(DisruptionFallback value) {
        this.primaryDisruptionFallbacks = value;
    }

    /**
     * Gets the value of the secondaryDisruptionFallbacks property.
     * 
     * @return
     *     possible object is
     *     {@link DisruptionFallback }
     *     
     */
    public DisruptionFallback getSecondaryDisruptionFallbacks() {
        return secondaryDisruptionFallbacks;
    }

    /**
     * Sets the value of the secondaryDisruptionFallbacks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisruptionFallback }
     *     
     */
    public void setSecondaryDisruptionFallbacks(DisruptionFallback value) {
        this.secondaryDisruptionFallbacks = value;
    }

}
