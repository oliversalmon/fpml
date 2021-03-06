
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type that records a short form event history of a trade.
 * 
 * <p>Java class for TradingEventSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradingEventSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessEventIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eventType" type="{http://www.fpml.org/FpML-5/recordkeeping}EventType"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}AgreementAndEffectiveDates.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}ReportingNotionalChange.model" minOccurs="0"/>
 *         &lt;element name="payment" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativePayment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingEventSummary", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "eventIdentifier",
    "eventType",
    "agreementDate",
    "executionDateTime",
    "effectiveDate",
    "notionalChange",
    "changeInNotional",
    "changeInNumberOfOptions",
    "changeInQuantity",
    "payment"
})
public class TradingEventSummary {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<BusinessEventIdentifier> eventIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected EventType eventType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar agreementDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExecutionDateTime executionDateTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected NotionalChangeEnum notionalChange;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<MoneyRef> changeInNotional;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<AmountRef> changeInNumberOfOptions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<UnitQuantityRef> changeInQuantity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativePayment payment;

    /**
     * Gets the value of the eventIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessEventIdentifier }
     * 
     * 
     */
    public List<BusinessEventIdentifier> getEventIdentifier() {
        if (eventIdentifier == null) {
            eventIdentifier = new ArrayList<BusinessEventIdentifier>();
        }
        return this.eventIdentifier;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setEventType(EventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the agreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgreementDate() {
        return agreementDate;
    }

    /**
     * Sets the value of the agreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAgreementDate(XMLGregorianCalendar value) {
        this.agreementDate = value;
    }

    /**
     * Gets the value of the executionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionDateTime }
     *     
     */
    public ExecutionDateTime getExecutionDateTime() {
        return executionDateTime;
    }

    /**
     * Sets the value of the executionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionDateTime }
     *     
     */
    public void setExecutionDateTime(ExecutionDateTime value) {
        this.executionDateTime = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the notionalChange property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalChangeEnum }
     *     
     */
    public NotionalChangeEnum getNotionalChange() {
        return notionalChange;
    }

    /**
     * Sets the value of the notionalChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalChangeEnum }
     *     
     */
    public void setNotionalChange(NotionalChangeEnum value) {
        this.notionalChange = value;
    }

    /**
     * Gets the value of the changeInNotional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeInNotional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeInNotional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MoneyRef }
     * 
     * 
     */
    public List<MoneyRef> getChangeInNotional() {
        if (changeInNotional == null) {
            changeInNotional = new ArrayList<MoneyRef>();
        }
        return this.changeInNotional;
    }

    /**
     * Gets the value of the changeInNumberOfOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeInNumberOfOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeInNumberOfOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountRef }
     * 
     * 
     */
    public List<AmountRef> getChangeInNumberOfOptions() {
        if (changeInNumberOfOptions == null) {
            changeInNumberOfOptions = new ArrayList<AmountRef>();
        }
        return this.changeInNumberOfOptions;
    }

    /**
     * Gets the value of the changeInQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeInQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeInQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitQuantityRef }
     * 
     * 
     */
    public List<UnitQuantityRef> getChangeInQuantity() {
        if (changeInQuantity == null) {
            changeInQuantity = new ArrayList<UnitQuantityRef>();
        }
        return this.changeInQuantity;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativePayment }
     *     
     */
    public NonNegativePayment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativePayment }
     *     
     */
    public void setPayment(NonNegativePayment value) {
        this.payment = value;
    }

}
