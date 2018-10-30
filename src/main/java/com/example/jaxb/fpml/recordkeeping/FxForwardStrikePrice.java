
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that describes the rate of exchange between the two currencies of the leg of a deal.
 * 
 * <p>Java class for FxForwardStrikePrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxForwardStrikePrice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualStrike">
 *       &lt;sequence>
 *         &lt;element name="quoteBasis" type="{http://www.fpml.org/FpML-5/recordkeeping}QuoteBasisEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxForwardStrikePrice", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "quoteBasis"
})
public class FxForwardStrikePrice
    extends FxAccrualStrike
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected QuoteBasisEnum quoteBasis;

    /**
     * Gets the value of the quoteBasis property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteBasisEnum }
     *     
     */
    public QuoteBasisEnum getQuoteBasis() {
        return quoteBasis;
    }

    /**
     * Sets the value of the quoteBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteBasisEnum }
     *     
     */
    public void setQuoteBasis(QuoteBasisEnum value) {
        this.quoteBasis = value;
    }

}
