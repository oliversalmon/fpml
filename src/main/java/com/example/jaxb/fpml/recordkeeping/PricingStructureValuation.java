
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An abstract pricing structure valuation base type. Used as a base for values of pricing structures such as yield curves and volatility matrices. Derived from the "Valuation" type.
 * 
 * <p>Java class for PricingStructureValuation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingStructureValuation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Valuation">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PricingInputDates.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingStructureValuation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "baseDate",
    "spotDate",
    "inputDataDate",
    "endDate",
    "buildDateTime"
})
@XmlSeeAlso({
    YieldCurveValuation.class,
    CreditCurveValuation.class,
    FxCurveValuation.class,
    VolatilityMatrix.class,
    DefaultProbabilityCurve.class
})
public class PricingStructureValuation
    extends Valuation
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedDate baseDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedDate spotDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedDate inputDataDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedDate endDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar buildDateTime;

    /**
     * Gets the value of the baseDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getBaseDate() {
        return baseDate;
    }

    /**
     * Sets the value of the baseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setBaseDate(IdentifiedDate value) {
        this.baseDate = value;
    }

    /**
     * Gets the value of the spotDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getSpotDate() {
        return spotDate;
    }

    /**
     * Sets the value of the spotDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setSpotDate(IdentifiedDate value) {
        this.spotDate = value;
    }

    /**
     * Gets the value of the inputDataDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getInputDataDate() {
        return inputDataDate;
    }

    /**
     * Sets the value of the inputDataDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setInputDataDate(IdentifiedDate value) {
        this.inputDataDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setEndDate(IdentifiedDate value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the buildDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuildDateTime() {
        return buildDateTime;
    }

    /**
     * Sets the value of the buildDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuildDateTime(XMLGregorianCalendar value) {
        this.buildDateTime = value;
    }

}
