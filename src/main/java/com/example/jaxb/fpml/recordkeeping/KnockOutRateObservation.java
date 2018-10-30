
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes an observation that caused a barrier knock out to trigger
 * 
 * <p>Java class for KnockOutRateObservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnockOutRateObservation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}TriggerRateObservation">
 *       &lt;sequence>
 *         &lt;element name="rebatePayment" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativePayment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnockOutRateObservation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "rebatePayment"
})
public class KnockOutRateObservation
    extends TriggerRateObservation
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativePayment rebatePayment;

    /**
     * Gets the value of the rebatePayment property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativePayment }
     *     
     */
    public NonNegativePayment getRebatePayment() {
        return rebatePayment;
    }

    /**
     * Sets the value of the rebatePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativePayment }
     *     
     */
    public void setRebatePayment(NonNegativePayment value) {
        this.rebatePayment = value;
    }

}
