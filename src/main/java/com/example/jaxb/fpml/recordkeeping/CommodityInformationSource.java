
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the source of a commodity rate, price or index or of a market rate or of a conversion factor (e.g. a fx conversion factor).
 * 
 * <p>Java class for CommodityInformationSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityInformationSource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rateSource" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityInformationProvider" minOccurs="0"/>
 *         &lt;element name="rateSourcePage" type="{http://www.fpml.org/FpML-5/recordkeeping}RateSourcePage" minOccurs="0"/>
 *         &lt;element name="rateSourcePageHeading" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityInformationSource", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "rateSource",
    "rateSourcePage",
    "rateSourcePageHeading"
})
public class CommodityInformationSource {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CommodityInformationProvider rateSource;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected RateSourcePage rateSourcePage;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String rateSourcePageHeading;

    /**
     * Gets the value of the rateSource property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityInformationProvider }
     *     
     */
    public CommodityInformationProvider getRateSource() {
        return rateSource;
    }

    /**
     * Sets the value of the rateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityInformationProvider }
     *     
     */
    public void setRateSource(CommodityInformationProvider value) {
        this.rateSource = value;
    }

    /**
     * Gets the value of the rateSourcePage property.
     * 
     * @return
     *     possible object is
     *     {@link RateSourcePage }
     *     
     */
    public RateSourcePage getRateSourcePage() {
        return rateSourcePage;
    }

    /**
     * Sets the value of the rateSourcePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateSourcePage }
     *     
     */
    public void setRateSourcePage(RateSourcePage value) {
        this.rateSourcePage = value;
    }

    /**
     * Gets the value of the rateSourcePageHeading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateSourcePageHeading() {
        return rateSourcePageHeading;
    }

    /**
     * Sets the value of the rateSourcePageHeading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateSourcePageHeading(String value) {
        this.rateSourcePageHeading = value;
    }

}
