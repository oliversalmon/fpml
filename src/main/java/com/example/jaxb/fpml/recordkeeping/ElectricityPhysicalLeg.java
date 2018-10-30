
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Physically settled leg of a physically settled electricity transaction.
 * 
 * <p>Java class for ElectricityPhysicalLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityPhysicalLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PhysicalSwapLeg">
 *       &lt;sequence>
 *         &lt;element name="deliveryPeriods" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityDeliveryPeriods" minOccurs="0"/>
 *         &lt;element name="settlementPeriods" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementPeriods" maxOccurs="unbounded"/>
 *         &lt;element name="settlementPeriodsSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementPeriodsSchedule" minOccurs="0"/>
 *         &lt;element name="loadType" type="{http://www.fpml.org/FpML-5/recordkeeping}LoadTypeEnum" minOccurs="0"/>
 *         &lt;element name="electricity" type="{http://www.fpml.org/FpML-5/recordkeeping}ElectricityProduct"/>
 *         &lt;element name="deliveryConditions" type="{http://www.fpml.org/FpML-5/recordkeeping}ElectricityDelivery"/>
 *         &lt;element name="deliveryQuantity" type="{http://www.fpml.org/FpML-5/recordkeeping}ElectricityPhysicalQuantity"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityPhysicalLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "deliveryPeriods",
    "settlementPeriods",
    "settlementPeriodsSchedule",
    "loadType",
    "electricity",
    "deliveryConditions",
    "deliveryQuantity"
})
public class ElectricityPhysicalLeg
    extends PhysicalSwapLeg
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityDeliveryPeriods deliveryPeriods;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected List<SettlementPeriods> settlementPeriods;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SettlementPeriodsSchedule settlementPeriodsSchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected LoadTypeEnum loadType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected ElectricityProduct electricity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected ElectricityDelivery deliveryConditions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected ElectricityPhysicalQuantity deliveryQuantity;

    /**
     * Gets the value of the deliveryPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryPeriods }
     *     
     */
    public CommodityDeliveryPeriods getDeliveryPeriods() {
        return deliveryPeriods;
    }

    /**
     * Sets the value of the deliveryPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryPeriods }
     *     
     */
    public void setDeliveryPeriods(CommodityDeliveryPeriods value) {
        this.deliveryPeriods = value;
    }

    /**
     * Gets the value of the settlementPeriods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementPeriods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementPeriods }
     * 
     * 
     */
    public List<SettlementPeriods> getSettlementPeriods() {
        if (settlementPeriods == null) {
            settlementPeriods = new ArrayList<SettlementPeriods>();
        }
        return this.settlementPeriods;
    }

    /**
     * Gets the value of the settlementPeriodsSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementPeriodsSchedule }
     *     
     */
    public SettlementPeriodsSchedule getSettlementPeriodsSchedule() {
        return settlementPeriodsSchedule;
    }

    /**
     * Sets the value of the settlementPeriodsSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementPeriodsSchedule }
     *     
     */
    public void setSettlementPeriodsSchedule(SettlementPeriodsSchedule value) {
        this.settlementPeriodsSchedule = value;
    }

    /**
     * Gets the value of the loadType property.
     * 
     * @return
     *     possible object is
     *     {@link LoadTypeEnum }
     *     
     */
    public LoadTypeEnum getLoadType() {
        return loadType;
    }

    /**
     * Sets the value of the loadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTypeEnum }
     *     
     */
    public void setLoadType(LoadTypeEnum value) {
        this.loadType = value;
    }

    /**
     * Gets the value of the electricity property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityProduct }
     *     
     */
    public ElectricityProduct getElectricity() {
        return electricity;
    }

    /**
     * Sets the value of the electricity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityProduct }
     *     
     */
    public void setElectricity(ElectricityProduct value) {
        this.electricity = value;
    }

    /**
     * Gets the value of the deliveryConditions property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityDelivery }
     *     
     */
    public ElectricityDelivery getDeliveryConditions() {
        return deliveryConditions;
    }

    /**
     * Sets the value of the deliveryConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityDelivery }
     *     
     */
    public void setDeliveryConditions(ElectricityDelivery value) {
        this.deliveryConditions = value;
    }

    /**
     * Gets the value of the deliveryQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityPhysicalQuantity }
     *     
     */
    public ElectricityPhysicalQuantity getDeliveryQuantity() {
        return deliveryQuantity;
    }

    /**
     * Sets the value of the deliveryQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityPhysicalQuantity }
     *     
     */
    public void setDeliveryQuantity(ElectricityPhysicalQuantity value) {
        this.deliveryQuantity = value;
    }

}
