
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a floating rate.
 * 
 * <p>Java class for FloatingRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingRate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Rate">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FloatingRateIndex.model"/>
 *         &lt;element name="floatingRateMultiplierSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}Schedule" minOccurs="0"/>
 *         &lt;element name="spreadSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}SpreadSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rateTreatment" type="{http://www.fpml.org/FpML-5/recordkeeping}RateTreatmentEnum" minOccurs="0"/>
 *         &lt;element name="capRateSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}StrikeSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="floorRateSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}StrikeSchedule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingRate", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "floatingRateIndex",
    "indexTenor",
    "floatingRateMultiplierSchedule",
    "spreadSchedule",
    "rateTreatment",
    "capRateSchedule",
    "floorRateSchedule"
})
@XmlSeeAlso({
    FloatingRateCalculation.class
})
public class FloatingRate
    extends Rate
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FloatingRateIndex floatingRateIndex;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period indexTenor;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Schedule floatingRateMultiplierSchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<SpreadSchedule> spreadSchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected RateTreatmentEnum rateTreatment;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<StrikeSchedule> capRateSchedule;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<StrikeSchedule> floorRateSchedule;

    /**
     * Gets the value of the floatingRateIndex property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingRateIndex }
     *     
     */
    public FloatingRateIndex getFloatingRateIndex() {
        return floatingRateIndex;
    }

    /**
     * Sets the value of the floatingRateIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingRateIndex }
     *     
     */
    public void setFloatingRateIndex(FloatingRateIndex value) {
        this.floatingRateIndex = value;
    }

    /**
     * Gets the value of the indexTenor property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getIndexTenor() {
        return indexTenor;
    }

    /**
     * Sets the value of the indexTenor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setIndexTenor(Period value) {
        this.indexTenor = value;
    }

    /**
     * Gets the value of the floatingRateMultiplierSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getFloatingRateMultiplierSchedule() {
        return floatingRateMultiplierSchedule;
    }

    /**
     * Sets the value of the floatingRateMultiplierSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setFloatingRateMultiplierSchedule(Schedule value) {
        this.floatingRateMultiplierSchedule = value;
    }

    /**
     * Gets the value of the spreadSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spreadSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpreadSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpreadSchedule }
     * 
     * 
     */
    public List<SpreadSchedule> getSpreadSchedule() {
        if (spreadSchedule == null) {
            spreadSchedule = new ArrayList<SpreadSchedule>();
        }
        return this.spreadSchedule;
    }

    /**
     * Gets the value of the rateTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link RateTreatmentEnum }
     *     
     */
    public RateTreatmentEnum getRateTreatment() {
        return rateTreatment;
    }

    /**
     * Sets the value of the rateTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTreatmentEnum }
     *     
     */
    public void setRateTreatment(RateTreatmentEnum value) {
        this.rateTreatment = value;
    }

    /**
     * Gets the value of the capRateSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capRateSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapRateSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrikeSchedule }
     * 
     * 
     */
    public List<StrikeSchedule> getCapRateSchedule() {
        if (capRateSchedule == null) {
            capRateSchedule = new ArrayList<StrikeSchedule>();
        }
        return this.capRateSchedule;
    }

    /**
     * Gets the value of the floorRateSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floorRateSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloorRateSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrikeSchedule }
     * 
     * 
     */
    public List<StrikeSchedule> getFloorRateSchedule() {
        if (floorRateSchedule == null) {
            floorRateSchedule = new ArrayList<StrikeSchedule>();
        }
        return this.floorRateSchedule;
    }

}
