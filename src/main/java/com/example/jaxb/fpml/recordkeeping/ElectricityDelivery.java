
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The physical delivery conditions for electricity.
 * 
 * <p>Java class for ElectricityDelivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityDelivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="deliveryPoint" type="{http://www.fpml.org/FpML-5/recordkeeping}ElectricityDeliveryPoint"/>
 *           &lt;element name="deliveryType" type="{http://www.fpml.org/FpML-5/recordkeeping}ElectricityDeliveryType"/>
 *           &lt;element name="transmissionContingency" type="{http://www.fpml.org/FpML-5/recordkeeping}ElectricityTransmissionContingency" minOccurs="0"/>
 *           &lt;element name="interconnectionPoint" type="{http://www.fpml.org/FpML-5/recordkeeping}InterconnectionPoint" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="deliveryZone" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityDeliveryPoint" minOccurs="0"/>
 *           &lt;element name="electingPartyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityDelivery", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "deliveryPoint",
    "deliveryType",
    "transmissionContingency",
    "interconnectionPoint",
    "deliveryZone",
    "electingPartyReference"
})
public class ElectricityDelivery {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ElectricityDeliveryPoint deliveryPoint;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ElectricityDeliveryType deliveryType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ElectricityTransmissionContingency transmissionContingency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected InterconnectionPoint interconnectionPoint;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityDeliveryPoint deliveryZone;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference electingPartyReference;

    /**
     * Gets the value of the deliveryPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityDeliveryPoint }
     *     
     */
    public ElectricityDeliveryPoint getDeliveryPoint() {
        return deliveryPoint;
    }

    /**
     * Sets the value of the deliveryPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityDeliveryPoint }
     *     
     */
    public void setDeliveryPoint(ElectricityDeliveryPoint value) {
        this.deliveryPoint = value;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityDeliveryType }
     *     
     */
    public ElectricityDeliveryType getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityDeliveryType }
     *     
     */
    public void setDeliveryType(ElectricityDeliveryType value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the transmissionContingency property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricityTransmissionContingency }
     *     
     */
    public ElectricityTransmissionContingency getTransmissionContingency() {
        return transmissionContingency;
    }

    /**
     * Sets the value of the transmissionContingency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricityTransmissionContingency }
     *     
     */
    public void setTransmissionContingency(ElectricityTransmissionContingency value) {
        this.transmissionContingency = value;
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
     * Gets the value of the deliveryZone property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public CommodityDeliveryPoint getDeliveryZone() {
        return deliveryZone;
    }

    /**
     * Sets the value of the deliveryZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDeliveryPoint }
     *     
     */
    public void setDeliveryZone(CommodityDeliveryPoint value) {
        this.deliveryZone = value;
    }

    /**
     * Gets the value of the electingPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getElectingPartyReference() {
        return electingPartyReference;
    }

    /**
     * Sets the value of the electingPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setElectingPartyReference(PartyReference value) {
        this.electingPartyReference = value;
    }

}
