
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Associates trade identifiers with components of a strategy.
 * 
 * <p>Java class for StrategyComponentIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategyComponentIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tradeIdentifierReference" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyTradeIdentifierReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="componentReference" type="{http://www.fpml.org/FpML-5/recordkeeping}ProductReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrategyComponentIdentification", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "tradeIdentifierReference",
    "componentReference"
})
public class StrategyComponentIdentification {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PartyTradeIdentifierReference> tradeIdentifierReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ProductReference componentReference;

    /**
     * Gets the value of the tradeIdentifierReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeIdentifierReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeIdentifierReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeIdentifierReference }
     * 
     * 
     */
    public List<PartyTradeIdentifierReference> getTradeIdentifierReference() {
        if (tradeIdentifierReference == null) {
            tradeIdentifierReference = new ArrayList<PartyTradeIdentifierReference>();
        }
        return this.tradeIdentifierReference;
    }

    /**
     * Gets the value of the componentReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProductReference }
     *     
     */
    public ProductReference getComponentReference() {
        return componentReference;
    }

    /**
     * Sets the value of the componentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductReference }
     *     
     */
    public void setComponentReference(ProductReference value) {
        this.componentReference = value;
    }

}
