
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxCounterCurrencyAmount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxCounterCurrencyAmount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeAmountSchedule">
 *       &lt;sequence>
 *         &lt;element name="strikeReference" type="{http://www.fpml.org/FpML-5/recordkeeping}FxStrikeReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxCounterCurrencyAmount", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "strikeReference"
})
public class FxCounterCurrencyAmount
    extends NonNegativeAmountSchedule
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxStrikeReference strikeReference;

    /**
     * Gets the value of the strikeReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxStrikeReference }
     *     
     */
    public FxStrikeReference getStrikeReference() {
        return strikeReference;
    }

    /**
     * Sets the value of the strikeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxStrikeReference }
     *     
     */
    public void setStrikeReference(FxStrikeReference value) {
        this.strikeReference = value;
    }

}
