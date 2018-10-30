
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditDerivativesNotices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditDerivativesNotices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="publiclyAvailableInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="physicalSettlement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditDerivativesNotices", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "creditEvent",
    "publiclyAvailableInformation",
    "physicalSettlement"
})
public class CreditDerivativesNotices {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean creditEvent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean publiclyAvailableInformation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean physicalSettlement;

    /**
     * Gets the value of the creditEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditEvent() {
        return creditEvent;
    }

    /**
     * Sets the value of the creditEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditEvent(Boolean value) {
        this.creditEvent = value;
    }

    /**
     * Gets the value of the publiclyAvailableInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPubliclyAvailableInformation() {
        return publiclyAvailableInformation;
    }

    /**
     * Sets the value of the publiclyAvailableInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPubliclyAvailableInformation(Boolean value) {
        this.publiclyAvailableInformation = value;
    }

    /**
     * Gets the value of the physicalSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPhysicalSettlement() {
        return physicalSettlement;
    }

    /**
     * Sets the value of the physicalSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPhysicalSettlement(Boolean value) {
        this.physicalSettlement = value;
    }

}
