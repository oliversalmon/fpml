
package com.example.jaxb.fpml.legal;

import javax.annotation.Generated;
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
 *         &lt;element name="rateSource" type="{http://www.fpml.org/FpML-5/legal}CommodityInformationProvider"/>
 *         &lt;element name="rateSourcePage" type="{http://www.fpml.org/FpML-5/legal}RateSourcePage" minOccurs="0"/>
 *         &lt;element name="rateSourcePageHeading" type="{http://www.fpml.org/FpML-5/legal}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityInformationSource", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "rateSource",
    "rateSourcePage",
    "rateSourcePageHeading"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class CommodityInformationSource {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CommodityInformationProvider rateSource;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected RateSourcePage rateSourcePage;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String rateSourcePageHeading;

    /**
     * Gets the value of the rateSource property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityInformationProvider }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRateSourcePageHeading(String value) {
        this.rateSourcePageHeading = value;
    }

}
