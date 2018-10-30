
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A set of credit curve values, which can include pricing inputs (which are typically credit spreads), default probabilities, and recovery rates.
 * 
 * <p>Java class for CreditCurveValuation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCurveValuation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PricingStructureValuation">
 *       &lt;sequence>
 *         &lt;element name="inputs" type="{http://www.fpml.org/FpML-5/recordkeeping}QuotedAssetSet" minOccurs="0"/>
 *         &lt;element name="defaultProbabilityCurve" type="{http://www.fpml.org/FpML-5/recordkeeping}DefaultProbabilityCurve" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}RecoveryRate.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCurveValuation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "inputs",
    "defaultProbabilityCurve",
    "recoveryRate",
    "recoveryRateCurve"
})
public class CreditCurveValuation
    extends PricingStructureValuation
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuotedAssetSet inputs;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DefaultProbabilityCurve defaultProbabilityCurve;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal recoveryRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TermCurve recoveryRateCurve;

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
     * Gets the value of the defaultProbabilityCurve property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultProbabilityCurve }
     *     
     */
    public DefaultProbabilityCurve getDefaultProbabilityCurve() {
        return defaultProbabilityCurve;
    }

    /**
     * Sets the value of the defaultProbabilityCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultProbabilityCurve }
     *     
     */
    public void setDefaultProbabilityCurve(DefaultProbabilityCurve value) {
        this.defaultProbabilityCurve = value;
    }

    /**
     * Gets the value of the recoveryRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecoveryRate() {
        return recoveryRate;
    }

    /**
     * Sets the value of the recoveryRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecoveryRate(BigDecimal value) {
        this.recoveryRate = value;
    }

    /**
     * Gets the value of the recoveryRateCurve property.
     * 
     * @return
     *     possible object is
     *     {@link TermCurve }
     *     
     */
    public TermCurve getRecoveryRateCurve() {
        return recoveryRateCurve;
    }

    /**
     * Sets the value of the recoveryRateCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCurve }
     *     
     */
    public void setRecoveryRateCurve(TermCurve value) {
        this.recoveryRateCurve = value;
    }

}
