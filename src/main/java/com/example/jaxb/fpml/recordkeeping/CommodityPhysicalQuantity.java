
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the physical quantity of the commodity to be delivered.
 * 
 * <p>Java class for CommodityPhysicalQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityPhysicalQuantity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPhysicalQuantityBase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityFixedPhysicalQuantity.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityPhysicalQuantity", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "physicalQuantity",
    "physicalQuantitySchedule",
    "totalPhysicalQuantity"
})
public class CommodityPhysicalQuantity
    extends CommodityPhysicalQuantityBase
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityNotionalQuantity physicalQuantity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityPhysicalQuantitySchedule physicalQuantitySchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected UnitQuantity totalPhysicalQuantity;

    /**
     * Gets the value of the physicalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public CommodityNotionalQuantity getPhysicalQuantity() {
        return physicalQuantity;
    }

    /**
     * Sets the value of the physicalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityNotionalQuantity }
     *     
     */
    public void setPhysicalQuantity(CommodityNotionalQuantity value) {
        this.physicalQuantity = value;
    }

    /**
     * Gets the value of the physicalQuantitySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPhysicalQuantitySchedule }
     *     
     */
    public CommodityPhysicalQuantitySchedule getPhysicalQuantitySchedule() {
        return physicalQuantitySchedule;
    }

    /**
     * Sets the value of the physicalQuantitySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPhysicalQuantitySchedule }
     *     
     */
    public void setPhysicalQuantitySchedule(CommodityPhysicalQuantitySchedule value) {
        this.physicalQuantitySchedule = value;
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
