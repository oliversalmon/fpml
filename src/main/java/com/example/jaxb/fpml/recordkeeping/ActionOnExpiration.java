
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionOnExpiration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionOnExpiration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}OptionExerciseAmount.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionOnExpiration", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "exerciseAction",
    "expiry",
    "fullExercise",
    "exerciseInNotionalAmount",
    "outstandingNotionalAmount",
    "exerciseInNumberOfOptions",
    "outstandingNumberOfOptions",
    "exerciseInNumberOfUnits",
    "outstandingNumberOfUnits",
    "specifiedExercise"
})
public class ActionOnExpiration {

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

}
