
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing how notice of exercise should be given. This can be either manual or automatic.
 * 
 * <p>Java class for ExerciseProcedure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExerciseProcedure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="manualExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}ManualExercise"/>
 *           &lt;element name="automaticExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}AutomaticExercise"/>
 *         &lt;/choice>
 *         &lt;element name="followUpConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="limitedRightToConfirm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="splitTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExerciseProcedure", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "manualExercise",
    "automaticExercise",
    "followUpConfirmation",
    "limitedRightToConfirm",
    "splitTicket"
})
public class ExerciseProcedure {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ManualExercise manualExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AutomaticExercise automaticExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean followUpConfirmation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean limitedRightToConfirm;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean splitTicket;

    /**
     * Gets the value of the manualExercise property.
     * 
     * @return
     *     possible object is
     *     {@link ManualExercise }
     *     
     */
    public ManualExercise getManualExercise() {
        return manualExercise;
    }

    /**
     * Sets the value of the manualExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManualExercise }
     *     
     */
    public void setManualExercise(ManualExercise value) {
        this.manualExercise = value;
    }

    /**
     * Gets the value of the automaticExercise property.
     * 
     * @return
     *     possible object is
     *     {@link AutomaticExercise }
     *     
     */
    public AutomaticExercise getAutomaticExercise() {
        return automaticExercise;
    }

    /**
     * Sets the value of the automaticExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomaticExercise }
     *     
     */
    public void setAutomaticExercise(AutomaticExercise value) {
        this.automaticExercise = value;
    }

    /**
     * Gets the value of the followUpConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFollowUpConfirmation() {
        return followUpConfirmation;
    }

    /**
     * Sets the value of the followUpConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFollowUpConfirmation(Boolean value) {
        this.followUpConfirmation = value;
    }

    /**
     * Gets the value of the limitedRightToConfirm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLimitedRightToConfirm() {
        return limitedRightToConfirm;
    }

    /**
     * Sets the value of the limitedRightToConfirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLimitedRightToConfirm(Boolean value) {
        this.limitedRightToConfirm = value;
    }

    /**
     * Gets the value of the splitTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplitTicket() {
        return splitTicket;
    }

    /**
     * Sets the value of the splitTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplitTicket(Boolean value) {
        this.splitTicket = value;
    }

}
