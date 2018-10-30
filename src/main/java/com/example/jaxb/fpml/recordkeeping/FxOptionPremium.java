
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that specifies the premium exchanged for a single option trade or option strategy.
 * 
 * <p>Java class for FxOptionPremium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxOptionPremium">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativePayment">
 *       &lt;sequence>
 *         &lt;element name="settlementInformation" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementInformation" minOccurs="0"/>
 *         &lt;element name="quote" type="{http://www.fpml.org/FpML-5/recordkeeping}PremiumQuote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxOptionPremium", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "settlementInformation",
    "quote"
})
public class FxOptionPremium
    extends NonNegativePayment
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SettlementInformation settlementInformation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PremiumQuote quote;

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

    /**
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumQuote }
     *     
     */
    public PremiumQuote getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumQuote }
     *     
     */
    public void setQuote(PremiumQuote value) {
        this.quote = value;
    }

}
