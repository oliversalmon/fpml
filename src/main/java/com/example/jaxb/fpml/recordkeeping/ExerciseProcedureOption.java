
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing how notice of exercise should be given. This can be either manual or automatic.
 * 
 * <p>Java class for ExerciseProcedureOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExerciseProcedureOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="manualExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}Empty"/>
 *         &lt;element name="automaticExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}Empty"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExerciseProcedureOption", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "manualExercise",
    "automaticExercise"
})
public class ExerciseProcedureOption {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Empty manualExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Empty automaticExercise;

    /**
     * Gets the value of the manualExercise property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getManualExercise() {
        return manualExercise;
    }

    /**
     * Sets the value of the manualExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setManualExercise(Empty value) {
        this.manualExercise = value;
    }

    /**
     * Gets the value of the automaticExercise property.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getAutomaticExercise() {
        return automaticExercise;
    }

    /**
     * Sets the value of the automaticExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setAutomaticExercise(Empty value) {
        this.automaticExercise = value;
    }

}
