
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The barrier which, when breached, triggers the knock-in or knock-out of the barrier option.
 * 
 * <p>Java class for CommodityTrigger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityTrigger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="levelQuantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *             &lt;element name="levelUnit" type="{http://www.fpml.org/FpML-5/recordkeeping}QuantityUnit"/>
 *           &lt;/sequence>
 *           &lt;element name="levelPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="levelPrice" type="{http://www.fpml.org/FpML-5/recordkeeping}FixedPrice"/>
 *         &lt;/choice>
 *         &lt;element name="triggerType" type="{http://www.fpml.org/FpML-5/recordkeeping}TriggerTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityTrigger", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "levelQuantity",
    "levelUnit",
    "levelPercentage",
    "levelPrice",
    "triggerType"
})
public class CommodityTrigger {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal levelQuantity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuantityUnit levelUnit;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal levelPercentage;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FixedPrice levelPrice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected TriggerTypeEnum triggerType;

    /**
     * Gets the value of the levelQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevelQuantity() {
        return levelQuantity;
    }

    /**
     * Sets the value of the levelQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevelQuantity(BigDecimal value) {
        this.levelQuantity = value;
    }

    /**
     * Gets the value of the levelUnit property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityUnit }
     *     
     */
    public QuantityUnit getLevelUnit() {
        return levelUnit;
    }

    /**
     * Sets the value of the levelUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityUnit }
     *     
     */
    public void setLevelUnit(QuantityUnit value) {
        this.levelUnit = value;
    }

    /**
     * Gets the value of the levelPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevelPercentage() {
        return levelPercentage;
    }

    /**
     * Sets the value of the levelPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevelPercentage(BigDecimal value) {
        this.levelPercentage = value;
    }

    /**
     * Gets the value of the levelPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FixedPrice }
     *     
     */
    public FixedPrice getLevelPrice() {
        return levelPrice;
    }

    /**
     * Sets the value of the levelPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedPrice }
     *     
     */
    public void setLevelPrice(FixedPrice value) {
        this.levelPrice = value;
    }

    /**
     * Gets the value of the triggerType property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerTypeEnum }
     *     
     */
    public TriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    /**
     * Sets the value of the triggerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerTypeEnum }
     *     
     */
    public void setTriggerType(TriggerTypeEnum value) {
        this.triggerType = value;
    }

}
