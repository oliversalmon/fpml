
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a rate source to be fixed and the date the fixing occurs
 * 
 * <p>Java class for FxRateSourceFixing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxRateSourceFixing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementRateSource" type="{http://www.fpml.org/FpML-5/recordkeeping}FxSettlementRateSource"/>
 *         &lt;element name="fixingDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableDate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxRateSourceFixing", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "settlementRateSource",
    "fixingDate"
})
public class FxRateSourceFixing {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FxSettlementRateSource settlementRateSource;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected AdjustableDate fixingDate;

    /**
     * Gets the value of the settlementRateSource property.
     * 
     * @return
     *     possible object is
     *     {@link FxSettlementRateSource }
     *     
     */
    public FxSettlementRateSource getSettlementRateSource() {
        return settlementRateSource;
    }

    /**
     * Sets the value of the settlementRateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxSettlementRateSource }
     *     
     */
    public void setSettlementRateSource(FxSettlementRateSource value) {
        this.settlementRateSource = value;
    }

    /**
     * Gets the value of the fixingDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate }
     *     
     */
    public AdjustableDate getFixingDate() {
        return fixingDate;
    }

    /**
     * Sets the value of the fixingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate }
     *     
     */
    public void setFixingDate(AdjustableDate value) {
        this.fixingDate = value;
    }

}
