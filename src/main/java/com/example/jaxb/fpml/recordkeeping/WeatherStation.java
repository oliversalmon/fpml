
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Weather Station.
 * 
 * <p>Java class for WeatherStation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherStation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="weatherStationCity" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenter"/>
 *           &lt;element name="weatherStationAirport" type="{http://www.fpml.org/FpML-5/recordkeeping}WeatherStationAirport"/>
 *           &lt;element name="weatherStationWBAN" type="{http://www.fpml.org/FpML-5/recordkeeping}WeatherStationWBAN"/>
 *           &lt;element name="weatherStationWMO" type="{http://www.fpml.org/FpML-5/recordkeeping}WeatherStationWMO"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherStation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "weatherStationCity",
    "weatherStationAirport",
    "weatherStationWBAN",
    "weatherStationWMO"
})
public class WeatherStation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenter weatherStationCity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected WeatherStationAirport weatherStationAirport;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected WeatherStationWBAN weatherStationWBAN;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected WeatherStationWMO weatherStationWMO;

    /**
     * Gets the value of the weatherStationCity property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenter }
     *     
     */
    public BusinessCenter getWeatherStationCity() {
        return weatherStationCity;
    }

    /**
     * Sets the value of the weatherStationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenter }
     *     
     */
    public void setWeatherStationCity(BusinessCenter value) {
        this.weatherStationCity = value;
    }

    /**
     * Gets the value of the weatherStationAirport property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherStationAirport }
     *     
     */
    public WeatherStationAirport getWeatherStationAirport() {
        return weatherStationAirport;
    }

    /**
     * Sets the value of the weatherStationAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherStationAirport }
     *     
     */
    public void setWeatherStationAirport(WeatherStationAirport value) {
        this.weatherStationAirport = value;
    }

    /**
     * Gets the value of the weatherStationWBAN property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherStationWBAN }
     *     
     */
    public WeatherStationWBAN getWeatherStationWBAN() {
        return weatherStationWBAN;
    }

    /**
     * Sets the value of the weatherStationWBAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherStationWBAN }
     *     
     */
    public void setWeatherStationWBAN(WeatherStationWBAN value) {
        this.weatherStationWBAN = value;
    }

    /**
     * Gets the value of the weatherStationWMO property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherStationWMO }
     *     
     */
    public WeatherStationWMO getWeatherStationWMO() {
        return weatherStationWMO;
    }

    /**
     * Sets the value of the weatherStationWMO property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherStationWMO }
     *     
     */
    public void setWeatherStationWMO(WeatherStationWMO value) {
        this.weatherStationWMO = value;
    }

}
