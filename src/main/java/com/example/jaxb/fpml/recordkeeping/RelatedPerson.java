
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PersonReference"/>
 *         &lt;element name="role" type="{http://www.fpml.org/FpML-5/recordkeeping}PersonRole"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedPerson", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "personReference",
    "role"
})
public class RelatedPerson {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected PersonReference personReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected PersonRole role;

    /**
     * Gets the value of the personReference property.
     * 
     * @return
     *     possible object is
     *     {@link PersonReference }
     *     
     */
    public PersonReference getPersonReference() {
        return personReference;
    }

    /**
     * Sets the value of the personReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonReference }
     *     
     */
    public void setPersonReference(PersonReference value) {
        this.personReference = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link PersonRole }
     *     
     */
    public PersonRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonRole }
     *     
     */
    public void setRole(PersonRole value) {
        this.role = value;
    }

}
