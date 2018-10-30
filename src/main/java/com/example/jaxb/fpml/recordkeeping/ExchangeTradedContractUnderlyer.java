
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing a single underlyer
 * 
 * <p>Java class for ExchangeTradedContractUnderlyer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeTradedContractUnderlyer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FloatingRateIndex.model"/>
 *         &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/recordkeeping}QuotedCurrencyPair"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}underlyingAsset" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeTradedContractUnderlyer", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "floatingRateIndex",
    "indexTenor",
    "quotedCurrencyPair",
    "underlyingAsset"
})
public class ExchangeTradedContractUnderlyer {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FloatingRateIndex floatingRateIndex;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period indexTenor;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuotedCurrencyPair quotedCurrencyPair;
    @XmlElementRef(name = "underlyingAsset", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends Asset>> underlyingAsset;

    /**
     * Gets the value of the floatingRateIndex property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateIndex }
     *     
     */
    public FloatingRateIndex getFloatingRateIndex() {
        return floatingRateIndex;
    }

    /**
     * Sets the value of the floatingRateIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateIndex }
     *     
     */
    public void setFloatingRateIndex(FloatingRateIndex value) {
        this.floatingRateIndex = value;
    }

    /**
     * Gets the value of the indexTenor property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getIndexTenor() {
        return indexTenor;
    }

    /**
     * Sets the value of the indexTenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setIndexTenor(Period value) {
        this.indexTenor = value;
    }

    /**
     * Gets the value of the quotedCurrencyPair property.
     * 
     * @return
     *     possible object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public QuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    /**
     * Sets the value of the quotedCurrencyPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public void setQuotedCurrencyPair(QuotedCurrencyPair value) {
        this.quotedCurrencyPair = value;
    }

    /**
     * Gets the value of the underlyingAsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underlyingAsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderlyingAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MutualFund }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangeTradedFund }{@code >}
     * {@link JAXBElement }{@code <}{@link Future }{@code >}
     * {@link JAXBElement }{@code <}{@link Mortgage }{@code >}
     * {@link JAXBElement }{@code <}{@link EquityAsset }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangeTradedOption }{@code >}
     * {@link JAXBElement }{@code <}{@link Index }{@code >}
     * {@link JAXBElement }{@code <}{@link Loan }{@code >}
     * {@link JAXBElement }{@code <}{@link ConvertibleBond }{@code >}
     * {@link JAXBElement }{@code <}{@link Basket }{@code >}
     * {@link JAXBElement }{@code <}{@link Commodity }{@code >}
     * {@link JAXBElement }{@code <}{@link Asset }{@code >}
     * {@link JAXBElement }{@code <}{@link Cash }{@code >}
     * {@link JAXBElement }{@code <}{@link Bond }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangeTradedContract }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Asset>> getUnderlyingAsset() {
        if (underlyingAsset == null) {
            underlyingAsset = new ArrayList<JAXBElement<? extends Asset>>();
        }
        return this.underlyingAsset;
    }

}
