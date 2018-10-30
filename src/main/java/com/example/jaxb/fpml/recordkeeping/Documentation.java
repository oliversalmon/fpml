
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An entity for defining the definitions that govern the document and should include the year and type of definitions referenced, along with any relevant documentation (such as master agreement) and the date it was signed.
 * 
 * <p>Java class for Documentation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Documentation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="masterAgreement" type="{http://www.fpml.org/FpML-5/recordkeeping}MasterAgreement" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="masterConfirmation" type="{http://www.fpml.org/FpML-5/recordkeeping}MasterConfirmation"/>
 *           &lt;element name="brokerConfirmation" type="{http://www.fpml.org/FpML-5/recordkeeping}BrokerConfirmation"/>
 *         &lt;/choice>
 *         &lt;element name="contractualDefinitions" type="{http://www.fpml.org/FpML-5/recordkeeping}ContractualDefinitions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contractualTermsSupplement" type="{http://www.fpml.org/FpML-5/recordkeeping}ContractualTermsSupplement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contractualMatrix" type="{http://www.fpml.org/FpML-5/recordkeeping}ContractualMatrix" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creditSupportAgreement" type="{http://www.fpml.org/FpML-5/recordkeeping}CreditSupportAgreement" minOccurs="0"/>
 *         &lt;element name="otherAgreement" type="{http://www.fpml.org/FpML-5/recordkeeping}OtherAgreement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attachment" type="{http://www.fpml.org/FpML-5/recordkeeping}Resource" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documentation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "masterAgreement",
    "masterConfirmation",
    "brokerConfirmation",
    "contractualDefinitions",
    "contractualTermsSupplement",
    "contractualMatrix",
    "creditSupportAgreement",
    "otherAgreement",
    "attachment"
})
public class Documentation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MasterAgreement masterAgreement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MasterConfirmation masterConfirmation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BrokerConfirmation brokerConfirmation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ContractualDefinitions> contractualDefinitions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ContractualTermsSupplement> contractualTermsSupplement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ContractualMatrix> contractualMatrix;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CreditSupportAgreement creditSupportAgreement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<OtherAgreement> otherAgreement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Resource> attachment;

    /**
     * Gets the value of the masterAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement }
     *     
     */
    public MasterAgreement getMasterAgreement() {
        return masterAgreement;
    }

    /**
     * Sets the value of the masterAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement }
     *     
     */
    public void setMasterAgreement(MasterAgreement value) {
        this.masterAgreement = value;
    }

    /**
     * Gets the value of the masterConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link MasterConfirmation }
     *     
     */
    public MasterConfirmation getMasterConfirmation() {
        return masterConfirmation;
    }

    /**
     * Sets the value of the masterConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterConfirmation }
     *     
     */
    public void setMasterConfirmation(MasterConfirmation value) {
        this.masterConfirmation = value;
    }

    /**
     * Gets the value of the brokerConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link BrokerConfirmation }
     *     
     */
    public BrokerConfirmation getBrokerConfirmation() {
        return brokerConfirmation;
    }

    /**
     * Sets the value of the brokerConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerConfirmation }
     *     
     */
    public void setBrokerConfirmation(BrokerConfirmation value) {
        this.brokerConfirmation = value;
    }

    /**
     * Gets the value of the contractualDefinitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractualDefinitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractualDefinitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractualDefinitions }
     * 
     * 
     */
    public List<ContractualDefinitions> getContractualDefinitions() {
        if (contractualDefinitions == null) {
            contractualDefinitions = new ArrayList<ContractualDefinitions>();
        }
        return this.contractualDefinitions;
    }

    /**
     * Gets the value of the contractualTermsSupplement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractualTermsSupplement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractualTermsSupplement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractualTermsSupplement }
     * 
     * 
     */
    public List<ContractualTermsSupplement> getContractualTermsSupplement() {
        if (contractualTermsSupplement == null) {
            contractualTermsSupplement = new ArrayList<ContractualTermsSupplement>();
        }
        return this.contractualTermsSupplement;
    }

    /**
     * Gets the value of the contractualMatrix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractualMatrix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractualMatrix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractualMatrix }
     * 
     * 
     */
    public List<ContractualMatrix> getContractualMatrix() {
        if (contractualMatrix == null) {
            contractualMatrix = new ArrayList<ContractualMatrix>();
        }
        return this.contractualMatrix;
    }

    /**
     * Gets the value of the creditSupportAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link CreditSupportAgreement }
     *     
     */
    public CreditSupportAgreement getCreditSupportAgreement() {
        return creditSupportAgreement;
    }

    /**
     * Sets the value of the creditSupportAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditSupportAgreement }
     *     
     */
    public void setCreditSupportAgreement(CreditSupportAgreement value) {
        this.creditSupportAgreement = value;
    }

    /**
     * Gets the value of the otherAgreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAgreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAgreement }
     * 
     * 
     */
    public List<OtherAgreement> getOtherAgreement() {
        if (otherAgreement == null) {
            otherAgreement = new ArrayList<OtherAgreement>();
        }
        return this.otherAgreement;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resource }
     * 
     * 
     */
    public List<Resource> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<Resource>();
        }
        return this.attachment;
    }

}
