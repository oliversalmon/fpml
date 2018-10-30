
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Descibes the averaging period properties for an asian option.
 * 
 * <p>Java class for FxAsianFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAsianFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryRateSource" type="{http://www.fpml.org/FpML-5/recordkeeping}InformationSource" minOccurs="0"/>
 *         &lt;element name="secondaryRateSource" type="{http://www.fpml.org/FpML-5/recordkeeping}InformationSource" minOccurs="0"/>
 *         &lt;element name="fixingTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="observationSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAverageRateObservationSchedule" minOccurs="0"/>
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxRateObservation.model" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="payoutFormula" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxAsianFeature", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "primaryRateSource",
    "secondaryRateSource",
    "fixingTime",
    "observationSchedule",
    "rateObservation",
    "rateObservationQuoteBasis",
    "payoutFormula",
    "precision"
})
public class FxAsianFeature {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected InformationSource primaryRateSource;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected InformationSource secondaryRateSource;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenterTime fixingTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxAverageRateObservationSchedule observationSchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FxAverageRateObservation> rateObservation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected StrikeQuoteBasisEnum rateObservationQuoteBasis;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String payoutFormula;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger precision;

    /**
     * Gets the value of the primaryRateSource property.
     * 
     * @return
     *     possible object is
     *     {@link InformationSource }
     *     
     */
    public InformationSource getPrimaryRateSource() {
        return primaryRateSource;
    }

    /**
     * Sets the value of the primaryRateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationSource }
     *     
     */
    public void setPrimaryRateSource(InformationSource value) {
        this.primaryRateSource = value;
    }

    /**
     * Gets the value of the secondaryRateSource property.
     * 
     * @return
     *     possible object is
     *     {@link InformationSource }
     *     
     */
    public InformationSource getSecondaryRateSource() {
        return secondaryRateSource;
    }

    /**
     * Sets the value of the secondaryRateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationSource }
     *     
     */
    public void setSecondaryRateSource(InformationSource value) {
        this.secondaryRateSource = value;
    }

    /**
     * Gets the value of the fixingTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getFixingTime() {
        return fixingTime;
    }

    /**
     * Sets the value of the fixingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setFixingTime(BusinessCenterTime value) {
        this.fixingTime = value;
    }

    /**
     * Gets the value of the observationSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link FxAverageRateObservationSchedule }
     *     
     */
    public FxAverageRateObservationSchedule getObservationSchedule() {
        return observationSchedule;
    }

    /**
     * Sets the value of the observationSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxAverageRateObservationSchedule }
     *     
     */
    public void setObservationSchedule(FxAverageRateObservationSchedule value) {
        this.observationSchedule = value;
    }

    /**
     * Gets the value of the rateObservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rateObservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateObservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxAverageRateObservation }
     * 
     * 
     */
    public List<FxAverageRateObservation> getRateObservation() {
        if (rateObservation == null) {
            rateObservation = new ArrayList<FxAverageRateObservation>();
        }
        return this.rateObservation;
    }

    /**
     * Gets the value of the rateObservationQuoteBasis property.
     * 
     * @return
     *     possible object is
     *     {@link StrikeQuoteBasisEnum }
     *     
     */
    public StrikeQuoteBasisEnum getRateObservationQuoteBasis() {
        return rateObservationQuoteBasis;
    }

    /**
     * Sets the value of the rateObservationQuoteBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrikeQuoteBasisEnum }
     *     
     */
    public void setRateObservationQuoteBasis(StrikeQuoteBasisEnum value) {
        this.rateObservationQuoteBasis = value;
    }

    /**
     * Gets the value of the payoutFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutFormula() {
        return payoutFormula;
    }

    /**
     * Sets the value of the payoutFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayoutFormula(String value) {
        this.payoutFormula = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrecision(BigInteger value) {
        this.precision = value;
    }

}
