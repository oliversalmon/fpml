
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Approvals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Approvals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approval" type="{http://www.fpml.org/FpML-5/recordkeeping}Approval" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Approvals", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "approval"
})
public class Approvals {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Approval> approval;

    /**
     * Gets the value of the approval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Approval }
     * 
     * 
     */
    public List<Approval> getApproval() {
        if (approval == null) {
            approval = new ArrayList<Approval>();
        }
        return this.approval;
    }

}
