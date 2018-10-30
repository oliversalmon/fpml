
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The physical delivery conditions for coal.
 * 
 * <p>Java class for CoalDelivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoalDelivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="deliveryPoint" type="{http://www.fpml.org/FpML-5/recordkeeping}CoalDeliveryPoint"/>
 *           &lt;element name="deliveryAtSource" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityUSCoalDelivery.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoalDelivery", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "deliveryPoint",
    "deliveryAtSource",
    "quantityVariationAdjustment",
    "transportationEquipment",
    "risk"
})
public class CoalDelivery {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalDeliveryPoint deliveryPoint;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean deliveryAtSource;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean quantityVariationAdjustment;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalTransportationEquipment transportationEquipment;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityDeliveryRisk risk;

    /**
     * Gets the value of the deliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link CoalDeliveryPoint }
     *     
     */
    public CoalDeliveryPoint getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Sets the value of the deliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalDeliveryPoint }
     *     
     */
    public void setDeliveryPoint(CoalDeliveryPoint value) {
        this.deliveryPoint = value;
    }

    /**
     * Gets the value of the deliveryAtSource property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryAtSource() {
        return deliveryAtSource;
    }

    /**
     * Sets the value of the deliveryAtSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryAtSource(Boolean value) {
        this.deliveryAtSource = value;
    }

    /**
     * Gets the value of the quantityVariationAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQuantityVariationAdjustment() {
        return quantityVariationAdjustment;
    }

    /**
     * Sets the value of the quantityVariationAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQuantityVariationAdjustment(Boolean value) {
        this.quantityVariationAdjustment = value;
    }

    /**
     * Gets the value of the transportationEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link CoalTransportationEquipment }
     *     
     */
    public CoalTransportationEquipment getTransportationEquipment() {
        return transportationEquipment;
    }

    /**
     * Sets the value of the transportationEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalTransportationEquipment }
     *     
     */
    public void setTransportationEquipment(CoalTransportationEquipment value) {
        this.transportationEquipment = value;
    }

    /**
     * Gets the value of the risk property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryRisk }
     *     
     */
    public CommodityDeliveryRisk getRisk() {
        return risk;
    }

    /**
     * Sets the value of the risk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryRisk }
     *     
     */
    public void setRisk(CommodityDeliveryRisk value) {
        this.risk = value;
    }

}
