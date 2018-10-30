
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type used to describe the scope/contents of a report.
 * 
 * <p>Java class for ReportContents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportContents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;element name="accountReference" type="{http://www.fpml.org/FpML-5/recordkeeping}AccountReference" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.fpml.org/FpML-5/recordkeeping}TradeCategory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="primaryAssetClass" type="{http://www.fpml.org/FpML-5/recordkeeping}AssetClass" minOccurs="0"/>
 *           &lt;element name="secondaryAssetClass" type="{http://www.fpml.org/FpML-5/recordkeeping}AssetClass" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="productType" type="{http://www.fpml.org/FpML-5/recordkeeping}ProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="queryPortfolio" type="{http://www.fpml.org/FpML-5/recordkeeping}QueryPortfolio" minOccurs="0"/>
 *         &lt;element name="reportingRegime" type="{http://www.fpml.org/FpML-5/recordkeeping}ReportingRegimeIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportContents", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "partyReference",
    "accountReference",
    "category",
    "primaryAssetClass",
    "secondaryAssetClass",
    "productType",
    "queryPortfolio",
    "reportingRegime"
})
public class ReportContents {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference partyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AccountReference accountReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<TradeCategory> category;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AssetClass primaryAssetClass;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<AssetClass> secondaryAssetClass;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ProductType> productType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QueryPortfolio queryPortfolio;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ReportingRegimeIdentifier> reportingRegime;

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
     * Gets the value of the secondaryAssetClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryAssetClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryAssetClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetClass }
     * 
     * 
     */
    public List<AssetClass> getSecondaryAssetClass() {
        if (secondaryAssetClass == null) {
            secondaryAssetClass = new ArrayList<AssetClass>();
        }
        return this.secondaryAssetClass;
    }

    /**
     * Gets the value of the productType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductType }
     * 
     * 
     */
    public List<ProductType> getProductType() {
        if (productType == null) {
            productType = new ArrayList<ProductType>();
        }
        return this.productType;
    }

    /**
     * Gets the value of the queryPortfolio property.
     * 
     * @return
     *     possible object is
     *     {@link QueryPortfolio }
     *     
     */
    public QueryPortfolio getQueryPortfolio() {
        return queryPortfolio;
    }

    /**
     * Sets the value of the queryPortfolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryPortfolio }
     *     
     */
    public void setQueryPortfolio(QueryPortfolio value) {
        this.queryPortfolio = value;
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
     * {@link ReportingRegimeIdentifier }
     * 
     * 
     */
    public List<ReportingRegimeIdentifier> getReportingRegime() {
        if (reportingRegime == null) {
            reportingRegime = new ArrayList<ReportingRegimeIdentifier>();
        }
        return this.reportingRegime;
    }

}
