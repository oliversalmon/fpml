
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermDepositFeatures complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermDepositFeatures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dualCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}DualCurrencyFeature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermDepositFeatures", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "dualCurrency"
})
public class TermDepositFeatures {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DualCurrencyFeature dualCurrency;

    /**
     * Gets the value of the dualCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link DualCurrencyFeature }
     *     
     */
    public DualCurrencyFeature getDualCurrency() {
        return dualCurrency;
    }

    /**
     * Sets the value of the dualCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DualCurrencyFeature }
     *     
     */
    public void setDualCurrency(DualCurrencyFeature value) {
        this.dualCurrency = value;
    }

}
