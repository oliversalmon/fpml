
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type to define automatic exercise of a swaption. With automatic exercise the option is deemed to have exercised if it is in the money by more than the threshold amount on the exercise date.
 * 
 * <p>Java class for AutomaticExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutomaticExercise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="thresholdRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomaticExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "thresholdRate"
})
public class AutomaticExercise {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal thresholdRate;

    /**
     * Gets the value of the thresholdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getThresholdRate() {
        return thresholdRate;
    }

    /**
     * Sets the value of the thresholdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setThresholdRate(BigDecimal value) {
        this.thresholdRate = value;
    }

}
