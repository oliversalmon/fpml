
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Quantity per Delivery Period. There must be a Quantity step specified for each Delivery Period, regardless of whether the Quantity changes or remains the same between periods.
 * 
 * <p>Java class for CommodityPhysicalQuantitySchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityPhysicalQuantitySchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantityStep" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityNotionalQuantity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityDeliveryPeriodsPointer.model"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityPhysicalQuantitySchedule", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "quantityStep",
    "deliveryPeriodsReference",
    "deliveryPeriodsScheduleReference"
})
@XmlSeeAlso({
    ElectricityPhysicalDeliveryQuantitySchedule.class
})
public class CommodityPhysicalQuantitySchedule {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CommodityNotionalQuantity> quantityStep;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodsReference deliveryPeriodsReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodsScheduleReference deliveryPeriodsScheduleReference;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the quantityStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityNotionalQuantity }
     * 
     * 
     */
    public List<CommodityNotionalQuantity> getQuantityStep() {
        if (quantityStep == null) {
            quantityStep = new ArrayList<CommodityNotionalQuantity>();
        }
        return this.quantityStep;
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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
