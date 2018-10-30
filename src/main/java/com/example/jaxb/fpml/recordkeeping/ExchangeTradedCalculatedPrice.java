
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract base class for all exchange traded financial products with a price which is calculated from exchange traded constituents.
 * 
 * <p>Java class for ExchangeTradedCalculatedPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeTradedCalculatedPrice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}ExchangeTraded">
 *       &lt;sequence>
 *         &lt;element name="constituentExchangeId" type="{http://www.fpml.org/FpML-5/recordkeeping}ExchangeId" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeTradedCalculatedPrice", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "constituentExchangeId"
})
@XmlSeeAlso({
    Index.class,
    ExchangeTradedFund.class
})
public abstract class ExchangeTradedCalculatedPrice
    extends ExchangeTraded
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ExchangeId> constituentExchangeId;

    /**
     * Gets the value of the constituentExchangeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constituentExchangeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstituentExchangeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeId }
     * 
     * 
     */
    public List<ExchangeId> getConstituentExchangeId() {
        if (constituentExchangeId == null) {
            constituentExchangeId = new ArrayList<ExchangeId>();
        }
        return this.constituentExchangeId;
    }

}
