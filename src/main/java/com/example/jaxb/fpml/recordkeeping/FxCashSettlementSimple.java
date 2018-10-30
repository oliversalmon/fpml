
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that is used for describing cash settlement of a variance or volatility swap option. It includes the settlement currency together with the spot currency exchange required to calculate the settlement currency amount.
 * 
 * <p>Java class for FxCashSettlementSimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxCashSettlementSimple">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}Currency"/>
 *         &lt;element name="referenceCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}Currency" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="fixing" type="{http://www.fpml.org/FpML-5/recordkeeping}FxFixing" maxOccurs="unbounded"/>
 *           &lt;element name="rateSourceFixing" type="{http://www.fpml.org/FpML-5/recordkeeping}FxRateSourceFixing" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxCashSettlementSimple", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "settlementCurrency",
    "referenceCurrency",
    "fixing",
    "rateSourceFixing"
})
public class FxCashSettlementSimple {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected Currency settlementCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Currency referenceCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FxFixing> fixing;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FxRateSourceFixing> rateSourceFixing;

    /**
     * Gets the value of the settlementCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getSettlementCurrency() {
        return settlementCurrency;
    }

    /**
     * Sets the value of the settlementCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setSettlementCurrency(Currency value) {
        this.settlementCurrency = value;
    }

    /**
     * Gets the value of the referenceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getReferenceCurrency() {
        return referenceCurrency;
    }

    /**
     * Sets the value of the referenceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setReferenceCurrency(Currency value) {
        this.referenceCurrency = value;
    }

    /**
     * Gets the value of the fixing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxFixing }
     * 
     * 
     */
    public List<FxFixing> getFixing() {
        if (fixing == null) {
            fixing = new ArrayList<FxFixing>();
        }
        return this.fixing;
    }

    /**
     * Gets the value of the rateSourceFixing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateSourceFixing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateSourceFixing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxRateSourceFixing }
     * 
     * 
     */
    public List<FxRateSourceFixing> getRateSourceFixing() {
        if (rateSourceFixing == null) {
            rateSourceFixing = new ArrayList<FxRateSourceFixing>();
        }
        return this.rateSourceFixing;
    }

}
