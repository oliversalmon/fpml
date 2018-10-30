
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
 * A type defining the content model for a message normally generated in response to a RequestValuationReport request.
 * 
 * <p>Java class for ValuationReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValuationReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}NotificationMessage">
 *       &lt;sequence>
 *         &lt;element name="reportIdentification" type="{http://www.fpml.org/FpML-5/recordkeeping}ReportIdentification" minOccurs="0"/>
 *         &lt;element name="reportContents" type="{http://www.fpml.org/FpML-5/recordkeeping}ReportContents" minOccurs="0"/>
 *         &lt;element name="asOfDate" type="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedDate" minOccurs="0"/>
 *         &lt;element name="asOfTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="generatedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PartiesAndAccounts.model"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}market" minOccurs="0"/>
 *         &lt;element name="portfolioValuationItem" type="{http://www.fpml.org/FpML-5/recordkeeping}PortfolioValuationItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tradeValuationItem" type="{http://www.fpml.org/FpML-5/recordkeeping}TradeValuationItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationReport", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "reportIdentification",
    "reportContents",
    "asOfDate",
    "asOfTime",
    "generatedDateTime",
    "party",
    "account",
    "market",
    "portfolioValuationItem",
    "tradeValuationItem"
})
public class ValuationReport
    extends NotificationMessage
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReportIdentification reportIdentification;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReportContents reportContents;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedDate asOfDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar asOfTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generatedDateTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Party> party;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Account> account;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Market market;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PortfolioValuationItem> portfolioValuationItem;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<TradeValuationItem> tradeValuationItem;

    /**
     * Gets the value of the reportIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ReportIdentification }
     *     
     */
    public ReportIdentification getReportIdentification() {
        return reportIdentification;
    }

    /**
     * Sets the value of the reportIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportIdentification }
     *     
     */
    public void setReportIdentification(ReportIdentification value) {
        this.reportIdentification = value;
    }

    /**
     * Gets the value of the reportContents property.
     * 
     * @return
     *     possible object is
     *     {@link ReportContents }
     *     
     */
    public ReportContents getReportContents() {
        return reportContents;
    }

    /**
     * Sets the value of the reportContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportContents }
     *     
     */
    public void setReportContents(ReportContents value) {
        this.reportContents = value;
    }

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
     * Gets the value of the generatedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeneratedDateTime() {
        return generatedDateTime;
    }

    /**
     * Sets the value of the generatedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeneratedDateTime(XMLGregorianCalendar value) {
        this.generatedDateTime = value;
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

    /**
     * Gets the value of the market property.
     * 
     * @return
     *     possible object is
     *     {@link Market }
     *     
     */
    public Market getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     * 
     * @param value
     *     allowed object is
     *     {@link Market }
     *     
     */
    public void setMarket(Market value) {
        this.market = value;
    }

    /**
     * Gets the value of the portfolioValuationItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portfolioValuationItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortfolioValuationItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortfolioValuationItem }
     * 
     * 
     */
    public List<PortfolioValuationItem> getPortfolioValuationItem() {
        if (portfolioValuationItem == null) {
            portfolioValuationItem = new ArrayList<PortfolioValuationItem>();
        }
        return this.portfolioValuationItem;
    }

    /**
     * Gets the value of the tradeValuationItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeValuationItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeValuationItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeValuationItem }
     * 
     * 
     */
    public List<TradeValuationItem> getTradeValuationItem() {
        if (tradeValuationItem == null) {
            tradeValuationItem = new ArrayList<TradeValuationItem>();
        }
        return this.tradeValuationItem;
    }

}
