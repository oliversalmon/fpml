
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for FxTargetLeverage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTargetLeverage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{http://www.fpml.org/FpML-5/recordkeeping}ConditionEnum"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetConditionLevel.model"/>
 *         &lt;choice>
 *           &lt;element name="ratio" type="{http://www.fpml.org/FpML-5/recordkeeping}Schedule"/>
 *           &lt;sequence>
 *             &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeAmountSchedule"/>
 *             &lt;element name="counterCurrencyAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}FxCounterCurrencyAmount" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "FxTargetLeverage", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "condition",
    "level",
    "strikeReference",
    "pivotReference",
    "barrierReference",
    "levelReference",
    "ratio",
    "notionalAmount",
    "counterCurrencyAmount"
})
public class FxTargetLeverage {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected ConditionEnum condition;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxLevel level;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxStrikeReference strikeReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxPivotReference pivotReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxComplexBarrierBaseReference barrierReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxLevelReference levelReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Schedule ratio;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativeAmountSchedule notionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FxCounterCurrencyAmount> counterCurrencyAmount;
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

    /**
     * Gets the value of the pivotReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxPivotReference }
     *     
     */
    public FxPivotReference getPivotReference() {
        return pivotReference;
    }

    /**
     * Sets the value of the pivotReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxPivotReference }
     *     
     */
    public void setPivotReference(FxPivotReference value) {
        this.pivotReference = value;
    }

    /**
     * Gets the value of the barrierReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxComplexBarrierBaseReference }
     *     
     */
    public FxComplexBarrierBaseReference getBarrierReference() {
        return barrierReference;
    }

    /**
     * Sets the value of the barrierReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxComplexBarrierBaseReference }
     *     
     */
    public void setBarrierReference(FxComplexBarrierBaseReference value) {
        this.barrierReference = value;
    }

    /**
     * Gets the value of the levelReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxLevelReference }
     *     
     */
    public FxLevelReference getLevelReference() {
        return levelReference;
    }

    /**
     * Sets the value of the levelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxLevelReference }
     *     
     */
    public void setLevelReference(FxLevelReference value) {
        this.levelReference = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the counterCurrencyAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCounterCurrencyAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxCounterCurrencyAmount }
     * 
     * 
     */
    public List<FxCounterCurrencyAmount> getCounterCurrencyAmount() {
        if (counterCurrencyAmount == null) {
            counterCurrencyAmount = new ArrayList<FxCounterCurrencyAmount>();
        }
        return this.counterCurrencyAmount;
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
