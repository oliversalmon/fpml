
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining the merger events and their treatment.
 * 
 * <p>Java class for EquityCorporateEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityCorporateEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shareForShare" type="{http://www.fpml.org/FpML-5/recordkeeping}ShareExtraordinaryEventEnum" minOccurs="0"/>
 *         &lt;element name="shareForOther" type="{http://www.fpml.org/FpML-5/recordkeeping}ShareExtraordinaryEventEnum" minOccurs="0"/>
 *         &lt;element name="shareForCombined" type="{http://www.fpml.org/FpML-5/recordkeeping}ShareExtraordinaryEventEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityCorporateEvents", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "shareForShare",
    "shareForOther",
    "shareForCombined"
})
public class EquityCorporateEvents {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected ShareExtraordinaryEventEnum shareForShare;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected ShareExtraordinaryEventEnum shareForOther;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected ShareExtraordinaryEventEnum shareForCombined;

    /**
     * Gets the value of the shareForShare property.
     * 
     * @return
     *     possible object is
     *     {@link ShareExtraordinaryEventEnum }
     *     
     */
    public ShareExtraordinaryEventEnum getShareForShare() {
        return shareForShare;
    }

    /**
     * Sets the value of the shareForShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareExtraordinaryEventEnum }
     *     
     */
    public void setShareForShare(ShareExtraordinaryEventEnum value) {
        this.shareForShare = value;
    }

    /**
     * Gets the value of the shareForOther property.
     * 
     * @return
     *     possible object is
     *     {@link ShareExtraordinaryEventEnum }
     *     
     */
    public ShareExtraordinaryEventEnum getShareForOther() {
        return shareForOther;
    }

    /**
     * Sets the value of the shareForOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareExtraordinaryEventEnum }
     *     
     */
    public void setShareForOther(ShareExtraordinaryEventEnum value) {
        this.shareForOther = value;
    }

    /**
     * Gets the value of the shareForCombined property.
     * 
     * @return
     *     possible object is
     *     {@link ShareExtraordinaryEventEnum }
     *     
     */
    public ShareExtraordinaryEventEnum getShareForCombined() {
        return shareForCombined;
    }

    /**
     * Sets the value of the shareForCombined property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareExtraordinaryEventEnum }
     *     
     */
    public void setShareForCombined(ShareExtraordinaryEventEnum value) {
        this.shareForCombined = value;
    }

}
