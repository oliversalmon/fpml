
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The schedule of Calculation Period First Days and Lasts Days. If there is only one First Day - Last Day pair then the First is equal to the Effective Date and the Last Day is equal to the Termination Date.
 * 
 * <p>Java class for WeatherCalculationPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherCalculationPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calculationPeriodFirstDay" type="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedDate" minOccurs="0"/>
 *         &lt;element name="calculationPeriodEndDay" type="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherCalculationPeriod", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "calculationPeriodFirstDay",
    "calculationPeriodEndDay"
})
public class WeatherCalculationPeriod {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedDate calculationPeriodFirstDay;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedDate calculationPeriodEndDay;

    /**
     * Gets the value of the calculationPeriodFirstDay property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getCalculationPeriodFirstDay() {
        return calculationPeriodFirstDay;
    }

    /**
     * Sets the value of the calculationPeriodFirstDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setCalculationPeriodFirstDay(IdentifiedDate value) {
        this.calculationPeriodFirstDay = value;
    }

    /**
     * Gets the value of the calculationPeriodEndDay property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getCalculationPeriodEndDay() {
        return calculationPeriodEndDay;
    }

    /**
     * Sets the value of the calculationPeriodEndDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setCalculationPeriodEndDay(IdentifiedDate value) {
        this.calculationPeriodEndDay = value;
    }

}
