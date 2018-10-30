
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
 * A type refining the generic message header content to make it specific to request messages.
 * 
 * <p>Java class for RequestMessageHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMessageHeader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}MessageHeader">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}MessageHeader.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessageHeader", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "sentBy",
    "sendTo",
    "copyTo",
    "creationTimestamp",
    "expiryTimestamp",
    "implementationSpecification",
    "partyMessageInformation",
    "signature"
})
public class RequestMessageHeader
    extends MessageHeader
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MessageAddress sentBy;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<MessageAddress> sendTo;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<MessageAddress> copyTo;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTimestamp;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryTimestamp;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ImplementationSpecification implementationSpecification;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PartyMessageInformation> partyMessageInformation;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected List<SignatureType> signature;

    /**
     * Gets the value of the sentBy property.
     * 
     * @return
     *     possible object is
     *     {@link MessageAddress }
     *     
     */
    public MessageAddress getSentBy() {
        return sentBy;
    }

    /**
     * Sets the value of the sentBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageAddress }
     *     
     */
    public void setSentBy(MessageAddress value) {
        this.sentBy = value;
    }

    /**
     * Gets the value of the sendTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sendTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSendTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageAddress }
     * 
     * 
     */
    public List<MessageAddress> getSendTo() {
        if (sendTo == null) {
            sendTo = new ArrayList<MessageAddress>();
        }
        return this.sendTo;
    }

    /**
     * Gets the value of the copyTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageAddress }
     * 
     * 
     */
    public List<MessageAddress> getCopyTo() {
        if (copyTo == null) {
            copyTo = new ArrayList<MessageAddress>();
        }
        return this.copyTo;
    }

    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTimestamp(XMLGregorianCalendar value) {
        this.creationTimestamp = value;
    }

    /**
     * Gets the value of the expiryTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryTimestamp() {
        return expiryTimestamp;
    }

    /**
     * Sets the value of the expiryTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryTimestamp(XMLGregorianCalendar value) {
        this.expiryTimestamp = value;
    }

    /**
     * Gets the value of the implementationSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ImplementationSpecification }
     *     
     */
    public ImplementationSpecification getImplementationSpecification() {
        return implementationSpecification;
    }

    /**
     * Sets the value of the implementationSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImplementationSpecification }
     *     
     */
    public void setImplementationSpecification(ImplementationSpecification value) {
        this.implementationSpecification = value;
    }

    /**
     * Gets the value of the partyMessageInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyMessageInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyMessageInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyMessageInformation }
     * 
     * 
     */
    public List<PartyMessageInformation> getPartyMessageInformation() {
        if (partyMessageInformation == null) {
            partyMessageInformation = new ArrayList<PartyMessageInformation>();
        }
        return this.partyMessageInformation;
    }

    /**
     * Gets the value of the signature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureType }
     * 
     * 
     */
    public List<SignatureType> getSignature() {
        if (signature == null) {
            signature = new ArrayList<SignatureType>();
        }
        return this.signature;
    }

}
