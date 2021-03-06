
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type which contains pass through payments.
 * 
 * <p>Java class for PassThrough complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassThrough">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passThroughItem" type="{http://www.fpml.org/FpML-5/recordkeeping}PassThroughItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassThrough", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "passThroughItem"
})
public class PassThrough {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PassThroughItem> passThroughItem;

    /**
     * Gets the value of the passThroughItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passThroughItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassThroughItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassThroughItem }
     * 
     * 
     */
    public List<PassThroughItem> getPassThroughItem() {
        if (passThroughItem == null) {
            passThroughItem = new ArrayList<PassThroughItem>();
        }
        return this.passThroughItem;
    }

}
