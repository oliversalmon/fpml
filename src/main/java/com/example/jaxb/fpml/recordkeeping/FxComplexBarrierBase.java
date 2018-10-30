
package com.example.jaxb.fpml.recordkeeping;

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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FxComplexBarrierBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxComplexBarrierBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="barrierType" type="{http://www.fpml.org/FpML-5/recordkeeping}FxBarrierTypeSimpleEnum" minOccurs="0"/>
 *         &lt;element name="style" type="{http://www.fpml.org/FpML-5/recordkeeping}FxBarrierStyleEnum"/>
 *         &lt;element name="scope" type="{http://www.fpml.org/FpML-5/recordkeeping}FxBarrierScopeEnum" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://www.fpml.org/FpML-5/recordkeeping}ConditionEnum"/>
 *         &lt;element name="triggerRate" type="{http://www.fpml.org/FpML-5/recordkeeping}Schedule"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="observationStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="observationStartTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="observationEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="observationEndTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *         &lt;/sequence>
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
@XmlType(name = "FxComplexBarrierBase", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "barrierType",
    "style",
    "scope",
    "condition",
    "triggerRate",
    "observationStartDate",
    "observationStartTime",
    "observationEndDate",
    "observationEndTime"
})
@XmlSeeAlso({
    FxAccrualBarrier.class,
    FxTargetBarrier.class
})
public class FxComplexBarrierBase {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected FxBarrierTypeSimpleEnum barrierType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected FxBarrierStyleEnum style;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected FxBarrierScopeEnum scope;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected ConditionEnum condition;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected Schedule triggerRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar observationStartDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenterTime observationStartTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar observationEndDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenterTime observationEndTime;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the barrierType property.
     * 
     * @return
     *     possible object is
     *     {@link FxBarrierTypeSimpleEnum }
     *     
     */
    public FxBarrierTypeSimpleEnum getBarrierType() {
        return barrierType;
    }

    /**
     * Sets the value of the barrierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxBarrierTypeSimpleEnum }
     *     
     */
    public void setBarrierType(FxBarrierTypeSimpleEnum value) {
        this.barrierType = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link FxBarrierStyleEnum }
     *     
     */
    public FxBarrierStyleEnum getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxBarrierStyleEnum }
     *     
     */
    public void setStyle(FxBarrierStyleEnum value) {
        this.style = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link FxBarrierScopeEnum }
     *     
     */
    public FxBarrierScopeEnum getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxBarrierScopeEnum }
     *     
     */
    public void setScope(FxBarrierScopeEnum value) {
        this.scope = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionEnum }
     *     
     */
    public ConditionEnum getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionEnum }
     *     
     */
    public void setCondition(ConditionEnum value) {
        this.condition = value;
    }

    /**
     * Gets the value of the triggerRate property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getTriggerRate() {
        return triggerRate;
    }

    /**
     * Sets the value of the triggerRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setTriggerRate(Schedule value) {
        this.triggerRate = value;
    }

    /**
     * Gets the value of the observationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObservationStartDate() {
        return observationStartDate;
    }

    /**
     * Sets the value of the observationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObservationStartDate(XMLGregorianCalendar value) {
        this.observationStartDate = value;
    }

    /**
     * Gets the value of the observationStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getObservationStartTime() {
        return observationStartTime;
    }

    /**
     * Sets the value of the observationStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setObservationStartTime(BusinessCenterTime value) {
        this.observationStartTime = value;
    }

    /**
     * Gets the value of the observationEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObservationEndDate() {
        return observationEndDate;
    }

    /**
     * Sets the value of the observationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObservationEndDate(XMLGregorianCalendar value) {
        this.observationEndDate = value;
    }

    /**
     * Gets the value of the observationEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getObservationEndTime() {
        return observationEndTime;
    }

    /**
     * Sets the value of the observationEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setObservationEndTime(BusinessCenterTime value) {
        this.observationEndTime = value;
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
