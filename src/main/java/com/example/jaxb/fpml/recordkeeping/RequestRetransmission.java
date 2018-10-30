
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A message to request that a message be retransmitted. The original message will typically be a component of a group of messages, such as a portfolio or a report in multiple parts.
 * 
 * <p>Java class for RequestRetransmission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestRetransmission">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}NonCorrectableRequestMessage">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PortfolioReferenceOrReportIdentification.model"/>
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
@XmlType(name = "RequestRetransmission", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "portfolioReference",
    "reportIdentification",
    "party",
    "account"
})
public class RequestRetransmission
    extends NonCorrectableRequestMessage
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PortfolioConstituentReference portfolioReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReportSectionIdentification reportIdentification;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Party> party;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Account> account;

    /**
     * Gets the value of the portfolioReference property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioConstituentReference }
     *     
     */
    public PortfolioConstituentReference getPortfolioReference() {
        return portfolioReference;
    }

    /**
     * Sets the value of the portfolioReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioConstituentReference }
     *     
     */
    public void setPortfolioReference(PortfolioConstituentReference value) {
        this.portfolioReference = value;
    }

    /**
     * Gets the value of the reportIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ReportSectionIdentification }
     *     
     */
    public ReportSectionIdentification getReportIdentification() {
        return reportIdentification;
    }

    /**
     * Sets the value of the reportIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSectionIdentification }
     *     
     */
    public void setReportIdentification(ReportSectionIdentification value) {
        this.reportIdentification = value;
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
