
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining the obligations of the counterparty subject to credit support requirements.
 * 
 * <p>Java class for Collateral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Collateral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="independentAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}IndependentAmount" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "independentAmount"
})
public class Collateral {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<IndependentAmount> independentAmount;

    /**
     * Gets the value of the independentAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the independentAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndependentAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndependentAmount }
     * 
     * 
     */
    public List<IndependentAmount> getIndependentAmount() {
        if (independentAmount == null) {
            independentAmount = new ArrayList<IndependentAmount>();
        }
        return this.independentAmount;
    }

}
