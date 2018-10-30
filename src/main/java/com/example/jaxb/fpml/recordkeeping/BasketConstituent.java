
package com.example.jaxb.fpml.recordkeeping;

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
 * A type describing each of the constituents of a basket.
 * 
 * <p>Java class for BasketConstituent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasketConstituent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PayerReceiver.model" minOccurs="0"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}underlyingAsset"/>
 *         &lt;element name="constituentWeight" type="{http://www.fpml.org/FpML-5/recordkeeping}ConstituentWeight" minOccurs="0"/>
 *         &lt;element name="underlyerPrice" type="{http://www.fpml.org/FpML-5/recordkeeping}Price" minOccurs="0"/>
 *         &lt;element name="underlyerNotional" type="{http://www.fpml.org/FpML-5/recordkeeping}Money" minOccurs="0"/>
 *         &lt;element name="underlyerSpread" type="{http://www.fpml.org/FpML-5/recordkeeping}SpreadScheduleReference" minOccurs="0"/>
 *         &lt;element name="underlyerFinancing" type="{http://www.fpml.org/FpML-5/recordkeeping}UnderlyerInterestLeg" minOccurs="0"/>
 *         &lt;element name="underlyerLoanRate" type="{http://www.fpml.org/FpML-5/recordkeeping}UnderlyerLoanRate" minOccurs="0"/>
 *         &lt;element name="underlyerCollateral" type="{http://www.fpml.org/FpML-5/recordkeeping}Collateral" minOccurs="0"/>
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
@XmlType(name = "BasketConstituent", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "payerPartyReference",
    "payerAccountReference",
    "receiverPartyReference",
    "receiverAccountReference",
    "underlyingAsset",
    "constituentWeight",
    "underlyerPrice",
    "underlyerNotional",
    "underlyerSpread",
    "underlyerFinancing",
    "underlyerLoanRate",
    "underlyerCollateral"
})
public class BasketConstituent {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference payerPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AccountReference payerAccountReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference receiverPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AccountReference receiverAccountReference;
    @XmlElementRef(name = "underlyingAsset", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class)
    protected JAXBElement<? extends Asset> underlyingAsset;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ConstituentWeight constituentWeight;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Price underlyerPrice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money underlyerNotional;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SpreadScheduleReference underlyerSpread;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected UnderlyerInterestLeg underlyerFinancing;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected UnderlyerLoanRate underlyerLoanRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Collateral underlyerCollateral;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the payerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getPayerPartyReference() {
        return payerPartyReference;
    }

    /**
     * Sets the value of the payerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setPayerPartyReference(PartyReference value) {
        this.payerPartyReference = value;
    }

    /**
     * Gets the value of the payerAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getPayerAccountReference() {
        return payerAccountReference;
    }

    /**
     * Sets the value of the payerAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setPayerAccountReference(AccountReference value) {
        this.payerAccountReference = value;
    }

    /**
     * Gets the value of the receiverPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getReceiverPartyReference() {
        return receiverPartyReference;
    }

    /**
     * Sets the value of the receiverPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setReceiverPartyReference(PartyReference value) {
        this.receiverPartyReference = value;
    }

    /**
     * Gets the value of the receiverAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getReceiverAccountReference() {
        return receiverAccountReference;
    }

    /**
     * Sets the value of the receiverAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setReceiverAccountReference(AccountReference value) {
        this.receiverAccountReference = value;
    }

    /**
     * Gets the value of the underlyingAsset property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MutualFund }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeTradedFund }{@code >}
     *     {@link JAXBElement }{@code <}{@link Future }{@code >}
     *     {@link JAXBElement }{@code <}{@link Mortgage }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquityAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeTradedOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link Index }{@code >}
     *     {@link JAXBElement }{@code <}{@link Loan }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvertibleBond }{@code >}
     *     {@link JAXBElement }{@code <}{@link Basket }{@code >}
     *     {@link JAXBElement }{@code <}{@link Commodity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Asset }{@code >}
     *     {@link JAXBElement }{@code <}{@link Cash }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bond }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeTradedContract }{@code >}
     *     
     */
    public JAXBElement<? extends Asset> getUnderlyingAsset() {
        return underlyingAsset;
    }

