
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityBasketByPercentage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityBasketByPercentage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CommodityBasketBase">
 *       &lt;sequence>
 *         &lt;element name="underlying" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityBasketUnderlyingByPercentage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NotionalAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityBasketByPercentage", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "underlying",
    "notionalAmount"
})
public class CommodityBasketByPercentage
    extends CommodityBasketBase
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CommodityBasketUnderlyingByPercentage> underlying;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NotionalAmount notionalAmount;

    /**
     * Gets the value of the underlying property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underlying property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderlying().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityBasketUnderlyingByPercentage }
     * 
     * 
     */
    public List<CommodityBasketUnderlyingByPercentage> getUnderlying() {
        if (underlying == null) {
            underlying = new ArrayList<CommodityBasketUnderlyingByPercentage>();
        }
        return this.underlying;
    }

    /**
     * Gets the value of the notionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmount }
     *     
     */
    public NotionalAmount getNotionalAmount() {
        return notionalAmount;
    }

    /**
     * Sets the value of the notionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmount }
     *     
     */
    public void setNotionalAmount(NotionalAmount value) {
        this.notionalAmount = value;
    }

}
