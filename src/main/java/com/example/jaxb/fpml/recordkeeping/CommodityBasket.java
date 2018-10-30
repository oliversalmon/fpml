
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the swap's underlyer when it has multiple asset components.
 * 
 * <p>Java class for CommodityBasket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityBasket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BasketIdentifier.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityBasket.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityBasket", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "basketName",
    "basketId",
    "notionalQuantityBasket",
    "notionalAmountBasket"
})
public class CommodityBasket {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BasketName basketName;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<BasketId> basketId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityBasketByNotional notionalQuantityBasket;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityBasketByPercentage notionalAmountBasket;

    /**
     * Gets the value of the basketName property.
     * 
     * @return
     *     possible object is
     *     {@link BasketName }
     *     
     */
    public BasketName getBasketName() {
        return basketName;
    }

    /**
     * Sets the value of the basketName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketName }
     *     
     */
    public void setBasketName(BasketName value) {
        this.basketName = value;
    }

    /**
     * Gets the value of the basketId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basketId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasketId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasketId }
     * 
     * 
     */
    public List<BasketId> getBasketId() {
        if (basketId == null) {
            basketId = new ArrayList<BasketId>();
        }
        return this.basketId;
    }

    /**
     * Gets the value of the notionalQuantityBasket property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityBasketByNotional }
     *     
     */
    public CommodityBasketByNotional getNotionalQuantityBasket() {
        return notionalQuantityBasket;
    }

    /**
     * Sets the value of the notionalQuantityBasket property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityBasketByNotional }
     *     
     */
    public void setNotionalQuantityBasket(CommodityBasketByNotional value) {
        this.notionalQuantityBasket = value;
    }

    /**
     * Gets the value of the notionalAmountBasket property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityBasketByPercentage }
     *     
     */
    public CommodityBasketByPercentage getNotionalAmountBasket() {
        return notionalAmountBasket;
    }

    /**
     * Sets the value of the notionalAmountBasket property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityBasketByPercentage }
     *     
     */
    public void setNotionalAmountBasket(CommodityBasketByPercentage value) {
        this.notionalAmountBasket = value;
    }

}
