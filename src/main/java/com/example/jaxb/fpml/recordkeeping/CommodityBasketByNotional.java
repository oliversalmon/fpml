
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityBasketByNotional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityBasketByNotional">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CommodityBasketBase">
 *       &lt;sequence>
 *         &lt;element name="underlying" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityBasketUnderlyingByNotional" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityBasketByNotional", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "underlying"
})
public class CommodityBasketByNotional
    extends CommodityBasketBase
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CommodityBasketUnderlyingByNotional> underlying;

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
     * {@link CommodityBasketUnderlyingByNotional }
     * 
     * 
     */
    public List<CommodityBasketUnderlyingByNotional> getUnderlying() {
        if (underlying == null) {
            underlying = new ArrayList<CommodityBasketUnderlyingByNotional>();
        }
        return this.underlying;
    }

}
