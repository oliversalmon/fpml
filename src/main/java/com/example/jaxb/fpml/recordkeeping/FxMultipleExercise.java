
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the limits on the size of notional when multiple exercise is allowed.
 * 
 * <p>Java class for FxMultipleExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxMultipleExercise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimumNotionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney" minOccurs="0"/>
 *         &lt;element name="maximumNotionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxMultipleExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "minimumNotionalAmount",
    "maximumNotionalAmount"
})
public class FxMultipleExercise {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney minimumNotionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeMoney maximumNotionalAmount;

    /**
     * Gets the value of the minimumNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getMinimumNotionalAmount() {
        return minimumNotionalAmount;
    }

    /**
     * Sets the value of the minimumNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setMinimumNotionalAmount(NonNegativeMoney value) {
        this.minimumNotionalAmount = value;
    }

    /**
     * Gets the value of the maximumNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getMaximumNotionalAmount() {
        return maximumNotionalAmount;
    }

    /**
     * Sets the value of the maximumNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setMaximumNotionalAmount(NonNegativeMoney value) {
        this.maximumNotionalAmount = value;
    }

}
