
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An un ordered list of weighted averaging observations.
 * 
 * <p>Java class for AveragingObservationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AveragingObservationList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averagingObservation" type="{http://www.fpml.org/FpML-5/recordkeeping}WeightedAveragingObservation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AveragingObservationList", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "averagingObservation"
})
public class AveragingObservationList {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<WeightedAveragingObservation> averagingObservation;

    /**
     * Gets the value of the averagingObservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the averagingObservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAveragingObservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightedAveragingObservation }
     * 
     * 
     */
    public List<WeightedAveragingObservation> getAveragingObservation() {
        if (averagingObservation == null) {
            averagingObservation = new ArrayList<WeightedAveragingObservation>();
        }
        return this.averagingObservation;
    }

}
