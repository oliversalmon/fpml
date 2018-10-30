
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a trade identifier with a reference to the party that this trade is associated with.
 * 
 * <p>Java class for TradeIdentifierExtended complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeIdentifierExtended">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}TradeIdentifier">
 *       &lt;sequence>
 *         &lt;element name="associatedPartyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeIdentifierExtended", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "associatedPartyReference"
})
public class TradeIdentifierExtended
    extends TradeIdentifier
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference associatedPartyReference;

    /**
     * Gets the value of the associatedPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getAssociatedPartyReference() {
        return associatedPartyReference;
    }

    /**
     * Sets the value of the associatedPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setAssociatedPartyReference(PartyReference value) {
        this.associatedPartyReference = value;
    }

}
