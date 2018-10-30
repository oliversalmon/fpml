
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FxAccrualLeverage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAccrualLeverage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{http://www.fpml.org/FpML-5/recordkeeping}ConditionEnum"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualConditionLevel.model"/>
 *         &lt;choice>
 *           &lt;element name="ratio" type="{http://www.fpml.org/FpML-5/recordkeeping}Schedule"/>
 *           &lt;sequence>
 *             &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeAmountSchedule"/>
 *             &lt;element name="counterCurrencyAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}FxCounterCurrencyAmount" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxAccrualLeverage", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "condition",
    "level",
    "quoteBasis",
    "strikeReference",
    "averageStrikeReference",
    "triggerReference",
    "ratio",
    "notionalAmount",
    "counterCurrencyAmount"
})
public class FxAccrualLeverage {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected ConditionEnum condition;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxLevel level;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected QuoteBasisEnum quoteBasis;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxAccrualStrikeReference strikeReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxAccrualAverageStrikeReference averageStrikeReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxAccrualTriggerReference triggerReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Schedule ratio;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeAmountSchedule notionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxCounterCurrencyAmount counterCurrencyAmount;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionEnum }
     *     
     */
    public ConditionEnum getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionEnum }
     *     
     */
    public void setCondition(ConditionEnum value) {
        this.condition = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link FxLevel }
     *     
     */
    public FxLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxLevel }
     *     
     */
    public void setLevel(FxLevel value) {
        this.level = value;
    }

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

    /**
     * Gets the value of the strikeReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxAccrualStrikeReference }
     *     
     */
    public FxAccrualStrikeReference getStrikeReference() {
        return strikeReference;
    }

    /**
     * Sets the value of the strikeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxAccrualStrikeReference }
     *     
     */
    public void setStrikeReference(FxAccrualStrikeReference value) {
        this.strikeReference = value;
    }

    /**
     * Gets the value of the averageStrikeReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxAccrualAverageStrikeReference }
     *     
     */
    public FxAccrualAverageStrikeReference getAverageStrikeReference() {
        return averageStrikeReference;
    }

    /**
     * Sets the value of the averageStrikeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxAccrualAverageStrikeReference }
     *     
     */
    public void setAverageStrikeReference(FxAccrualAverageStrikeReference value) {
        this.averageStrikeReference = value;
    }

    /**
     * Gets the value of the triggerReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxAccrualTriggerReference }
     *     
     */
    public FxAccrualTriggerReference getTriggerReference() {
        return triggerReference;
    }

    /**
     * Sets the value of the triggerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxAccrualTriggerReference }
     *     
     */
    public void setTriggerReference(FxAccrualTriggerReference value) {
        this.triggerReference = value;
    }

    /**
     * Gets the value of the ratio property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getRatio() {
        return ratio;
    }

    /**
     * Sets the value of the ratio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setRatio(Schedule value) {
        this.ratio = value;
    }

    /**
     * Gets the value of the notionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeAmountSchedule }
     *     
     */
    public NonNegativeAmountSchedule getNotionalAmount() {
        return notionalAmount;
    }

    /**
     * Sets the value of the notionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeAmountSchedule }
     *     
     */
    public void setNotionalAmount(NonNegativeAmountSchedule value) {
        this.notionalAmount = value;
    }

    /**
     * Gets the value of the counterCurrencyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FxCounterCurrencyAmount }
     *     
     */
    public FxCounterCurrencyAmount getCounterCurrencyAmount() {
        return counterCurrencyAmount;
    }

    /**
     * Sets the value of the counterCurrencyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxCounterCurrencyAmount }
     *     
     */
    public void setCounterCurrencyAmount(FxCounterCurrencyAmount value) {
        this.counterCurrencyAmount = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
