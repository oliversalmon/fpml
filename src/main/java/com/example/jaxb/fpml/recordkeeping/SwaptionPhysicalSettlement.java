
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SwaptionPhysicalSettlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SwaptionPhysicalSettlement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clearedPhysicalSettlement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="predeterminedClearingOrganizationPartyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwaptionPhysicalSettlement", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "clearedPhysicalSettlement",
    "predeterminedClearingOrganizationPartyReference"
})
public class SwaptionPhysicalSettlement {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean clearedPhysicalSettlement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference predeterminedClearingOrganizationPartyReference;

    /**
     * Gets the value of the clearedPhysicalSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClearedPhysicalSettlement() {
        return clearedPhysicalSettlement;
    }

    /**
     * Sets the value of the clearedPhysicalSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClearedPhysicalSettlement(Boolean value) {
        this.clearedPhysicalSettlement = value;
    }

    /**
     * Gets the value of the predeterminedClearingOrganizationPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPredeterminedClearingOrganizationPartyReference() {
        return predeterminedClearingOrganizationPartyReference;
    }

    /**
     * Sets the value of the predeterminedClearingOrganizationPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPredeterminedClearingOrganizationPartyReference(PartyReference value) {
        this.predeterminedClearingOrganizationPartyReference = value;
    }

}
