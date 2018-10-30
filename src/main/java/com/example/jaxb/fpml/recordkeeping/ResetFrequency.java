
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the reset frequency. In the case of a weekly reset, also specifies the day of the week that the reset occurs. If the reset frequency is greater than the calculation period frequency the this implies that more or more reset dates is established for each calculation period and some form of rate averaginhg is applicable. The specific averaging method of calculation is specified in FloatingRateCalculation. In case the reset frequency is of value T (term), the period is defined by the swap\swapStream\calculationPerioDates\effectiveDate and the swap\swapStream\calculationPerioDates\terminationDate.
 * 
 * <p>Java class for ResetFrequency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResetFrequency">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Frequency">
 *       &lt;sequence>
 *         &lt;element name="weeklyRollConvention" type="{http://www.fpml.org/FpML-5/recordkeeping}WeeklyRollConventionEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetFrequency", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "weeklyRollConvention"
})
public class ResetFrequency
    extends Frequency
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "anySimpleType")
    protected String weeklyRollConvention;

    /**
     * Gets the value of the weeklyRollConvention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeeklyRollConvention() {
        return weeklyRollConvention;
    }

    /**
     * Sets the value of the weeklyRollConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeeklyRollConvention(String value) {
        this.weeklyRollConvention = value;
    }

}
