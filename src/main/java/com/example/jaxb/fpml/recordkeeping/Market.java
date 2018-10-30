
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A collection of pricing inputs.
 * 
 * <p>Java class for Market complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Market">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *         &lt;element name="benchmarkQuotes" type="{http://www.fpml.org/FpML-5/recordkeeping}QuotedAssetSet" minOccurs="0"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}pricingStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}pricingStructureValuation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="benchmarkPricingMethod" type="{http://www.fpml.org/FpML-5/recordkeeping}PricingMethod" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Market", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "name",
    "benchmarkQuotes",
    "pricingStructure",
    "pricingStructureValuation",
    "benchmarkPricingMethod"
})
public class Market {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String name;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuotedAssetSet benchmarkQuotes;
    @XmlElementRef(name = "pricingStructure", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends PricingStructure>> pricingStructure;
    @XmlElementRef(name = "pricingStructureValuation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends PricingStructureValuation>> pricingStructureValuation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PricingMethod> benchmarkPricingMethod;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the benchmarkQuotes property.
     * 
     * @return
     *     possible object is
     *     {@link QuotedAssetSet }
     *     
     */
    public QuotedAssetSet getBenchmarkQuotes() {
        return benchmarkQuotes;
    }

    /**
     * Sets the value of the benchmarkQuotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotedAssetSet }
     *     
     */
    public void setBenchmarkQuotes(QuotedAssetSet value) {
        this.benchmarkQuotes = value;
    }

    /**
     * A collection of pricing inputs (curves, volatility matrices, etc.) used to represent the market.Gets the value of the pricingStructure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingStructure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingStructure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PricingStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link YieldCurve }{@code >}
     * {@link JAXBElement }{@code <}{@link VolatilityRepresentation }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditCurve }{@code >}
     * {@link JAXBElement }{@code <}{@link FxCurve }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends PricingStructure>> getPricingStructure() {
        if (pricingStructure == null) {
            pricingStructure = new ArrayList<JAXBElement<? extends PricingStructure>>();
        }
        return this.pricingStructure;
    }

    /**
     * The values of the pricing structure used to represent the markets.Gets the value of the pricingStructureValuation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingStructureValuation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingStructureValuation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PricingStructureValuation }{@code >}
     * {@link JAXBElement }{@code <}{@link YieldCurveValuation }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditCurveValuation }{@code >}
     * {@link JAXBElement }{@code <}{@link FxCurveValuation }{@code >}
     * {@link JAXBElement }{@code <}{@link VolatilityMatrix }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends PricingStructureValuation>> getPricingStructureValuation() {
        if (pricingStructureValuation == null) {
            pricingStructureValuation = new ArrayList<JAXBElement<? extends PricingStructureValuation>>();
        }
        return this.pricingStructureValuation;
    }

    /**
     * Gets the value of the benchmarkPricingMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the benchmarkPricingMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBenchmarkPricingMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingMethod }
     * 
     * 
     */
    public List<PricingMethod> getBenchmarkPricingMethod() {
        if (benchmarkPricingMethod == null) {
            benchmarkPricingMethod = new ArrayList<PricingMethod>();
        }
        return this.benchmarkPricingMethod;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
