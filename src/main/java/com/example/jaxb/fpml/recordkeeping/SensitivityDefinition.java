
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A set of characteristics describing a sensitivity.
 * 
 * <p>Java class for SensitivityDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SensitivityDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *         &lt;element name="valuationScenarioReference" type="{http://www.fpml.org/FpML-5/recordkeeping}ValuationScenarioReference" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}ComputedDerivative.model"/>
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}SensitivityDescription.model"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensitivityDefinition", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "name",
    "valuationScenarioReference",
    "partialDerivative",
    "formula",
    "term",
    "pricingCoordinateOrReferenceModel"
})
public class SensitivityDefinition {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String name;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ValuationScenarioReference valuationScenarioReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PricingParameterDerivative> partialDerivative;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DerivativeFormula formula;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TimeDimension term;
    @XmlElements({
        @XmlElement(name = "coordinate", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = PricingDataPointCoordinate.class),
        @XmlElement(name = "coordinateReference", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = PricingDataPointCoordinateReference.class)
    })
    protected List<Object> pricingCoordinateOrReferenceModel;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the valuationScenarioReference property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationScenarioReference }
     *     
     */
    public ValuationScenarioReference getValuationScenarioReference() {
        return valuationScenarioReference;
    }

    /**
     * Sets the value of the valuationScenarioReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationScenarioReference }
     *     
     */
    public void setValuationScenarioReference(ValuationScenarioReference value) {
        this.valuationScenarioReference = value;
    }

    /**
     * Gets the value of the partialDerivative property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partialDerivative property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartialDerivative().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingParameterDerivative }
     * 
     * 
     */
    public List<PricingParameterDerivative> getPartialDerivative() {
        if (partialDerivative == null) {
            partialDerivative = new ArrayList<PricingParameterDerivative>();
        }
        return this.partialDerivative;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeFormula }
     *     
     */
    public DerivativeFormula getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeFormula }
     *     
     */
    public void setFormula(DerivativeFormula value) {
        this.formula = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDimension }
     *     
     */
    public TimeDimension getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDimension }
     *     
     */
    public void setTerm(TimeDimension value) {
        this.term = value;
    }

    /**
     * The input coordinates, or references to them (e.g. expiration, strike, tenor).Gets the value of the pricingCoordinateOrReferenceModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingCoordinateOrReferenceModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingCoordinateOrReferenceModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingDataPointCoordinate }
     * {@link PricingDataPointCoordinateReference }
     * 
     * 
     */
    public List<Object> getPricingCoordinateOrReferenceModel() {
        if (pricingCoordinateOrReferenceModel == null) {
            pricingCoordinateOrReferenceModel = new ArrayList<Object>();
        }
        return this.pricingCoordinateOrReferenceModel;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
