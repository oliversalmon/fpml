
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxSettlementRateSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxSettlementRateSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="settlementRateOption" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementRateOption"/>
 *         &lt;element name="nonstandardSettlementRate" type="{http://www.fpml.org/FpML-5/recordkeeping}FxInformationSource"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxSettlementRateSource", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "settlementRateOption",
    "nonstandardSettlementRate"
})
public class FxSettlementRateSource {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SettlementRateOption settlementRateOption;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxInformationSource nonstandardSettlementRate;

    /**
     * Gets the value of the settlementRateOption property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementRateOption }
     *     
     */
    public SettlementRateOption getSettlementRateOption() {
        return settlementRateOption;
    }

    /**
     * Sets the value of the settlementRateOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementRateOption }
     *     
     */
    public void setSettlementRateOption(SettlementRateOption value) {
        this.settlementRateOption = value;
    }

    /**
     * Gets the value of the nonstandardSettlementRate property.
     * 
     * @return
     *     possible object is
     *     {@link FxInformationSource }
     *     
     */
    public FxInformationSource getNonstandardSettlementRate() {
        return nonstandardSettlementRate;
    }

    /**
     * Sets the value of the nonstandardSettlementRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxInformationSource }
     *     
     */
    public void setNonstandardSettlementRate(FxInformationSource value) {
        this.nonstandardSettlementRate = value;
    }

}
