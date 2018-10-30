
package com.example.jaxb.fpml.legal;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The English Law 2013 SCSA implementation, which extends StandardCreditSupportAnnexBase.
 * 
 * <p>Java class for StandardCreditSupportAnnex2013EnglishLaw complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardCreditSupportAnnex2013EnglishLaw">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/legal}StandardCreditSupportAnnexBase">
 *       &lt;sequence>
 *         &lt;element name="disputeResolution" type="{http://www.fpml.org/FpML-5/legal}DisputeResolution" minOccurs="0"/>
 *         &lt;element name="demandsAndNotices" type="{http://www.fpml.org/FpML-5/legal}PartyContactInformation" maxOccurs="unbounded"/>
 *         &lt;element name="otherProvisions" type="{http://www.fpml.org/FpML-5/legal}OtherProvisions" minOccurs="0"/>
 *         &lt;element name="transportCurrency" type="{http://www.fpml.org/FpML-5/legal}TransportCurrency" maxOccurs="2"/>
 *         &lt;element name="dayCount" type="{http://www.fpml.org/FpML-5/legal}DayCount"/>
 *         &lt;element name="independentAmountInterestRate" type="{http://www.fpml.org/FpML-5/legal}IndependentAmountInterestRate"/>
 *         &lt;element name="independentAmountEligibleCreditSupport" type="{http://www.fpml.org/FpML-5/legal}IndependentAmountEligibleCollateral" maxOccurs="2"/>
 *         &lt;element name="exchangeDate" type="{http://www.fpml.org/FpML-5/legal}ExchangeDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardCreditSupportAnnex2013EnglishLaw", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "disputeResolution",
    "demandsAndNotices",
    "otherProvisions",
    "transportCurrency",
    "dayCount",
    "independentAmountInterestRate",
    "independentAmountEligibleCreditSupport",
    "exchangeDate"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class StandardCreditSupportAnnex2013EnglishLaw
    extends StandardCreditSupportAnnexBase
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DisputeResolution disputeResolution;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<PartyContactInformation> demandsAndNotices;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected OtherProvisions otherProvisions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<TransportCurrency> transportCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DayCount dayCount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected IndependentAmountInterestRate independentAmountInterestRate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<IndependentAmountEligibleCollateral> independentAmountEligibleCreditSupport;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ExchangeDate exchangeDate;

    /**
     * Gets the value of the disputeResolution property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeResolution }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DisputeResolution getDisputeResolution() {
        return disputeResolution;
    }

    /**
     * Sets the value of the disputeResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeResolution }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDisputeResolution(DisputeResolution value) {
        this.disputeResolution = value;
    }

    /**
     * Gets the value of the demandsAndNotices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demandsAndNotices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemandsAndNotices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyContactInformation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<PartyContactInformation> getDemandsAndNotices() {
        if (demandsAndNotices == null) {
            demandsAndNotices = new ArrayList<PartyContactInformation>();
        }
        return this.demandsAndNotices;
    }

    /**
     * Gets the value of the otherProvisions property.
     * 
     * @return
     *     possible object is
     *     {@link OtherProvisions }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public OtherProvisions getOtherProvisions() {
        return otherProvisions;
    }

    /**
     * Sets the value of the otherProvisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherProvisions }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOtherProvisions(OtherProvisions value) {
        this.otherProvisions = value;
    }

    /**
     * Gets the value of the transportCurrency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportCurrency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportCurrency }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<TransportCurrency> getTransportCurrency() {
        if (transportCurrency == null) {
            transportCurrency = new ArrayList<TransportCurrency>();
        }
        return this.transportCurrency;
    }

    /**
     * Gets the value of the dayCount property.
     * 
     * @return
     *     possible object is
     *     {@link DayCount }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DayCount getDayCount() {
        return dayCount;
    }

    /**
     * Sets the value of the dayCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayCount }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDayCount(DayCount value) {
        this.dayCount = value;
    }

    /**
     * Gets the value of the independentAmountInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentAmountInterestRate }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public IndependentAmountInterestRate getIndependentAmountInterestRate() {
        return independentAmountInterestRate;
    }

    /**
     * Sets the value of the independentAmountInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentAmountInterestRate }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIndependentAmountInterestRate(IndependentAmountInterestRate value) {
        this.independentAmountInterestRate = value;
    }

    /**
     * Gets the value of the independentAmountEligibleCreditSupport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the independentAmountEligibleCreditSupport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndependentAmountEligibleCreditSupport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndependentAmountEligibleCollateral }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<IndependentAmountEligibleCollateral> getIndependentAmountEligibleCreditSupport() {
        if (independentAmountEligibleCreditSupport == null) {
            independentAmountEligibleCreditSupport = new ArrayList<IndependentAmountEligibleCollateral>();
        }
        return this.independentAmountEligibleCreditSupport;
    }

    /**
     * Gets the value of the exchangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeDate }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ExchangeDate getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Sets the value of the exchangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeDate }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setExchangeDate(ExchangeDate value) {
        this.exchangeDate = value;
    }

}
