
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A generic yield curve object, which can be valued in a variety of ways.
 * 
 * <p>Java class for YieldCurve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YieldCurve">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PricingStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}YieldCurveCharacteristics.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YieldCurve", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "algorithm",
    "forecastRateIndex"
})
public class YieldCurve
    extends PricingStructure
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String algorithm;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ForecastRateIndex forecastRateIndex;

    /**
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the forecastRateIndex property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastRateIndex }
     *     
     */
    public ForecastRateIndex getForecastRateIndex() {
        return forecastRateIndex;
    }

    /**
     * Sets the value of the forecastRateIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastRateIndex }
     *     
     */
    public void setForecastRateIndex(ForecastRateIndex value) {
        this.forecastRateIndex = value;
    }

}
