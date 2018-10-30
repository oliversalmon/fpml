
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of quoted assets.
 * 
 * <p>Java class for QuotedAssetSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotedAssetSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instrumentSet" type="{http://www.fpml.org/FpML-5/recordkeeping}InstrumentSet" minOccurs="0"/>
 *         &lt;element name="assetQuote" type="{http://www.fpml.org/FpML-5/recordkeeping}BasicAssetValuation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotedAssetSet", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "instrumentSet",
    "assetQuote"
})
@XmlSeeAlso({
    FxRateSet.class
})
public class QuotedAssetSet {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected InstrumentSet instrumentSet;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<BasicAssetValuation> assetQuote;

    /**
     * Gets the value of the instrumentSet property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentSet }
     *     
     */
    public InstrumentSet getInstrumentSet() {
        return instrumentSet;
    }

    /**
     * Sets the value of the instrumentSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentSet }
     *     
     */
    public void setInstrumentSet(InstrumentSet value) {
        this.instrumentSet = value;
    }

    /**
     * Gets the value of the assetQuote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetQuote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicAssetValuation }
     * 
     * 
     */
    public List<BasicAssetValuation> getAssetQuote() {
        if (assetQuote == null) {
            assetQuote = new ArrayList<BasicAssetValuation>();
        }
        return this.assetQuote;
    }

}
