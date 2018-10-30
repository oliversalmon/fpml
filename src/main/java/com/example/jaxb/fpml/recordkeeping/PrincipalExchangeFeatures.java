
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the principal exchange features of the return swap.
 * 
 * <p>Java class for PrincipalExchangeFeatures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalExchangeFeatures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="principalExchanges" type="{http://www.fpml.org/FpML-5/recordkeeping}PrincipalExchanges" minOccurs="0"/>
 *         &lt;element name="principalExchangeDescriptions" type="{http://www.fpml.org/FpML-5/recordkeeping}PrincipalExchangeDescriptions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalExchangeFeatures", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "principalExchanges",
    "principalExchangeDescriptions"
})
public class PrincipalExchangeFeatures {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PrincipalExchanges principalExchanges;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PrincipalExchangeDescriptions> principalExchangeDescriptions;

    /**
     * Gets the value of the principalExchanges property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalExchanges }
     *     
     */
    public PrincipalExchanges getPrincipalExchanges() {
        return principalExchanges;
    }

    /**
     * Sets the value of the principalExchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalExchanges }
     *     
     */
    public void setPrincipalExchanges(PrincipalExchanges value) {
        this.principalExchanges = value;
    }

    /**
     * Gets the value of the principalExchangeDescriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalExchangeDescriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalExchangeDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalExchangeDescriptions }
     * 
     * 
     */
    public List<PrincipalExchangeDescriptions> getPrincipalExchangeDescriptions() {
        if (principalExchangeDescriptions == null) {
            principalExchangeDescriptions = new ArrayList<PrincipalExchangeDescriptions>();
        }
        return this.principalExchangeDescriptions;
    }

}
