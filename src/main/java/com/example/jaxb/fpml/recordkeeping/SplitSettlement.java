
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that supports the division of a gross settlement amount into a number of split settlements, each requiring its own settlement instruction.
 * 
 * <p>Java class for SplitSettlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitSettlement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="splitSettlementAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}Money" minOccurs="0"/>
 *         &lt;element name="beneficiaryBank" type="{http://www.fpml.org/FpML-5/recordkeeping}Routing" minOccurs="0"/>
 *         &lt;element name="beneficiary" type="{http://www.fpml.org/FpML-5/recordkeeping}Routing" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitSettlement", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "splitSettlementAmount",
    "beneficiaryBank",
    "beneficiary"
})
public class SplitSettlement {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money splitSettlementAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Routing beneficiaryBank;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Routing beneficiary;

    /**
     * Gets the value of the splitSettlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSplitSettlementAmount() {
        return splitSettlementAmount;
    }

    /**
     * Sets the value of the splitSettlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSplitSettlementAmount(Money value) {
        this.splitSettlementAmount = value;
    }

    /**
     * Gets the value of the beneficiaryBank property.
     * 
     * @return
     *     possible object is
     *     {@link Routing }
     *     
     */
    public Routing getBeneficiaryBank() {
        return beneficiaryBank;
    }

    /**
     * Sets the value of the beneficiaryBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Routing }
     *     
     */
    public void setBeneficiaryBank(Routing value) {
        this.beneficiaryBank = value;
    }

    /**
     * Gets the value of the beneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link Routing }
     *     
     */
    public Routing getBeneficiary() {
        return beneficiary;
    }

    /**
     * Sets the value of the beneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Routing }
     *     
     */
    public void setBeneficiary(Routing value) {
        this.beneficiary = value;
    }

}
