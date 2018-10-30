
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
 * <p>Java class for GasPhysicalQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasPhysicalQuantity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPhysicalQuantityBase">
 *       &lt;choice minOccurs="0">
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityFixedPhysicalQuantity.model"/>
 *         &lt;sequence>
 *           &lt;element name="minPhysicalQuantity" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityNotionalQuantity" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="maxPhysicalQuantity" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityNotionalQuantity" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="electingParty" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasPhysicalQuantity", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "physicalQuantity",
    "physicalQuantitySchedule",
    "totalPhysicalQuantity",
    "minPhysicalQuantity",
    "maxPhysicalQuantity",
    "electingParty"
})
public class GasPhysicalQuantity
    extends CommodityPhysicalQuantityBase
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityNotionalQuantity physicalQuantity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityPhysicalQuantitySchedule physicalQuantitySchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected UnitQuantity totalPhysicalQuantity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CommodityNotionalQuantity> minPhysicalQuantity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CommodityNotionalQuantity> maxPhysicalQuantity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference electingParty;

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

    /**
     * Gets the value of the minPhysicalQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minPhysicalQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinPhysicalQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityNotionalQuantity }
     * 
     * 
     */
    public List<CommodityNotionalQuantity> getMinPhysicalQuantity() {
        if (minPhysicalQuantity == null) {
            minPhysicalQuantity = new ArrayList<CommodityNotionalQuantity>();
        }
        return this.minPhysicalQuantity;
    }

    /**
     * Gets the value of the maxPhysicalQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxPhysicalQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaxPhysicalQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityNotionalQuantity }
     * 
     * 
     */
    public List<CommodityNotionalQuantity> getMaxPhysicalQuantity() {
        if (maxPhysicalQuantity == null) {
            maxPhysicalQuantity = new ArrayList<CommodityNotionalQuantity>();
        }
        return this.maxPhysicalQuantity;
    }

    /**
     * Gets the value of the electingParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getElectingParty() {
        return electingParty;
    }

    /**
     * Sets the value of the electingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setElectingParty(PartyReference value) {
        this.electingParty = value;
    }

}
