
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that holds a set of measures about an asset, including possibly their sensitivities.
 * 
 * <p>Java class for AssetValuation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetValuation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Valuation">
 *       &lt;sequence>
 *         &lt;element name="quote" type="{http://www.fpml.org/FpML-5/recordkeeping}Quotation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fxRate" type="{http://www.fpml.org/FpML-5/recordkeeping}FxRate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetValuation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "quote",
    "fxRate"
})
public class AssetValuation
    extends Valuation
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Quotation> quote;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FxRate> fxRate;

    /**
     * Gets the value of the quote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Quotation }
     * 
     * 
     */
    public List<Quotation> getQuote() {
        if (quote == null) {
            quote = new ArrayList<Quotation>();
        }
        return this.quote;
    }

    /**
     * Gets the value of the fxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxRate }
     * 
     * 
     */
    public List<FxRate> getFxRate() {
        if (fxRate == null) {
            fxRate = new ArrayList<FxRate>();
        }
        return this.fxRate;
    }

}
