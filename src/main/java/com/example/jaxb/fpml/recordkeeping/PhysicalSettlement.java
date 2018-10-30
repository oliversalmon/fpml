
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that describes how an option settles into a physical trade.
 * 
 * <p>Java class for PhysicalSettlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalSettlement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="resultingTradeIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyTradeIdentifier"/>
 *         &lt;element name="resultingTrade" type="{http://www.fpml.org/FpML-5/recordkeeping}Trade"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}product"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalSettlement", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "resultingTradeIdentifier",
    "resultingTrade",
    "product"
})
public class PhysicalSettlement {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyTradeIdentifier resultingTradeIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Trade resultingTrade;
    @XmlElementRef(name = "product", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends Product> product;

    /**
     * Gets the value of the resultingTradeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public PartyTradeIdentifier getResultingTradeIdentifier() {
        return resultingTradeIdentifier;
    }

    /**
     * Sets the value of the resultingTradeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTradeIdentifier }
     *     
     */
    public void setResultingTradeIdentifier(PartyTradeIdentifier value) {
        this.resultingTradeIdentifier = value;
    }

    /**
     * Gets the value of the resultingTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getResultingTrade() {
        return resultingTrade;
    }

    /**
     * Sets the value of the resultingTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setResultingTrade(Trade value) {
        this.resultingTrade = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommodityDigitalOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommoditySwaption }{@code >}
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityPerformanceSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstrumentTradeDetails }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditDefaultSwapOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditDefaultSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link Strategy }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityBasketOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommoditySwap }{@code >}
     *     
     */
    public JAXBElement<? extends Product> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommodityDigitalOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommoditySwaption }{@code >}
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityPerformanceSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link InstrumentTradeDetails }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityForward }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditDefaultSwapOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CreditDefaultSwap }{@code >}
     *     {@link JAXBElement }{@code <}{@link Strategy }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommodityBasketOption }{@code >}
     *     {@link JAXBElement }{@code <}{@link CommoditySwap }{@code >}
     *     
     */
    public void setProduct(JAXBElement<? extends Product> value) {
        this.product = value;
    }

}
