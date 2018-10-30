
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * An exchange traded option.
 * 
 * <p>Java class for ExchangeTradedOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeTradedOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}ExchangeTradedContract">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="strike" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *           &lt;element name="strikeCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}Currency" minOccurs="0"/>
 *           &lt;element name="strikeUnits" type="{http://www.fpml.org/FpML-5/recordkeeping}PriceQuoteUnits" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/recordkeeping}PutCallEnum" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="exerciseStyle" type="{http://www.fpml.org/FpML-5/recordkeeping}ExerciseStyleEnum" minOccurs="0"/>
 *           &lt;element name="underlyer" type="{http://www.fpml.org/FpML-5/recordkeeping}ExchangeTradedContractUnderlyer" minOccurs="0"/>
 *           &lt;element name="settlementType" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementTypeEnum" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeTradedOption", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "strike",
    "strikeCurrency",
    "strikeUnits",
    "optionType",
    "exerciseStyle",
    "underlyer",
    "settlementType"
})
public class ExchangeTradedOption
    extends ExchangeTradedContract
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal strike;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Currency strikeCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PriceQuoteUnits strikeUnits;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected PutCallEnum optionType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected ExerciseStyleEnum exerciseStyle;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExchangeTradedContractUnderlyer underlyer;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected SettlementTypeEnum settlementType;

    /**
     * Gets the value of the strike property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrike() {
        return strike;
    }

    /**
     * Sets the value of the strike property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrike(BigDecimal value) {
        this.strike = value;
    }

    /**
     * Gets the value of the strikeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getStrikeCurrency() {
        return strikeCurrency;
    }

    /**
     * Sets the value of the strikeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setStrikeCurrency(Currency value) {
        this.strikeCurrency = value;
    }

    /**
     * Gets the value of the strikeUnits property.
     * 
     * @return
     *     possible object is
     *     {@link PriceQuoteUnits }
     *     
     */
    public PriceQuoteUnits getStrikeUnits() {
        return strikeUnits;
    }

    /**
     * Sets the value of the strikeUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceQuoteUnits }
     *     
     */
    public void setStrikeUnits(PriceQuoteUnits value) {
        this.strikeUnits = value;
    }

    /**
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link PutCallEnum }
     *     
     */
    public PutCallEnum getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PutCallEnum }
     *     
     */
    public void setOptionType(PutCallEnum value) {
        this.optionType = value;
    }

    /**
     * Gets the value of the exerciseStyle property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseStyleEnum }
     *     
     */
    public ExerciseStyleEnum getExerciseStyle() {
        return exerciseStyle;
    }

    /**
     * Sets the value of the exerciseStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseStyleEnum }
     *     
     */
    public void setExerciseStyle(ExerciseStyleEnum value) {
        this.exerciseStyle = value;
    }

    /**
     * Gets the value of the underlyer property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeTradedContractUnderlyer }
     *     
     */
    public ExchangeTradedContractUnderlyer getUnderlyer() {
        return underlyer;
    }

    /**
     * Sets the value of the underlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeTradedContractUnderlyer }
     *     
     */
    public void setUnderlyer(ExchangeTradedContractUnderlyer value) {
        this.underlyer = value;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public SettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public void setSettlementType(SettlementTypeEnum value) {
        this.settlementType = value;
    }

}
