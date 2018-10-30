
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferenceObligation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceObligation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}bond"/>
 *           &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}convertibleBond"/>
 *           &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}mortgage"/>
 *           &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}loan"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="primaryObligor" type="{http://www.fpml.org/FpML-5/recordkeeping}LegalEntity"/>
 *           &lt;element name="primaryObligorReference" type="{http://www.fpml.org/FpML-5/recordkeeping}LegalEntityReference"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="guarantor" type="{http://www.fpml.org/FpML-5/recordkeeping}LegalEntity"/>
 *           &lt;element name="guarantorReference" type="{http://www.fpml.org/FpML-5/recordkeeping}LegalEntityReference"/>
 *         &lt;/choice>
 *         &lt;element name="standardReferenceObligation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceObligation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "bond",
    "convertibleBond",
    "mortgage",
    "loan",
    "primaryObligor",
    "primaryObligorReference",
    "guarantorOrGuarantorReference",
    "standardReferenceObligation"
})
public class ReferenceObligation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Bond bond;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ConvertibleBond convertibleBond;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Mortgage mortgage;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Loan loan;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected LegalEntity primaryObligor;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected LegalEntityReference primaryObligorReference;
    @XmlElements({
        @XmlElement(name = "guarantor", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = LegalEntity.class),
        @XmlElement(name = "guarantorReference", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = LegalEntityReference.class)
    })
    protected List<Object> guarantorOrGuarantorReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean standardReferenceObligation;

    /**
     * Gets the value of the bond property.
     * 
     * @return
     *     possible object is
     *     {@link Bond }
     *     
     */
    public Bond getBond() {
        return bond;
    }

    /**
     * Sets the value of the bond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bond }
     *     
     */
    public void setBond(Bond value) {
        this.bond = value;
    }

    /**
     * Gets the value of the convertibleBond property.
     * 
     * @return
     *     possible object is
     *     {@link ConvertibleBond }
     *     
     */
    public ConvertibleBond getConvertibleBond() {
        return convertibleBond;
    }

    /**
     * Sets the value of the convertibleBond property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConvertibleBond }
     *     
     */
    public void setConvertibleBond(ConvertibleBond value) {
        this.convertibleBond = value;
    }

    /**
     * Gets the value of the mortgage property.
     * 
     * @return
     *     possible object is
     *     {@link Mortgage }
     *     
     */
    public Mortgage getMortgage() {
        return mortgage;
    }

    /**
     * Sets the value of the mortgage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mortgage }
     *     
     */
    public void setMortgage(Mortgage value) {
        this.mortgage = value;
    }

    /**
     * Gets the value of the loan property.
     * 
     * @return
     *     possible object is
     *     {@link Loan }
     *     
     */
    public Loan getLoan() {
        return loan;
    }

    /**
     * Sets the value of the loan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Loan }
     *     
     */
    public void setLoan(Loan value) {
        this.loan = value;
    }

    /**
     * Gets the value of the primaryObligor property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntity }
     *     
     */
    public LegalEntity getPrimaryObligor() {
        return primaryObligor;
    }

    /**
     * Sets the value of the primaryObligor property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntity }
     *     
     */
    public void setPrimaryObligor(LegalEntity value) {
        this.primaryObligor = value;
    }

    /**
     * Gets the value of the primaryObligorReference property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntityReference }
     *     
     */
    public LegalEntityReference getPrimaryObligorReference() {
        return primaryObligorReference;
    }

    /**
     * Sets the value of the primaryObligorReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntityReference }
     *     
     */
    public void setPrimaryObligorReference(LegalEntityReference value) {
        this.primaryObligorReference = value;
    }

    /**
     * Gets the value of the guarantorOrGuarantorReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guarantorOrGuarantorReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuarantorOrGuarantorReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEntity }
     * {@link LegalEntityReference }
     * 
     * 
     */
    public List<Object> getGuarantorOrGuarantorReference() {
        if (guarantorOrGuarantorReference == null) {
            guarantorOrGuarantorReference = new ArrayList<Object>();
        }
        return this.guarantorOrGuarantorReference;
    }

    /**
     * Gets the value of the standardReferenceObligation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStandardReferenceObligation() {
        return standardReferenceObligation;
    }

    /**
     * Sets the value of the standardReferenceObligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStandardReferenceObligation(Boolean value) {
        this.standardReferenceObligation = value;
    }

}
