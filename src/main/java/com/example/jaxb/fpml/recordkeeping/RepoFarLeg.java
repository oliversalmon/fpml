
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A transaction leg for a repo is equivalent to a single cash transaction. It is augmented here to carry some values that are of interest for the repo. Also note that the BuyerSeller model in this transaction must be the exact opposite of the one found in the near leg.
 * 
 * <p>Java class for RepoFarLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepoFarLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}RepoLegBase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}SettlementAmountOrCurrency.model"/>
 *         &lt;element name="fxRate" type="{http://www.fpml.org/FpML-5/recordkeeping}FxRate" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="deliveryMethod" type="{http://www.fpml.org/FpML-5/recordkeeping}DeliveryMethod" minOccurs="0"/>
 *           &lt;element name="deliveryDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *           &lt;element name="collateral" type="{http://www.fpml.org/FpML-5/recordkeeping}CollateralValuation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="repoInterest" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepoFarLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "settlementAmount",
    "settlementCurrency",
    "fxRate",
    "deliveryMethod",
    "deliveryDate",
    "collateral",
    "repoInterest"
})
public class RepoFarLeg
    extends RepoLegBase
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money settlementAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Currency settlementCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxRate fxRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DeliveryMethod deliveryMethod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDate deliveryDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CollateralValuation> collateral;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal repoInterest;

    /**
     * Gets the value of the settlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Sets the value of the settlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSettlementAmount(Money value) {
        this.settlementAmount = value;
    }

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
     * Gets the value of the fxRate property.
     * 
     * @return
     *     possible object is
     *     {@link FxRate }
     *     
     */
    public FxRate getFxRate() {
        return fxRate;
    }

    /**
     * Sets the value of the fxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxRate }
     *     
     */
    public void setFxRate(FxRate value) {
        this.fxRate = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethod }
     *     
     */
    public DeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethod }
     *     
     */
    public void setDeliveryMethod(DeliveryMethod value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setDeliveryDate(AdjustableOrRelativeDate value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the collateral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collateral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollateral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralValuation }
     * 
     * 
     */
    public List<CollateralValuation> getCollateral() {
        if (collateral == null) {
            collateral = new ArrayList<CollateralValuation>();
        }
        return this.collateral;
    }

    /**
     * Gets the value of the repoInterest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepoInterest() {
        return repoInterest;
    }

    /**
     * Sets the value of the repoInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepoInterest(BigDecimal value) {
        this.repoInterest = value;
    }

}
