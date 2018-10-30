
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type to represent agreed period of notice to be given in advance before exercise of the open repo trade by a party requesting such exercise and reference to that party.
 * 
 * <p>Java class for PartyNoticePeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyNoticePeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference"/>
 *         &lt;element name="noticePeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOffset"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyNoticePeriod", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "partyReference",
    "noticePeriod"
})
public class PartyNoticePeriod {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected PartyReference partyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected AdjustableOffset noticePeriod;

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
     * Gets the value of the noticePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOffset }
     *     
     */
    public AdjustableOffset getNoticePeriod() {
        return noticePeriod;
    }

    /**
     * Sets the value of the noticePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOffset }
     *     
     */
    public void setNoticePeriod(AdjustableOffset value) {
        this.noticePeriod = value;
    }

}
