
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An abstract base class for all exchange traded financial products.
 * 
 * <p>Java class for ExchangeTraded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeTraded">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}UnderlyingAsset">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}ExchangeIdentifier.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeTraded", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "relatedExchangeId",
    "optionsExchangeId",
    "specifiedExchangeId"
})
@XmlSeeAlso({
    EquityAsset.class,
    Future.class,
    ExchangeTradedContract.class,
    ExchangeTradedCalculatedPrice.class
})
public abstract class ExchangeTraded
    extends UnderlyingAsset
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ExchangeId> relatedExchangeId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ExchangeId> optionsExchangeId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ExchangeId> specifiedExchangeId;

    /**
     * Gets the value of the relatedExchangeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedExchangeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedExchangeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeId }
     * 
     * 
     */
    public List<ExchangeId> getRelatedExchangeId() {
        if (relatedExchangeId == null) {
            relatedExchangeId = new ArrayList<ExchangeId>();
        }
        return this.relatedExchangeId;
    }

    /**
     * Gets the value of the optionsExchangeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionsExchangeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionsExchangeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeId }
     * 
     * 
     */
    public List<ExchangeId> getOptionsExchangeId() {
        if (optionsExchangeId == null) {
            optionsExchangeId = new ArrayList<ExchangeId>();
        }
        return this.optionsExchangeId;
    }

    /**
     * Gets the value of the specifiedExchangeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedExchangeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedExchangeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeId }
     * 
     * 
     */
    public List<ExchangeId> getSpecifiedExchangeId() {
        if (specifiedExchangeId == null) {
            specifiedExchangeId = new ArrayList<ExchangeId>();
        }
        return this.specifiedExchangeId;
    }

}
