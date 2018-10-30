
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of instruments usable for quotation purposes. In future releases, quotable derivative assets may be added after the underlying asset.
 * 
 * <p>Java class for InstrumentSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}underlyingAsset"/>
 *           &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}curveInstrument"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentSet", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "underlyingAssetOrCurveInstrument"
})
public class InstrumentSet {

    @XmlElementRefs({
        @XmlElementRef(name = "underlyingAsset", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "curveInstrument", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Asset>> underlyingAssetOrCurveInstrument;

    /**
     * Gets the value of the underlyingAssetOrCurveInstrument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underlyingAssetOrCurveInstrument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderlyingAssetOrCurveInstrument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FxRateAsset }{@code >}
     * {@link JAXBElement }{@code <}{@link RateIndex }{@code >}
     * {@link JAXBElement }{@code <}{@link Basket }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangeTradedContract }{@code >}
     * {@link JAXBElement }{@code <}{@link Future }{@code >}
     * {@link JAXBElement }{@code <}{@link Bond }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangeTradedOption }{@code >}
     * {@link JAXBElement }{@code <}{@link Asset }{@code >}
     * {@link JAXBElement }{@code <}{@link EquityAsset }{@code >}
     * {@link JAXBElement }{@code <}{@link ExchangeTradedFund }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleCreditDefaultSwap }{@code >}
     * {@link JAXBElement }{@code <}{@link ConvertibleBond }{@code >}
     * {@link JAXBElement }{@code <}{@link MutualFund }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleIRSwap }{@code >}
     * {@link JAXBElement }{@code <}{@link Deposit }{@code >}
     * {@link JAXBElement }{@code <}{@link Index }{@code >}
     * {@link JAXBElement }{@code <}{@link Commodity }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleFra }{@code >}
     * {@link JAXBElement }{@code <}{@link Loan }{@code >}
     * {@link JAXBElement }{@code <}{@link Mortgage }{@code >}
     * {@link JAXBElement }{@code <}{@link Cash }{@code >}
     * {@link JAXBElement }{@code <}{@link Asset }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Asset>> getUnderlyingAssetOrCurveInstrument() {
        if (underlyingAssetOrCurveInstrument == null) {
            underlyingAssetOrCurveInstrument = new ArrayList<JAXBElement<? extends Asset>>();
        }
        return this.underlyingAssetOrCurveInstrument;
    }

}
