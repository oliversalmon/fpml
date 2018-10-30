
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The values of a yield curve, including possibly inputs and outputs (dfs, forwards, zero rates).
 * 
 * <p>Java class for YieldCurveValuation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YieldCurveValuation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PricingStructureValuation">
 *       &lt;sequence>
 *         &lt;element name="inputs" type="{http://www.fpml.org/FpML-5/recordkeeping}QuotedAssetSet" minOccurs="0"/>
 *         &lt;element name="zeroCurve" type="{http://www.fpml.org/FpML-5/recordkeeping}ZeroRateCurve" minOccurs="0"/>
 *         &lt;element name="forwardCurve" type="{http://www.fpml.org/FpML-5/recordkeeping}ForwardRateCurve" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="discountFactorCurve" type="{http://www.fpml.org/FpML-5/recordkeeping}TermCurve" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YieldCurveValuation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "inputs",
    "zeroCurve",
    "forwardCurve",
    "discountFactorCurve"
})
public class YieldCurveValuation
    extends PricingStructureValuation
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuotedAssetSet inputs;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ZeroRateCurve zeroCurve;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ForwardRateCurve> forwardCurve;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TermCurve discountFactorCurve;

    /**
     * Gets the value of the inputs property.
     * 
     * @return
     *     possible object is
     *     {@link QuotedAssetSet }
     *     
     */
    public QuotedAssetSet getInputs() {
        return inputs;
    }

    /**
     * Sets the value of the inputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotedAssetSet }
     *     
     */
    public void setInputs(QuotedAssetSet value) {
        this.inputs = value;
    }

    /**
     * Gets the value of the zeroCurve property.
     * 
     * @return
     *     possible object is
     *     {@link ZeroRateCurve }
     *     
     */
    public ZeroRateCurve getZeroCurve() {
        return zeroCurve;
    }

    /**
     * Sets the value of the zeroCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZeroRateCurve }
     *     
     */
    public void setZeroCurve(ZeroRateCurve value) {
        this.zeroCurve = value;
    }

    /**
     * Gets the value of the forwardCurve property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forwardCurve property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForwardCurve().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForwardRateCurve }
     * 
     * 
     */
    public List<ForwardRateCurve> getForwardCurve() {
        if (forwardCurve == null) {
            forwardCurve = new ArrayList<ForwardRateCurve>();
        }
        return this.forwardCurve;
    }

    /**
     * Gets the value of the discountFactorCurve property.
     * 
     * @return
     *     possible object is
     *     {@link TermCurve }
     *     
     */
    public TermCurve getDiscountFactorCurve() {
        return discountFactorCurve;
    }

    /**
     * Sets the value of the discountFactorCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCurve }
     *     
     */
    public void setDiscountFactorCurve(TermCurve value) {
        this.discountFactorCurve = value;
    }

}
