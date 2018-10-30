
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure describing the effect of a change to an index.
 * 
 * <p>Java class for IndexChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndexChange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}ChangeEvent">
 *       &lt;sequence>
 *         &lt;element name="indexFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="factoredCalculationAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexChange", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "indexFactor",
    "factoredCalculationAmount"
})
public class IndexChange
    extends ChangeEvent
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal indexFactor;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money factoredCalculationAmount;

    /**
     * Gets the value of the indexFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndexFactor() {
        return indexFactor;
    }

    /**
     * Sets the value of the indexFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndexFactor(BigDecimal value) {
        this.indexFactor = value;
    }

    /**
     * Gets the value of the factoredCalculationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getFactoredCalculationAmount() {
        return factoredCalculationAmount;
    }

    /**
     * Sets the value of the factoredCalculationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setFactoredCalculationAmount(Money value) {
        this.factoredCalculationAmount = value;
    }

}
