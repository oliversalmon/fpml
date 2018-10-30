
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A matrix of volatilities with dimension 0-3.
 * 
 * <p>Java class for VolatilityMatrix complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolatilityMatrix">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PricingStructureValuation">
 *       &lt;sequence>
 *         &lt;element name="dataPoints" type="{http://www.fpml.org/FpML-5/recordkeeping}MultiDimensionalPricingData" minOccurs="0"/>
 *         &lt;element name="adjustment" type="{http://www.fpml.org/FpML-5/recordkeeping}ParametricAdjustment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolatilityMatrix", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "dataPoints",
    "adjustment"
})
public class VolatilityMatrix
    extends PricingStructureValuation
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MultiDimensionalPricingData dataPoints;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ParametricAdjustment> adjustment;

    /**
     * Gets the value of the dataPoints property.
     * 
     * @return
     *     possible object is
     *     {@link MultiDimensionalPricingData }
     *     
     */
    public MultiDimensionalPricingData getDataPoints() {
        return dataPoints;
    }

    /**
     * Sets the value of the dataPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiDimensionalPricingData }
     *     
     */
    public void setDataPoints(MultiDimensionalPricingData value) {
        this.dataPoints = value;
    }

    /**
     * Gets the value of the adjustment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametricAdjustment }
     * 
     * 
     */
    public List<ParametricAdjustment> getAdjustment() {
        if (adjustment == null) {
            adjustment = new ArrayList<ParametricAdjustment>();
        }
        return this.adjustment;
    }

}