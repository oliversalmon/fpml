
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The different options for specifying the Delivery Periods for a physically settled gas trade.
 * 
 * <p>Java class for GasDeliveryPeriods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasDeliveryPeriods">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CommodityDeliveryPeriods">
 *       &lt;sequence>
 *         &lt;element name="supplyStartTime" type="{http://www.fpml.org/FpML-5/recordkeeping}PrevailingTime"/>
 *         &lt;element name="supplyEndTime" type="{http://www.fpml.org/FpML-5/recordkeeping}PrevailingTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasDeliveryPeriods", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "supplyStartTime",
    "supplyEndTime"
})
public class GasDeliveryPeriods
    extends CommodityDeliveryPeriods
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected PrevailingTime supplyStartTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected PrevailingTime supplyEndTime;

    /**
     * Gets the value of the supplyStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link PrevailingTime }
     *     
     */
    public PrevailingTime getSupplyStartTime() {
        return supplyStartTime;
    }

    /**
     * Sets the value of the supplyStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevailingTime }
     *     
     */
    public void setSupplyStartTime(PrevailingTime value) {
        this.supplyStartTime = value;
    }

    /**
     * Gets the value of the supplyEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link PrevailingTime }
     *     
     */
    public PrevailingTime getSupplyEndTime() {
        return supplyEndTime;
    }

    /**
     * Sets the value of the supplyEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevailingTime }
     *     
     */
    public void setSupplyEndTime(PrevailingTime value) {
        this.supplyEndTime = value;
    }

}
