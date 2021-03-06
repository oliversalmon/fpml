
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="referenceLevelUnit" type="{http://www.fpml.org/FpML-5/recordkeeping}ReferenceLevelUnit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceLevel", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "amount",
    "referenceLevelUnit"
})
public class ReferenceLevel {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected BigDecimal amount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected ReferenceLevelUnit referenceLevelUnit;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the referenceLevelUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLevelUnit }
     *     
     */
    public ReferenceLevelUnit getReferenceLevelUnit() {
        return referenceLevelUnit;
    }

    /**
     * Sets the value of the referenceLevelUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLevelUnit }
     *     
     */
    public void setReferenceLevelUnit(ReferenceLevelUnit value) {
        this.referenceLevelUnit = value;
    }

}
