
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the characteristics of the gas being traded in a physically settled gas transaction.
 * 
 * <p>Java class for GasProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GasProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.fpml.org/FpML-5/recordkeeping}GasProductTypeEnum"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="calorificValue" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeDecimal"/>
 *           &lt;element name="quality" type="{http://www.fpml.org/FpML-5/recordkeeping}GasQuality"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasProduct", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "type",
    "calorificValue",
    "quality"
})
public class GasProduct {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected GasProductTypeEnum type;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal calorificValue;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected GasQuality quality;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link GasProductTypeEnum }
     *     
     */
    public GasProductTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasProductTypeEnum }
     *     
     */
    public void setType(GasProductTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the calorificValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalorificValue() {
        return calorificValue;
    }

    /**
     * Sets the value of the calorificValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalorificValue(BigDecimal value) {
        this.calorificValue = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link GasQuality }
     *     
     */
    public GasQuality getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasQuality }
     *     
     */
    public void setQuality(GasQuality value) {
        this.quality = value;
    }

}