    /**
     * Sets the value of the underlyingAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MutualFund }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeTradedFund }{@code >}
     *     {@link JAXBElement }{@code <}{@link Future }{@code >}
     *     {@link JAXBElement }{@code <}{@link Mortgage }{@code >}
     *     {@link JAXBElement }{@code <}{@link EquityAsset }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeTradedOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link Index }{@code >}
     *     {@link JAXBElement }{@code <}{@link Loan }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConvertibleBond }{@code >}
     *     {@link JAXBElement }{@code <}{@link Basket }{@code >}
     *     {@link JAXBElement }{@code <}{@link Commodity }{@code >}
     *     {@link JAXBElement }{@code <}{@link Asset }{@code >}
     *     {@link JAXBElement }{@code <}{@link Cash }{@code >}
     *     {@link JAXBElement }{@code <}{@link Bond }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangeTradedContract }{@code >}
     *     
     */
    public void setUnderlyingAsset(JAXBElement<? extends Asset> value) {
        this.underlyingAsset = value;
    }

    /**
     * Gets the value of the constituentWeight property.
     * 
     * @return
     *     possible object is
     *     {@link ConstituentWeight }
     *     
     */
    public ConstituentWeight getConstituentWeight() {
        return constituentWeight;
    }

    /**
     * Sets the value of the constituentWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstituentWeight }
     *     
     */
    public void setConstituentWeight(ConstituentWeight value) {
        this.constituentWeight = value;
    }

    /**
     * Gets the value of the underlyerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getUnderlyerPrice() {
        return underlyerPrice;
    }

    /**
     * Sets the value of the underlyerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setUnderlyerPrice(Price value) {
        this.underlyerPrice = value;
    }

    /**
     * Gets the value of the underlyerNotional property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getUnderlyerNotional() {
        return underlyerNotional;
    }

    /**
     * Sets the value of the underlyerNotional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setUnderlyerNotional(Money value) {
        this.underlyerNotional = value;
    }

    /**
     * Gets the value of the underlyerSpread property.
     * 
     * @return
     *     possible object is
     *     {@link SpreadScheduleReference }
     *     
     */
    public SpreadScheduleReference getUnderlyerSpread() {
        return underlyerSpread;
    }

    /**
     * Sets the value of the underlyerSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpreadScheduleReference }
     *     
     */
    public void setUnderlyerSpread(SpreadScheduleReference value) {
        this.underlyerSpread = value;
    }

    /**
     * Gets the value of the underlyerFinancing property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyerInterestLeg }
     *     
     */
    public UnderlyerInterestLeg getUnderlyerFinancing() {
        return underlyerFinancing;
    }

    /**
     * Sets the value of the underlyerFinancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyerInterestLeg }
     *     
     */
    public void setUnderlyerFinancing(UnderlyerInterestLeg value) {
        this.underlyerFinancing = value;
    }

    /**
     * Gets the value of the underlyerLoanRate property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyerLoanRate }
     *     
     */
    public UnderlyerLoanRate getUnderlyerLoanRate() {
        return underlyerLoanRate;
    }

    /**
     * Sets the value of the underlyerLoanRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyerLoanRate }
     *     
     */
    public void setUnderlyerLoanRate(UnderlyerLoanRate value) {
        this.underlyerLoanRate = value;
    }

    /**
     * Gets the value of the underlyerCollateral property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral }
     *     
     */
    public Collateral getUnderlyerCollateral() {
        return underlyerCollateral;
    }

    /**
     * Sets the value of the underlyerCollateral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral }
     *     
     */
    public void setUnderlyerCollateral(Collateral value) {
        this.underlyerCollateral = value;
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
