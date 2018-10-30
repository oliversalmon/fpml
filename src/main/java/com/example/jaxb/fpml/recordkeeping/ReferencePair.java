
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferencePair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencePair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceEntity" type="{http://www.fpml.org/FpML-5/recordkeeping}LegalEntity" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="referenceObligation" type="{http://www.fpml.org/FpML-5/recordkeeping}ReferenceObligation"/>
 *           &lt;element name="noReferenceObligation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
 *         &lt;element name="entityType" type="{http://www.fpml.org/FpML-5/recordkeeping}EntityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencePair", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "referenceEntity",
    "referenceObligation",
    "noReferenceObligation",
    "entityType"
})
public class ReferencePair {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected LegalEntity referenceEntity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReferenceObligation referenceObligation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean noReferenceObligation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EntityType entityType;

    /**
     * Gets the value of the referenceEntity property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntity }
     *     
     */
    public LegalEntity getReferenceEntity() {
        return referenceEntity;
    }

    /**
     * Sets the value of the referenceEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntity }
     *     
     */
    public void setReferenceEntity(LegalEntity value) {
        this.referenceEntity = value;
    }

    /**
     * Gets the value of the referenceObligation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceObligation }
     *     
     */
    public ReferenceObligation getReferenceObligation() {
        return referenceObligation;
    }

    /**
     * Sets the value of the referenceObligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceObligation }
     *     
     */
    public void setReferenceObligation(ReferenceObligation value) {
        this.referenceObligation = value;
    }

    /**
     * Gets the value of the noReferenceObligation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoReferenceObligation() {
        return noReferenceObligation;
    }

    /**
     * Sets the value of the noReferenceObligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoReferenceObligation(Boolean value) {
        this.noReferenceObligation = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setEntityType(EntityType value) {
        this.entityType = value;
    }

}
