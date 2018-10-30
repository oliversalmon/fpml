
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides information about a regulator or other supervisory body that an organization is registered with.
 * 
 * <p>Java class for SupervisorRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupervisorRegistration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}SupervisorRegistration.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupervisorRegistration", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "supervisoryBody",
    "registrationNumber"
})
public class SupervisorRegistration {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected SupervisoryBody supervisoryBody;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected RegulatorId registrationNumber;

    /**
     * Gets the value of the supervisoryBody property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisoryBody }
     *     
     */
    public SupervisoryBody getSupervisoryBody() {
        return supervisoryBody;
    }

    /**
     * Sets the value of the supervisoryBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisoryBody }
     *     
     */
    public void setSupervisoryBody(SupervisoryBody value) {
        this.supervisoryBody = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatorId }
     *     
     */
    public RegulatorId getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatorId }
     *     
     */
    public void setRegistrationNumber(RegulatorId value) {
        this.registrationNumber = value;
    }

}
