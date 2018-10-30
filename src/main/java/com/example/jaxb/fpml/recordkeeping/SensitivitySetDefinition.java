
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
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
 * A sensitivity report definition, consisting of a collection of sensitivity definitions.
 * 
 * <p>Java class for SensitivitySetDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SensitivitySetDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *         &lt;element name="sensitivityCharacteristics" type="{http://www.fpml.org/FpML-5/recordkeeping}QuotationCharacteristics" minOccurs="0"/>
 *         &lt;element name="valuationScenarioReference" type="{http://www.fpml.org/FpML-5/recordkeeping}ValuationScenarioReference" minOccurs="0"/>
 *         &lt;element name="pricingInputType" type="{http://www.fpml.org/FpML-5/recordkeeping}PricingInputType" minOccurs="0"/>
 *         &lt;element name="pricingInputReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PricingStructureReference" minOccurs="0"/>
 *         &lt;element name="scale" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="sensitivityDefinition" type="{http://www.fpml.org/FpML-5/recordkeeping}SensitivityDefinition" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SensitivitySetDefinition", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "name",
    "sensitivityCharacteristics",
    "valuationScenarioReference",
    "pricingInputType",
    "pricingInputReference",
    "scale",
    "sensitivityDefinition",
    "calculationProcedure"
})
public class SensitivitySetDefinition {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String name;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuotationCharacteristics sensitivityCharacteristics;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ValuationScenarioReference valuationScenarioReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PricingInputType pricingInputType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PricingStructureReference pricingInputReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal scale;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<SensitivityDefinition> sensitivityDefinition;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DerivativeCalculationProcedure calculationProcedure;
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
     * Gets the value of the sensitivityCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationCharacteristics }
     *     
     */
    public QuotationCharacteristics getSensitivityCharacteristics() {
        return sensitivityCharacteristics;
    }

    /**
     * Sets the value of the sensitivityCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationCharacteristics }
     *     
     */
    public void setSensitivityCharacteristics(QuotationCharacteristics value) {
        this.sensitivityCharacteristics = value;
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
     * Gets the value of the pricingInputType property.
     * 
     * @return
     *     possible object is
     *     {@link PricingInputType }
     *     
     */
    public PricingInputType getPricingInputType() {
        return pricingInputType;
    }

    /**
     * Sets the value of the pricingInputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingInputType }
     *     
     */
    public void setPricingInputType(PricingInputType value) {
        this.pricingInputType = value;
    }

    /**
     * Gets the value of the pricingInputReference property.
     * 
     * @return
     *     possible object is
     *     {@link PricingStructureReference }
     *     
     */
    public PricingStructureReference getPricingInputReference() {
        return pricingInputReference;
    }

    /**
     * Sets the value of the pricingInputReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingStructureReference }
     *     
     */
    public void setPricingInputReference(PricingStructureReference value) {
        this.pricingInputReference = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScale(BigDecimal value) {
        this.scale = value;
    }

    /**
     * Gets the value of the sensitivityDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sensitivityDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSensitivityDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensitivityDefinition }
     * 
     * 
     */
    public List<SensitivityDefinition> getSensitivityDefinition() {
        if (sensitivityDefinition == null) {
            sensitivityDefinition = new ArrayList<SensitivityDefinition>();
        }
        return this.sensitivityDefinition;
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
