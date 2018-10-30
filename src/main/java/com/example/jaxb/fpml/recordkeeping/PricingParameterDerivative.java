
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A definition of the mathematical derivative with respect to a specific pricing parameter.
 * 
 * <p>Java class for PricingParameterDerivative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingParameterDerivative">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="parameterReference" type="{http://www.fpml.org/FpML-5/recordkeeping}AssetOrTermPointOrPricingStructureReference" minOccurs="0"/>
 *           &lt;element name="inputDateReference" type="{http://www.fpml.org/FpML-5/recordkeeping}ValuationReference" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="calculationProcedure" type="{http://www.fpml.org/FpML-5/recordkeeping}DerivativeCalculationProcedure" minOccurs="0"/>
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
@XmlType(name = "PricingParameterDerivative", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "description",
    "parameterReference",
    "inputDateReference",
    "calculationProcedure"
})
public class PricingParameterDerivative {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String description;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AssetOrTermPointOrPricingStructureReference parameterReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ValuationReference> inputDateReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DerivativeCalculationProcedure calculationProcedure;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the parameterReference property.
     * 
     * @return
     *     possible object is
     *     {@link AssetOrTermPointOrPricingStructureReference }
     *     
     */
    public AssetOrTermPointOrPricingStructureReference getParameterReference() {
        return parameterReference;
    }

    /**
     * Sets the value of the parameterReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetOrTermPointOrPricingStructureReference }
     *     
     */
    public void setParameterReference(AssetOrTermPointOrPricingStructureReference value) {
        this.parameterReference = value;
    }

    /**
     * Gets the value of the inputDateReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputDateReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputDateReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValuationReference }
     * 
     * 
     */
    public List<ValuationReference> getInputDateReference() {
        if (inputDateReference == null) {
            inputDateReference = new ArrayList<ValuationReference>();
        }
        return this.inputDateReference;
    }

    /**
     * Gets the value of the calculationProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeCalculationProcedure }
     *     
     */
    public DerivativeCalculationProcedure getCalculationProcedure() {
        return calculationProcedure;
    }

    /**
     * Sets the value of the calculationProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeCalculationProcedure }
     *     
     */
    public void setCalculationProcedure(DerivativeCalculationProcedure value) {
        this.calculationProcedure = value;
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
