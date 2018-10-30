
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A complex type used to specify the option and convertible bond option strike when expressed in reference to a swap curve.
 * 
 * <p>Java class for ReferenceSwapCurve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceSwapCurve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="swapUnwindValue" type="{http://www.fpml.org/FpML-5/recordkeeping}SwapCurveValuation" minOccurs="0"/>
 *         &lt;element name="makeWholeAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}MakeWholeAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceSwapCurve", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "swapUnwindValue",
    "makeWholeAmount"
})
public class ReferenceSwapCurve {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SwapCurveValuation swapUnwindValue;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MakeWholeAmount makeWholeAmount;

    /**
     * Gets the value of the swapUnwindValue property.
     * 
     * @return
     *     possible object is
     *     {@link SwapCurveValuation }
     *     
     */
    public SwapCurveValuation getSwapUnwindValue() {
        return swapUnwindValue;
    }

    /**
     * Sets the value of the swapUnwindValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwapCurveValuation }
     *     
     */
    public void setSwapUnwindValue(SwapCurveValuation value) {
        this.swapUnwindValue = value;
    }

    /**
     * Gets the value of the makeWholeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MakeWholeAmount }
     *     
     */
    public MakeWholeAmount getMakeWholeAmount() {
        return makeWholeAmount;
    }

    /**
     * Sets the value of the makeWholeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MakeWholeAmount }
     *     
     */
    public void setMakeWholeAmount(MakeWholeAmount value) {
        this.makeWholeAmount = value;
    }

}
