
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The parameters for defining the expiration date(s) and time(s) for an American style option.
 * 
 * <p>Java class for CommodityPhysicalAmericanExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityPhysicalAmericanExercise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Exercise">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="commencementDates" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDates" minOccurs="0"/>
 *             &lt;element name="expirationDates" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDates" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="relativeCommencementDates" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityRelativeExpirationDates" minOccurs="0"/>
 *             &lt;element name="relativeExpirationDates" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityRelativeExpirationDates" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="latestExerciseTime" type="{http://www.fpml.org/FpML-5/recordkeeping}PrevailingTime" minOccurs="0"/>
 *         &lt;element name="expirationTime" type="{http://www.fpml.org/FpML-5/recordkeeping}PrevailingTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityPhysicalAmericanExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "commencementDates",
    "expirationDates",
    "relativeCommencementDates",
    "relativeExpirationDates",
    "latestExerciseTime",
    "expirationTime"
})
public class CommodityPhysicalAmericanExercise
    extends Exercise
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDates commencementDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDates expirationDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityRelativeExpirationDates relativeCommencementDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityRelativeExpirationDates relativeExpirationDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PrevailingTime latestExerciseTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PrevailingTime expirationTime;

    /**
     * Gets the value of the commencementDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public AdjustableOrRelativeDates getCommencementDates() {
        return commencementDates;
    }

    /**
     * Sets the value of the commencementDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public void setCommencementDates(AdjustableOrRelativeDates value) {
        this.commencementDates = value;
    }

    /**
     * Gets the value of the expirationDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public AdjustableOrRelativeDates getExpirationDates() {
        return expirationDates;
    }

    /**
     * Sets the value of the expirationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDates }
     *     
     */
    public void setExpirationDates(AdjustableOrRelativeDates value) {
        this.expirationDates = value;
    }

    /**
     * Gets the value of the relativeCommencementDates property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityRelativeExpirationDates }
     *     
     */
    public CommodityRelativeExpirationDates getRelativeCommencementDates() {
        return relativeCommencementDates;
    }

    /**
     * Sets the value of the relativeCommencementDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityRelativeExpirationDates }
     *     
     */
    public void setRelativeCommencementDates(CommodityRelativeExpirationDates value) {
        this.relativeCommencementDates = value;
    }

    /**
     * Gets the value of the relativeExpirationDates property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityRelativeExpirationDates }
     *     
     */
    public CommodityRelativeExpirationDates getRelativeExpirationDates() {
        return relativeExpirationDates;
    }

    /**
     * Sets the value of the relativeExpirationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityRelativeExpirationDates }
     *     
     */
    public void setRelativeExpirationDates(CommodityRelativeExpirationDates value) {
        this.relativeExpirationDates = value;
    }

    /**
     * Gets the value of the latestExerciseTime property.
     * 
     * @return
     *     possible object is
     *     {@link PrevailingTime }
     *     
     */
    public PrevailingTime getLatestExerciseTime() {
        return latestExerciseTime;
    }

    /**
     * Sets the value of the latestExerciseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevailingTime }
     *     
     */
    public void setLatestExerciseTime(PrevailingTime value) {
        this.latestExerciseTime = value;
    }

    /**
     * Gets the value of the expirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link PrevailingTime }
     *     
     */
    public PrevailingTime getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets the value of the expirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevailingTime }
     *     
     */
    public void setExpirationTime(PrevailingTime value) {
        this.expirationTime = value;
    }

}
