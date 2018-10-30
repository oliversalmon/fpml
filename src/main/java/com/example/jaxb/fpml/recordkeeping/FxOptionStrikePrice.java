
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that describes the rate of exchange at which the option has been struck.
 * 
 * <p>Java class for FxOptionStrikePrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxOptionStrikePrice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualStrike">
 *       &lt;sequence>
 *         &lt;element name="strikeQuoteBasis" type="{http://www.fpml.org/FpML-5/recordkeeping}StrikeQuoteBasisEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxOptionStrikePrice", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "strikeQuoteBasis"
})
public class FxOptionStrikePrice
    extends FxAccrualStrike
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected StrikeQuoteBasisEnum strikeQuoteBasis;

    /**
     * Gets the value of the strikeQuoteBasis property.
     * 
     * @return
     *     possible object is
     *     {@link StrikeQuoteBasisEnum }
     *     
     */
    public StrikeQuoteBasisEnum getStrikeQuoteBasis() {
        return strikeQuoteBasis;
    }

    /**
     * Sets the value of the strikeQuoteBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrikeQuoteBasisEnum }
     *     
     */
    public void setStrikeQuoteBasis(StrikeQuoteBasisEnum value) {
        this.strikeQuoteBasis = value;
    }

}
