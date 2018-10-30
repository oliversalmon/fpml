
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type represents a CDS Tranche.
 * 
 * <p>Java class for Tranche complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tranche">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachmentPoint" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="exhaustionPoint" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="incurredRecoveryApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tranche", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "attachmentPoint",
    "exhaustionPoint",
    "incurredRecoveryApplicable"
})
public class Tranche {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal attachmentPoint;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal exhaustionPoint;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean incurredRecoveryApplicable;

    /**
     * Gets the value of the attachmentPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAttachmentPoint() {
        return attachmentPoint;
    }

    /**
     * Sets the value of the attachmentPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAttachmentPoint(BigDecimal value) {
        this.attachmentPoint = value;
    }

    /**
     * Gets the value of the exhaustionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExhaustionPoint() {
        return exhaustionPoint;
    }

    /**
     * Sets the value of the exhaustionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExhaustionPoint(BigDecimal value) {
        this.exhaustionPoint = value;
    }

    /**
     * Gets the value of the incurredRecoveryApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncurredRecoveryApplicable() {
        return incurredRecoveryApplicable;
    }

    /**
     * Sets the value of the incurredRecoveryApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncurredRecoveryApplicable(Boolean value) {
        this.incurredRecoveryApplicable = value;
    }

}
