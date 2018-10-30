
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonpublicExecutionReportRetracted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonpublicExecutionReportRetracted">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}NonCorrectableRequestMessage">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;choice minOccurs="0">
 *             &lt;sequence>
 *               &lt;element name="originatingEvent" type="{http://www.fpml.org/FpML-5/recordkeeping}OriginatingEvent" minOccurs="0"/>
 *               &lt;element name="trade" type="{http://www.fpml.org/FpML-5/recordkeeping}Trade"/>
 *               &lt;element name="tradingEvent" type="{http://www.fpml.org/FpML-5/recordkeeping}TradingEventSummary" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;/sequence>
 *             &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PostTradeEventsBase.model"/>
 *             &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}ChangeEventsBase.model"/>
 *             &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}OptionsEventsBase.model"/>
 *             &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}additionalEvent"/>
 *           &lt;/choice>
 *           &lt;sequence>
 *             &lt;element name="primaryAssetClass" type="{http://www.fpml.org/FpML-5/recordkeeping}AssetClass" minOccurs="0"/>
 *             &lt;element name="tradeIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyTradeIdentifier" minOccurs="0"/>
 *             &lt;element name="eventIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessEventIdentifier" maxOccurs="2" minOccurs="0"/>
 *             &lt;element name="relatedParty" type="{http://www.fpml.org/FpML-5/recordkeeping}RelatedParty" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PartiesAndAccounts.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonpublicExecutionReportRetracted", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
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
    "primaryAssetClass",
    "tradeIdentifier",
    "eventIdentifier",
    "relatedParty",
    "party",
    "account"
})
public class NonpublicExecutionReportRetracted
    extends NonCorrectableRequestMessage
{

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
    protected AssetClass primaryAssetClass;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyTradeIdentifier tradeIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<BusinessEventIdentifier> eventIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<RelatedParty> relatedParty;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Party> party;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Account> account;

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
     * Gets the value of the primaryAssetClass property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClass }
     *     
     */
    public AssetClass getPrimaryAssetClass() {
        return primaryAssetClass;
    }

    /**
     * Sets the value of the primaryAssetClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClass }
     *     
     */
    public void setPrimaryAssetClass(AssetClass value) {
        this.primaryAssetClass = value;
    }

    /**
     * Gets the value of the tradeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public PartyTradeIdentifier getTradeIdentifier() {
        return tradeIdentifier;
    }

    /**
     * Sets the value of the tradeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public void setTradeIdentifier(PartyTradeIdentifier value) {
        this.tradeIdentifier = value;
    }

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
     * Gets the value of the relatedParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedParty }
     * 
     * 
     */
    public List<RelatedParty> getRelatedParty() {
        if (relatedParty == null) {
            relatedParty = new ArrayList<RelatedParty>();
        }
        return this.relatedParty;
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
