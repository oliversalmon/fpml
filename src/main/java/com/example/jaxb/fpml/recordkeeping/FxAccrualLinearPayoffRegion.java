
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
 * A fixing region in which the payoff varies linearly with the fixing value.
 * 
 * <p>Java class for FxAccrualLinearPayoffRegion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAccrualLinearPayoffRegion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualPayoffRegion">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxExchangedCurrency.model"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="strike" type="{http://www.fpml.org/FpML-5/recordkeeping}FxForwardStrikePrice"/>
 *             &lt;element name="counterCurrencyAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeAmountSchedule" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="averageStrike" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAverageStrike"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualRegionBound.model" minOccurs="0"/>
 *         &lt;element name="leverage" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualLeverage" minOccurs="0"/>
 *         &lt;element name="payoffCap" type="{http://www.fpml.org/FpML-5/recordkeeping}FxPayoffCap" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxAccrualLinearPayoffRegion", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "rest"
})
public class FxAccrualLinearPayoffRegion
    extends FxAccrualPayoffRegion
{

    @XmlElementRefs({
        @XmlElementRef(name = "leverage", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exchangedCurrency2", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "strike", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exchangedCurrency1", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "upperBound", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "averageStrike", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "payoffCap", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "counterCurrencyAmount", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lowerBound", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "UpperBound" is used by two different parts of a schema. See: 
     * line 943 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/recordkeeping/fpml-fx-accruals-5-10.xsd
     * line 932 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/recordkeeping/fpml-fx-accruals-5-10.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FxAccrualLeverage }{@code >}
     * {@link JAXBElement }{@code <}{@link FxExchangedCurrency }{@code >}
     * {@link JAXBElement }{@code <}{@link FxForwardStrikePrice }{@code >}
     * {@link JAXBElement }{@code <}{@link FxExchangedCurrency }{@code >}
     * {@link JAXBElement }{@code <}{@link FxAccrualRegionUpperBound }{@code >}
     * {@link JAXBElement }{@code <}{@link FxAverageStrike }{@code >}
     * {@link JAXBElement }{@code <}{@link FxPayoffCap }{@code >}
     * {@link JAXBElement }{@code <}{@link NonNegativeAmountSchedule }{@code >}
     * {@link JAXBElement }{@code <}{@link FxAccrualRegionLowerBound }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
