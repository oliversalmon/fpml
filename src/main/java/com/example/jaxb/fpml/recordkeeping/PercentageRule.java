
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a content model for a calculation rule defined as percentage of the notional amount.
 * 
 * <p>Java class for PercentageRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentageRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PaymentRule">
 *       &lt;sequence>
 *         &lt;element name="paymentPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="notionalAmountReference" type="{http://www.fpml.org/FpML-5/recordkeeping}NotionalAmountReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageRule", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "paymentPercent",
    "notionalAmountReference"
})
public class PercentageRule
    extends PaymentRule
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal paymentPercent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NotionalAmountReference notionalAmountReference;

    /**
     * Gets the value of the paymentPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentPercent() {
        return paymentPercent;
    }

    /**
     * Sets the value of the paymentPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentPercent(BigDecimal value) {
        this.paymentPercent = value;
    }

    /**
     * Gets the value of the notionalAmountReference property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmountReference }
     *     
     */
    public NotionalAmountReference getNotionalAmountReference() {
        return notionalAmountReference;
    }

    /**
     * Sets the value of the notionalAmountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmountReference }
     *     
     */
    public void setNotionalAmountReference(NotionalAmountReference value) {
        this.notionalAmountReference = value;
    }

}
