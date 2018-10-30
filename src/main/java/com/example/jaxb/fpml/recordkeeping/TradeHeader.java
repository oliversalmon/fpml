
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining trade related information which is not product specific.
 * 
 * <p>Java class for TradeHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyTradeIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyTradeIdentifier" maxOccurs="unbounded"/>
 *         &lt;element name="partyTradeInformation" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyTradeInformation" maxOccurs="unbounded"/>
 *         &lt;element name="tradeSummary" type="{http://www.fpml.org/FpML-5/recordkeeping}TradeSummary" minOccurs="0"/>
 *         &lt;element name="productSummary" type="{http://www.fpml.org/FpML-5/recordkeeping}ProductSummary" minOccurs="0"/>
 *         &lt;element name="originatingPackage" type="{http://www.fpml.org/FpML-5/recordkeeping}PackageSummary" minOccurs="0"/>
 *         &lt;element name="tradeDate" type="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedDate" minOccurs="0"/>
 *         &lt;element name="clearedDate" type="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeHeader", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "partyTradeIdentifier",
    "partyTradeInformation",
    "tradeSummary",
    "productSummary",
    "originatingPackage",
    "tradeDate",
    "clearedDate"
})
public class TradeHeader {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected List<PartyTradeIdentifier> partyTradeIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected List<PartyTradeInformation> partyTradeInformation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TradeSummary tradeSummary;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ProductSummary productSummary;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PackageSummary originatingPackage;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedDate tradeDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedDate clearedDate;

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
     * {@link PartyTradeInformation }
     * 
     * 
     */
    public List<PartyTradeInformation> getPartyTradeInformation() {
        if (partyTradeInformation == null) {
            partyTradeInformation = new ArrayList<PartyTradeInformation>();
        }
        return this.partyTradeInformation;
    }

    /**
     * Gets the value of the tradeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TradeSummary }
     *     
     */
    public TradeSummary getTradeSummary() {
        return tradeSummary;
    }

    /**
     * Sets the value of the tradeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeSummary }
     *     
     */
    public void setTradeSummary(TradeSummary value) {
        this.tradeSummary = value;
    }

    /**
     * Gets the value of the productSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSummary }
     *     
     */
    public ProductSummary getProductSummary() {
        return productSummary;
    }

    /**
     * Sets the value of the productSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSummary }
     *     
     */
    public void setProductSummary(ProductSummary value) {
        this.productSummary = value;
    }

    /**
     * Gets the value of the originatingPackage property.
     * 
     * @return
     *     possible object is
     *     {@link PackageSummary }
     *     
     */
    public PackageSummary getOriginatingPackage() {
        return originatingPackage;
    }

    /**
     * Sets the value of the originatingPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageSummary }
     *     
     */
    public void setOriginatingPackage(PackageSummary value) {
        this.originatingPackage = value;
    }

    /**
     * Gets the value of the tradeDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getTradeDate() {
        return tradeDate;
    }

    /**
     * Sets the value of the tradeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setTradeDate(IdentifiedDate value) {
        this.tradeDate = value;
    }

    /**
     * Gets the value of the clearedDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getClearedDate() {
        return clearedDate;
    }

    /**
     * Sets the value of the clearedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setClearedDate(IdentifiedDate value) {
        this.clearedDate = value;
    }

}
