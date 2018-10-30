
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the method for obtaining a settlement rate.
 * 
 * <p>Java class for SettlementRateSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementRateSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="informationSource" type="{http://www.fpml.org/FpML-5/recordkeeping}InformationSource"/>
 *         &lt;element name="cashSettlementReferenceBanks" type="{http://www.fpml.org/FpML-5/recordkeeping}CashSettlementReferenceBanks"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementRateSource", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "informationSource",
    "cashSettlementReferenceBanks"
})
public class SettlementRateSource {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected InformationSource informationSource;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CashSettlementReferenceBanks cashSettlementReferenceBanks;

    /**
     * Gets the value of the informationSource property.
     * 
     * @return
     *     possible object is
     *     {@link InformationSource }
     *     
     */
    public InformationSource getInformationSource() {
        return informationSource;
    }

    /**
     * Sets the value of the informationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationSource }
     *     
     */
    public void setInformationSource(InformationSource value) {
        this.informationSource = value;
    }

    /**
     * Gets the value of the cashSettlementReferenceBanks property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementReferenceBanks }
     *     
     */
    public CashSettlementReferenceBanks getCashSettlementReferenceBanks() {
        return cashSettlementReferenceBanks;
    }

    /**
     * Sets the value of the cashSettlementReferenceBanks property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementReferenceBanks }
     *     
     */
    public void setCashSettlementReferenceBanks(CashSettlementReferenceBanks value) {
        this.cashSettlementReferenceBanks = value;
    }

}
