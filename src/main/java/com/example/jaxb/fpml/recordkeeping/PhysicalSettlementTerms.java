
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalSettlementTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalSettlementTerms">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}SettlementTerms">
 *       &lt;sequence>
 *         &lt;element name="physicalSettlementPeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}PhysicalSettlementPeriod" minOccurs="0"/>
 *         &lt;element name="deliverableObligations" type="{http://www.fpml.org/FpML-5/recordkeeping}DeliverableObligations" minOccurs="0"/>
 *         &lt;element name="escrow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sixtyBusinessDaySettlementCap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalSettlementTerms", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "physicalSettlementPeriod",
    "deliverableObligations",
    "escrow",
    "sixtyBusinessDaySettlementCap"
})
public class PhysicalSettlementTerms
    extends SettlementTerms
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PhysicalSettlementPeriod physicalSettlementPeriod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DeliverableObligations deliverableObligations;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean escrow;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean sixtyBusinessDaySettlementCap;

    /**
     * Gets the value of the physicalSettlementPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalSettlementPeriod }
     *     
     */
    public PhysicalSettlementPeriod getPhysicalSettlementPeriod() {
        return physicalSettlementPeriod;
    }

    /**
     * Sets the value of the physicalSettlementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalSettlementPeriod }
     *     
     */
    public void setPhysicalSettlementPeriod(PhysicalSettlementPeriod value) {
        this.physicalSettlementPeriod = value;
    }

    /**
     * Gets the value of the deliverableObligations property.
     * 
     * @return
     *     possible object is
     *     {@link DeliverableObligations }
     *     
     */
    public DeliverableObligations getDeliverableObligations() {
        return deliverableObligations;
    }

    /**
     * Sets the value of the deliverableObligations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliverableObligations }
     *     
     */
    public void setDeliverableObligations(DeliverableObligations value) {
        this.deliverableObligations = value;
    }

    /**
     * Gets the value of the escrow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEscrow() {
        return escrow;
    }

    /**
     * Sets the value of the escrow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEscrow(Boolean value) {
        this.escrow = value;
    }

    /**
     * Gets the value of the sixtyBusinessDaySettlementCap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSixtyBusinessDaySettlementCap() {
        return sixtyBusinessDaySettlementCap;
    }

    /**
     * Sets the value of the sixtyBusinessDaySettlementCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSixtyBusinessDaySettlementCap(Boolean value) {
        this.sixtyBusinessDaySettlementCap = value;
    }

}
