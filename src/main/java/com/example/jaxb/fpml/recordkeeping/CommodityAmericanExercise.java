
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining exercise procedures associated with an American style exercise of a commodity option.
 * 
 * <p>Java class for CommodityAmericanExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityAmericanExercise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Exercise">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="exercisePeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityExercisePeriods" maxOccurs="unbounded"/>
 *           &lt;element name="exerciseFrequency" type="{http://www.fpml.org/FpML-5/recordkeeping}Frequency" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="latestExerciseTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime"/>
 *           &lt;element name="latestExerciseTimeDetermination" type="{http://www.fpml.org/FpML-5/recordkeeping}DeterminationMethod"/>
 *         &lt;/choice>
 *         &lt;element name="expirationTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *         &lt;element name="multipleExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityMultipleExercise" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityAmericanExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "exercisePeriod",
    "exerciseFrequency",
    "latestExerciseTime",
    "latestExerciseTimeDetermination",
    "expirationTime",
    "multipleExercise"
})
public class CommodityAmericanExercise
    extends Exercise
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CommodityExercisePeriods> exercisePeriod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Frequency exerciseFrequency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenterTime latestExerciseTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DeterminationMethod latestExerciseTimeDetermination;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenterTime expirationTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityMultipleExercise multipleExercise;

    /**
     * Gets the value of the exercisePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exercisePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExercisePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityExercisePeriods }
     * 
     * 
     */
    public List<CommodityExercisePeriods> getExercisePeriod() {
        if (exercisePeriod == null) {
            exercisePeriod = new ArrayList<CommodityExercisePeriods>();
        }
        return this.exercisePeriod;
    }

    /**
     * Gets the value of the exerciseFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getExerciseFrequency() {
        return exerciseFrequency;
    }

    /**
     * Sets the value of the exerciseFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setExerciseFrequency(Frequency value) {
        this.exerciseFrequency = value;
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
     * Gets the value of the latestExerciseTimeDetermination property.
     * 
     * @return
     *     possible object is
     *     {@link DeterminationMethod }
     *     
     */
    public DeterminationMethod getLatestExerciseTimeDetermination() {
        return latestExerciseTimeDetermination;
    }

    /**
     * Sets the value of the latestExerciseTimeDetermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeterminationMethod }
     *     
     */
    public void setLatestExerciseTimeDetermination(DeterminationMethod value) {
        this.latestExerciseTimeDetermination = value;
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
     *     {@link CommodityMultipleExercise }
     *     
     */
    public CommodityMultipleExercise getMultipleExercise() {
        return multipleExercise;
    }

    /**
     * Sets the value of the multipleExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityMultipleExercise }
     *     
     */
    public void setMultipleExercise(CommodityMultipleExercise value) {
        this.multipleExercise = value;
    }

}
