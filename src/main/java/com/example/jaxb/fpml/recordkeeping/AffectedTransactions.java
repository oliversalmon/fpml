
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffectedTransactions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedTransactions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}TradeOrTradeReference.model" maxOccurs="unbounded"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedTransactions", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "tradeOrTradeReferenceModel"
})
public class AffectedTransactions {

    @XmlElements({
        @XmlElement(name = "trade", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = Trade.class),
        @XmlElement(name = "tradeReference", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = PartyTradeIdentifiers.class)
    })
    protected List<Object> tradeOrTradeReferenceModel;

    /**
     * Gets the value of the tradeOrTradeReferenceModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeOrTradeReferenceModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeOrTradeReferenceModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Trade }
     * {@link PartyTradeIdentifiers }
     * 
     * 
     */
    public List<Object> getTradeOrTradeReferenceModel() {
        if (tradeOrTradeReferenceModel == null) {
            tradeOrTradeReferenceModel = new ArrayList<Object>();
        }
        return this.tradeOrTradeReferenceModel;
    }

}
