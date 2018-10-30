
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that contains full details of a predefined fixed payout which may occur (or not) in a Barrier Option or Digital Option when a trigger event occurs (or not).
 * 
 * <p>Java class for FxOptionPayout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxOptionPayout">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney">
 *       &lt;sequence>
 *         &lt;element name="payoutStyle" type="{http://www.fpml.org/FpML-5/recordkeeping}PayoutEnum" minOccurs="0"/>
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
@XmlType(name = "FxOptionPayout", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "payoutStyle",
    "settlementInformation"
})
public class FxOptionPayout
    extends NonNegativeMoney
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected PayoutEnum payoutStyle;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SettlementInformation settlementInformation;

    /**
     * Gets the value of the payoutStyle property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutEnum }
     *     
     */
    public PayoutEnum getPayoutStyle() {
        return payoutStyle;
    }

    /**
     * Sets the value of the payoutStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutEnum }
     *     
     */
    public void setPayoutStyle(PayoutEnum value) {
        this.payoutStyle = value;
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
