
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A rebate can be expressed as a payment amount or as amount of outstanding gain.
 * 
 * <p>Java class for FxTargetRebate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTargetRebate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="payment" type="{http://www.fpml.org/FpML-5/recordkeeping}SimplePayment"/>
 *         &lt;element name="outstandingGain" type="{http://www.fpml.org/FpML-5/recordkeeping}FxOutstandingGain"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTargetRebate", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "payment",
    "outstandingGain"
})
public class FxTargetRebate {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SimplePayment payment;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxOutstandingGain outstandingGain;

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePayment }
     *     
     */
    public SimplePayment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePayment }
     *     
     */
    public void setPayment(SimplePayment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the outstandingGain property.
     * 
     * @return
     *     possible object is
     *     {@link FxOutstandingGain }
     *     
     */
    public FxOutstandingGain getOutstandingGain() {
        return outstandingGain;
    }

    /**
     * Sets the value of the outstandingGain property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxOutstandingGain }
     *     
     */
    public void setOutstandingGain(FxOutstandingGain value) {
        this.outstandingGain = value;
    }

}
