
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that is used for describing cash settlement of an option / non deliverable forward. It includes the currency to settle into together with the fixings required to calculate the currency amount.
 * 
 * <p>Java class for FxCashSettlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxCashSettlement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}Currency"/>
 *         &lt;element name="referenceCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}Currency" minOccurs="0"/>
 *         &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveMoney" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="fixing" type="{http://www.fpml.org/FpML-5/recordkeeping}FxFixing" maxOccurs="unbounded"/>
 *           &lt;element name="rateSourceFixing" type="{http://www.fpml.org/FpML-5/recordkeeping}FxRateSourceFixing" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="settlementDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxCashSettlement", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "settlementCurrency",
    "referenceCurrency",
    "notionalAmount",
    "fixing",
    "rateSourceFixing",
    "settlementDate"
})
public class FxCashSettlement {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected Currency settlementCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Currency referenceCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PositiveMoney notionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FxFixing> fixing;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FxRateSourceFixing> rateSourceFixing;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableDate settlementDate;

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
     * Gets the value of the notionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PositiveMoney }
     *     
     */
    public PositiveMoney getNotionalAmount() {
        return notionalAmount;
    }

    /**
     * Sets the value of the notionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositiveMoney }
     *     
     */
    public void setNotionalAmount(PositiveMoney value) {
        this.notionalAmount = value;
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

    /**
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate }
     *     
     */
    public AdjustableDate getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate }
     *     
     */
    public void setSettlementDate(AdjustableDate value) {
        this.settlementDate = value;
    }

}
