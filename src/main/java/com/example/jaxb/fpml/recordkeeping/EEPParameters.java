
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Excess Emission Penalty related parameters.
 * 
 * <p>Java class for EEPParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EEPParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eEPApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="riskPeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}EEPRiskPeriod" minOccurs="0"/>
 *         &lt;element name="equivalentApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="penaltyApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EEPParameters", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "eepApplicable",
    "riskPeriod",
    "equivalentApplicable",
    "penaltyApplicable"
})
public class EEPParameters {

    @XmlElement(name = "eEPApplicable", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean eepApplicable;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EEPRiskPeriod riskPeriod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean equivalentApplicable;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean penaltyApplicable;

    /**
     * Gets the value of the eepApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEEPApplicable() {
        return eepApplicable;
    }

    /**
     * Sets the value of the eepApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEEPApplicable(Boolean value) {
        this.eepApplicable = value;
    }

    /**
     * Gets the value of the riskPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EEPRiskPeriod }
     *     
     */
    public EEPRiskPeriod getRiskPeriod() {
        return riskPeriod;
    }

    /**
     * Sets the value of the riskPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EEPRiskPeriod }
     *     
     */
    public void setRiskPeriod(EEPRiskPeriod value) {
        this.riskPeriod = value;
    }

    /**
     * Gets the value of the equivalentApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEquivalentApplicable() {
        return equivalentApplicable;
    }

    /**
     * Sets the value of the equivalentApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEquivalentApplicable(Boolean value) {
        this.equivalentApplicable = value;
    }

    /**
     * Gets the value of the penaltyApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPenaltyApplicable() {
        return penaltyApplicable;
    }

    /**
     * Sets the value of the penaltyApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPenaltyApplicable(Boolean value) {
        this.penaltyApplicable = value;
    }

}
