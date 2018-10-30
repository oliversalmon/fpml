
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The tri-party terms.
 * 
 * <p>Java class for TriParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TriParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="triPartyAgent" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;element name="collateralProfile" type="{http://www.fpml.org/FpML-5/recordkeeping}CollateralProfile" minOccurs="0"/>
 *         &lt;element name="collateralType" type="{http://www.fpml.org/FpML-5/recordkeeping}CollateralType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TriParty", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "triPartyAgent",
    "collateralProfile",
    "collateralType"
})
public class TriParty {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference triPartyAgent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CollateralProfile collateralProfile;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CollateralType collateralType;

    /**
     * Gets the value of the triPartyAgent property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getTriPartyAgent() {
        return triPartyAgent;
    }

    /**
     * Sets the value of the triPartyAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setTriPartyAgent(PartyReference value) {
        this.triPartyAgent = value;
    }

    /**
     * Gets the value of the collateralProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProfile }
     *     
     */
    public CollateralProfile getCollateralProfile() {
        return collateralProfile;
    }

    /**
     * Sets the value of the collateralProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProfile }
     *     
     */
    public void setCollateralProfile(CollateralProfile value) {
        this.collateralProfile = value;
    }

    /**
     * Gets the value of the collateralType property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType }
     *     
     */
    public CollateralType getCollateralType() {
        return collateralType;
    }

    /**
     * Sets the value of the collateralType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType }
     *     
     */
    public void setCollateralType(CollateralType value) {
        this.collateralType = value;
    }

}
