
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining exercise procedures associated with a European style exercise of a commodity option.
 * 
 * <p>Java class for CommodityEuropeanExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityEuropeanExercise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Exercise">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="expirationDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="exerciseFrequency" type="{http://www.fpml.org/FpML-5/recordkeeping}Frequency" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="expirationTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityEuropeanExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "expirationDate",
    "exerciseFrequency",
    "expirationTime"
})
public class CommodityEuropeanExercise
    extends Exercise
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<AdjustableOrRelativeDate> expirationDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Frequency exerciseFrequency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenterTime expirationTime;

    /**
     * Gets the value of the expirationDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expirationDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpirationDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjustableOrRelativeDate }
     * 
     * 
     */
    public List<AdjustableOrRelativeDate> getExpirationDate() {
        if (expirationDate == null) {
            expirationDate = new ArrayList<AdjustableOrRelativeDate>();
        }
        return this.expirationDate;
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

}
