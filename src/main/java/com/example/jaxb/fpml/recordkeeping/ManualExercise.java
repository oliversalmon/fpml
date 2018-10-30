
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining manual exercise, i.e. that the option buyer counterparty must give notice to the option seller of exercise.
 * 
 * <p>Java class for ManualExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualExercise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exerciseNotice" type="{http://www.fpml.org/FpML-5/recordkeeping}ExerciseNotice" minOccurs="0"/>
 *         &lt;element name="fallbackExercise" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "exerciseNotice",
    "fallbackExercise"
})
public class ManualExercise {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExerciseNotice exerciseNotice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean fallbackExercise;

    /**
     * Gets the value of the exerciseNotice property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseNotice }
     *     
     */
    public ExerciseNotice getExerciseNotice() {
        return exerciseNotice;
    }

    /**
     * Sets the value of the exerciseNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseNotice }
     *     
     */
    public void setExerciseNotice(ExerciseNotice value) {
        this.exerciseNotice = value;
    }

    /**
     * Gets the value of the fallbackExercise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFallbackExercise() {
        return fallbackExercise;
    }

    /**
     * Sets the value of the fallbackExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFallbackExercise(Boolean value) {
        this.fallbackExercise = value;
    }

}
