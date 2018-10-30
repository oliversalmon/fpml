
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining the strike price for an option as a numeric value without currency.
 * 
 * <p>Java class for OptionNumericStrike complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionNumericStrike">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="strikePrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="strikePercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
@XmlType(name = "OptionNumericStrike", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "strikePrice",
    "strikePercentage"
})
@XmlSeeAlso({
    OptionStrike.class
})
public class OptionNumericStrike {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal strikePrice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal strikePercentage;

    /**
     * Gets the value of the strikePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrikePrice() {
        return strikePrice;
    }

    /**
     * Sets the value of the strikePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrikePrice(BigDecimal value) {
        this.strikePrice = value;
    }

    /**
     * Gets the value of the strikePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrikePercentage() {
        return strikePercentage;
    }

    /**
     * Sets the value of the strikePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrikePercentage(BigDecimal value) {
        this.strikePercentage = value;
    }

}
