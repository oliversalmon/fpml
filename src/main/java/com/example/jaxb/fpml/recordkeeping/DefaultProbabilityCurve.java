
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A set of default probabilities.
 * 
 * <p>Java class for DefaultProbabilityCurve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultProbabilityCurve">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PricingStructureValuation">
 *       &lt;sequence>
 *         &lt;element name="baseYieldCurve" type="{http://www.fpml.org/FpML-5/recordkeeping}PricingStructureReference" minOccurs="0"/>
 *         &lt;element name="defaultProbabilities" type="{http://www.fpml.org/FpML-5/recordkeeping}TermCurve" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultProbabilityCurve", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "baseYieldCurve",
    "defaultProbabilities"
})
public class DefaultProbabilityCurve
    extends PricingStructureValuation
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PricingStructureReference baseYieldCurve;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TermCurve defaultProbabilities;

    /**
     * Gets the value of the baseYieldCurve property.
     * 
     * @return
     *     possible object is
     *     {@link PricingStructureReference }
     *     
     */
    public PricingStructureReference getBaseYieldCurve() {
        return baseYieldCurve;
    }

    /**
     * Sets the value of the baseYieldCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingStructureReference }
     *     
     */
    public void setBaseYieldCurve(PricingStructureReference value) {
        this.baseYieldCurve = value;
    }

    /**
     * Gets the value of the defaultProbabilities property.
     * 
     * @return
     *     possible object is
     *     {@link TermCurve }
     *     
     */
    public TermCurve getDefaultProbabilities() {
        return defaultProbabilities;
    }

    /**
     * Sets the value of the defaultProbabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCurve }
     *     
     */
    public void setDefaultProbabilities(TermCurve value) {
        this.defaultProbabilities = value;
    }

}
