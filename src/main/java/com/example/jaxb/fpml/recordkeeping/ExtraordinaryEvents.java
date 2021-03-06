
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Where the underlying is shares, defines market events affecting the issuer of those shares that may require the terms of the transaction to be adjusted.
 * 
 * <p>Java class for ExtraordinaryEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtraordinaryEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mergerEvents" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityCorporateEvents" minOccurs="0"/>
 *         &lt;element name="tenderOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tenderOfferEvents" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityCorporateEvents" minOccurs="0"/>
 *         &lt;element name="compositionOfCombinedConsideration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indexAdjustmentEvents" type="{http://www.fpml.org/FpML-5/recordkeeping}IndexAdjustmentEvents" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="additionalDisruptionEvents" type="{http://www.fpml.org/FpML-5/recordkeeping}AdditionalDisruptionEvents"/>
 *           &lt;element name="failureToDeliver" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
 *         &lt;element name="representations" type="{http://www.fpml.org/FpML-5/recordkeeping}Representations" minOccurs="0"/>
 *         &lt;element name="nationalisationOrInsolvency" type="{http://www.fpml.org/FpML-5/recordkeeping}NationalisationOrInsolvencyOrDelistingEventEnum" minOccurs="0"/>
 *         &lt;element name="delisting" type="{http://www.fpml.org/FpML-5/recordkeeping}NationalisationOrInsolvencyOrDelistingEventEnum" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}ExchangeIdentifier.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraordinaryEvents", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "mergerEvents",
    "tenderOffer",
    "tenderOfferEvents",
    "compositionOfCombinedConsideration",
    "indexAdjustmentEvents",
    "additionalDisruptionEvents",
    "failureToDeliver",
    "representations",
    "nationalisationOrInsolvency",
    "delisting",
    "relatedExchangeId",
    "optionsExchangeId",
    "specifiedExchangeId"
})
public class ExtraordinaryEvents {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EquityCorporateEvents mergerEvents;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean tenderOffer;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EquityCorporateEvents tenderOfferEvents;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean compositionOfCombinedConsideration;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IndexAdjustmentEvents indexAdjustmentEvents;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdditionalDisruptionEvents additionalDisruptionEvents;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean failureToDeliver;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Representations representations;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected NationalisationOrInsolvencyOrDelistingEventEnum nationalisationOrInsolvency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected NationalisationOrInsolvencyOrDelistingEventEnum delisting;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ExchangeId> relatedExchangeId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ExchangeId> optionsExchangeId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ExchangeId> specifiedExchangeId;

    /**
     * Gets the value of the mergerEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EquityCorporateEvents }
     *     
     */
    public EquityCorporateEvents getMergerEvents() {
        return mergerEvents;
    }

    /**
     * Sets the value of the mergerEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityCorporateEvents }
     *     
     */
    public void setMergerEvents(EquityCorporateEvents value) {
        this.mergerEvents = value;
    }

    /**
     * Gets the value of the tenderOffer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTenderOffer() {
        return tenderOffer;
    }

    /**
     * Sets the value of the tenderOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTenderOffer(Boolean value) {
        this.tenderOffer = value;
    }

    /**
     * Gets the value of the tenderOfferEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EquityCorporateEvents }
     *     
     */
    public EquityCorporateEvents getTenderOfferEvents() {
        return tenderOfferEvents;
    }

    /**
     * Sets the value of the tenderOfferEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityCorporateEvents }
     *     
     */
    public void setTenderOfferEvents(EquityCorporateEvents value) {
        this.tenderOfferEvents = value;
    }

