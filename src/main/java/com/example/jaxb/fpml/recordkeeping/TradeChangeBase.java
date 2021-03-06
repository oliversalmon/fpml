
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure describing a trade change.
 * 
 * <p>Java class for TradeChangeBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeChangeBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}AbstractEvent">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="tradeIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyTradeIdentifier" maxOccurs="unbounded"/>
 *           &lt;element name="originalTrade" type="{http://www.fpml.org/FpML-5/recordkeeping}Trade"/>
 *         &lt;/choice>
 *         &lt;element name="resultingTrade" type="{http://www.fpml.org/FpML-5/recordkeeping}Trade" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}AgreementAndEffectiveDates.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}TradeAlterationPayment.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeChangeBase", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "tradeIdentifier",
    "originalTrade",
    "resultingTrade",
    "agreementDate",
    "executionDateTime",
    "effectiveDate",
    "payment"
})
@XmlSeeAlso({
    TradeNotionalChange.class
})
public class TradeChangeBase
    extends AbstractEvent
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PartyTradeIdentifier> tradeIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Trade originalTrade;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Trade resultingTrade;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar agreementDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExecutionDateTime executionDateTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Payment> payment;

    /**
     * Gets the value of the tradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeIdentifier }
     * 
     * 
     */
    public List<PartyTradeIdentifier> getTradeIdentifier() {
        if (tradeIdentifier == null) {
            tradeIdentifier = new ArrayList<PartyTradeIdentifier>();
        }
        return this.tradeIdentifier;
    }

    /**
     * Gets the value of the originalTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getOriginalTrade() {
        return originalTrade;
    }

    /**
     * Sets the value of the originalTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setOriginalTrade(Trade value) {
        this.originalTrade = value;
    }

    /**
     * Gets the value of the resultingTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getResultingTrade() {
        return resultingTrade;
    }

    /**
     * Sets the value of the resultingTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setResultingTrade(Trade value) {
        this.resultingTrade = value;
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
     * Gets the value of the payment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getPayment() {
        if (payment == null) {
            payment = new ArrayList<Payment>();
        }
        return this.payment;
    }

}
