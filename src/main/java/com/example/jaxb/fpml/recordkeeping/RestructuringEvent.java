
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestructuringEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestructuringEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CreditEvent">
 *       &lt;sequence>
 *         &lt;element name="partialExerciseAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestructuringEvent", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "partialExerciseAmount"
})
public class RestructuringEvent
    extends CreditEvent
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money partialExerciseAmount;

    /**
     * Gets the value of the partialExerciseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPartialExerciseAmount() {
        return partialExerciseAmount;
    }

    /**
     * Sets the value of the partialExerciseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPartialExerciseAmount(Money value) {
        this.partialExerciseAmount = value;
    }

}
