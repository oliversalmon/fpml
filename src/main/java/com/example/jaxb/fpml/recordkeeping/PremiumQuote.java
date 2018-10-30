
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that describes the option premium as quoted.
 * 
 * <p>Java class for PremiumQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremiumQuote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="quoteBasis" type="{http://www.fpml.org/FpML-5/recordkeeping}PremiumQuoteBasisEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremiumQuote", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "value",
    "quoteBasis"
})
public class PremiumQuote {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected BigDecimal value;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected PremiumQuoteBasisEnum quoteBasis;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the quoteBasis property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumQuoteBasisEnum }
     *     
     */
    public PremiumQuoteBasisEnum getQuoteBasis() {
        return quoteBasis;
    }

    /**
     * Sets the value of the quoteBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumQuoteBasisEnum }
     *     
     */
    public void setQuoteBasis(PremiumQuoteBasisEnum value) {
        this.quoteBasis = value;
    }

}
