
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that models name, address and supplementary textual information for the purposes of identifying a party involved in the routing of a payment.
 * 
 * <p>Java class for RoutingExplicitDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingExplicitDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}RoutingExplicitDetails.model"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingExplicitDetails", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "routingName",
    "routingAddress",
    "routingAccountNumber",
    "routingReferenceText"
})
public class RoutingExplicitDetails {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String routingName;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Address routingAddress;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String routingAccountNumber;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<String> routingReferenceText;

    /**
     * Gets the value of the routingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingName() {
        return routingName;
    }

    /**
     * Sets the value of the routingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingName(String value) {
        this.routingName = value;
    }

    /**
     * Gets the value of the routingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getRoutingAddress() {
        return routingAddress;
    }

    /**
     * Sets the value of the routingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setRoutingAddress(Address value) {
        this.routingAddress = value;
    }

    /**
     * Gets the value of the routingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingAccountNumber() {
        return routingAccountNumber;
    }

    /**
     * Sets the value of the routingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingAccountNumber(String value) {
        this.routingAccountNumber = value;
    }

    /**
     * Gets the value of the routingReferenceText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingReferenceText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingReferenceText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoutingReferenceText() {
        if (routingReferenceText == null) {
            routingReferenceText = new ArrayList<String>();
        }
        return this.routingReferenceText;
    }

}