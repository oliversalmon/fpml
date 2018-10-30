
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxTargetBarrier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTargetBarrier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FxComplexBarrierBase">
 *       &lt;sequence>
 *         &lt;element name="rebate" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetRebate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTargetBarrier", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "rebate"
})
public class FxTargetBarrier
    extends FxComplexBarrierBase
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxTargetRebate rebate;

    /**
     * Gets the value of the rebate property.
     * 
     * @return
     *     possible object is
     *     {@link FxTargetRebate }
     *     
     */
    public FxTargetRebate getRebate() {
        return rebate;
    }

    /**
     * Sets the value of the rebate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxTargetRebate }
     *     
     */
    public void setRebate(FxTargetRebate value) {
        this.rebate = value;
    }

}
