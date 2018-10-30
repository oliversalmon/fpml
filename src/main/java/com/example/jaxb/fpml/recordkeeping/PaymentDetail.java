
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PaymentBase">
 *       &lt;sequence>
 *         &lt;element name="paymentDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="paymentRule" type="{http://www.fpml.org/FpML-5/recordkeeping}PaymentRule" minOccurs="0"/>
 *           &lt;element name="paymentAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}Money" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetail", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "paymentDate",
    "paymentRule",
    "paymentAmount"
})
public class PaymentDetail
    extends PaymentBase
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDate paymentDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PaymentRule paymentRule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money paymentAmount;

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setPaymentDate(AdjustableOrRelativeDate value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the paymentRule property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRule }
     *     
     */
    public PaymentRule getPaymentRule() {
        return paymentRule;
    }

    /**
     * Sets the value of the paymentRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRule }
     *     
     */
    public void setPaymentRule(PaymentRule value) {
        this.paymentRule = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPaymentAmount(Money value) {
        this.paymentAmount = value;
    }

}
