
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxTargetSettlementPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTargetSettlementPeriod">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}SettlementPeriod">
 *       &lt;sequence>
 *         &lt;element name="pivot" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="payoff" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetSettlementPeriodPayoff" maxOccurs="unbounded"/>
 *         &lt;element name="barrier" type="{http://www.fpml.org/FpML-5/recordkeeping}FxSettlementPeriodBarrier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTargetSettlementPeriod", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "pivot",
    "payoff",
    "barrier"
})
public class FxTargetSettlementPeriod
    extends SettlementPeriod
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal pivot;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected List<FxTargetSettlementPeriodPayoff> payoff;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FxSettlementPeriodBarrier> barrier;

    /**
     * Gets the value of the pivot property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPivot() {
        return pivot;
    }

    /**
     * Sets the value of the pivot property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPivot(BigDecimal value) {
        this.pivot = value;
    }

    /**
     * Gets the value of the payoff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payoff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayoff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxTargetSettlementPeriodPayoff }
     * 
     * 
     */
    public List<FxTargetSettlementPeriodPayoff> getPayoff() {
        if (payoff == null) {
            payoff = new ArrayList<FxTargetSettlementPeriodPayoff>();
        }
        return this.payoff;
    }

    /**
     * Gets the value of the barrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxSettlementPeriodBarrier }
     * 
     * 
     */
    public List<FxSettlementPeriodBarrier> getBarrier() {
        if (barrier == null) {
            barrier = new ArrayList<FxSettlementPeriodBarrier>();
        }
        return this.barrier;
    }

}
