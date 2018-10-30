
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract base class for all underlying assets.
 * 
 * <p>Java class for UnderlyingAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingAsset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedAsset">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedCurrency" minOccurs="0"/>
 *         &lt;element name="exchangeId" type="{http://www.fpml.org/FpML-5/recordkeeping}ExchangeId" minOccurs="0"/>
 *         &lt;element name="clearanceSystem" type="{http://www.fpml.org/FpML-5/recordkeeping}ClearanceSystem" minOccurs="0"/>
 *         &lt;element name="definition" type="{http://www.fpml.org/FpML-5/recordkeeping}ProductReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingAsset", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "currency",
    "exchangeId",
    "clearanceSystem",
    "definition"
})
@XmlSeeAlso({
    Loan.class,
    SimpleIRSwap.class,
    FxRateAsset.class,
    Mortgage.class,
    SimpleCreditDefaultSwap.class,
    MutualFund.class,
    SimpleFra.class,
    Bond.class,
    Deposit.class,
    RateIndex.class,
    ExchangeTraded.class
})
public abstract class UnderlyingAsset
    extends IdentifiedAsset
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedCurrency currency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExchangeId exchangeId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ClearanceSystem clearanceSystem;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ProductReference definition;

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public IdentifiedCurrency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedCurrency }
     *     
     */
    public void setCurrency(IdentifiedCurrency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the exchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeId }
     *     
     */
    public ExchangeId getExchangeId() {
        return exchangeId;
    }

    /**
     * Sets the value of the exchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeId }
     *     
     */
    public void setExchangeId(ExchangeId value) {
        this.exchangeId = value;
    }

    /**
     * Gets the value of the clearanceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link ClearanceSystem }
     *     
     */
    public ClearanceSystem getClearanceSystem() {
        return clearanceSystem;
    }

    /**
     * Sets the value of the clearanceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearanceSystem }
     *     
     */
    public void setClearanceSystem(ClearanceSystem value) {
        this.clearanceSystem = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link ProductReference }
     *     
     */
    public ProductReference getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductReference }
     *     
     */
    public void setDefinition(ProductReference value) {
        this.definition = value;
    }

}
