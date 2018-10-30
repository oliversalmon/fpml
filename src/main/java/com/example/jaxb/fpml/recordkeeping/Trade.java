
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type defining an FpML trade.
 * 
 * <p>Java class for Trade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tradeHeader" type="{http://www.fpml.org/FpML-5/recordkeeping}TradeHeader" minOccurs="0"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}product" minOccurs="0"/>
 *         &lt;element name="otherPartyPayment" type="{http://www.fpml.org/FpML-5/recordkeeping}Payment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="brokerPartyReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CalculationAgent.model"/>
 *         &lt;element name="determiningParty" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="barrierDeterminationAgent" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;element name="hedgingParty" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="collateral" type="{http://www.fpml.org/FpML-5/recordkeeping}Collateral" minOccurs="0"/>
 *         &lt;element name="documentation" type="{http://www.fpml.org/FpML-5/recordkeeping}Documentation" minOccurs="0"/>
 *         &lt;element name="governingLaw" type="{http://www.fpml.org/FpML-5/recordkeeping}GoverningLaw" minOccurs="0"/>
 *         &lt;element name="allocations" type="{http://www.fpml.org/FpML-5/recordkeeping}Allocations" maxOccurs="2" minOccurs="0"/>
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
@XmlType(name = "Trade", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "tradeHeader",
    "product",
    "otherPartyPayment",
    "brokerPartyReference",
    "calculationAgent",
    "calculationAgentBusinessCenter",
    "determiningParty",
    "barrierDeterminationAgent",
    "hedgingParty",
    "collateral",
    "documentation",
    "governingLaw",
    "allocations"
})
public class Trade {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TradeHeader tradeHeader;
    @XmlElementRef(name = "product", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends Product> product;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Payment> otherPartyPayment;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PartyReference> brokerPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CalculationAgent calculationAgent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenter calculationAgentBusinessCenter;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PartyReference> determiningParty;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference barrierDeterminationAgent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PartyReference> hedgingParty;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Collateral collateral;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Documentation documentation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected GoverningLaw governingLaw;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Allocations> allocations;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the tradeHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TradeHeader }
     *     
     */
    public TradeHeader getTradeHeader() {
        return tradeHeader;
    }

    /**
     * Sets the value of the tradeHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeHeader }
     *     
     */
    public void setTradeHeader(TradeHeader value) {
        this.tradeHeader = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommodityDigitalOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommoditySwaption }{@code >}
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityPerformanceSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstrumentTradeDetails }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditDefaultSwapOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditDefaultSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link Strategy }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityBasketOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommoditySwap }{@code >}
     *     
     */
    public JAXBElement<? extends Product> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommodityDigitalOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommoditySwaption }{@code >}
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityPerformanceSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstrumentTradeDetails }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditDefaultSwapOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditDefaultSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link Strategy }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityBasketOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommoditySwap }{@code >}
     *     
     */
    public void setProduct(JAXBElement<? extends Product> value) {
        this.product = value;
    }

    /**
     * Gets the value of the otherPartyPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPartyPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPartyPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Payment }
     * 
     * 
     */
    public List<Payment> getOtherPartyPayment() {
        if (otherPartyPayment == null) {
            otherPartyPayment = new ArrayList<Payment>();
        }
        return this.otherPartyPayment;
    }

    /**
     * Gets the value of the brokerPartyReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brokerPartyReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerPartyReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getBrokerPartyReference() {
        if (brokerPartyReference == null) {
            brokerPartyReference = new ArrayList<PartyReference>();
        }
        return this.brokerPartyReference;
    }

    /**
     * Gets the value of the calculationAgent property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationAgent }
     *     
     */
    public CalculationAgent getCalculationAgent() {
        return calculationAgent;
    }

    /**
     * Sets the value of the calculationAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationAgent }
     *     
     */
    public void setCalculationAgent(CalculationAgent value) {
        this.calculationAgent = value;
    }

    /**
     * Gets the value of the calculationAgentBusinessCenter property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenter }
     *     
     */
    public BusinessCenter getCalculationAgentBusinessCenter() {
        return calculationAgentBusinessCenter;
    }

    /**
     * Sets the value of the calculationAgentBusinessCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenter }
     *     
     */
    public void setCalculationAgentBusinessCenter(BusinessCenter value) {
        this.calculationAgentBusinessCenter = value;
    }

    /**
     * Gets the value of the determiningParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the determiningParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeterminingParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getDeterminingParty() {
        if (determiningParty == null) {
            determiningParty = new ArrayList<PartyReference>();
        }
        return this.determiningParty;
    }

    /**
     * Gets the value of the barrierDeterminationAgent property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBarrierDeterminationAgent() {
        return barrierDeterminationAgent;
    }

    /**
     * Sets the value of the barrierDeterminationAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBarrierDeterminationAgent(PartyReference value) {
        this.barrierDeterminationAgent = value;
    }

    /**
     * Gets the value of the hedgingParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hedgingParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHedgingParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyReference }
     * 
     * 
     */
    public List<PartyReference> getHedgingParty() {
        if (hedgingParty == null) {
            hedgingParty = new ArrayList<PartyReference>();
        }
        return this.hedgingParty;
    }

    /**
     * Gets the value of the collateral property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral }
     *     
     */
    public Collateral getCollateral() {
        return collateral;
    }

    /**
     * Sets the value of the collateral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral }
     *     
     */
    public void setCollateral(Collateral value) {
        this.collateral = value;
    }

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link Documentation }
     *     
     */
    public Documentation getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentation }
     *     
     */
    public void setDocumentation(Documentation value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the governingLaw property.
     * 
     * @return
     *     possible object is
     *     {@link GoverningLaw }
     *     
     */
    public GoverningLaw getGoverningLaw() {
        return governingLaw;
    }

    /**
     * Sets the value of the governingLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoverningLaw }
     *     
     */
    public void setGoverningLaw(GoverningLaw value) {
        this.governingLaw = value;
    }

    /**
     * Gets the value of the allocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Allocations }
     * 
     * 
     */
    public List<Allocations> getAllocations() {
        if (allocations == null) {
            allocations = new ArrayList<Allocations>();
        }
        return this.allocations;
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
