
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Describes an american or discrete touch or no-touch trigger applied to an FX binary or digital option.
 * 
 * <p>Java class for FxTouch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTouch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="touchCondition" type="{http://www.fpml.org/FpML-5/recordkeeping}TouchConditionEnum" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://www.fpml.org/FpML-5/recordkeeping}TriggerConditionEnum" minOccurs="0"/>
 *         &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/recordkeeping}QuotedCurrencyPair" minOccurs="0"/>
 *         &lt;element name="triggerRate" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="spotRate" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="informationSource" type="{http://www.fpml.org/FpML-5/recordkeeping}InformationSource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;sequence>
 *               &lt;element name="observationStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *               &lt;element name="observationStartTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *             &lt;/sequence>
 *             &lt;sequence minOccurs="0">
 *               &lt;element name="observationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *               &lt;element name="observationEndTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *             &lt;/sequence>
 *           &lt;/sequence>
 *           &lt;element name="observationPoint" type="{http://www.fpml.org/FpML-5/recordkeeping}FxBusinessCenterDateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTouch", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "touchCondition",
    "direction",
    "quotedCurrencyPair",
    "triggerRate",
    "spotRate",
    "informationSource",
    "observationStartDate",
    "observationStartTime",
    "observationEndDate",
    "observationEndTime",
    "observationPoint"
})
public class FxTouch {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected TouchConditionEnum touchCondition;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected TriggerConditionEnum direction;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuotedCurrencyPair quotedCurrencyPair;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal triggerRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal spotRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<InformationSource> informationSource;
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
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FxBusinessCenterDateTime> observationPoint;

    /**
     * Gets the value of the touchCondition property.
     * 
     * @return
     *     possible object is
     *     {@link TouchConditionEnum }
     *     
     */
    public TouchConditionEnum getTouchCondition() {
        return touchCondition;
    }

    /**
     * Sets the value of the touchCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TouchConditionEnum }
     *     
     */
    public void setTouchCondition(TouchConditionEnum value) {
        this.touchCondition = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerConditionEnum }
     *     
     */
    public TriggerConditionEnum getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerConditionEnum }
     *     
     */
    public void setDirection(TriggerConditionEnum value) {
        this.direction = value;
    }

    /**
     * Gets the value of the quotedCurrencyPair property.
     * 
     * @return
     *     possible object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public QuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    /**
     * Sets the value of the quotedCurrencyPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public void setQuotedCurrencyPair(QuotedCurrencyPair value) {
        this.quotedCurrencyPair = value;
    }

    /**
     * Gets the value of the triggerRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTriggerRate() {
        return triggerRate;
    }

    /**
     * Sets the value of the triggerRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTriggerRate(BigDecimal value) {
        this.triggerRate = value;
    }

    /**
     * Gets the value of the spotRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpotRate() {
        return spotRate;
    }

    /**
     * Sets the value of the spotRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpotRate(BigDecimal value) {
        this.spotRate = value;
    }

    /**
     * Gets the value of the informationSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationSource }
     * 
     * 
     */
    public List<InformationSource> getInformationSource() {
        if (informationSource == null) {
            informationSource = new ArrayList<InformationSource>();
        }
        return this.informationSource;
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
     * Gets the value of the observationPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observationPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservationPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxBusinessCenterDateTime }
     * 
     * 
     */
    public List<FxBusinessCenterDateTime> getObservationPoint() {
        if (observationPoint == null) {
            observationPoint = new ArrayList<FxBusinessCenterDateTime>();
        }
        return this.observationPoint;
    }

}
