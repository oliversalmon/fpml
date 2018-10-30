
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditEventNotice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditEventNotice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notifyingParty" type="{http://www.fpml.org/FpML-5/recordkeeping}NotifyingParty" minOccurs="0"/>
 *         &lt;element name="businessCenter" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenter" minOccurs="0"/>
 *         &lt;element name="publiclyAvailableInformation" type="{http://www.fpml.org/FpML-5/recordkeeping}PubliclyAvailableInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditEventNotice", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "notifyingParty",
    "businessCenter",
    "publiclyAvailableInformation"
})
public class CreditEventNotice {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NotifyingParty notifyingParty;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenter businessCenter;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PubliclyAvailableInformation publiclyAvailableInformation;

    /**
     * Gets the value of the notifyingParty property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyingParty }
     *     
     */
    public NotifyingParty getNotifyingParty() {
        return notifyingParty;
    }

    /**
     * Sets the value of the notifyingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyingParty }
     *     
     */
    public void setNotifyingParty(NotifyingParty value) {
        this.notifyingParty = value;
    }

    /**
     * Gets the value of the businessCenter property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenter }
     *     
     */
    public BusinessCenter getBusinessCenter() {
        return businessCenter;
    }

    /**
     * Sets the value of the businessCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenter }
     *     
     */
    public void setBusinessCenter(BusinessCenter value) {
        this.businessCenter = value;
    }

    /**
     * Gets the value of the publiclyAvailableInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PubliclyAvailableInformation }
     *     
     */
    public PubliclyAvailableInformation getPubliclyAvailableInformation() {
        return publiclyAvailableInformation;
    }

    /**
     * Sets the value of the publiclyAvailableInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PubliclyAvailableInformation }
     *     
     */
    public void setPubliclyAvailableInformation(PubliclyAvailableInformation value) {
        this.publiclyAvailableInformation = value;
    }

}
