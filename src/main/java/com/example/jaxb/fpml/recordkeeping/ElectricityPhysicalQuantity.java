
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The quantity of gas to be delivered.
 * 
 * <p>Java class for ElectricityPhysicalQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityPhysicalQuantity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPhysicalQuantityBase">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="physicalQuantity" type="{http://www.fpml.org/FpML-5/recordkeeping}ElectricityPhysicalDeliveryQuantity" maxOccurs="unbounded"/>
 *           &lt;element name="physicalQuantitySchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}ElectricityPhysicalDeliveryQuantitySchedule" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="totalPhysicalQuantity" type="{http://www.fpml.org/FpML-5/recordkeeping}UnitQuantity"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityPhysicalQuantity", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "physicalQuantity",
    "physicalQuantitySchedule",
    "totalPhysicalQuantity"
})
public class ElectricityPhysicalQuantity
    extends CommodityPhysicalQuantityBase
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ElectricityPhysicalDeliveryQuantity> physicalQuantity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ElectricityPhysicalDeliveryQuantitySchedule> physicalQuantitySchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected UnitQuantity totalPhysicalQuantity;

    /**
     * Gets the value of the physicalQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricityPhysicalDeliveryQuantity }
     * 
     * 
     */
    public List<ElectricityPhysicalDeliveryQuantity> getPhysicalQuantity() {
        if (physicalQuantity == null) {
            physicalQuantity = new ArrayList<ElectricityPhysicalDeliveryQuantity>();
        }
        return this.physicalQuantity;
    }

    /**
     * Gets the value of the physicalQuantitySchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalQuantitySchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalQuantitySchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectricityPhysicalDeliveryQuantitySchedule }
     * 
     * 
     */
    public List<ElectricityPhysicalDeliveryQuantitySchedule> getPhysicalQuantitySchedule() {
        if (physicalQuantitySchedule == null) {
            physicalQuantitySchedule = new ArrayList<ElectricityPhysicalDeliveryQuantitySchedule>();
        }
        return this.physicalQuantitySchedule;
    }

    /**
     * Gets the value of the totalPhysicalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link UnitQuantity }
     *     
     */
    public UnitQuantity getTotalPhysicalQuantity() {
        return totalPhysicalQuantity;
    }

    /**
     * Sets the value of the totalPhysicalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitQuantity }
     *     
     */
    public void setTotalPhysicalQuantity(UnitQuantity value) {
        this.totalPhysicalQuantity = value;
    }

}
