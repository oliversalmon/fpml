
package com.example.jaxb.fpml.legal;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a group of products making up a single trade.
 * 
 * <p>Java class for Strategy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Strategy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/legal}Product">
 *       &lt;sequence>
 *         &lt;element name="strategyComponentIdentifier" type="{http://www.fpml.org/FpML-5/legal}StrategyComponentIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="premiumProductReference" type="{http://www.fpml.org/FpML-5/legal}ProductReference" minOccurs="0"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/legal}product" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Strategy", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "strategyComponentIdentifier",
    "premiumProductReference",
    "product"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Strategy
    extends Product
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<StrategyComponentIdentification> strategyComponentIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/legal")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ProductReference premiumProductReference;
    @XmlElementRef(name = "product", namespace = "http://www.fpml.org/FpML-5/legal", type = JAXBElement.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<JAXBElement<? extends Product>> product;

    /**
     * Gets the value of the strategyComponentIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strategyComponentIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrategyComponentIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrategyComponentIdentification }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<StrategyComponentIdentification> getStrategyComponentIdentifier() {
        if (strategyComponentIdentifier == null) {
            strategyComponentIdentifier = new ArrayList<StrategyComponentIdentification>();
        }
        return this.strategyComponentIdentifier;
    }

    /**
     * Gets the value of the premiumProductReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProductReference }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPremiumProductReference(ProductReference value) {
        this.premiumProductReference = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link InstrumentTradeDetails }{@code >}
     * {@link JAXBElement }{@code <}{@link Strategy }{@code >}
     * {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<JAXBElement<? extends Product>> getProduct() {
        if (product == null) {
            product = new ArrayList<JAXBElement<? extends Product>>();
        }
        return this.product;
    }

}
