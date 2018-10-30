
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Payment Dates of the trade relative to the Calculation Periods.
 * 
 * <p>Java class for CommodityRelativePaymentDates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityRelativePaymentDates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="payRelativeTo" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPayRelativeToEnum"/>
 *           &lt;element name="payRelativeToEvent" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPayRelativeToEvent"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityCalculationPeriodsPointer.model" minOccurs="0"/>
 *         &lt;element name="paymentDaysOffset" type="{http://www.fpml.org/FpML-5/recordkeeping}DateOffset" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCentersOrReference.model" minOccurs="0"/>
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
@XmlType(name = "CommodityRelativePaymentDates", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "payRelativeTo",
    "payRelativeToEvent",
    "calculationPeriodsReference",
    "calculationPeriodsScheduleReference",
    "calculationPeriodsDatesReference",
    "paymentDaysOffset",
    "businessCentersReference",
    "businessCenters"
})
public class CommodityRelativePaymentDates {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "anySimpleType")
    protected String payRelativeTo;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityPayRelativeToEvent payRelativeToEvent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodsReference calculationPeriodsReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodsScheduleReference calculationPeriodsScheduleReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationPeriodsDatesReference calculationPeriodsDatesReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DateOffset paymentDaysOffset;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCentersReference businessCentersReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenters businessCenters;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the payRelativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayRelativeTo() {
        return payRelativeTo;
    }

    /**
     * Sets the value of the payRelativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayRelativeTo(String value) {
        this.payRelativeTo = value;
    }

    /**
     * Gets the value of the payRelativeToEvent property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityPayRelativeToEvent }
     *     
     */
    public CommodityPayRelativeToEvent getPayRelativeToEvent() {
        return payRelativeToEvent;
    }

    /**
     * Sets the value of the payRelativeToEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityPayRelativeToEvent }
     *     
     */
    public void setPayRelativeToEvent(CommodityPayRelativeToEvent value) {
        this.payRelativeToEvent = value;
    }

    /**
     * Gets the value of the calculationPeriodsReference property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodsReference }
     *     
     */
    public CalculationPeriodsReference getCalculationPeriodsReference() {
        return calculationPeriodsReference;
    }

    /**
     * Sets the value of the calculationPeriodsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodsReference }
     *     
     */
    public void setCalculationPeriodsReference(CalculationPeriodsReference value) {
        this.calculationPeriodsReference = value;
    }

    /**
     * Gets the value of the calculationPeriodsScheduleReference property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodsScheduleReference }
     *     
     */
    public CalculationPeriodsScheduleReference getCalculationPeriodsScheduleReference() {
        return calculationPeriodsScheduleReference;
    }

    /**
     * Sets the value of the calculationPeriodsScheduleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodsScheduleReference }
     *     
     */
    public void setCalculationPeriodsScheduleReference(CalculationPeriodsScheduleReference value) {
        this.calculationPeriodsScheduleReference = value;
    }

    /**
     * Gets the value of the calculationPeriodsDatesReference property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationPeriodsDatesReference }
     *     
     */
    public CalculationPeriodsDatesReference getCalculationPeriodsDatesReference() {
        return calculationPeriodsDatesReference;
    }

    /**
     * Sets the value of the calculationPeriodsDatesReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationPeriodsDatesReference }
     *     
     */
    public void setCalculationPeriodsDatesReference(CalculationPeriodsDatesReference value) {
        this.calculationPeriodsDatesReference = value;
    }

    /**
     * Gets the value of the paymentDaysOffset property.
     * 
     * @return
     *     possible object is
     *     {@link DateOffset }
     *     
     */
    public DateOffset getPaymentDaysOffset() {
        return paymentDaysOffset;
    }

    /**
     * Sets the value of the paymentDaysOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOffset }
     *     
     */
    public void setPaymentDaysOffset(DateOffset value) {
        this.paymentDaysOffset = value;
    }

    /**
     * Gets the value of the businessCentersReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCentersReference }
     *     
     */
    public BusinessCentersReference getBusinessCentersReference() {
        return businessCentersReference;
    }

    /**
     * Sets the value of the businessCentersReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCentersReference }
     *     
     */
    public void setBusinessCentersReference(BusinessCentersReference value) {
        this.businessCentersReference = value;
    }

    /**
     * Gets the value of the businessCenters property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenters }
     *     
     */
    public BusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    /**
     * Sets the value of the businessCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenters }
     *     
     */
    public void setBusinessCenters(BusinessCenters value) {
        this.businessCenters = value;
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
