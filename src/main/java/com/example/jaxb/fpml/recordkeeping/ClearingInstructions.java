
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingInstructions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearingInstructions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestedClearingAction" type="{http://www.fpml.org/FpML-5/recordkeeping}RequestedClearingAction" minOccurs="0"/>
 *         &lt;element name="requestedClearingOrganizationPartyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingInstructions", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "requestedClearingAction",
    "requestedClearingOrganizationPartyReference"
})
public class ClearingInstructions {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected RequestedClearingAction requestedClearingAction;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference requestedClearingOrganizationPartyReference;

    /**
     * Gets the value of the requestedClearingAction property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedClearingAction }
     *     
     */
    public RequestedClearingAction getRequestedClearingAction() {
        return requestedClearingAction;
    }

    /**
     * Sets the value of the requestedClearingAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedClearingAction }
     *     
     */
    public void setRequestedClearingAction(RequestedClearingAction value) {
        this.requestedClearingAction = value;
    }

    /**
     * Gets the value of the requestedClearingOrganizationPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getRequestedClearingOrganizationPartyReference() {
        return requestedClearingOrganizationPartyReference;
    }

    /**
     * Sets the value of the requestedClearingOrganizationPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setRequestedClearingOrganizationPartyReference(PartyReference value) {
        this.requestedClearingOrganizationPartyReference = value;
    }

}
