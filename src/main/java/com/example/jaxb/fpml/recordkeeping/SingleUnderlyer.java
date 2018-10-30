
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing a single underlyer
 * 
 * <p>Java class for SingleUnderlyer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SingleUnderlyer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}underlyingAsset"/>
 *         &lt;element name="openUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dividendPayout" type="{http://www.fpml.org/FpML-5/recordkeeping}DividendPayout" minOccurs="0"/>
 *         &lt;element name="couponPayment" type="{http://www.fpml.org/FpML-5/recordkeeping}PendingPayment" minOccurs="0"/>
 *         &lt;element name="averageDailyTradingVolume" type="{http://www.fpml.org/FpML-5/recordkeeping}AverageDailyTradingVolumeLimit" minOccurs="0"/>
 *         &lt;element name="depositoryReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleUnderlyer", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "underlyingAsset",
    "openUnits",
    "dividendPayout",
    "couponPayment",
    "averageDailyTradingVolume",
    "depositoryReceipt"
})
public class SingleUnderlyer {

    @XmlElementRef(name = "underlyingAsset", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class)
    protected JAXBElement<? extends Asset> underlyingAsset;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal openUnits;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DividendPayout dividendPayout;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PendingPayment couponPayment;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AverageDailyTradingVolumeLimit averageDailyTradingVolume;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean depositoryReceipt;

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
     * Gets the value of the openUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenUnits() {
        return openUnits;
    }

    /**
     * Sets the value of the openUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenUnits(BigDecimal value) {
        this.openUnits = value;
    }

    /**
     * Gets the value of the dividendPayout property.
     * 
     * @return
     *     possible object is
     *     {@link DividendPayout }
     *     
     */
    public DividendPayout getDividendPayout() {
        return dividendPayout;
    }

    /**
     * Sets the value of the dividendPayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendPayout }
     *     
     */
    public void setDividendPayout(DividendPayout value) {
        this.dividendPayout = value;
    }

    /**
     * Gets the value of the couponPayment property.
     * 
     * @return
     *     possible object is
     *     {@link PendingPayment }
     *     
     */
    public PendingPayment getCouponPayment() {
        return couponPayment;
    }

    /**
     * Sets the value of the couponPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingPayment }
     *     
     */
    public void setCouponPayment(PendingPayment value) {
        this.couponPayment = value;
    }

    /**
     * Gets the value of the averageDailyTradingVolume property.
     * 
     * @return
     *     possible object is
     *     {@link AverageDailyTradingVolumeLimit }
     *     
     */
    public AverageDailyTradingVolumeLimit getAverageDailyTradingVolume() {
        return averageDailyTradingVolume;
    }

    /**
     * Sets the value of the averageDailyTradingVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link AverageDailyTradingVolumeLimit }
     *     
     */
    public void setAverageDailyTradingVolume(AverageDailyTradingVolumeLimit value) {
        this.averageDailyTradingVolume = value;
    }

    /**
     * Gets the value of the depositoryReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDepositoryReceipt() {
        return depositoryReceipt;
    }

    /**
     * Sets the value of the depositoryReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDepositoryReceipt(Boolean value) {
        this.depositoryReceipt = value;
    }

}
