
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure describing an option exercise. The OptionExercise type supports partial exercise (specify the number of options or amount to exercise), full exercise (use fullExercise flag), as well as the option to request options not to be exercised.
 * 
 * <p>Java class for OptionExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionExercise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}AbstractEvent">
 *       &lt;sequence>
 *         &lt;element name="optionSeller" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;element name="optionBuyer" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="originalTrade" type="{http://www.fpml.org/FpML-5/recordkeeping}Trade"/>
 *           &lt;element name="tradeIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyTradeIdentifier" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="exerciseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *             &lt;element name="exerciseTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="exerciseTiming" type="{http://www.fpml.org/FpML-5/recordkeeping}ExerciseTimingEnum"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}OptionExerciseAmount.model"/>
 *         &lt;element name="exerciseSide" type="{http://www.fpml.org/FpML-5/recordkeeping}ExerciseSideEnum" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="settlementType" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementTypeEnum"/>
 *           &lt;element name="cashSettlement" type="{http://www.fpml.org/FpML-5/recordkeeping}SimplePayment"/>
 *           &lt;element name="physicalSettlement" type="{http://www.fpml.org/FpML-5/recordkeeping}PhysicalSettlement"/>
 *         &lt;/choice>
 *         &lt;element name="payment" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativePayment" minOccurs="0"/>
 *         &lt;element name="clearingInstructions" type="{http://www.fpml.org/FpML-5/recordkeeping}ClearingInstructions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "optionSeller",
    "optionBuyer",
    "originalTrade",
    "tradeIdentifier",
    "exerciseDate",
    "exerciseTime",
    "exerciseTiming",
    "exerciseAction",
    "expiry",
    "fullExercise",
    "exerciseInNotionalAmount",
    "outstandingNotionalAmount",
    "exerciseInNumberOfOptions",
    "outstandingNumberOfOptions",
    "exerciseInNumberOfUnits",
    "outstandingNumberOfUnits",
    "specifiedExercise",
    "exerciseSide",
    "settlementType",
    "cashSettlement",
    "physicalSettlement",
    "payment",
    "clearingInstructions"
})
public class OptionExercise
    extends AbstractEvent
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference optionSeller;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference optionBuyer;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Trade originalTrade;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PartyTradeIdentifier> tradeIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exerciseDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar exerciseTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected ExerciseTimingEnum exerciseTiming;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected ExerciseActionEnum exerciseAction;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean expiry;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean fullExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money exerciseInNotionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money outstandingNotionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal exerciseInNumberOfOptions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal outstandingNumberOfOptions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal exerciseInNumberOfUnits;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal outstandingNumberOfUnits;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<OptionExerciseAmounts> specifiedExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "anySimpleType")
    protected String exerciseSide;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected SettlementTypeEnum settlementType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SimplePayment cashSettlement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PhysicalSettlement physicalSettlement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativePayment payment;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ClearingInstructions clearingInstructions;

    /**
     * Gets the value of the optionSeller property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getOptionSeller() {
        return optionSeller;
    }

    /**
     * Sets the value of the optionSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setOptionSeller(PartyReference value) {
        this.optionSeller = value;
    }

    /**
     * Gets the value of the optionBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getOptionBuyer() {
        return optionBuyer;
    }

    /**
     * Sets the value of the optionBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setOptionBuyer(PartyReference value) {
        this.optionBuyer = value;
    }

    /**
     * Gets the value of the originalTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getOriginalTrade() {
        return originalTrade;
    }

    /**
     * Sets the value of the originalTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setOriginalTrade(Trade value) {
        this.originalTrade = value;
    }

    /**
     * Gets the value of the tradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeIdentifier }
     * 
     * 
     */
    public List<PartyTradeIdentifier> getTradeIdentifier() {
        if (tradeIdentifier == null) {
            tradeIdentifier = new ArrayList<PartyTradeIdentifier>();
        }
        return this.tradeIdentifier;
    }

    /**
     * Gets the value of the exerciseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExerciseDate() {
        return exerciseDate;
    }

    /**
     * Sets the value of the exerciseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExerciseDate(XMLGregorianCalendar value) {
        this.exerciseDate = value;
    }

    /**
     * Gets the value of the exerciseTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExerciseTime() {
        return exerciseTime;
    }

    /**
     * Sets the value of the exerciseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExerciseTime(XMLGregorianCalendar value) {
        this.exerciseTime = value;
    }

    /**
     * Gets the value of the exerciseTiming property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseTimingEnum }
     *     
     */
    public ExerciseTimingEnum getExerciseTiming() {
        return exerciseTiming;
    }

    /**
     * Sets the value of the exerciseTiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseTimingEnum }
     *     
     */
    public void setExerciseTiming(ExerciseTimingEnum value) {
        this.exerciseTiming = value;
    }

    /**
     * Gets the value of the exerciseAction property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseActionEnum }
     *     
     */
    public ExerciseActionEnum getExerciseAction() {
        return exerciseAction;
    }

    /**
     * Sets the value of the exerciseAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseActionEnum }
     *     
     */
    public void setExerciseAction(ExerciseActionEnum value) {
        this.exerciseAction = value;
    }

    /**
     * Gets the value of the expiry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpiry() {
        return expiry;
    }

    /**
     * Sets the value of the expiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpiry(Boolean value) {
        this.expiry = value;
    }

    /**
     * Gets the value of the fullExercise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullExercise() {
        return fullExercise;
    }

    /**
     * Sets the value of the fullExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullExercise(Boolean value) {
        this.fullExercise = value;
    }

    /**
     * Gets the value of the exerciseInNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getExerciseInNotionalAmount() {
        return exerciseInNotionalAmount;
    }

    /**
     * Sets the value of the exerciseInNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setExerciseInNotionalAmount(Money value) {
        this.exerciseInNotionalAmount = value;
    }

    /**
     * Gets the value of the outstandingNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getOutstandingNotionalAmount() {
        return outstandingNotionalAmount;
    }

    /**
     * Sets the value of the outstandingNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setOutstandingNotionalAmount(Money value) {
        this.outstandingNotionalAmount = value;
    }

    /**
     * Gets the value of the exerciseInNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExerciseInNumberOfOptions() {
        return exerciseInNumberOfOptions;
    }

    /**
     * Sets the value of the exerciseInNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExerciseInNumberOfOptions(BigDecimal value) {
        this.exerciseInNumberOfOptions = value;
    }

    /**
     * Gets the value of the outstandingNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingNumberOfOptions() {
        return outstandingNumberOfOptions;
    }

    /**
     * Sets the value of the outstandingNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingNumberOfOptions(BigDecimal value) {
        this.outstandingNumberOfOptions = value;
    }

    /**
     * Gets the value of the exerciseInNumberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExerciseInNumberOfUnits() {
        return exerciseInNumberOfUnits;
    }

    /**
     * Sets the value of the exerciseInNumberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExerciseInNumberOfUnits(BigDecimal value) {
        this.exerciseInNumberOfUnits = value;
    }

    /**
     * Gets the value of the outstandingNumberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingNumberOfUnits() {
        return outstandingNumberOfUnits;
    }

    /**
     * Sets the value of the outstandingNumberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingNumberOfUnits(BigDecimal value) {
        this.outstandingNumberOfUnits = value;
    }

    /**
     * Gets the value of the specifiedExercise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedExercise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedExercise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionExerciseAmounts }
     * 
     * 
     */
    public List<OptionExerciseAmounts> getSpecifiedExercise() {
        if (specifiedExercise == null) {
            specifiedExercise = new ArrayList<OptionExerciseAmounts>();
        }
        return this.specifiedExercise;
    }

    /**
     * Gets the value of the exerciseSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExerciseSide() {
        return exerciseSide;
    }

    /**
     * Sets the value of the exerciseSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExerciseSide(String value) {
        this.exerciseSide = value;
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

    /**
     * Gets the value of the cashSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePayment }
     *     
     */
    public SimplePayment getCashSettlement() {
        return cashSettlement;
    }

    /**
     * Sets the value of the cashSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePayment }
     *     
     */
    public void setCashSettlement(SimplePayment value) {
        this.cashSettlement = value;
    }

    /**
     * Gets the value of the physicalSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalSettlement }
     *     
     */
    public PhysicalSettlement getPhysicalSettlement() {
        return physicalSettlement;
    }

    /**
     * Sets the value of the physicalSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalSettlement }
     *     
     */
    public void setPhysicalSettlement(PhysicalSettlement value) {
        this.physicalSettlement = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativePayment }
     *     
     */
    public NonNegativePayment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativePayment }
     *     
     */
    public void setPayment(NonNegativePayment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the clearingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingInstructions }
     *     
     */
    public ClearingInstructions getClearingInstructions() {
        return clearingInstructions;
    }

    /**
     * Sets the value of the clearingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingInstructions }
     *     
     */
    public void setClearingInstructions(ClearingInstructions value) {
        this.clearingInstructions = value;
    }

}
