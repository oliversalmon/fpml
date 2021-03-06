
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the exercise period for an American style option together with any rules governing the notional amount of the underlying which can be exercised on any given exercise date and any associated exercise fees.
 * 
 * <p>Java class for AmericanExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmericanExercise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Exercise">
 *       &lt;sequence>
 *         &lt;element name="commencementDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate"/>
 *         &lt;element name="expirationDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate"/>
 *         &lt;element name="relevantUnderlyingDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDates" minOccurs="0"/>
 *         &lt;element name="earliestExerciseTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *         &lt;element name="latestExerciseTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *         &lt;element name="expirationTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *         &lt;element name="multipleExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}MultipleExercise" minOccurs="0"/>
 *         &lt;element name="exerciseFeeSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}ExerciseFeeSchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmericanExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "commencementDate",
    "expirationDate",
    "relevantUnderlyingDate",
    "earliestExerciseTime",
    "latestExerciseTime",
    "expirationTime",
    "multipleExercise",
    "exerciseFeeSchedule"
})
public class AmericanExercise
    extends Exercise
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected AdjustableOrRelativeDate commencementDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected AdjustableOrRelativeDate expirationDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDates relevantUnderlyingDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenterTime earliestExerciseTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenterTime latestExerciseTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenterTime expirationTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MultipleExercise multipleExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExerciseFeeSchedule exerciseFeeSchedule;

    /**
     * Gets the value of the commencementDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getCommencementDate() {
        return commencementDate;
    }

    /**
     * Sets the value of the commencementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setCommencementDate(AdjustableOrRelativeDate value) {
        this.commencementDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setExpirationDate(AdjustableOrRelativeDate value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the relevantUnderlyingDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public AdjustableOrRelativeDates getRelevantUnderlyingDate() {
        return relevantUnderlyingDate;
    }

    /**
     * Sets the value of the relevantUnderlyingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public void setRelevantUnderlyingDate(AdjustableOrRelativeDates value) {
        this.relevantUnderlyingDate = value;
    }

    /**
     * Gets the value of the earliestExerciseTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getEarliestExerciseTime() {
        return earliestExerciseTime;
    }

    /**
     * Sets the value of the earliestExerciseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setEarliestExerciseTime(BusinessCenterTime value) {
        this.earliestExerciseTime = value;
    }

    /**
     * Gets the value of the latestExerciseTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getLatestExerciseTime() {
        return latestExerciseTime;
    }

    /**
     * Sets the value of the latestExerciseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setLatestExerciseTime(BusinessCenterTime value) {
        this.latestExerciseTime = value;
    }

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setExpirationTime(BusinessCenterTime value) {
        this.expirationTime = value;
    }

    /**
     * Gets the value of the multipleExercise property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleExercise }
     *     
     */
    public MultipleExercise getMultipleExercise() {
        return multipleExercise;
    }

    /**
     * Sets the value of the multipleExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleExercise }
     *     
     */
    public void setMultipleExercise(MultipleExercise value) {
        this.multipleExercise = value;
    }

    /**
     * Gets the value of the exerciseFeeSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseFeeSchedule }
     *     
     */
    public ExerciseFeeSchedule getExerciseFeeSchedule() {
        return exerciseFeeSchedule;
    }

    /**
     * Sets the value of the exerciseFeeSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseFeeSchedule }
     *     
     */
    public void setExerciseFeeSchedule(ExerciseFeeSchedule value) {
        this.exerciseFeeSchedule = value;
    }

}
