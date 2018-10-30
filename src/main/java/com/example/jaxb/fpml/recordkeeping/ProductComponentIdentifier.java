
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Deprecated: A type defining a USI for the a subproduct component of a strategy.
 * 
 * <p>Java class for ProductComponentIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductComponentIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="premiumProductReference" type="{http://www.fpml.org/FpML-5/recordkeeping}ProductReference" minOccurs="0"/>
 *         &lt;element name="issuer" type="{http://www.fpml.org/FpML-5/recordkeeping}IssuerId"/>
 *         &lt;element name="tradeId" type="{http://www.fpml.org/FpML-5/recordkeeping}TradeId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductComponentIdentifier", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "premiumProductReference",
    "issuer",
    "tradeId"
})
public class ProductComponentIdentifier {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ProductReference premiumProductReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected IssuerId issuer;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected TradeId tradeId;

    /**
     * Gets the value of the premiumProductReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProductReference }
     *     
     */
    public ProductReference getPremiumProductReference() {
        return premiumProductReference;
    }

    /**
     * Sets the value of the premiumProductReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductReference }
     *     
     */
    public void setPremiumProductReference(ProductReference value) {
        this.premiumProductReference = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerId }
     *     
     */
    public IssuerId getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerId }
     *     
     */
    public void setIssuer(IssuerId value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the tradeId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeId }
     *     
     */
    public TradeId getTradeId() {
        return tradeId;
    }

    /**
     * Sets the value of the tradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeId }
     *     
     */
    public void setTradeId(TradeId value) {
        this.tradeId = value;
    }

}
