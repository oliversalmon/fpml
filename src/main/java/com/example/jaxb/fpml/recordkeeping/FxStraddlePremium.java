
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The Currency and Amount to be paid by the Buyer to the Seller. The straddle premium is calculated on the Fixing Date using the Forward Volatility Agreement parameters.
 * 
 * <p>Java class for FxStraddlePremium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxStraddlePremium">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PaymentBaseExtended">
 *       &lt;sequence>
 *         &lt;element name="paymentCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedCurrency"/>
 *         &lt;element name="settlementInformation" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxStraddlePremium", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "paymentCurrency",
    "settlementInformation"
})
public class FxStraddlePremium
    extends PaymentBaseExtended
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected IdentifiedCurrency paymentCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SettlementInformation settlementInformation;

    /**
     * Gets the value of the paymentCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public IdentifiedCurrency getPaymentCurrency() {
        return paymentCurrency;
    }

    /**
     * Sets the value of the paymentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public void setPaymentCurrency(IdentifiedCurrency value) {
        this.paymentCurrency = value;
    }

    /**
     * Gets the value of the settlementInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInformation }
     *     
     */
    public SettlementInformation getSettlementInformation() {
        return settlementInformation;
    }

    /**
     * Sets the value of the settlementInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInformation }
     *     
     */
    public void setSettlementInformation(SettlementInformation value) {
        this.settlementInformation = value;
    }

}
