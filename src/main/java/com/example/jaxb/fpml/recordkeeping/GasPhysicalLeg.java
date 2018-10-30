
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Physically settled leg of a physically settled gas transaction.
 * 
 * <p>Java class for GasPhysicalLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasPhysicalLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PhysicalSwapLeg">
 *       &lt;sequence>
 *         &lt;element name="deliveryPeriods" type="{http://www.fpml.org/FpML-5/recordkeeping}GasDeliveryPeriods"/>
 *         &lt;element name="gas" type="{http://www.fpml.org/FpML-5/recordkeeping}GasProduct"/>
 *         &lt;element name="deliveryConditions" type="{http://www.fpml.org/FpML-5/recordkeeping}GasDelivery" minOccurs="0"/>
 *         &lt;element name="deliveryQuantity" type="{http://www.fpml.org/FpML-5/recordkeeping}GasPhysicalQuantity"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasPhysicalLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "deliveryPeriods",
    "gas",
    "deliveryConditions",
    "deliveryQuantity"
})
public class GasPhysicalLeg
    extends PhysicalSwapLeg
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected GasDeliveryPeriods deliveryPeriods;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected GasProduct gas;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected GasDelivery deliveryConditions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected GasPhysicalQuantity deliveryQuantity;

    /**
     * Gets the value of the deliveryPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link GasDeliveryPeriods }
     *     
     */
    public GasDeliveryPeriods getDeliveryPeriods() {
        return deliveryPeriods;
    }

    /**
     * Sets the value of the deliveryPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasDeliveryPeriods }
     *     
     */
    public void setDeliveryPeriods(GasDeliveryPeriods value) {
        this.deliveryPeriods = value;
    }

    /**
     * Gets the value of the gas property.
     * 
     * @return
     *     possible object is
     *     {@link GasProduct }
     *     
     */
    public GasProduct getGas() {
        return gas;
    }

    /**
     * Sets the value of the gas property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasProduct }
     *     
     */
    public void setGas(GasProduct value) {
        this.gas = value;
    }

    /**
     * Gets the value of the deliveryConditions property.
     * 
     * @return
     *     possible object is
     *     {@link GasDelivery }
     *     
     */
    public GasDelivery getDeliveryConditions() {
        return deliveryConditions;
    }

    /**
     * Sets the value of the deliveryConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasDelivery }
     *     
     */
    public void setDeliveryConditions(GasDelivery value) {
        this.deliveryConditions = value;
    }

    /**
     * Gets the value of the deliveryQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link GasPhysicalQuantity }
     *     
     */
    public GasPhysicalQuantity getDeliveryQuantity() {
        return deliveryQuantity;
    }

    /**
     * Sets the value of the deliveryQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasPhysicalQuantity }
     *     
     */
    public void setDeliveryQuantity(GasPhysicalQuantity value) {
        this.deliveryQuantity = value;
    }

}
