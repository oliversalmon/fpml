
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An event type that records the occurrence of a credit event notice.
 * 
 * <p>Java class for CreditEventNoticeDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditEventNoticeDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="affectedTransactions" type="{http://www.fpml.org/FpML-5/recordkeeping}AffectedTransactions" minOccurs="0"/>
 *         &lt;element name="referenceEntity" type="{http://www.fpml.org/FpML-5/recordkeeping}LegalEntity" minOccurs="0"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}creditEvent" minOccurs="0"/>
 *         &lt;element name="publiclyAvailableInformation" type="{http://www.fpml.org/FpML-5/recordkeeping}Resource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notifyingPartyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;element name="notifiedPartyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;element name="creditEventNoticeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="creditEventDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditEventNoticeDocument", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "affectedTransactions",
    "referenceEntity",
    "creditEvent",
    "publiclyAvailableInformation",
    "notifyingPartyReference",
    "notifiedPartyReference",
    "creditEventNoticeDate",
    "creditEventDate"
})
public class CreditEventNoticeDocument {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AffectedTransactions affectedTransactions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected LegalEntity referenceEntity;
    @XmlElementRef(name = "creditEvent", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends CreditEvent> creditEvent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Resource> publiclyAvailableInformation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference notifyingPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference notifiedPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditEventNoticeDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creditEventDate;

    /**
     * Gets the value of the affectedTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link AffectedTransactions }
     *     
     */
    public AffectedTransactions getAffectedTransactions() {
        return affectedTransactions;
    }

    /**
     * Sets the value of the affectedTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedTransactions }
     *     
     */
    public void setAffectedTransactions(AffectedTransactions value) {
        this.affectedTransactions = value;
    }

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
     * Gets the value of the creditEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FailureToPayEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link BankruptcyEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link RestructuringEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link RepudiationMoratoriumEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObligationDefaultEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObligationAccelerationEvent }{@code >}
     *     
     */
    public JAXBElement<? extends CreditEvent> getCreditEvent() {
        return creditEvent;
    }

    /**
     * Sets the value of the creditEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FailureToPayEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link BankruptcyEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link RestructuringEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link RepudiationMoratoriumEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObligationDefaultEvent }{@code >}
     *     {@link JAXBElement }{@code <}{@link ObligationAccelerationEvent }{@code >}
     *     
     */
    public void setCreditEvent(JAXBElement<? extends CreditEvent> value) {
        this.creditEvent = value;
    }

    /**
     * Gets the value of the publiclyAvailableInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publiclyAvailableInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubliclyAvailableInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Resource }
     * 
     * 
     */
    public List<Resource> getPubliclyAvailableInformation() {
        if (publiclyAvailableInformation == null) {
            publiclyAvailableInformation = new ArrayList<Resource>();
        }
        return this.publiclyAvailableInformation;
    }

    /**
     * Gets the value of the notifyingPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getNotifyingPartyReference() {
        return notifyingPartyReference;
    }

    /**
     * Sets the value of the notifyingPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setNotifyingPartyReference(PartyReference value) {
        this.notifyingPartyReference = value;
    }

    /**
     * Gets the value of the notifiedPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getNotifiedPartyReference() {
        return notifiedPartyReference;
    }

    /**
     * Sets the value of the notifiedPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setNotifiedPartyReference(PartyReference value) {
        this.notifiedPartyReference = value;
    }

    /**
     * Gets the value of the creditEventNoticeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditEventNoticeDate() {
        return creditEventNoticeDate;
    }

    /**
     * Sets the value of the creditEventNoticeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditEventNoticeDate(XMLGregorianCalendar value) {
        this.creditEventNoticeDate = value;
    }

    /**
     * Gets the value of the creditEventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditEventDate() {
        return creditEventDate;
    }

    /**
     * Sets the value of the creditEventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditEventDate(XMLGregorianCalendar value) {
        this.creditEventDate = value;
    }

}
