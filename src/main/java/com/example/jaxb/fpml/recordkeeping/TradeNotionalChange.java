
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure describing a change to the size of a trade.
 * 
 * <p>Java class for TradeNotionalChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeNotionalChange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}TradeChangeBase">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}TradeNotionalChange.model"/>
 *           &lt;element name="sizeChange" type="{http://www.fpml.org/FpML-5/recordkeeping}TradeLegSizeChange" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="priceChange" type="{http://www.fpml.org/FpML-5/recordkeeping}TradeLegPriceChange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeNotionalChange", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "changeInNotionalAmount",
    "outstandingNotionalAmount",
    "changeInNumberOfOptions",
    "outstandingNumberOfOptions",
    "changeInNumberOfUnits",
    "outstandingNumberOfUnits",
    "sizeChange",
    "priceChange"
})
public class TradeNotionalChange
    extends TradeChangeBase
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<NonNegativeMoney> changeInNotionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<NonNegativeMoney> outstandingNotionalAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal changeInNumberOfOptions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal outstandingNumberOfOptions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal changeInNumberOfUnits;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal outstandingNumberOfUnits;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<TradeLegSizeChange> sizeChange;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<TradeLegPriceChange> priceChange;

    /**
     * Gets the value of the changeInNotionalAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeInNotionalAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeInNotionalAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonNegativeMoney }
     * 
     * 
     */
    public List<NonNegativeMoney> getChangeInNotionalAmount() {
        if (changeInNotionalAmount == null) {
            changeInNotionalAmount = new ArrayList<NonNegativeMoney>();
        }
        return this.changeInNotionalAmount;
    }

    /**
     * Gets the value of the outstandingNotionalAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outstandingNotionalAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutstandingNotionalAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonNegativeMoney }
     * 
     * 
     */
    public List<NonNegativeMoney> getOutstandingNotionalAmount() {
        if (outstandingNotionalAmount == null) {
            outstandingNotionalAmount = new ArrayList<NonNegativeMoney>();
        }
        return this.outstandingNotionalAmount;
    }

    /**
     * Gets the value of the changeInNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChangeInNumberOfOptions() {
        return changeInNumberOfOptions;
    }

    /**
     * Sets the value of the changeInNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeInNumberOfOptions(BigDecimal value) {
        this.changeInNumberOfOptions = value;
    }

    /**
     * Gets the value of the outstandingNumberOfOptions property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingNumberOfOptions() {
        return outstandingNumberOfOptions;
    }

    /**
     * Sets the value of the outstandingNumberOfOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingNumberOfOptions(BigDecimal value) {
        this.outstandingNumberOfOptions = value;
    }

    /**
     * Gets the value of the changeInNumberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChangeInNumberOfUnits() {
        return changeInNumberOfUnits;
    }

    /**
     * Sets the value of the changeInNumberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeInNumberOfUnits(BigDecimal value) {
        this.changeInNumberOfUnits = value;
    }

    /**
     * Gets the value of the outstandingNumberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutstandingNumberOfUnits() {
        return outstandingNumberOfUnits;
    }

    /**
     * Sets the value of the outstandingNumberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutstandingNumberOfUnits(BigDecimal value) {
        this.outstandingNumberOfUnits = value;
    }

    /**
     * Gets the value of the sizeChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sizeChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSizeChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeLegSizeChange }
     * 
     * 
     */
    public List<TradeLegSizeChange> getSizeChange() {
        if (sizeChange == null) {
            sizeChange = new ArrayList<TradeLegSizeChange>();
        }
        return this.sizeChange;
    }

    /**
     * Gets the value of the priceChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeLegPriceChange }
     * 
     * 
     */
    public List<TradeLegPriceChange> getPriceChange() {
        if (priceChange == null) {
            priceChange = new ArrayList<TradeLegPriceChange>();
        }
        return this.priceChange;
    }

}
