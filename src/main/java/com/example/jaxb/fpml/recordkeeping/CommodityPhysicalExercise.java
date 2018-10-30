
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The parameters for defining how the physically-settled commodity option can be exercised and how it is settled.
 * 
 * <p>Java class for CommodityPhysicalExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityPhysicalExercise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="americanExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPhysicalAmericanExercise"/>
 *           &lt;element name="europeanExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPhysicalEuropeanExercise"/>
 *         &lt;/choice>
 *         &lt;element name="automaticExercise" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="writtenConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="clearingInstructions" type="{http://www.fpml.org/FpML-5/recordkeeping}SwaptionPhysicalSettlement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityPhysicalExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "americanExercise",
    "europeanExercise",
    "automaticExercise",
    "writtenConfirmation",
    "clearingInstructions"
})
public class CommodityPhysicalExercise {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityPhysicalAmericanExercise americanExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityPhysicalEuropeanExercise europeanExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean automaticExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean writtenConfirmation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SwaptionPhysicalSettlement clearingInstructions;

    /**
     * Gets the value of the americanExercise property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPhysicalAmericanExercise }
     *     
     */
    public CommodityPhysicalAmericanExercise getAmericanExercise() {
        return americanExercise;
    }

    /**
     * Sets the value of the americanExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPhysicalAmericanExercise }
     *     
     */
    public void setAmericanExercise(CommodityPhysicalAmericanExercise value) {
        this.americanExercise = value;
    }

    /**
     * Gets the value of the europeanExercise property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPhysicalEuropeanExercise }
     *     
     */
    public CommodityPhysicalEuropeanExercise getEuropeanExercise() {
        return europeanExercise;
    }

    /**
     * Sets the value of the europeanExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPhysicalEuropeanExercise }
     *     
     */
    public void setEuropeanExercise(CommodityPhysicalEuropeanExercise value) {
        this.europeanExercise = value;
    }

    /**
     * Gets the value of the automaticExercise property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticExercise() {
        return automaticExercise;
    }

    /**
     * Sets the value of the automaticExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticExercise(Boolean value) {
        this.automaticExercise = value;
    }

    /**
     * Gets the value of the writtenConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWrittenConfirmation() {
        return writtenConfirmation;
    }

    /**
     * Sets the value of the writtenConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWrittenConfirmation(Boolean value) {
        this.writtenConfirmation = value;
    }

    /**
     * Gets the value of the clearingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link SwaptionPhysicalSettlement }
     *     
     */
    public SwaptionPhysicalSettlement getClearingInstructions() {
        return clearingInstructions;
    }

    /**
     * Sets the value of the clearingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwaptionPhysicalSettlement }
     *     
     */
    public void setClearingInstructions(SwaptionPhysicalSettlement value) {
        this.clearingInstructions = value;
    }

}
