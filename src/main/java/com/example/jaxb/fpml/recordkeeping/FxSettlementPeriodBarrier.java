
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxSettlementPeriodBarrier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxSettlementPeriodBarrier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="barrierReference" type="{http://www.fpml.org/FpML-5/recordkeeping}FxComplexBarrierBaseReference" minOccurs="0"/>
 *         &lt;element name="triggerRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxSettlementPeriodBarrier", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "barrierReference",
    "triggerRate"
})
public class FxSettlementPeriodBarrier {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxComplexBarrierBaseReference barrierReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected BigDecimal triggerRate;

    /**
     * Gets the value of the barrierReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxComplexBarrierBaseReference }
     *     
     */
    public FxComplexBarrierBaseReference getBarrierReference() {
        return barrierReference;
    }

    /**
     * Sets the value of the barrierReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxComplexBarrierBaseReference }
     *     
     */
    public void setBarrierReference(FxComplexBarrierBaseReference value) {
        this.barrierReference = value;
    }

    /**
     * Gets the value of the triggerRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTriggerRate() {
        return triggerRate;
    }

    /**
     * Sets the value of the triggerRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTriggerRate(BigDecimal value) {
        this.triggerRate = value;
    }

}
