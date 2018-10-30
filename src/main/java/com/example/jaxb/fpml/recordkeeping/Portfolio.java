
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type representing an arbitary grouping of trade references.
 * 
 * <p>Java class for Portfolio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Portfolio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyPortfolioName" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyPortfolioName" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="tradeId" type="{http://www.fpml.org/FpML-5/recordkeeping}TradeId" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="partyTradeIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyTradeIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="portfolio" type="{http://www.fpml.org/FpML-5/recordkeeping}Portfolio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Portfolio", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "partyPortfolioName",
    "tradeId",
    "partyTradeIdentifier",
    "portfolio"
})
@XmlSeeAlso({
    QueryPortfolio.class
})
public class Portfolio {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyPortfolioName partyPortfolioName;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<TradeId> tradeId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PartyTradeIdentifier> partyTradeIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Portfolio> portfolio;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the partyPortfolioName property.
     * 
     * @return
     *     possible object is
     *     {@link PartyPortfolioName }
     *     
     */
    public PartyPortfolioName getPartyPortfolioName() {
        return partyPortfolioName;
    }

    /**
     * Sets the value of the partyPortfolioName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyPortfolioName }
     *     
     */
    public void setPartyPortfolioName(PartyPortfolioName value) {
        this.partyPortfolioName = value;
    }

    /**
     * Gets the value of the tradeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeId }
     * 
     * 
     */
    public List<TradeId> getTradeId() {
        if (tradeId == null) {
            tradeId = new ArrayList<TradeId>();
        }
        return this.tradeId;
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
     * Gets the value of the portfolio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portfolio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortfolio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Portfolio }
     * 
     * 
     */
    public List<Portfolio> getPortfolio() {
        if (portfolio == null) {
            portfolio = new ArrayList<Portfolio>();
        }
        return this.portfolio;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
