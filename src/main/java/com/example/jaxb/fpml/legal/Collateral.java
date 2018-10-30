
package com.example.jaxb.fpml.legal;

import javax.annotation.Generated;
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
 *         &lt;element name="independentAmount" type="{http://www.fpml.org/FpML-5/legal}IndependentAmount"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "independentAmount"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Collateral {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected IndependentAmount independentAmount;

    /**
     * Gets the value of the independentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentAmount }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public IndependentAmount getIndependentAmount() {
        return independentAmount;
    }

    /**
     * Sets the value of the independentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentAmount }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIndependentAmount(IndependentAmount value) {
        this.independentAmount = value;
    }

}
