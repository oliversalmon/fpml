
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
 * An entity for defining the an agreement executed between parties.
 * 
 * <p>Java class for OtherAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherAgreement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.fpml.org/FpML-5/recordkeeping}OtherAgreementId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.fpml.org/FpML-5/recordkeeping}OtherAgreementType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.fpml.org/FpML-5/recordkeeping}OtherAgreementVersion" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAgreement", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "identifier",
    "type",
    "version",
    "date"
})
public class OtherAgreement {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<OtherAgreementId> identifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected OtherAgreementType type;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected OtherAgreementVersion version;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAgreementId }
     * 
     * 
     */
    public List<OtherAgreementId> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<OtherAgreementId>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAgreementType }
     *     
     */
    public OtherAgreementType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAgreementType }
     *     
     */
    public void setType(OtherAgreementType value) {
        this.type = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link OtherAgreementVersion }
     *     
     */
    public OtherAgreementVersion getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherAgreementVersion }
     *     
     */
    public void setVersion(OtherAgreementVersion value) {
        this.version = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
