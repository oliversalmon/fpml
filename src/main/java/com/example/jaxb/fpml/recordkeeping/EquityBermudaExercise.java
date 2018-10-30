
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining exercise procedures associated with a Bermuda style exercise of an equity option. The term Bermuda is adopted in FpML for consistency with the ISDA Definitions.
 * 
 * <p>Java class for EquityBermudaExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquityBermudaExercise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}SharedAmericanExercise">
 *       &lt;sequence>
 *         &lt;element name="bermudaExerciseDates" type="{http://www.fpml.org/FpML-5/recordkeeping}DateList" minOccurs="0"/>
 *         &lt;element name="latestExerciseTimeType" type="{http://www.fpml.org/FpML-5/recordkeeping}TimeTypeEnum" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}EquityExpiration.model"/>
 *         &lt;element name="equityMultipleExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}EquityMultipleExercise" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquityBermudaExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "bermudaExerciseDates",
    "latestExerciseTimeType",
    "equityExpirationTimeType",
    "equityExpirationTime",
    "expirationTimeDetermination",
    "equityMultipleExercise"
})
public class EquityBermudaExercise
    extends SharedAmericanExercise
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DateList bermudaExerciseDates;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected TimeTypeEnum latestExerciseTimeType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected TimeTypeEnum equityExpirationTimeType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenterTime equityExpirationTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DeterminationMethod expirationTimeDetermination;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EquityMultipleExercise equityMultipleExercise;

    /**
     * Gets the value of the bermudaExerciseDates property.
     * 
     * @return
     *     possible object is
     *     {@link DateList }
     *     
     */
    public DateList getBermudaExerciseDates() {
        return bermudaExerciseDates;
    }

    /**
     * Sets the value of the bermudaExerciseDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateList }
     *     
     */
    public void setBermudaExerciseDates(DateList value) {
        this.bermudaExerciseDates = value;
    }

    /**
     * Gets the value of the latestExerciseTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link TimeTypeEnum }
     *     
     */
    public TimeTypeEnum getLatestExerciseTimeType() {
        return latestExerciseTimeType;
    }

    /**
     * Sets the value of the latestExerciseTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTypeEnum }
     *     
     */
    public void setLatestExerciseTimeType(TimeTypeEnum value) {
        this.latestExerciseTimeType = value;
    }

    /**
     * Gets the value of the equityExpirationTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link TimeTypeEnum }
     *     
     */
    public TimeTypeEnum getEquityExpirationTimeType() {
        return equityExpirationTimeType;
    }

    /**
     * Sets the value of the equityExpirationTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTypeEnum }
     *     
     */
    public void setEquityExpirationTimeType(TimeTypeEnum value) {
        this.equityExpirationTimeType = value;
    }

    /**
     * Gets the value of the equityExpirationTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getEquityExpirationTime() {
        return equityExpirationTime;
    }

    /**
     * Sets the value of the equityExpirationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setEquityExpirationTime(BusinessCenterTime value) {
        this.equityExpirationTime = value;
    }

    /**
     * Gets the value of the expirationTimeDetermination property.
     * 
     * @return
     *     possible object is
     *     {@link DeterminationMethod }
     *     
     */
    public DeterminationMethod getExpirationTimeDetermination() {
        return expirationTimeDetermination;
    }

    /**
     * Sets the value of the expirationTimeDetermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeterminationMethod }
     *     
     */
    public void setExpirationTimeDetermination(DeterminationMethod value) {
        this.expirationTimeDetermination = value;
    }

    /**
     * Gets the value of the equityMultipleExercise property.
     * 
     * @return
     *     possible object is
     *     {@link EquityMultipleExercise }
     *     
     */
    public EquityMultipleExercise getEquityMultipleExercise() {
        return equityMultipleExercise;
    }

    /**
     * Sets the value of the equityMultipleExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityMultipleExercise }
     *     
     */
    public void setEquityMultipleExercise(EquityMultipleExercise value) {
        this.equityMultipleExercise = value;
    }

}
