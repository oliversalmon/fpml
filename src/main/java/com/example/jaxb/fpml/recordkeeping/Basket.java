
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the underlyer features of a basket swap. Each of the basket constituents are described through an embedded component, the basketConstituentsType.
 * 
 * <p>Java class for Basket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Basket">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Asset">
 *       &lt;sequence>
 *         &lt;element name="openUnits" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="basketConstituent" type="{http://www.fpml.org/FpML-5/recordkeeping}BasketConstituent" maxOccurs="unbounded"/>
 *         &lt;element name="basketDivisor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="basketVersion" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BasketIdentifier.model" minOccurs="0"/>
 *         &lt;element name="basketCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}Currency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Basket", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "openUnits",
    "basketConstituent",
    "basketDivisor",
    "basketVersion",
    "basketName",
    "basketId",
    "basketCurrency"
})
public class Basket
    extends Asset
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal openUnits;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected List<BasketConstituent> basketConstituent;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal basketDivisor;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger basketVersion;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BasketName basketName;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<BasketId> basketId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Currency basketCurrency;

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
     * Gets the value of the basketConstituent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basketConstituent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasketConstituent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasketConstituent }
     * 
     * 
     */
    public List<BasketConstituent> getBasketConstituent() {
        if (basketConstituent == null) {
            basketConstituent = new ArrayList<BasketConstituent>();
        }
        return this.basketConstituent;
    }

    /**
     * Gets the value of the basketDivisor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBasketDivisor() {
        return basketDivisor;
    }

    /**
     * Sets the value of the basketDivisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBasketDivisor(BigDecimal value) {
        this.basketDivisor = value;
    }

    /**
     * Gets the value of the basketVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBasketVersion() {
        return basketVersion;
    }

    /**
     * Sets the value of the basketVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBasketVersion(BigInteger value) {
        this.basketVersion = value;
    }

    /**
     * Gets the value of the basketName property.
     * 
     * @return
     *     possible object is
     *     {@link BasketName }
     *     
     */
    public BasketName getBasketName() {
        return basketName;
    }

    /**
     * Sets the value of the basketName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketName }
     *     
     */
    public void setBasketName(BasketName value) {
        this.basketName = value;
    }

    /**
     * Gets the value of the basketId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basketId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasketId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasketId }
     * 
     * 
     */
    public List<BasketId> getBasketId() {
        if (basketId == null) {
            basketId = new ArrayList<BasketId>();
        }
        return this.basketId;
    }

    /**
     * Gets the value of the basketCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getBasketCurrency() {
        return basketCurrency;
    }

    /**
     * Sets the value of the basketCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setBasketCurrency(Currency value) {
        this.basketCurrency = value;
    }

}
