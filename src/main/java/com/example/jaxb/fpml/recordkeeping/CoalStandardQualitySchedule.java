
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The quality attributes of the coal to be delivered, specified on a periodic basis.
 * 
 * <p>Java class for CoalStandardQualitySchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoalStandardQualitySchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StandardQualityStep" type="{http://www.fpml.org/FpML-5/recordkeeping}CoalStandardQuality" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityDeliveryPeriodsPointer.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoalStandardQualitySchedule", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "standardQualityStep",
    "deliveryPeriodsReference",
    "deliveryPeriodsScheduleReference"
})
public class CoalStandardQualitySchedule {

    @XmlElement(name = "StandardQualityStep", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CoalStandardQuality> standardQualityStep;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodsReference deliveryPeriodsReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodsScheduleReference deliveryPeriodsScheduleReference;

    /**
     * Gets the value of the standardQualityStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardQualityStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardQualityStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoalStandardQuality }
     * 
     * 
     */
    public List<CoalStandardQuality> getStandardQualityStep() {
        if (standardQualityStep == null) {
            standardQualityStep = new ArrayList<CoalStandardQuality>();
        }
        return this.standardQualityStep;
    }

    /**
     * Gets the value of the deliveryPeriodsReference property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodsReference }
     *     
     */
    public CalculationPeriodsReference getDeliveryPeriodsReference() {
        return deliveryPeriodsReference;
    }

    /**
     * Sets the value of the deliveryPeriodsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodsReference }
     *     
     */
    public void setDeliveryPeriodsReference(CalculationPeriodsReference value) {
        this.deliveryPeriodsReference = value;
    }

    /**
     * Gets the value of the deliveryPeriodsScheduleReference property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodsScheduleReference }
     *     
     */
    public CalculationPeriodsScheduleReference getDeliveryPeriodsScheduleReference() {
        return deliveryPeriodsScheduleReference;
    }

    /**
     * Sets the value of the deliveryPeriodsScheduleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodsScheduleReference }
     *     
     */
    public void setDeliveryPeriodsScheduleReference(CalculationPeriodsScheduleReference value) {
        this.deliveryPeriodsScheduleReference = value;
    }

}
