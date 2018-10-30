
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that provides for identifying a party involved in the routing of a payment by means of one or more standard identification codes. For example, both a SWIFT BIC code and a national bank identifier may be required.
 * 
 * <p>Java class for RoutingIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="routingId" type="{http://www.fpml.org/FpML-5/recordkeeping}RoutingId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingIds", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "routingId"
})
public class RoutingIds {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<RoutingId> routingId;

    /**
     * Gets the value of the routingId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingId }
     * 
     * 
     */
    public List<RoutingId> getRoutingId() {
        if (routingId == null) {
            routingId = new ArrayList<RoutingId>();
        }
        return this.routingId;
    }

}
