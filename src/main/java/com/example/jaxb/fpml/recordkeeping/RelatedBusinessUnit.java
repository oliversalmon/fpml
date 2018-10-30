
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedBusinessUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedBusinessUnit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessUnitReference" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessUnitReference"/>
 *         &lt;element name="role" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessUnitRole"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedBusinessUnit", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "businessUnitReference",
    "role"
})
public class RelatedBusinessUnit {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected BusinessUnitReference businessUnitReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected BusinessUnitRole role;

    /**
     * Gets the value of the businessUnitReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessUnitReference }
     *     
     */
    public BusinessUnitReference getBusinessUnitReference() {
        return businessUnitReference;
    }

    /**
     * Sets the value of the businessUnitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessUnitReference }
     *     
     */
    public void setBusinessUnitReference(BusinessUnitReference value) {
        this.businessUnitReference = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessUnitRole }
     *     
     */
    public BusinessUnitRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessUnitRole }
     *     
     */
    public void setRole(BusinessUnitRole value) {
        this.role = value;
    }

}
