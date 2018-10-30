
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CreditEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bankruptcy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="failureToPay" type="{http://www.fpml.org/FpML-5/recordkeeping}FailureToPay" minOccurs="0"/>
 *         &lt;element name="failureToPayPrincipal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="failureToPayInterest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="obligationDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="obligationAcceleration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="repudiationMoratorium" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="restructuring" type="{http://www.fpml.org/FpML-5/recordkeeping}Restructuring" minOccurs="0"/>
 *         &lt;element name="governmentalIntervention" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="distressedRatingsDowngrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maturityExtension" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="writedown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="impliedWritedown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultRequirement" type="{http://www.fpml.org/FpML-5/recordkeeping}Money" minOccurs="0"/>
 *         &lt;element name="creditEventNotice" type="{http://www.fpml.org/FpML-5/recordkeeping}CreditEventNotice" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditEvents", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "bankruptcy",
    "failureToPay",
    "failureToPayPrincipal",
    "failureToPayInterest",
    "obligationDefault",
    "obligationAcceleration",
    "repudiationMoratorium",
    "restructuring",
    "governmentalIntervention",
    "distressedRatingsDowngrade",
    "maturityExtension",
    "writedown",
    "impliedWritedown",
    "defaultRequirement",
    "creditEventNotice"
})
public class CreditEvents {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean bankruptcy;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FailureToPay failureToPay;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean failureToPayPrincipal;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean failureToPayInterest;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean obligationDefault;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean obligationAcceleration;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean repudiationMoratorium;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Restructuring restructuring;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean governmentalIntervention;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean distressedRatingsDowngrade;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean maturityExtension;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean writedown;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean impliedWritedown;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money defaultRequirement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CreditEventNotice creditEventNotice;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the bankruptcy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBankruptcy() {
        return bankruptcy;
    }

    /**
     * Sets the value of the bankruptcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBankruptcy(Boolean value) {
        this.bankruptcy = value;
    }

    /**
     * Gets the value of the failureToPay property.
     * 
     * @return
     *     possible object is
     *     {@link FailureToPay }
     *     
     */
    public FailureToPay getFailureToPay() {
        return failureToPay;
    }

    /**
     * Sets the value of the failureToPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureToPay }
     *     
     */
    public void setFailureToPay(FailureToPay value) {
        this.failureToPay = value;
    }

    /**
     * Gets the value of the failureToPayPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailureToPayPrincipal() {
        return failureToPayPrincipal;
    }

    /**
     * Sets the value of the failureToPayPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailureToPayPrincipal(Boolean value) {
        this.failureToPayPrincipal = value;
    }

    /**
     * Gets the value of the failureToPayInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailureToPayInterest() {
        return failureToPayInterest;
    }

    /**
     * Sets the value of the failureToPayInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailureToPayInterest(Boolean value) {
        this.failureToPayInterest = value;
    }

    /**
     * Gets the value of the obligationDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObligationDefault() {
        return obligationDefault;
    }

    /**
     * Sets the value of the obligationDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObligationDefault(Boolean value) {
        this.obligationDefault = value;
    }

    /**
     * Gets the value of the obligationAcceleration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObligationAcceleration() {
        return obligationAcceleration;
    }

    /**
     * Sets the value of the obligationAcceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObligationAcceleration(Boolean value) {
        this.obligationAcceleration = value;
    }

    /**
     * Gets the value of the repudiationMoratorium property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepudiationMoratorium() {
        return repudiationMoratorium;
    }

    /**
     * Sets the value of the repudiationMoratorium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepudiationMoratorium(Boolean value) {
        this.repudiationMoratorium = value;
    }

    /**
     * Gets the value of the restructuring property.
     * 
     * @return
     *     possible object is
     *     {@link Restructuring }
     *     
     */
    public Restructuring getRestructuring() {
        return restructuring;
    }

    /**
     * Sets the value of the restructuring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restructuring }
     *     
     */
    public void setRestructuring(Restructuring value) {
        this.restructuring = value;
    }

    /**
     * Gets the value of the governmentalIntervention property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGovernmentalIntervention() {
        return governmentalIntervention;
    }

    /**
     * Sets the value of the governmentalIntervention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGovernmentalIntervention(Boolean value) {
        this.governmentalIntervention = value;
    }

    /**
     * Gets the value of the distressedRatingsDowngrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistressedRatingsDowngrade() {
        return distressedRatingsDowngrade;
    }

    /**
     * Sets the value of the distressedRatingsDowngrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistressedRatingsDowngrade(Boolean value) {
        this.distressedRatingsDowngrade = value;
    }

    /**
     * Gets the value of the maturityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaturityExtension() {
        return maturityExtension;
    }

    /**
     * Sets the value of the maturityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaturityExtension(Boolean value) {
        this.maturityExtension = value;
    }

    /**
     * Gets the value of the writedown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWritedown() {
        return writedown;
    }

    /**
     * Sets the value of the writedown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWritedown(Boolean value) {
        this.writedown = value;
    }

    /**
     * Gets the value of the impliedWritedown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImpliedWritedown() {
        return impliedWritedown;
    }

    /**
     * Sets the value of the impliedWritedown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImpliedWritedown(Boolean value) {
        this.impliedWritedown = value;
    }

    /**
     * Gets the value of the defaultRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDefaultRequirement() {
        return defaultRequirement;
    }

    /**
     * Sets the value of the defaultRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDefaultRequirement(Money value) {
        this.defaultRequirement = value;
    }

    /**
     * Gets the value of the creditEventNotice property.
     * 
     * @return
     *     possible object is
     *     {@link CreditEventNotice }
     *     
     */
    public CreditEventNotice getCreditEventNotice() {
        return creditEventNotice;
    }

    /**
     * Sets the value of the creditEventNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditEventNotice }
     *     
     */
    public void setCreditEventNotice(CreditEventNotice value) {
        this.creditEventNotice = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
