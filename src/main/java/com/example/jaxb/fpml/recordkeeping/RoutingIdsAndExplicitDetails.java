
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that provides a combination of payment system identification codes with physical postal address details, for the purposes of identifying a party involved in the routing of a payment.
 * 
 * <p>Java class for RoutingIdsAndExplicitDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingIdsAndExplicitDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routingIds" type="{http://www.fpml.org/FpML-5/recordkeeping}RoutingIds" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}RoutingExplicitDetails.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingIdsAndExplicitDetails", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "routingIds",
    "routingName",
    "routingAddress",
    "routingAccountNumber",
    "routingReferenceText"
})
public class RoutingIdsAndExplicitDetails {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<RoutingIds> routingIds;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String routingName;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Address routingAddress;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String routingAccountNumber;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<String> routingReferenceText;

    /**
     * Gets the value of the routingIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingIds }
     * 
     * 
     */
    public List<RoutingIds> getRoutingIds() {
        if (routingIds == null) {
            routingIds = new ArrayList<RoutingIds>();
        }
        return this.routingIds;
    }

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
