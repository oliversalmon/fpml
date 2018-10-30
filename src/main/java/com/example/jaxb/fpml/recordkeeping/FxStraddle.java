
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Straddle details. Straddle is composed of two options: a call and a put involving the quotedCurrencyPair.
 * 
 * <p>Java class for FxStraddle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxStraddle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="straddleType" type="{http://www.fpml.org/FpML-5/recordkeeping}FxStraddleTypeEnum"/>
 *         &lt;element name="tenorPeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}Period" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="europeanExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}FxEuropeanExercise"/>
 *           &lt;element name="exerciseProcedure" type="{http://www.fpml.org/FpML-5/recordkeeping}ExerciseProcedure" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="notional" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney"/>
 *           &lt;element name="counterCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}Currency"/>
 *         &lt;/sequence>
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/recordkeeping}FxStraddlePremium" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="settlementDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrAdjustedDate" minOccurs="0"/>
 *         &lt;element name="cashSettlement" type="{http://www.fpml.org/FpML-5/recordkeeping}FxCashSettlementSimple" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxStraddle", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "straddleType",
    "tenorPeriod",
    "europeanExercise",
    "exerciseProcedure",
    "notional",
    "counterCurrency",
    "premium",
    "settlementDate",
    "cashSettlement"
})
public class FxStraddle {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected FxStraddleTypeEnum straddleType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period tenorPeriod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FxEuropeanExercise europeanExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExerciseProcedure exerciseProcedure;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected NonNegativeMoney notional;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected Currency counterCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FxStraddlePremium> premium;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrAdjustedDate settlementDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxCashSettlementSimple cashSettlement;

    /**
     * Gets the value of the straddleType property.
     * 
     * @return
     *     possible object is
     *     {@link FxStraddleTypeEnum }
     *     
     */
    public FxStraddleTypeEnum getStraddleType() {
        return straddleType;
    }

    /**
     * Sets the value of the straddleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxStraddleTypeEnum }
     *     
     */
    public void setStraddleType(FxStraddleTypeEnum value) {
        this.straddleType = value;
    }

    /**
     * Gets the value of the tenorPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getTenorPeriod() {
        return tenorPeriod;
    }

    /**
     * Sets the value of the tenorPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setTenorPeriod(Period value) {
        this.tenorPeriod = value;
    }

    /**
     * Gets the value of the europeanExercise property.
     * 
     * @return
     *     possible object is
     *     {@link FxEuropeanExercise }
     *     
     */
    public FxEuropeanExercise getEuropeanExercise() {
        return europeanExercise;
    }

    /**
     * Sets the value of the europeanExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxEuropeanExercise }
     *     
     */
    public void setEuropeanExercise(FxEuropeanExercise value) {
        this.europeanExercise = value;
    }

    /**
     * Gets the value of the exerciseProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseProcedure }
     *     
     */
    public ExerciseProcedure getExerciseProcedure() {
        return exerciseProcedure;
    }

    /**
     * Sets the value of the exerciseProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseProcedure }
     *     
     */
    public void setExerciseProcedure(ExerciseProcedure value) {
        this.exerciseProcedure = value;
    }

    /**
     * Gets the value of the notional property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMoney }
     *     
     */
    public NonNegativeMoney getNotional() {
        return notional;
    }

    /**
     * Sets the value of the notional property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMoney }
     *     
     */
    public void setNotional(NonNegativeMoney value) {
        this.notional = value;
    }

    /**
     * Gets the value of the counterCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCounterCurrency() {
        return counterCurrency;
    }

    /**
     * Sets the value of the counterCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCounterCurrency(Currency value) {
        this.counterCurrency = value;
    }

    /**
     * Gets the value of the premium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxStraddlePremium }
     * 
     * 
     */
    public List<FxStraddlePremium> getPremium() {
        if (premium == null) {
            premium = new ArrayList<FxStraddlePremium>();
        }
        return this.premium;
    }

    /**
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrAdjustedDate }
     *     
     */
    public AdjustableOrAdjustedDate getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrAdjustedDate }
     *     
     */
    public void setSettlementDate(AdjustableOrAdjustedDate value) {
        this.settlementDate = value;
    }

    /**
     * Gets the value of the cashSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link FxCashSettlementSimple }
     *     
     */
    public FxCashSettlementSimple getCashSettlement() {
        return cashSettlement;
    }

    /**
     * Sets the value of the cashSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxCashSettlementSimple }
     *     
     */
    public void setCashSettlement(FxCashSettlementSimple value) {
        this.cashSettlement = value;
    }

}
