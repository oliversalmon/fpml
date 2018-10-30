
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An entity for defining the agreement executed between the parties and intended to govern all OTC derivatives transactions between those parties.
 * 
 * <p>Java class for MasterAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterAgreement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="masterAgreementId" type="{http://www.fpml.org/FpML-5/recordkeeping}MasterAgreementId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="masterAgreementType" type="{http://www.fpml.org/FpML-5/recordkeeping}MasterAgreementType" minOccurs="0"/>
 *         &lt;element name="masterAgreementVersion" type="{http://www.fpml.org/FpML-5/recordkeeping}MasterAgreementVersion" minOccurs="0"/>
 *         &lt;element name="masterAgreementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterAgreement", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "masterAgreementId",
    "masterAgreementType",
    "masterAgreementVersion",
    "masterAgreementDate"
})
public class MasterAgreement {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<MasterAgreementId> masterAgreementId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MasterAgreementType masterAgreementType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MasterAgreementVersion masterAgreementVersion;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar masterAgreementDate;

    /**
     * Gets the value of the masterAgreementId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the masterAgreementId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMasterAgreementId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterAgreementId }
     * 
     * 
     */
    public List<MasterAgreementId> getMasterAgreementId() {
        if (masterAgreementId == null) {
            masterAgreementId = new ArrayList<MasterAgreementId>();
        }
        return this.masterAgreementId;
    }

    /**
     * Gets the value of the masterAgreementType property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreementType }
     *     
     */
    public MasterAgreementType getMasterAgreementType() {
        return masterAgreementType;
    }

    /**
     * Sets the value of the masterAgreementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreementType }
     *     
     */
    public void setMasterAgreementType(MasterAgreementType value) {
        this.masterAgreementType = value;
    }

    /**
     * Gets the value of the masterAgreementVersion property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreementVersion }
     *     
     */
    public MasterAgreementVersion getMasterAgreementVersion() {
        return masterAgreementVersion;
    }

    /**
     * Sets the value of the masterAgreementVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreementVersion }
     *     
     */
    public void setMasterAgreementVersion(MasterAgreementVersion value) {
        this.masterAgreementVersion = value;
    }

    /**
     * Gets the value of the masterAgreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMasterAgreementDate() {
        return masterAgreementDate;
    }

    /**
     * Sets the value of the masterAgreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMasterAgreementDate(XMLGregorianCalendar value) {
        this.masterAgreementDate = value;
    }

}
