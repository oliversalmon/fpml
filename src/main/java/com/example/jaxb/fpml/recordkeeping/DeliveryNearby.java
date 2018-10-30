
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type defines nearest Delivery Date of the underlying Commodity of expiration of the futures contract.
 * 
 * <p>Java class for DeliveryNearby complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryNearby">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveryNearbyMultiplier" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="deliveryNearbyType" type="{http://www.fpml.org/FpML-5/recordkeeping}DeliveryNearbyTypeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryNearby", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "deliveryNearbyMultiplier",
    "deliveryNearbyType"
})
public class DeliveryNearby {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger deliveryNearbyMultiplier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected DeliveryNearbyTypeEnum deliveryNearbyType;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the deliveryNearbyMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeliveryNearbyMultiplier() {
        return deliveryNearbyMultiplier;
    }

    /**
     * Sets the value of the deliveryNearbyMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeliveryNearbyMultiplier(BigInteger value) {
        this.deliveryNearbyMultiplier = value;
    }

    /**
     * Gets the value of the deliveryNearbyType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryNearbyTypeEnum }
     *     
     */
    public DeliveryNearbyTypeEnum getDeliveryNearbyType() {
        return deliveryNearbyType;
    }

    /**
     * Sets the value of the deliveryNearbyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryNearbyTypeEnum }
     *     
     */
    public void setDeliveryNearbyType(DeliveryNearbyTypeEnum value) {
        this.deliveryNearbyType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
