
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type for defining how and when an equity option is to be valued.
 * 
 * <p>Java class for EquityValuation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityValuation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="valuationDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableDateOrRelativeDateSequence"/>
 *           &lt;element name="valuationDates" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableRelativeOrPeriodicDates"/>
 *         &lt;/choice>
 *         &lt;element name="valuationTimeType" type="{http://www.fpml.org/FpML-5/recordkeeping}TimeTypeEnum" minOccurs="0"/>
 *         &lt;element name="valuationTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="futuresPriceValuation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="optionsPriceValuation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
 *         &lt;element name="numberOfValuationDates" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="dividendValuationDates" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableRelativeOrPeriodicDates" minOccurs="0"/>
 *         &lt;element name="fPVFinalPriceElectionFallback" type="{http://www.fpml.org/FpML-5/recordkeeping}FPVFinalPriceElectionFallbackEnum" minOccurs="0"/>
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
@XmlType(name = "EquityValuation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "valuationDate",
    "valuationDates",
    "valuationTimeType",
    "valuationTime",
    "futuresPriceValuation",
    "optionsPriceValuation",
    "numberOfValuationDates",
    "dividendValuationDates",
    "fpvFinalPriceElectionFallback"
})
public class EquityValuation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableDateOrRelativeDateSequence valuationDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableRelativeOrPeriodicDates valuationDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected TimeTypeEnum valuationTimeType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenterTime valuationTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean futuresPriceValuation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean optionsPriceValuation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfValuationDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableRelativeOrPeriodicDates dividendValuationDates;
    @XmlElement(name = "fPVFinalPriceElectionFallback", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected FPVFinalPriceElectionFallbackEnum fpvFinalPriceElectionFallback;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the valuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDateOrRelativeDateSequence }
     *     
     */
    public AdjustableDateOrRelativeDateSequence getValuationDate() {
        return valuationDate;
    }

    /**
     * Sets the value of the valuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDateOrRelativeDateSequence }
     *     
     */
    public void setValuationDate(AdjustableDateOrRelativeDateSequence value) {
        this.valuationDate = value;
    }

    /**
     * Gets the value of the valuationDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableRelativeOrPeriodicDates }
     *     
     */
    public AdjustableRelativeOrPeriodicDates getValuationDates() {
        return valuationDates;
    }

    /**
     * Sets the value of the valuationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableRelativeOrPeriodicDates }
     *     
     */
    public void setValuationDates(AdjustableRelativeOrPeriodicDates value) {
        this.valuationDates = value;
    }

    /**
     * Gets the value of the valuationTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link TimeTypeEnum }
     *     
     */
    public TimeTypeEnum getValuationTimeType() {
        return valuationTimeType;
    }

    /**
     * Sets the value of the valuationTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTypeEnum }
     *     
     */
    public void setValuationTimeType(TimeTypeEnum value) {
        this.valuationTimeType = value;
    }

    /**
     * Gets the value of the valuationTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getValuationTime() {
        return valuationTime;
    }

    /**
     * Sets the value of the valuationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setValuationTime(BusinessCenterTime value) {
        this.valuationTime = value;
    }

    /**
     * Gets the value of the futuresPriceValuation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuturesPriceValuation() {
        return futuresPriceValuation;
    }

    /**
     * Sets the value of the futuresPriceValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuturesPriceValuation(Boolean value) {
        this.futuresPriceValuation = value;
    }

    /**
     * Gets the value of the optionsPriceValuation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsPriceValuation() {
        return optionsPriceValuation;
    }

    /**
     * Sets the value of the optionsPriceValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsPriceValuation(Boolean value) {
        this.optionsPriceValuation = value;
    }

    /**
     * Gets the value of the numberOfValuationDates property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfValuationDates() {
        return numberOfValuationDates;
    }

    /**
     * Sets the value of the numberOfValuationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfValuationDates(BigInteger value) {
        this.numberOfValuationDates = value;
    }

    /**
     * Gets the value of the dividendValuationDates property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableRelativeOrPeriodicDates }
     *     
     */
    public AdjustableRelativeOrPeriodicDates getDividendValuationDates() {
        return dividendValuationDates;
    }

    /**
     * Sets the value of the dividendValuationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableRelativeOrPeriodicDates }
     *     
     */
    public void setDividendValuationDates(AdjustableRelativeOrPeriodicDates value) {
        this.dividendValuationDates = value;
    }

    /**
     * Gets the value of the fpvFinalPriceElectionFallback property.
     * 
     * @return
     *     possible object is
     *     {@link FPVFinalPriceElectionFallbackEnum }
     *     
     */
    public FPVFinalPriceElectionFallbackEnum getFPVFinalPriceElectionFallback() {
        return fpvFinalPriceElectionFallback;
    }

    /**
     * Sets the value of the fpvFinalPriceElectionFallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link FPVFinalPriceElectionFallbackEnum }
     *     
     */
    public void setFPVFinalPriceElectionFallback(FPVFinalPriceElectionFallbackEnum value) {
        this.fpvFinalPriceElectionFallback = value;
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
