
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommoditySpread complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommoditySpread">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Money">
 *       &lt;sequence>
 *         &lt;element name="spreadConversionFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="spreadUnit" type="{http://www.fpml.org/FpML-5/recordkeeping}QuantityUnit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommoditySpread", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "spreadConversionFactor",
    "spreadUnit"
})
public class CommoditySpread
    extends Money
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal spreadConversionFactor;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuantityUnit spreadUnit;

    /**
     * Gets the value of the spreadConversionFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpreadConversionFactor() {
        return spreadConversionFactor;
    }

    /**
     * Sets the value of the spreadConversionFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpreadConversionFactor(BigDecimal value) {
        this.spreadConversionFactor = value;
    }

    /**
     * Gets the value of the spreadUnit property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityUnit }
     *     
     */
    public QuantityUnit getSpreadUnit() {
        return spreadUnit;
    }

    /**
     * Sets the value of the spreadUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityUnit }
     *     
     */
    public void setSpreadUnit(QuantityUnit value) {
        this.spreadUnit = value;
    }

}
