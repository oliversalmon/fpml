
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
 * <p>Java class for NonpublicExecutionReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonpublicExecutionReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CorrectableRequestMessage">
 *       &lt;sequence>
 *         &lt;element name="asOfDate" type="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedDate" minOccurs="0"/>
 *         &lt;element name="asOfTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PortfolioReferenceBase.model" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="originatingEvent" type="{http://www.fpml.org/FpML-5/recordkeeping}OriginatingEvent" minOccurs="0"/>
 *             &lt;element name="trade" type="{http://www.fpml.org/FpML-5/recordkeeping}Trade"/>
 *             &lt;element name="tradingEvent" type="{http://www.fpml.org/FpML-5/recordkeeping}TradingEventSummary" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PostTradeEventsBase.model"/>
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}ChangeEventsBase.model"/>
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}OptionsEventsBase.model"/>
 *           &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}additionalEvent"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}EventValuation.model" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PartiesAndAccounts.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonpublicExecutionReport", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "asOfDate",
    "asOfTime",
    "portfolioReference",
    "originatingEvent",
    "trade",
    "tradingEvent",
    "amendment",
    "increase",
    "terminatingEvent",
    "termination",
    "novation",
    "withdrawal",
    "change",
    "optionExercise",
    "optionExpiry",
    "optionEvent",
    "additionalEvent",
    "quote",
    "party",
    "account"
})
public class NonpublicExecutionReport
    extends CorrectableRequestMessage
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedDate asOfDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar asOfTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PortfolioReferenceBase portfolioReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected OriginatingEvent originatingEvent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Trade trade;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<TradingEventSummary> tradingEvent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TradeAmendmentContent amendment;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TradeNotionalChange increase;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TerminatingEvent terminatingEvent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TradeNotionalChange termination;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TradeNovationContent novation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Withdrawal withdrawal;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TradeChangeContent change;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected OptionExercise optionExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<OptionExpiry> optionExpiry;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected OptionEvent optionEvent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdditionalEvent additionalEvent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<BasicQuotation> quote;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Party> party;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Account> account;

    /**
     * Gets the value of the asOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getAsOfDate() {
        return asOfDate;
    }

    /**
     * Sets the value of the asOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setAsOfDate(IdentifiedDate value) {
        this.asOfDate = value;
    }

    /**
     * Gets the value of the asOfTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfTime() {
        return asOfTime;
    }

    /**
     * Sets the value of the asOfTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfTime(XMLGregorianCalendar value) {
        this.asOfTime = value;
    }

    /**
     * Gets the value of the portfolioReference property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioReferenceBase }
     *     
     */
    public PortfolioReferenceBase getPortfolioReference() {
        return portfolioReference;
    }

    /**
     * Sets the value of the portfolioReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioReferenceBase }
     *     
     */
    public void setPortfolioReference(PortfolioReferenceBase value) {
        this.portfolioReference = value;
    }

    /**
     * Gets the value of the originatingEvent property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatingEvent }
     *     
     */
    public OriginatingEvent getOriginatingEvent() {
        return originatingEvent;
    }

    /**
     * Sets the value of the originatingEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatingEvent }
     *     
     */
    public void setOriginatingEvent(OriginatingEvent value) {
        this.originatingEvent = value;
    }

    /**
     * Gets the value of the trade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getTrade() {
        return trade;
    }

    /**
     * Sets the value of the trade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setTrade(Trade value) {
        this.trade = value;
    }

    /**
     * Gets the value of the tradingEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingEventSummary }
     * 
     * 
     */
    public List<TradingEventSummary> getTradingEvent() {
        if (tradingEvent == null) {
            tradingEvent = new ArrayList<TradingEventSummary>();
        }
        return this.tradingEvent;
    }

    /**
     * Gets the value of the amendment property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAmendmentContent }
     *     
     */
    public TradeAmendmentContent getAmendment() {
        return amendment;
    }

    /**
     * Sets the value of the amendment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAmendmentContent }
     *     
     */
    public void setAmendment(TradeAmendmentContent value) {
        this.amendment = value;
    }

    /**
     * Gets the value of the increase property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNotionalChange }
     *     
     */
    public TradeNotionalChange getIncrease() {
        return increase;
    }

    /**
     * Sets the value of the increase property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNotionalChange }
     *     
     */
    public void setIncrease(TradeNotionalChange value) {
        this.increase = value;
    }

    /**
     * Gets the value of the terminatingEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TerminatingEvent }
     *     
     */
    public TerminatingEvent getTerminatingEvent() {
        return terminatingEvent;
    }

    /**
     * Sets the value of the terminatingEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminatingEvent }
     *     
     */
    public void setTerminatingEvent(TerminatingEvent value) {
        this.terminatingEvent = value;
    }

    /**
     * Gets the value of the termination property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNotionalChange }
     *     
     */
    public TradeNotionalChange getTermination() {
        return termination;
    }

    /**
     * Sets the value of the termination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNotionalChange }
     *     
     */
    public void setTermination(TradeNotionalChange value) {
        this.termination = value;
    }

    /**
     * Gets the value of the novation property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNovationContent }
     *     
     */
    public TradeNovationContent getNovation() {
        return novation;
    }

    /**
     * Sets the value of the novation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNovationContent }
     *     
     */
    public void setNovation(TradeNovationContent value) {
        this.novation = value;
    }

    /**
     * Gets the value of the withdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link Withdrawal }
     *     
     */
    public Withdrawal getWithdrawal() {
        return withdrawal;
    }

    /**
     * Sets the value of the withdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Withdrawal }
     *     
     */
    public void setWithdrawal(Withdrawal value) {
        this.withdrawal = value;
    }

    /**
     * Gets the value of the change property.
     * 
     * @return
     *     possible object is
     *     {@link TradeChangeContent }
     *     
     */
    public TradeChangeContent getChange() {
        return change;
    }

    /**
     * Sets the value of the change property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeChangeContent }
     *     
     */
    public void setChange(TradeChangeContent value) {
        this.change = value;
    }

    /**
     * Gets the value of the optionExercise property.
     * 
     * @return
     *     possible object is
     *     {@link OptionExercise }
     *     
     */
    public OptionExercise getOptionExercise() {
        return optionExercise;
    }

    /**
     * Sets the value of the optionExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionExercise }
     *     
     */
    public void setOptionExercise(OptionExercise value) {
        this.optionExercise = value;
    }

    /**
     * Gets the value of the optionExpiry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionExpiry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionExpiry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionExpiry }
     * 
     * 
     */
    public List<OptionExpiry> getOptionExpiry() {
        if (optionExpiry == null) {
            optionExpiry = new ArrayList<OptionExpiry>();
        }
        return this.optionExpiry;
    }

    /**
     * Gets the value of the optionEvent property.
     * 
     * @return
     *     possible object is
     *     {@link OptionEvent }
     *     
     */
    public OptionEvent getOptionEvent() {
        return optionEvent;
    }

    /**
     * Sets the value of the optionEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionEvent }
     *     
     */
    public void setOptionEvent(OptionEvent value) {
        this.optionEvent = value;
    }

    /**
     * Gets the value of the additionalEvent property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalEvent }
     *     
     */
    public AdditionalEvent getAdditionalEvent() {
        return additionalEvent;
    }

    /**
     * Sets the value of the additionalEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalEvent }
     *     
     */
    public void setAdditionalEvent(AdditionalEvent value) {
        this.additionalEvent = value;
    }

    /**
     * Gets the value of the quote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicQuotation }
     * 
     * 
     */
    public List<BasicQuotation> getQuote() {
        if (quote == null) {
            quote = new ArrayList<BasicQuotation>();
        }
        return this.quote;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account }
     * 
     * 
     */
    public List<Account> getAccount() {
        if (account == null) {
            account = new ArrayList<Account>();
        }
        return this.account;
    }

}
