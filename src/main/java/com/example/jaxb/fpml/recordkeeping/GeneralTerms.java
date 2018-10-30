
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralTerms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralTerms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="effectiveDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableDate2"/>
 *         &lt;element name="scheduledTerminationDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableDate2"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BuyerSeller.model"/>
 *         &lt;element name="dateAdjustments" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessDayAdjustments" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="referenceInformation" type="{http://www.fpml.org/FpML-5/recordkeeping}ReferenceInformation"/>
 *           &lt;element name="indexReferenceInformation" type="{http://www.fpml.org/FpML-5/recordkeeping}IndexReferenceInformation"/>
 *           &lt;element name="basketReferenceInformation" type="{http://www.fpml.org/FpML-5/recordkeeping}BasketReferenceInformation"/>
 *         &lt;/choice>
 *         &lt;element name="additionalTerm" type="{http://www.fpml.org/FpML-5/recordkeeping}AdditionalTerm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="substitution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="modifiedEquityDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralTerms", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "effectiveDate",
    "scheduledTerminationDate",
    "buyerPartyReference",
    "buyerAccountReference",
    "sellerPartyReference",
    "sellerAccountReference",
    "dateAdjustments",
    "referenceInformation",
    "indexReferenceInformation",
    "basketReferenceInformation",
    "additionalTerm",
    "substitution",
    "modifiedEquityDelivery"
})
public class GeneralTerms {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected AdjustableDate2 effectiveDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected AdjustableDate2 scheduledTerminationDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected PartyReference buyerPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AccountReference buyerAccountReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected PartyReference sellerPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AccountReference sellerAccountReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessDayAdjustments dateAdjustments;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReferenceInformation referenceInformation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IndexReferenceInformation indexReferenceInformation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BasketReferenceInformation basketReferenceInformation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<AdditionalTerm> additionalTerm;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean substitution;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean modifiedEquityDelivery;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate2 }
     *     
     */
    public AdjustableDate2 getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate2 }
     *     
     */
    public void setEffectiveDate(AdjustableDate2 value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the scheduledTerminationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate2 }
     *     
     */
    public AdjustableDate2 getScheduledTerminationDate() {
        return scheduledTerminationDate;
    }

    /**
     * Sets the value of the scheduledTerminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate2 }
     *     
     */
    public void setScheduledTerminationDate(AdjustableDate2 value) {
        this.scheduledTerminationDate = value;
    }

    /**
     * Gets the value of the buyerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBuyerPartyReference() {
        return buyerPartyReference;
    }

    /**
     * Sets the value of the buyerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBuyerPartyReference(PartyReference value) {
        this.buyerPartyReference = value;
    }

    /**
     * Gets the value of the buyerAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getBuyerAccountReference() {
        return buyerAccountReference;
    }

    /**
     * Sets the value of the buyerAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setBuyerAccountReference(AccountReference value) {
        this.buyerAccountReference = value;
    }

    /**
     * Gets the value of the sellerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getSellerPartyReference() {
        return sellerPartyReference;
    }

    /**
     * Sets the value of the sellerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setSellerPartyReference(PartyReference value) {
        this.sellerPartyReference = value;
    }

    /**
     * Gets the value of the sellerAccountReference property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReference }
     *     
     */
    public AccountReference getSellerAccountReference() {
        return sellerAccountReference;
    }

    /**
     * Sets the value of the sellerAccountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReference }
     *     
     */
    public void setSellerAccountReference(AccountReference value) {
        this.sellerAccountReference = value;
    }

    /**
     * Gets the value of the dateAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public BusinessDayAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    /**
     * Sets the value of the dateAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayAdjustments }
     *     
     */
    public void setDateAdjustments(BusinessDayAdjustments value) {
        this.dateAdjustments = value;
    }

    /**
     * Gets the value of the referenceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformation }
     *     
     */
    public ReferenceInformation getReferenceInformation() {
        return referenceInformation;
    }

    /**
     * Sets the value of the referenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformation }
     *     
     */
    public void setReferenceInformation(ReferenceInformation value) {
        this.referenceInformation = value;
    }

    /**
     * Gets the value of the indexReferenceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link IndexReferenceInformation }
     *     
     */
    public IndexReferenceInformation getIndexReferenceInformation() {
        return indexReferenceInformation;
    }

    /**
     * Sets the value of the indexReferenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexReferenceInformation }
     *     
     */
    public void setIndexReferenceInformation(IndexReferenceInformation value) {
        this.indexReferenceInformation = value;
    }

    /**
     * Gets the value of the basketReferenceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BasketReferenceInformation }
     *     
     */
    public BasketReferenceInformation getBasketReferenceInformation() {
        return basketReferenceInformation;
    }

    /**
     * Sets the value of the basketReferenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketReferenceInformation }
     *     
     */
    public void setBasketReferenceInformation(BasketReferenceInformation value) {
        this.basketReferenceInformation = value;
    }

    /**
     * Gets the value of the additionalTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalTerm }
     * 
     * 
     */
    public List<AdditionalTerm> getAdditionalTerm() {
        if (additionalTerm == null) {
            additionalTerm = new ArrayList<AdditionalTerm>();
        }
        return this.additionalTerm;
    }

    /**
     * Gets the value of the substitution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubstitution() {
        return substitution;
    }

    /**
     * Sets the value of the substitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubstitution(Boolean value) {
        this.substitution = value;
    }

    /**
     * Gets the value of the modifiedEquityDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifiedEquityDelivery() {
        return modifiedEquityDelivery;
    }

    /**
     * Sets the value of the modifiedEquityDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifiedEquityDelivery(Boolean value) {
        this.modifiedEquityDelivery = value;
    }

}