    /**
     * Gets the value of the compositionOfCombinedConsideration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompositionOfCombinedConsideration() {
        return compositionOfCombinedConsideration;
    }

    /**
     * Sets the value of the compositionOfCombinedConsideration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompositionOfCombinedConsideration(Boolean value) {
        this.compositionOfCombinedConsideration = value;
    }

    /**
     * Gets the value of the indexAdjustmentEvents property.
     * 
     * @return
     *     possible object is
     *     {@link IndexAdjustmentEvents }
     *     
     */
    public IndexAdjustmentEvents getIndexAdjustmentEvents() {
        return indexAdjustmentEvents;
    }

    /**
     * Sets the value of the indexAdjustmentEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexAdjustmentEvents }
     *     
     */
    public void setIndexAdjustmentEvents(IndexAdjustmentEvents value) {
        this.indexAdjustmentEvents = value;
    }

    /**
     * Gets the value of the additionalDisruptionEvents property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalDisruptionEvents }
     *     
     */
    public AdditionalDisruptionEvents getAdditionalDisruptionEvents() {
        return additionalDisruptionEvents;
    }

    /**
     * Sets the value of the additionalDisruptionEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalDisruptionEvents }
     *     
     */
    public void setAdditionalDisruptionEvents(AdditionalDisruptionEvents value) {
        this.additionalDisruptionEvents = value;
    }

    /**
     * Gets the value of the failureToDeliver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailureToDeliver() {
        return failureToDeliver;
    }

    /**
     * Sets the value of the failureToDeliver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailureToDeliver(Boolean value) {
        this.failureToDeliver = value;
    }

    /**
     * Gets the value of the representations property.
     * 
     * @return
     *     possible object is
     *     {@link Representations }
     *     
     */
    public Representations getRepresentations() {
        return representations;
    }

    /**
     * Sets the value of the representations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Representations }
     *     
     */
    public void setRepresentations(Representations value) {
        this.representations = value;
    }

    /**
     * Gets the value of the nationalisationOrInsolvency property.
     * 
     * @return
     *     possible object is
     *     {@link NationalisationOrInsolvencyOrDelistingEventEnum }
     *     
     */
    public NationalisationOrInsolvencyOrDelistingEventEnum getNationalisationOrInsolvency() {
        return nationalisationOrInsolvency;
    }

    /**
     * Sets the value of the nationalisationOrInsolvency property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalisationOrInsolvencyOrDelistingEventEnum }
     *     
     */
    public void setNationalisationOrInsolvency(NationalisationOrInsolvencyOrDelistingEventEnum value) {
        this.nationalisationOrInsolvency = value;
    }

    /**
     * Gets the value of the delisting property.
     * 
     * @return
     *     possible object is
     *     {@link NationalisationOrInsolvencyOrDelistingEventEnum }
     *     
     */
    public NationalisationOrInsolvencyOrDelistingEventEnum getDelisting() {
        return delisting;
    }

    /**
     * Sets the value of the delisting property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalisationOrInsolvencyOrDelistingEventEnum }
     *     
     */
    public void setDelisting(NationalisationOrInsolvencyOrDelistingEventEnum value) {
        this.delisting = value;
    }

    /**
     * Gets the value of the relatedExchangeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedExchangeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedExchangeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeId }
     * 
     * 
     */
    public List<ExchangeId> getRelatedExchangeId() {
        if (relatedExchangeId == null) {
            relatedExchangeId = new ArrayList<ExchangeId>();
        }
        return this.relatedExchangeId;
    }

    /**
     * Gets the value of the optionsExchangeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionsExchangeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionsExchangeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeId }
     * 
     * 
     */
    public List<ExchangeId> getOptionsExchangeId() {
        if (optionsExchangeId == null) {
            optionsExchangeId = new ArrayList<ExchangeId>();
        }
        return this.optionsExchangeId;
    }

    /**
     * Gets the value of the specifiedExchangeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedExchangeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedExchangeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeId }
     * 
     * 
     */
    public List<ExchangeId> getSpecifiedExchangeId() {
        if (specifiedExchangeId == null) {
            specifiedExchangeId = new ArrayList<ExchangeId>();
        }
        return this.specifiedExchangeId;
    }

}
