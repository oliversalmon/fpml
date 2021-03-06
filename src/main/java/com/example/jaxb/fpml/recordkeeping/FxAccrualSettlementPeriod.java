
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxAccrualSettlementPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAccrualSettlementPeriod">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}SettlementPeriod">
 *       &lt;sequence>
 *         &lt;element name="payoff" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualSettlementPeriodPayoff" maxOccurs="unbounded"/>
 *         &lt;element name="accrualFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="barrier" type="{http://www.fpml.org/FpML-5/recordkeeping}FxSettlementPeriodBarrier" minOccurs="0"/>
 *         &lt;element name="accrualFixingDates" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementPeriodFixingDates"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxAccrualSettlementPeriod", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "payoff",
    "accrualFactor",
    "barrier",
    "accrualFixingDates"
})
public class FxAccrualSettlementPeriod
    extends SettlementPeriod
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected List<FxAccrualSettlementPeriodPayoff> payoff;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal accrualFactor;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxSettlementPeriodBarrier barrier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected SettlementPeriodFixingDates accrualFixingDates;

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
     * {@link FxAccrualSettlementPeriodPayoff }
     * 
     * 
     */
    public List<FxAccrualSettlementPeriodPayoff> getPayoff() {
        if (payoff == null) {
            payoff = new ArrayList<FxAccrualSettlementPeriodPayoff>();
        }
        return this.payoff;
    }

    /**
     * Gets the value of the accrualFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccrualFactor() {
        return accrualFactor;
    }

    /**
     * Sets the value of the accrualFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccrualFactor(BigDecimal value) {
        this.accrualFactor = value;
    }

    /**
     * Gets the value of the barrier property.
     * 
     * @return
     *     possible object is
     *     {@link FxSettlementPeriodBarrier }
     *     
     */
    public FxSettlementPeriodBarrier getBarrier() {
        return barrier;
    }

    /**
     * Sets the value of the barrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxSettlementPeriodBarrier }
     *     
     */
    public void setBarrier(FxSettlementPeriodBarrier value) {
        this.barrier = value;
    }

    /**
     * Gets the value of the accrualFixingDates property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementPeriodFixingDates }
     *     
     */
    public SettlementPeriodFixingDates getAccrualFixingDates() {
        return accrualFixingDates;
    }

    /**
     * Sets the value of the accrualFixingDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementPeriodFixingDates }
     *     
     */
    public void setAccrualFixingDates(SettlementPeriodFixingDates value) {
        this.accrualFixingDates = value;
    }

}
