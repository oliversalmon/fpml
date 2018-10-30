
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A transaction leg for a repo is equivalent to a single cash transaction.
 * 
 * <p>Java class for RepoNearLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepoNearLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}RepoLegBase">
 *       &lt;sequence>
 *         &lt;element name="settlementAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}Money"/>
 *         &lt;element name="fxRate" type="{http://www.fpml.org/FpML-5/recordkeeping}FxRate" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="deliveryMethod" type="{http://www.fpml.org/FpML-5/recordkeeping}DeliveryMethod" minOccurs="0"/>
 *           &lt;element name="deliveryDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *           &lt;element name="collateral" type="{http://www.fpml.org/FpML-5/recordkeeping}CollateralValuation" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RepoNearLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "settlementAmount",
    "fxRate",
    "deliveryMethod",
    "deliveryDate",
    "collateral"
})
public class RepoNearLeg
    extends RepoLegBase
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected Money settlementAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxRate fxRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DeliveryMethod deliveryMethod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDate deliveryDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CollateralValuation> collateral;

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

}
