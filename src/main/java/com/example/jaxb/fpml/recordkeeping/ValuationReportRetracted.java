
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the content model for a message that retracts a valuation report. This says that the most recently supplied valuation is erroneous and a previous value should be used.
 * 
 * <p>Java class for ValuationReportRetracted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValuationReportRetracted">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}NotificationMessage">
 *       &lt;sequence>
 *         &lt;element name="reportIdentification" type="{http://www.fpml.org/FpML-5/recordkeeping}ReportIdentification" minOccurs="0"/>
 *         &lt;element name="reportContents" type="{http://www.fpml.org/FpML-5/recordkeeping}ReportContents" minOccurs="0"/>
 *         &lt;element name="asOfDate" type="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedDate" minOccurs="0"/>
 *         &lt;element name="partyTradeIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyTradeIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyTradeInformation" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyTradeInformationSimple" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ValuationReportRetracted", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "reportIdentification",
    "reportContents",
    "asOfDate",
    "partyTradeIdentifier",
    "partyTradeInformation",
    "party",
    "account"
})
public class ValuationReportRetracted
    extends NotificationMessage
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReportIdentification reportIdentification;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReportContents reportContents;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedDate asOfDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PartyTradeIdentifier> partyTradeIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PartyTradeInformationSimple> partyTradeInformation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Party> party;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Account> account;

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
     * Gets the value of the partyTradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyTradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeIdentifier }
     * 
     * 
     */
    public List<PartyTradeIdentifier> getPartyTradeIdentifier() {
        if (partyTradeIdentifier == null) {
            partyTradeIdentifier = new ArrayList<PartyTradeIdentifier>();
        }
        return this.partyTradeIdentifier;
    }

    /**
     * Gets the value of the partyTradeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyTradeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyTradeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeInformationSimple }
     * 
     * 
     */
    public List<PartyTradeInformationSimple> getPartyTradeInformation() {
        if (partyTradeInformation == null) {
            partyTradeInformation = new ArrayList<PartyTradeInformationSimple>();
        }
        return this.partyTradeInformation;
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
