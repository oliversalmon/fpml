
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceEntity" type="{http://www.fpml.org/FpML-5/recordkeeping}LegalEntity"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="referenceObligation" type="{http://www.fpml.org/FpML-5/recordkeeping}ReferenceObligation" maxOccurs="unbounded"/>
 *           &lt;element name="noReferenceObligation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="unknownReferenceObligation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
 *         &lt;element name="allGuarantees" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="referencePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="referencePolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="securedList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInformation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "referenceEntity",
    "referenceObligation",
    "noReferenceObligation",
    "unknownReferenceObligation",
    "allGuarantees",
    "referencePrice",
    "referencePolicy",
    "securedList"
})
public class ReferenceInformation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected LegalEntity referenceEntity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ReferenceObligation> referenceObligation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean noReferenceObligation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean unknownReferenceObligation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean allGuarantees;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal referencePrice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean referencePolicy;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean securedList;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceObligation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceObligation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceObligation }
     * 
     * 
     */
    public List<ReferenceObligation> getReferenceObligation() {
        if (referenceObligation == null) {
            referenceObligation = new ArrayList<ReferenceObligation>();
        }
        return this.referenceObligation;
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
     * Gets the value of the unknownReferenceObligation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnknownReferenceObligation() {
        return unknownReferenceObligation;
    }

    /**
     * Sets the value of the unknownReferenceObligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnknownReferenceObligation(Boolean value) {
        this.unknownReferenceObligation = value;
    }

    /**
     * Gets the value of the allGuarantees property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllGuarantees() {
        return allGuarantees;
    }

    /**
     * Sets the value of the allGuarantees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllGuarantees(Boolean value) {
        this.allGuarantees = value;
    }

    /**
     * Gets the value of the referencePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReferencePrice() {
        return referencePrice;
    }

    /**
     * Sets the value of the referencePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReferencePrice(BigDecimal value) {
        this.referencePrice = value;
    }

    /**
     * Gets the value of the referencePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReferencePolicy() {
        return referencePolicy;
    }

    /**
     * Sets the value of the referencePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReferencePolicy(Boolean value) {
        this.referencePolicy = value;
    }

    /**
     * Gets the value of the securedList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSecuredList() {
        return securedList;
    }

    /**
     * Sets the value of the securedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSecuredList(Boolean value) {
        this.securedList = value;
    }

}
