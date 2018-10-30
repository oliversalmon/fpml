
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type defining parameters associated with an individual observation or fixing. This type forms part of the cashflow representation of a stream.
 * 
 * <p>Java class for RateObservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateObservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resetDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="adjustedFixingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="observedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="treatedRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="observationWeight" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="rateReference" type="{http://www.fpml.org/FpML-5/recordkeeping}RateReference" minOccurs="0"/>
 *         &lt;element name="forecastRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="treatedForecastRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "RateObservation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "resetDate",
    "adjustedFixingDate",
    "observedRate",
    "treatedRate",
    "observationWeight",
    "rateReference",
    "forecastRate",
    "treatedForecastRate"
})
public class RateObservation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar resetDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar adjustedFixingDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal observedRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal treatedRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger observationWeight;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected RateReference rateReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal forecastRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal treatedForecastRate;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the resetDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResetDate() {
        return resetDate;
    }

    /**
     * Sets the value of the resetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResetDate(XMLGregorianCalendar value) {
        this.resetDate = value;
    }

    /**
     * Gets the value of the adjustedFixingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdjustedFixingDate() {
        return adjustedFixingDate;
    }

    /**
     * Sets the value of the adjustedFixingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdjustedFixingDate(XMLGregorianCalendar value) {
        this.adjustedFixingDate = value;
    }

    /**
     * Gets the value of the observedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getObservedRate() {
        return observedRate;
    }

    /**
     * Sets the value of the observedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setObservedRate(BigDecimal value) {
        this.observedRate = value;
    }

    /**
     * Gets the value of the treatedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTreatedRate() {
        return treatedRate;
    }

    /**
     * Sets the value of the treatedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTreatedRate(BigDecimal value) {
        this.treatedRate = value;
    }

    /**
     * Gets the value of the observationWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObservationWeight() {
        return observationWeight;
    }

    /**
     * Sets the value of the observationWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObservationWeight(BigInteger value) {
        this.observationWeight = value;
    }

    /**
     * Gets the value of the rateReference property.
     * 
     * @return
     *     possible object is
     *     {@link RateReference }
     *     
     */
    public RateReference getRateReference() {
        return rateReference;
    }

    /**
     * Sets the value of the rateReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateReference }
     *     
     */
    public void setRateReference(RateReference value) {
        this.rateReference = value;
    }

    /**
     * Gets the value of the forecastRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getForecastRate() {
        return forecastRate;
    }

    /**
     * Sets the value of the forecastRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setForecastRate(BigDecimal value) {
        this.forecastRate = value;
    }

    /**
     * Gets the value of the treatedForecastRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTreatedForecastRate() {
        return treatedForecastRate;
    }

    /**
     * Sets the value of the treatedForecastRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTreatedForecastRate(BigDecimal value) {
        this.treatedForecastRate = value;
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
