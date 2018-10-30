
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An entity for defining the master confirmation agreement executed between the parties.
 * 
 * <p>Java class for MasterConfirmation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterConfirmation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="masterConfirmationType" type="{http://www.fpml.org/FpML-5/recordkeeping}MasterConfirmationType" minOccurs="0"/>
 *         &lt;element name="masterConfirmationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="masterConfirmationAnnexDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="masterConfirmationAnnexType" type="{http://www.fpml.org/FpML-5/recordkeeping}MasterConfirmationAnnexType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterConfirmation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "masterConfirmationType",
    "masterConfirmationDate",
    "masterConfirmationAnnexDate",
    "masterConfirmationAnnexType"
})
public class MasterConfirmation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MasterConfirmationType masterConfirmationType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar masterConfirmationDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar masterConfirmationAnnexDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MasterConfirmationAnnexType masterConfirmationAnnexType;

    /**
     * Gets the value of the masterConfirmationType property.
     * 
     * @return
     *     possible object is
     *     {@link MasterConfirmationType }
     *     
     */
    public MasterConfirmationType getMasterConfirmationType() {
        return masterConfirmationType;
    }

    /**
     * Sets the value of the masterConfirmationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterConfirmationType }
     *     
     */
    public void setMasterConfirmationType(MasterConfirmationType value) {
        this.masterConfirmationType = value;
    }

    /**
     * Gets the value of the masterConfirmationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMasterConfirmationDate() {
        return masterConfirmationDate;
    }

    /**
     * Sets the value of the masterConfirmationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMasterConfirmationDate(XMLGregorianCalendar value) {
        this.masterConfirmationDate = value;
    }

    /**
     * Gets the value of the masterConfirmationAnnexDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMasterConfirmationAnnexDate() {
        return masterConfirmationAnnexDate;
    }

    /**
     * Sets the value of the masterConfirmationAnnexDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMasterConfirmationAnnexDate(XMLGregorianCalendar value) {
        this.masterConfirmationAnnexDate = value;
    }

    /**
     * Gets the value of the masterConfirmationAnnexType property.
     * 
     * @return
     *     possible object is
     *     {@link MasterConfirmationAnnexType }
     *     
     */
    public MasterConfirmationAnnexType getMasterConfirmationAnnexType() {
        return masterConfirmationAnnexType;
    }

    /**
     * Sets the value of the masterConfirmationAnnexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterConfirmationAnnexType }
     *     
     */
    public void setMasterConfirmationAnnexType(MasterConfirmationAnnexType value) {
        this.masterConfirmationAnnexType = value;
    }

}
