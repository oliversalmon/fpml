
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining party-specific additional information that may be recorded against a trade.
 * 
 * <p>Java class for PartyTradeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyTradeInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PartyAndAccountReferences.model"/>
 *         &lt;element name="relatedParty" type="{http://www.fpml.org/FpML-5/recordkeeping}RelatedParty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reportingRole" type="{http://www.fpml.org/FpML-5/recordkeeping}ReportingRole" minOccurs="0"/>
 *         &lt;element name="relatedBusinessUnit" type="{http://www.fpml.org/FpML-5/recordkeeping}RelatedBusinessUnit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedPerson" type="{http://www.fpml.org/FpML-5/recordkeeping}RelatedPerson" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="algorithm" type="{http://www.fpml.org/FpML-5/recordkeeping}Algorithm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isAccountingHedge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.fpml.org/FpML-5/recordkeeping}TradeCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="executionDateTime" type="{http://www.fpml.org/FpML-5/recordkeeping}ExecutionDateTime" minOccurs="0"/>
 *         &lt;element name="timestamps" type="{http://www.fpml.org/FpML-5/recordkeeping}TradeProcessingTimestamps" minOccurs="0"/>
 *         &lt;element name="intentToAllocate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allocationStatus" type="{http://www.fpml.org/FpML-5/recordkeeping}AllocationReportingStatus" minOccurs="0"/>
 *         &lt;element name="intentToClear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="clearingStatus" type="{http://www.fpml.org/FpML-5/recordkeeping}ClearingStatusValue" minOccurs="0"/>
 *         &lt;element name="collateralizationType" type="{http://www.fpml.org/FpML-5/recordkeeping}CollateralizationType" minOccurs="0"/>
 *         &lt;element name="collateralPortfolio" type="{http://www.fpml.org/FpML-5/recordkeeping}PortfolioName" minOccurs="0"/>
 *         &lt;element name="reportingRegime" type="{http://www.fpml.org/FpML-5/recordkeeping}ReportingRegime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="endUserException" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *             &lt;element name="endUserExceptionReason" type="{http://www.fpml.org/FpML-5/recordkeeping}ClearingExceptionReason" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="endUserExceptionDeclaration" type="{http://www.fpml.org/FpML-5/recordkeeping}EndUserExceptionDeclaration" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="nonStandardTerms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="offMarketPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pricingContext" type="{http://www.fpml.org/FpML-5/recordkeeping}PricingContext" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="largeSizeTrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="executionType" type="{http://www.fpml.org/FpML-5/recordkeeping}ExecutionType" minOccurs="0"/>
 *         &lt;element name="executionVenueType" type="{http://www.fpml.org/FpML-5/recordkeeping}ExecutionVenueType" minOccurs="0"/>
 *         &lt;element name="verificationMethod" type="{http://www.fpml.org/FpML-5/recordkeeping}VerificationMethod" minOccurs="0"/>
 *         &lt;element name="confirmationMethod" type="{http://www.fpml.org/FpML-5/recordkeeping}ConfirmationMethod" minOccurs="0"/>
 *         &lt;element name="compressedTrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}TransactionClassification.model" minOccurs="0"/>
 *         &lt;element name="isDisputed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTradeInformation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "partyReference",
    "accountReference",
    "relatedParty",
    "reportingRole",
    "relatedBusinessUnit",
    "relatedPerson",
    "algorithm",
    "isAccountingHedge",
    "category",
    "executionDateTime",
    "timestamps",
    "intentToAllocate",
    "allocationStatus",
    "intentToClear",
    "clearingStatus",
    "collateralizationType",
    "collateralPortfolio",
    "reportingRegime",
    "endUserException",
    "endUserExceptionReason",
    "endUserExceptionDeclaration",
    "nonStandardTerms",
    "offMarketPrice",
    "pricingContext",
    "largeSizeTrade",
    "executionType",
    "executionVenueType",
    "verificationMethod",
    "confirmationMethod",
    "compressedTrade",
    "isSecuritiesFinancing",
    "otcClassification",
    "tradingWaiver",
    "shortSale",
    "isCommodityHedge",
    "isDisputed"
})
public class PartyTradeInformation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected PartyReference partyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AccountReference accountReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<RelatedParty> relatedParty;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReportingRole reportingRole;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<RelatedBusinessUnit> relatedBusinessUnit;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<RelatedPerson> relatedPerson;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Algorithm> algorithm;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean isAccountingHedge;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<TradeCategory> category;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExecutionDateTime executionDateTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TradeProcessingTimestamps timestamps;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean intentToAllocate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AllocationReportingStatus allocationStatus;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean intentToClear;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ClearingStatusValue clearingStatus;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CollateralizationType collateralizationType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PortfolioName collateralPortfolio;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ReportingRegime> reportingRegime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean endUserException;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ClearingExceptionReason endUserExceptionReason;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EndUserExceptionDeclaration endUserExceptionDeclaration;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean nonStandardTerms;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean offMarketPrice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PricingContext> pricingContext;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean largeSizeTrade;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExecutionType executionType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExecutionVenueType executionVenueType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected VerificationMethod verificationMethod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ConfirmationMethod confirmationMethod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean compressedTrade;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean isSecuritiesFinancing;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<OtcClassification> otcClassification;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<TradingWaiver> tradingWaiver;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ShortSale shortSale;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean isCommodityHedge;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean isDisputed;

    /**
     * Gets the value of the partyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPartyReference() {
        return partyReference;
    }

    /**
     * Sets the value of the partyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPartyReference(PartyReference value) {
        this.partyReference = value;
    }

    /**
     * Gets the value of the accountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getAccountReference() {
        return accountReference;
    }

    /**
     * Sets the value of the accountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setAccountReference(AccountReference value) {
        this.accountReference = value;
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
     * Gets the value of the reportingRole property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingRole }
     *     
     */
    public ReportingRole getReportingRole() {
        return reportingRole;
    }

    /**
     * Sets the value of the reportingRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingRole }
     *     
     */
    public void setReportingRole(ReportingRole value) {
        this.reportingRole = value;
    }

    /**
     * Gets the value of the relatedBusinessUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedBusinessUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedBusinessUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedBusinessUnit }
     * 
     * 
     */
    public List<RelatedBusinessUnit> getRelatedBusinessUnit() {
        if (relatedBusinessUnit == null) {
            relatedBusinessUnit = new ArrayList<RelatedBusinessUnit>();
        }
        return this.relatedBusinessUnit;
    }

    /**
     * Gets the value of the relatedPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedPerson }
     * 
     * 
     */
    public List<RelatedPerson> getRelatedPerson() {
        if (relatedPerson == null) {
            relatedPerson = new ArrayList<RelatedPerson>();
        }
        return this.relatedPerson;
    }

    /**
     * Gets the value of the algorithm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the algorithm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlgorithm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm }
     * 
     * 
     */
    public List<Algorithm> getAlgorithm() {
        if (algorithm == null) {
            algorithm = new ArrayList<Algorithm>();
        }
        return this.algorithm;
    }

    /**
     * Gets the value of the isAccountingHedge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAccountingHedge() {
        return isAccountingHedge;
    }

    /**
     * Sets the value of the isAccountingHedge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAccountingHedge(Boolean value) {
        this.isAccountingHedge = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeCategory }
     * 
     * 
     */
    public List<TradeCategory> getCategory() {
        if (category == null) {
            category = new ArrayList<TradeCategory>();
        }
        return this.category;
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
     * Gets the value of the timestamps property.
     * 
     * @return
     *     possible object is
     *     {@link TradeProcessingTimestamps }
     *     
     */
    public TradeProcessingTimestamps getTimestamps() {
        return timestamps;
    }

    /**
     * Sets the value of the timestamps property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeProcessingTimestamps }
     *     
     */
    public void setTimestamps(TradeProcessingTimestamps value) {
        this.timestamps = value;
    }

    /**
     * Gets the value of the intentToAllocate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntentToAllocate() {
        return intentToAllocate;
    }

    /**
     * Sets the value of the intentToAllocate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntentToAllocate(Boolean value) {
        this.intentToAllocate = value;
    }

    /**
     * Gets the value of the allocationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationReportingStatus }
     *     
     */
    public AllocationReportingStatus getAllocationStatus() {
        return allocationStatus;
    }

    /**
     * Sets the value of the allocationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationReportingStatus }
     *     
     */
    public void setAllocationStatus(AllocationReportingStatus value) {
        this.allocationStatus = value;
    }

    /**
     * Gets the value of the intentToClear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntentToClear() {
        return intentToClear;
    }

    /**
     * Sets the value of the intentToClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntentToClear(Boolean value) {
        this.intentToClear = value;
    }

    /**
     * Gets the value of the clearingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingStatusValue }
     *     
     */
    public ClearingStatusValue getClearingStatus() {
        return clearingStatus;
    }

    /**
     * Sets the value of the clearingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingStatusValue }
     *     
     */
    public void setClearingStatus(ClearingStatusValue value) {
        this.clearingStatus = value;
    }

    /**
     * Gets the value of the collateralizationType property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralizationType }
     *     
     */
    public CollateralizationType getCollateralizationType() {
        return collateralizationType;
    }

    /**
     * Sets the value of the collateralizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralizationType }
     *     
     */
    public void setCollateralizationType(CollateralizationType value) {
        this.collateralizationType = value;
    }

    /**
     * Gets the value of the collateralPortfolio property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioName }
     *     
     */
    public PortfolioName getCollateralPortfolio() {
        return collateralPortfolio;
    }

    /**
     * Sets the value of the collateralPortfolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioName }
     *     
     */
    public void setCollateralPortfolio(PortfolioName value) {
        this.collateralPortfolio = value;
    }

    /**
     * Gets the value of the reportingRegime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportingRegime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportingRegime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingRegime }
     * 
     * 
     */
    public List<ReportingRegime> getReportingRegime() {
        if (reportingRegime == null) {
            reportingRegime = new ArrayList<ReportingRegime>();
        }
        return this.reportingRegime;
    }

    /**
     * Gets the value of the endUserException property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndUserException() {
        return endUserException;
    }

    /**
     * Sets the value of the endUserException property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndUserException(Boolean value) {
        this.endUserException = value;
    }

    /**
     * Gets the value of the endUserExceptionReason property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingExceptionReason }
     *     
     */
    public ClearingExceptionReason getEndUserExceptionReason() {
        return endUserExceptionReason;
    }

    /**
     * Sets the value of the endUserExceptionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingExceptionReason }
     *     
     */
    public void setEndUserExceptionReason(ClearingExceptionReason value) {
        this.endUserExceptionReason = value;
    }

    /**
     * Gets the value of the endUserExceptionDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link EndUserExceptionDeclaration }
     *     
     */
    public EndUserExceptionDeclaration getEndUserExceptionDeclaration() {
        return endUserExceptionDeclaration;
    }

    /**
     * Sets the value of the endUserExceptionDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndUserExceptionDeclaration }
     *     
     */
    public void setEndUserExceptionDeclaration(EndUserExceptionDeclaration value) {
        this.endUserExceptionDeclaration = value;
    }

    /**
     * Gets the value of the nonStandardTerms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonStandardTerms() {
        return nonStandardTerms;
    }

    /**
     * Sets the value of the nonStandardTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonStandardTerms(Boolean value) {
        this.nonStandardTerms = value;
    }

    /**
     * Gets the value of the offMarketPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffMarketPrice() {
        return offMarketPrice;
    }

    /**
     * Sets the value of the offMarketPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffMarketPrice(Boolean value) {
        this.offMarketPrice = value;
    }

    /**
     * Gets the value of the pricingContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingContext }
     * 
     * 
     */
    public List<PricingContext> getPricingContext() {
        if (pricingContext == null) {
            pricingContext = new ArrayList<PricingContext>();
        }
        return this.pricingContext;
    }

    /**
     * Gets the value of the largeSizeTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLargeSizeTrade() {
        return largeSizeTrade;
    }

    /**
     * Sets the value of the largeSizeTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLargeSizeTrade(Boolean value) {
        this.largeSizeTrade = value;
    }

    /**
     * Gets the value of the executionType property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionType }
     *     
     */
    public ExecutionType getExecutionType() {
        return executionType;
    }

    /**
     * Sets the value of the executionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionType }
     *     
     */
    public void setExecutionType(ExecutionType value) {
        this.executionType = value;
    }

    /**
     * Gets the value of the executionVenueType property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutionVenueType }
     *     
     */
    public ExecutionVenueType getExecutionVenueType() {
        return executionVenueType;
    }

    /**
     * Sets the value of the executionVenueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionVenueType }
     *     
     */
    public void setExecutionVenueType(ExecutionVenueType value) {
        this.executionVenueType = value;
    }

    /**
     * Gets the value of the verificationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationMethod }
     *     
     */
    public VerificationMethod getVerificationMethod() {
        return verificationMethod;
    }

    /**
     * Sets the value of the verificationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationMethod }
     *     
     */
    public void setVerificationMethod(VerificationMethod value) {
        this.verificationMethod = value;
    }

    /**
     * Gets the value of the confirmationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmationMethod }
     *     
     */
    public ConfirmationMethod getConfirmationMethod() {
        return confirmationMethod;
    }

    /**
     * Sets the value of the confirmationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmationMethod }
     *     
     */
    public void setConfirmationMethod(ConfirmationMethod value) {
        this.confirmationMethod = value;
    }

    /**
     * Gets the value of the compressedTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompressedTrade() {
        return compressedTrade;
    }

    /**
     * Sets the value of the compressedTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompressedTrade(Boolean value) {
        this.compressedTrade = value;
    }

    /**
     * Gets the value of the isSecuritiesFinancing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSecuritiesFinancing() {
        return isSecuritiesFinancing;
    }

    /**
     * Sets the value of the isSecuritiesFinancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSecuritiesFinancing(Boolean value) {
        this.isSecuritiesFinancing = value;
    }

    /**
     * Gets the value of the otcClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otcClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtcClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtcClassification }
     * 
     * 
     */
    public List<OtcClassification> getOtcClassification() {
        if (otcClassification == null) {
            otcClassification = new ArrayList<OtcClassification>();
        }
        return this.otcClassification;
    }

    /**
     * Gets the value of the tradingWaiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradingWaiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradingWaiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradingWaiver }
     * 
     * 
     */
    public List<TradingWaiver> getTradingWaiver() {
        if (tradingWaiver == null) {
            tradingWaiver = new ArrayList<TradingWaiver>();
        }
        return this.tradingWaiver;
    }

    /**
     * Gets the value of the shortSale property.
     * 
     * @return
     *     possible object is
     *     {@link ShortSale }
     *     
     */
    public ShortSale getShortSale() {
        return shortSale;
    }

    /**
     * Sets the value of the shortSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortSale }
     *     
     */
    public void setShortSale(ShortSale value) {
        this.shortSale = value;
    }

    /**
     * Gets the value of the isCommodityHedge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCommodityHedge() {
        return isCommodityHedge;
    }

    /**
     * Sets the value of the isCommodityHedge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCommodityHedge(Boolean value) {
        this.isCommodityHedge = value;
    }

    /**
     * Gets the value of the isDisputed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisputed() {
        return isDisputed;
    }

    /**
     * Sets the value of the isDisputed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisputed(Boolean value) {
        this.isDisputed = value;
    }

}
