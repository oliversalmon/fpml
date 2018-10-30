
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A complex type to specify the strike of a bond or convertible bond option.
 * 
 * <p>Java class for BondOptionStrike complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BondOptionStrike">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="referenceSwapCurve" type="{http://www.fpml.org/FpML-5/recordkeeping}ReferenceSwapCurve"/>
 *         &lt;element name="price" type="{http://www.fpml.org/FpML-5/recordkeeping}OptionStrike"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BondOptionStrike", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "referenceSwapCurve",
    "price"
})
public class BondOptionStrike {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReferenceSwapCurve referenceSwapCurve;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected OptionStrike price;

    /**
     * Gets the value of the referenceSwapCurve property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceSwapCurve }
     *     
     */
    public ReferenceSwapCurve getReferenceSwapCurve() {
        return referenceSwapCurve;
    }

    /**
     * Sets the value of the referenceSwapCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceSwapCurve }
     *     
     */
    public void setReferenceSwapCurve(ReferenceSwapCurve value) {
        this.referenceSwapCurve = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStrike }
     *     
     */
    public OptionStrike getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStrike }
     *     
     */
    public void setPrice(OptionStrike value) {
        this.price = value;
    }

}
