
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The allocations for a single side of a trade.
 * 
 * <p>Java class for Allocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Allocations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allocatingPartyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;element name="allocation" type="{http://www.fpml.org/FpML-5/recordkeeping}Allocation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Allocations", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "allocatingPartyReference",
    "allocation"
})
public class Allocations {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference allocatingPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Allocation> allocation;

    /**
     * Gets the value of the allocatingPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getAllocatingPartyReference() {
        return allocatingPartyReference;
    }

    /**
     * Sets the value of the allocatingPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setAllocatingPartyReference(PartyReference value) {
        this.allocatingPartyReference = value;
    }

    /**
     * Gets the value of the allocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Allocation }
     * 
     * 
     */
    public List<Allocation> getAllocation() {
        if (allocation == null) {
            allocation = new ArrayList<Allocation>();
        }
        return this.allocation;
    }

}
