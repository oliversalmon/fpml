
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a content model for describing the nature and possible location of a error within a previous message.
 * 
 * <p>Java class for Reason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reasonCode" type="{http://www.fpml.org/FpML-5/recordkeeping}ReasonCode" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.fpml.org/FpML-5/recordkeeping}ProblemLocation" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *         &lt;element name="validationRuleId" type="{http://www.fpml.org/FpML-5/recordkeeping}Validation" minOccurs="0"/>
 *         &lt;element name="additionalData" type="{http://www.fpml.org/FpML-5/recordkeeping}AdditionalData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reason", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "reasonCode",
    "location",
    "description",
    "validationRuleId",
    "additionalData"
})
public class Reason {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReasonCode reasonCode;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ProblemLocation location;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String description;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Validation validationRuleId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<AdditionalData> additionalData;

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonCode }
     *     
     */
    public ReasonCode getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonCode }
     *     
     */
    public void setReasonCode(ReasonCode value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemLocation }
     *     
     */
    public ProblemLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemLocation }
     *     
     */
    public void setLocation(ProblemLocation value) {
        this.location = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the validationRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link Validation }
     *     
     */
    public Validation getValidationRuleId() {
        return validationRuleId;
    }

    /**
     * Sets the value of the validationRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Validation }
     *     
     */
    public void setValidationRuleId(Validation value) {
        this.validationRuleId = value;
    }

    /**
     * Gets the value of the additionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData }
     * 
     * 
     */
    public List<AdditionalData> getAdditionalData() {
        if (additionalData == null) {
            additionalData = new ArrayList<AdditionalData>();
        }
        return this.additionalData;
    }

}
