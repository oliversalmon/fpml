
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalSettlementPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalSettlementPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="businessDaysNotSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="businessDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="maximumBusinessDays" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalSettlementPeriod", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "businessDaysNotSpecified",
    "businessDays",
    "maximumBusinessDays"
})
public class PhysicalSettlementPeriod {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean businessDaysNotSpecified;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger businessDays;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maximumBusinessDays;

    /**
     * Gets the value of the businessDaysNotSpecified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessDaysNotSpecified() {
        return businessDaysNotSpecified;
    }

    /**
     * Sets the value of the businessDaysNotSpecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessDaysNotSpecified(Boolean value) {
        this.businessDaysNotSpecified = value;
    }

    /**
     * Gets the value of the businessDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBusinessDays() {
        return businessDays;
    }

    /**
     * Sets the value of the businessDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBusinessDays(BigInteger value) {
        this.businessDays = value;
    }

    /**
     * Gets the value of the maximumBusinessDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumBusinessDays() {
        return maximumBusinessDays;
    }

    /**
     * Sets the value of the maximumBusinessDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumBusinessDays(BigInteger value) {
        this.maximumBusinessDays = value;
    }

}
