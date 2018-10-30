
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The specification of the gas to be delivered.
 * 
 * <p>Java class for GasDelivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasDelivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityDeliveryPoints.model"/>
 *         &lt;element name="deliveryType" type="{http://www.fpml.org/FpML-5/recordkeeping}DeliveryTypeEnum" minOccurs="0"/>
 *         &lt;element name="interconnectionPoint" type="{http://www.fpml.org/FpML-5/recordkeeping}InterconnectionPoint" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="buyerHub" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityHub" minOccurs="0"/>
 *           &lt;element name="sellerHub" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityHub" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasDelivery", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "deliveryPoint",
    "entryPoint",
    "withdrawalPoint",
    "deliveryType",
    "interconnectionPoint",
    "buyerHub",
    "sellerHub"
})
public class GasDelivery {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected GasDeliveryPoint deliveryPoint;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityDeliveryPoint entryPoint;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityDeliveryPoint withdrawalPoint;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected DeliveryTypeEnum deliveryType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected InterconnectionPoint interconnectionPoint;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityHub buyerHub;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityHub sellerHub;

    /**
     * Gets the value of the deliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GasDeliveryPoint }
     *     
     */
    public GasDeliveryPoint getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Sets the value of the deliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasDeliveryPoint }
     *     
     */
    public void setDeliveryPoint(GasDeliveryPoint value) {
        this.deliveryPoint = value;
    }

    /**
     * Gets the value of the entryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public CommodityDeliveryPoint getEntryPoint() {
        return entryPoint;
    }

    /**
     * Sets the value of the entryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public void setEntryPoint(CommodityDeliveryPoint value) {
        this.entryPoint = value;
    }

    /**
     * Gets the value of the withdrawalPoint property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public CommodityDeliveryPoint getWithdrawalPoint() {
        return withdrawalPoint;
    }

    /**
     * Sets the value of the withdrawalPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public void setWithdrawalPoint(CommodityDeliveryPoint value) {
        this.withdrawalPoint = value;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTypeEnum }
     *     
     */
    public DeliveryTypeEnum getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTypeEnum }
     *     
     */
    public void setDeliveryType(DeliveryTypeEnum value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the interconnectionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link InterconnectionPoint }
     *     
     */
    public InterconnectionPoint getInterconnectionPoint() {
        return interconnectionPoint;
    }

    /**
     * Sets the value of the interconnectionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterconnectionPoint }
     *     
     */
    public void setInterconnectionPoint(InterconnectionPoint value) {
        this.interconnectionPoint = value;
    }

    /**
     * Gets the value of the buyerHub property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityHub }
     *     
     */
    public CommodityHub getBuyerHub() {
        return buyerHub;
    }

    /**
     * Sets the value of the buyerHub property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityHub }
     *     
     */
    public void setBuyerHub(CommodityHub value) {
        this.buyerHub = value;
    }

    /**
     * Gets the value of the sellerHub property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityHub }
     *     
     */
    public CommodityHub getSellerHub() {
        return sellerHub;
    }

    /**
     * Sets the value of the sellerHub property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityHub }
     *     
     */
    public void setSellerHub(CommodityHub value) {
        this.sellerHub = value;
    }

}
