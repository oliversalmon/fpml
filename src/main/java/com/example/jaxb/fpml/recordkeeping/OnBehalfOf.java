
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnBehalfOf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnBehalfOf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;element name="accountReference" type="{http://www.fpml.org/FpML-5/recordkeeping}AccountReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnBehalfOf", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "partyReference",
    "accountReference"
})
public class OnBehalfOf {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference partyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<AccountReference> accountReference;

    /**
     * Gets the value of the partyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPartyReference() {
        return partyReference;
    }

    /**
     * Sets the value of the partyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPartyReference(PartyReference value) {
        this.partyReference = value;
    }

    /**
     * Gets the value of the accountReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountReference }
     * 
     * 
     */
    public List<AccountReference> getAccountReference() {
        if (accountReference == null) {
            accountReference = new ArrayList<AccountReference>();
        }
        return this.accountReference;
    }

}
