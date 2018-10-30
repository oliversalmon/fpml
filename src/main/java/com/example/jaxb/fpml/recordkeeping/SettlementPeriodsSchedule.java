
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The specification of the Settlement Periods in which the electricity will be delivered for a "shaped" trade i.e. where different Settlement Period ranges will apply to different periods of the trade.
 * 
 * <p>Java class for SettlementPeriodsSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementPeriodsSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settlementPeriodsStep" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementPeriodsStep" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SettlementPeriodsSchedule", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "settlementPeriodsStep",
    "deliveryPeriodsReference",
    "deliveryPeriodsScheduleReference"
})
public class SettlementPeriodsSchedule {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<SettlementPeriodsStep> settlementPeriodsStep;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodsReference deliveryPeriodsReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodsScheduleReference deliveryPeriodsScheduleReference;

    /**
     * Gets the value of the settlementPeriodsStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementPeriodsStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementPeriodsStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementPeriodsStep }
     * 
     * 
     */
    public List<SettlementPeriodsStep> getSettlementPeriodsStep() {
        if (settlementPeriodsStep == null) {
            settlementPeriodsStep = new ArrayList<SettlementPeriodsStep>();
        }
        return this.settlementPeriodsStep;
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
