
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
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
 * A definition of a shift with respect to a specific pricing parameter.
 * 
 * <p>Java class for PricingParameterShift complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingParameterShift">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameterReference" type="{http://www.fpml.org/FpML-5/recordkeeping}AssetOrTermPointOrPricingStructureReference" minOccurs="0"/>
 *         &lt;element name="shift" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="shiftUnits" type="{http://www.fpml.org/FpML-5/recordkeeping}PriceQuoteUnits" minOccurs="0"/>
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
@XmlType(name = "PricingParameterShift", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "parameterReference",
    "shift",
    "shiftUnits"
})
public class PricingParameterShift {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AssetOrTermPointOrPricingStructureReference parameterReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal shift;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PriceQuoteUnits shiftUnits;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

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
     * Gets the value of the shift property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShift() {
        return shift;
    }

    /**
     * Sets the value of the shift property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShift(BigDecimal value) {
        this.shift = value;
    }

    /**
     * Gets the value of the shiftUnits property.
     * 
     * @return
     *     possible object is
     *     {@link PriceQuoteUnits }
     *     
     */
    public PriceQuoteUnits getShiftUnits() {
        return shiftUnits;
    }

    /**
     * Sets the value of the shiftUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceQuoteUnits }
     *     
     */
    public void setShiftUnits(PriceQuoteUnits value) {
        this.shiftUnits = value;
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
