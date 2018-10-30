
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining a strike spread feature.
 * 
 * <p>Java class for StrikeSpread complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrikeSpread">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="upperStrike" type="{http://www.fpml.org/FpML-5/recordkeeping}OptionStrike" minOccurs="0"/>
 *         &lt;element name="upperStrikeNumberOfOptions" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveDecimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrikeSpread", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "upperStrike",
    "upperStrikeNumberOfOptions"
})
public class StrikeSpread {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected OptionStrike upperStrike;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal upperStrikeNumberOfOptions;

    /**
     * Gets the value of the upperStrike property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStrike }
     *     
     */
    public OptionStrike getUpperStrike() {
        return upperStrike;
    }

    /**
     * Sets the value of the upperStrike property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStrike }
     *     
     */
    public void setUpperStrike(OptionStrike value) {
        this.upperStrike = value;
    }

    /**
     * Gets the value of the upperStrikeNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpperStrikeNumberOfOptions() {
        return upperStrikeNumberOfOptions;
    }

    /**
     * Sets the value of the upperStrikeNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpperStrikeNumberOfOptions(BigDecimal value) {
        this.upperStrikeNumberOfOptions = value;
    }

}
