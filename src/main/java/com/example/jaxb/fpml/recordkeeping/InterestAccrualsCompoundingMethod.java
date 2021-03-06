
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the way in which interests are accrued: the applicable rate (fixed or floating reference) and the compounding method.
 * 
 * <p>Java class for InterestAccrualsCompoundingMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestAccrualsCompoundingMethod">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}InterestAccrualsMethod">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="compoundingMethod" type="{http://www.fpml.org/FpML-5/recordkeeping}CompoundingMethodEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestAccrualsCompoundingMethod", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "compoundingMethod"
})
public class InterestAccrualsCompoundingMethod
    extends InterestAccrualsMethod
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected CompoundingMethodEnum compoundingMethod;

    /**
     * Gets the value of the compoundingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundingMethodEnum }
     *     
     */
    public CompoundingMethodEnum getCompoundingMethod() {
        return compoundingMethod;
    }

    /**
     * Sets the value of the compoundingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundingMethodEnum }
     *     
     */
    public void setCompoundingMethod(CompoundingMethodEnum value) {
        this.compoundingMethod = value;
    }

}
