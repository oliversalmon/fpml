
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An adjustment used to accommodate a parameter of the input trade, e.g. the strike.
 * 
 * <p>Java class for ParametricAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParametricAdjustment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.fpml.org/FpML-5/recordkeeping}NormalizedString" minOccurs="0"/>
 *         &lt;element name="inputUnits" type="{http://www.fpml.org/FpML-5/recordkeeping}PriceQuoteUnits" minOccurs="0"/>
 *         &lt;element name="datapoint" type="{http://www.fpml.org/FpML-5/recordkeeping}ParametricAdjustmentPoint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametricAdjustment", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "name",
    "inputUnits",
    "datapoint"
})
public class ParametricAdjustment {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PriceQuoteUnits inputUnits;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ParametricAdjustmentPoint> datapoint;

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
     * Gets the value of the inputUnits property.
     * 
     * @return
     *     possible object is
     *     {@link PriceQuoteUnits }
     *     
     */
    public PriceQuoteUnits getInputUnits() {
        return inputUnits;
    }

    /**
     * Sets the value of the inputUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceQuoteUnits }
     *     
     */
    public void setInputUnits(PriceQuoteUnits value) {
        this.inputUnits = value;
    }

    /**
     * Gets the value of the datapoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datapoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatapoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametricAdjustmentPoint }
     * 
     * 
     */
    public List<ParametricAdjustmentPoint> getDatapoint() {
        if (datapoint == null) {
            datapoint = new ArrayList<ParametricAdjustmentPoint>();
        }
        return this.datapoint;
    }

}
