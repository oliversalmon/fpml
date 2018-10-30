
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining a premium.
 * 
 * <p>Java class for Premium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Premium">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}SimplePayment">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}Premium.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PaymentDiscounting.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Premium", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "premiumType",
    "pricePerOption",
    "percentageOfNotional",
    "discountFactor",
    "presentValueAmount"
})
public class Premium
    extends SimplePayment
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected PremiumTypeEnum premiumType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money pricePerOption;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal percentageOfNotional;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal discountFactor;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Money presentValueAmount;

    /**
     * Gets the value of the premiumType property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumTypeEnum }
     *     
     */
    public PremiumTypeEnum getPremiumType() {
        return premiumType;
    }

    /**
     * Sets the value of the premiumType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumTypeEnum }
     *     
     */
    public void setPremiumType(PremiumTypeEnum value) {
        this.premiumType = value;
    }

    /**
     * Gets the value of the pricePerOption property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPricePerOption() {
        return pricePerOption;
    }

    /**
     * Sets the value of the pricePerOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPricePerOption(Money value) {
        this.pricePerOption = value;
    }

    /**
     * Gets the value of the percentageOfNotional property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageOfNotional() {
        return percentageOfNotional;
    }

    /**
     * Sets the value of the percentageOfNotional property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageOfNotional(BigDecimal value) {
        this.percentageOfNotional = value;
    }

    /**
     * Gets the value of the discountFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountFactor() {
        return discountFactor;
    }

    /**
     * Sets the value of the discountFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountFactor(BigDecimal value) {
        this.discountFactor = value;
    }

    /**
     * Gets the value of the presentValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPresentValueAmount() {
        return presentValueAmount;
    }

    /**
     * Sets the value of the presentValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPresentValueAmount(Money value) {
        this.presentValueAmount = value;
    }

}
