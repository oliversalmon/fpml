
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalFixedPayments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalFixedPayments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interestShortfallReimbursement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="principalShortfallReimbursement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="writedownReimbursement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalFixedPayments", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "interestShortfallReimbursement",
    "principalShortfallReimbursement",
    "writedownReimbursement"
})
public class AdditionalFixedPayments {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean interestShortfallReimbursement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean principalShortfallReimbursement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean writedownReimbursement;

    /**
     * Gets the value of the interestShortfallReimbursement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterestShortfallReimbursement() {
        return interestShortfallReimbursement;
    }

    /**
     * Sets the value of the interestShortfallReimbursement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterestShortfallReimbursement(Boolean value) {
        this.interestShortfallReimbursement = value;
    }

    /**
     * Gets the value of the principalShortfallReimbursement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrincipalShortfallReimbursement() {
        return principalShortfallReimbursement;
    }

    /**
     * Sets the value of the principalShortfallReimbursement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrincipalShortfallReimbursement(Boolean value) {
        this.principalShortfallReimbursement = value;
    }

    /**
     * Gets the value of the writedownReimbursement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWritedownReimbursement() {
        return writedownReimbursement;
    }

    /**
     * Sets the value of the writedownReimbursement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWritedownReimbursement(Boolean value) {
        this.writedownReimbursement = value;
    }

}
