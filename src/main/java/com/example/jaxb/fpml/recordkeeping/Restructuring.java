
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Restructuring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Restructuring">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="restructuringType" type="{http://www.fpml.org/FpML-5/recordkeeping}RestructuringType" minOccurs="0"/>
 *         &lt;element name="multipleHolderObligation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="multipleCreditEventNotices" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Restructuring", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "applicable",
    "restructuringType",
    "multipleHolderObligation",
    "multipleCreditEventNotices"
})
public class Restructuring {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean applicable;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected RestructuringType restructuringType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean multipleHolderObligation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean multipleCreditEventNotices;

    /**
     * Gets the value of the applicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicable() {
        return applicable;
    }

    /**
     * Sets the value of the applicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicable(Boolean value) {
        this.applicable = value;
    }

    /**
     * Gets the value of the restructuringType property.
     * 
     * @return
     *     possible object is
     *     {@link RestructuringType }
     *     
     */
    public RestructuringType getRestructuringType() {
        return restructuringType;
    }

    /**
     * Sets the value of the restructuringType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestructuringType }
     *     
     */
    public void setRestructuringType(RestructuringType value) {
        this.restructuringType = value;
    }

    /**
     * Gets the value of the multipleHolderObligation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleHolderObligation() {
        return multipleHolderObligation;
    }

    /**
     * Sets the value of the multipleHolderObligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleHolderObligation(Boolean value) {
        this.multipleHolderObligation = value;
    }

    /**
     * Gets the value of the multipleCreditEventNotices property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleCreditEventNotices() {
        return multipleCreditEventNotices;
    }

    /**
     * Sets the value of the multipleCreditEventNotices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleCreditEventNotices(Boolean value) {
        this.multipleCreditEventNotices = value;
    }

}
