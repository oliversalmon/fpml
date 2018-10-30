
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Summary information about the trade.
 * 
 * <p>Java class for TradeSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isPackageTrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPrimeBrokerTrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reportingLevel" type="{http://www.fpml.org/FpML-5/recordkeeping}ReportingLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeSummary", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "isPackageTrade",
    "isPrimeBrokerTrade",
    "reportingLevel"
})
public class TradeSummary {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean isPackageTrade;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean isPrimeBrokerTrade;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ReportingLevel reportingLevel;

    /**
     * Gets the value of the isPackageTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPackageTrade() {
        return isPackageTrade;
    }

    /**
     * Sets the value of the isPackageTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPackageTrade(Boolean value) {
        this.isPackageTrade = value;
    }

    /**
     * Gets the value of the isPrimeBrokerTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimeBrokerTrade() {
        return isPrimeBrokerTrade;
    }

    /**
     * Sets the value of the isPrimeBrokerTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimeBrokerTrade(Boolean value) {
        this.isPrimeBrokerTrade = value;
    }

    /**
     * Gets the value of the reportingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingLevel }
     *     
     */
    public ReportingLevel getReportingLevel() {
        return reportingLevel;
    }

    /**
     * Sets the value of the reportingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingLevel }
     *     
     */
    public void setReportingLevel(ReportingLevel value) {
        this.reportingLevel = value;
    }

}
