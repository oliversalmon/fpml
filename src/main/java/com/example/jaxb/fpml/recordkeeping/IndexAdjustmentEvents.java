
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the specification of the consequences of Index Events as defined by the 2002 ISDA Equity Derivatives Definitions.
 * 
 * <p>Java class for IndexAdjustmentEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexAdjustmentEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indexModification" type="{http://www.fpml.org/FpML-5/recordkeeping}IndexEventConsequenceEnum" minOccurs="0"/>
 *         &lt;element name="indexCancellation" type="{http://www.fpml.org/FpML-5/recordkeeping}IndexEventConsequenceEnum" minOccurs="0"/>
 *         &lt;element name="indexDisruption" type="{http://www.fpml.org/FpML-5/recordkeeping}IndexEventConsequenceEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexAdjustmentEvents", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "indexModification",
    "indexCancellation",
    "indexDisruption"
})
public class IndexAdjustmentEvents {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected IndexEventConsequenceEnum indexModification;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected IndexEventConsequenceEnum indexCancellation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected IndexEventConsequenceEnum indexDisruption;

    /**
     * Gets the value of the indexModification property.
     * 
     * @return
     *     possible object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public IndexEventConsequenceEnum getIndexModification() {
        return indexModification;
    }

    /**
     * Sets the value of the indexModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public void setIndexModification(IndexEventConsequenceEnum value) {
        this.indexModification = value;
    }

    /**
     * Gets the value of the indexCancellation property.
     * 
     * @return
     *     possible object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public IndexEventConsequenceEnum getIndexCancellation() {
        return indexCancellation;
    }

    /**
     * Sets the value of the indexCancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public void setIndexCancellation(IndexEventConsequenceEnum value) {
        this.indexCancellation = value;
    }

    /**
     * Gets the value of the indexDisruption property.
     * 
     * @return
     *     possible object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public IndexEventConsequenceEnum getIndexDisruption() {
        return indexDisruption;
    }

    /**
     * Sets the value of the indexDisruption property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexEventConsequenceEnum }
     *     
     */
    public void setIndexDisruption(IndexEventConsequenceEnum value) {
        this.indexDisruption = value;
    }

}
