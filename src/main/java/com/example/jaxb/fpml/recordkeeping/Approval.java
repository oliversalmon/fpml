
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A specific approval state in the workflow.
 * 
 * <p>Java class for Approval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Approval">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.fpml.org/FpML-5/recordkeeping}ApprovalType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.fpml.org/FpML-5/recordkeeping}NormalizedString" minOccurs="0"/>
 *         &lt;element name="approver" type="{http://www.fpml.org/FpML-5/recordkeeping}PersonId" minOccurs="0"/>
 *         &lt;element name="approvingPartyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;element name="approvedPartyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;element name="approvalId" type="{http://www.fpml.org/FpML-5/recordkeeping}ApprovalId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Approval", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "type",
    "status",
    "approver",
    "approvingPartyReference",
    "approvedPartyReference",
    "approvalId"
})
public class Approval {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ApprovalType type;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String status;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PersonId approver;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference approvingPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference approvedPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ApprovalId approvalId;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalType }
     *     
     */
    public ApprovalType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalType }
     *     
     */
    public void setType(ApprovalType value) {
        this.type = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the approver property.
     * 
     * @return
     *     possible object is
     *     {@link PersonId }
     *     
     */
    public PersonId getApprover() {
        return approver;
    }

    /**
     * Sets the value of the approver property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonId }
     *     
     */
    public void setApprover(PersonId value) {
        this.approver = value;
    }

    /**
     * Gets the value of the approvingPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getApprovingPartyReference() {
        return approvingPartyReference;
    }

    /**
     * Sets the value of the approvingPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setApprovingPartyReference(PartyReference value) {
        this.approvingPartyReference = value;
    }

    /**
     * Gets the value of the approvedPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getApprovedPartyReference() {
        return approvedPartyReference;
    }

    /**
     * Sets the value of the approvedPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setApprovedPartyReference(PartyReference value) {
        this.approvedPartyReference = value;
    }

    /**
     * Gets the value of the approvalId property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalId }
     *     
     */
    public ApprovalId getApprovalId() {
        return approvalId;
    }

    /**
     * Sets the value of the approvalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalId }
     *     
     */
    public void setApprovalId(ApprovalId value) {
        this.approvalId = value;
    }

}
