
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This type contains all the reference pool items to define the reference entity and reference obligation(s) in the basket.
 * 
 * <p>Java class for ReferencePool complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencePool">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referencePoolItem" type="{http://www.fpml.org/FpML-5/recordkeeping}ReferencePoolItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencePool", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "referencePoolItem"
})
public class ReferencePool {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ReferencePoolItem> referencePoolItem;

    /**
     * Gets the value of the referencePoolItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencePoolItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencePoolItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencePoolItem }
     * 
     * 
     */
    public List<ReferencePoolItem> getReferencePoolItem() {
        if (referencePoolItem == null) {
            referencePoolItem = new ArrayList<ReferencePoolItem>();
        }
        return this.referencePoolItem;
    }

}
