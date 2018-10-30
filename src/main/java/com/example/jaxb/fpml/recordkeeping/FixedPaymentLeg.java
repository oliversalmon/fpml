
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fixed Payment Leg of a Dividend Swap.
 * 
 * <p>Java class for FixedPaymentLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedPaymentLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}DirectionalLeg">
 *       &lt;sequence>
 *         &lt;element name="fixedPayment" type="{http://www.fpml.org/FpML-5/recordkeeping}FixedPaymentAmount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedPaymentLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "fixedPayment"
})
public class FixedPaymentLeg
    extends DirectionalLeg
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FixedPaymentAmount> fixedPayment;

    /**
     * Gets the value of the fixedPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixedPaymentAmount }
     * 
     * 
     */
    public List<FixedPaymentAmount> getFixedPayment() {
        if (fixedPayment == null) {
            fixedPayment = new ArrayList<FixedPaymentAmount>();
        }
        return this.fixedPayment;
    }

}
