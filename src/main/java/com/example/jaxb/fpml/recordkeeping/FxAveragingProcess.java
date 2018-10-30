
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Accrual calculation process.
 * 
 * <p>Java class for FxAveragingProcess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAveragingProcess">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FxRateObservable">
 *       &lt;sequence>
 *         &lt;element name="fixingSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}FxWeightedFixingSchedule"/>
 *         &lt;element name="averagingMethod" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAveragingMethodEnum"/>
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxAveragingProcess", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "fixingSchedule",
    "averagingMethod",
    "precision"
})
@XmlSeeAlso({
    FxAverageStrike.class,
    FxAverageRate.class
})
public class FxAveragingProcess
    extends FxRateObservable
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FxWeightedFixingSchedule fixingSchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected FxAveragingMethodEnum averagingMethod;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger precision;

    /**
     * Gets the value of the fixingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link FxWeightedFixingSchedule }
     *     
     */
    public FxWeightedFixingSchedule getFixingSchedule() {
        return fixingSchedule;
    }

    /**
     * Sets the value of the fixingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxWeightedFixingSchedule }
     *     
     */
    public void setFixingSchedule(FxWeightedFixingSchedule value) {
        this.fixingSchedule = value;
    }

    /**
     * Gets the value of the averagingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link FxAveragingMethodEnum }
     *     
     */
    public FxAveragingMethodEnum getAveragingMethod() {
        return averagingMethod;
    }

    /**
     * Sets the value of the averagingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxAveragingMethodEnum }
     *     
     */
    public void setAveragingMethod(FxAveragingMethodEnum value) {
        this.averagingMethod = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrecision(BigInteger value) {
        this.precision = value;
    }

}
