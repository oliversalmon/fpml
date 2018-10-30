
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The units in which a price is quoted.
 * 
 * <p>Java class for PriceQuoteUnits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceQuoteUnits">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/recordkeeping>Scheme">
 *       &lt;attribute name="priceQuoteUnitsScheme" type="{http://www.fpml.org/FpML-5/recordkeeping}NonEmptyURI" default="http://www.fpml.org/coding-scheme/price-quote-units" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceQuoteUnits", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "value"
})
public class PriceQuoteUnits {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "priceQuoteUnitsScheme")
    protected String priceQuoteUnitsScheme;

    /**
     * The base class for all types which define coding schemes that are allowed to be empty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the priceQuoteUnitsScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceQuoteUnitsScheme() {
        if (priceQuoteUnitsScheme == null) {
            return "http://www.fpml.org/coding-scheme/price-quote-units";
        } else {
            return priceQuoteUnitsScheme;
        }
    }

    /**
     * Sets the value of the priceQuoteUnitsScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceQuoteUnitsScheme(String value) {
        this.priceQuoteUnitsScheme = value;
    }

}
