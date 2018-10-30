
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Accrual calculation process.
 * 
 * <p>Java class for FxAccrual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAccrual">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="observable" type="{http://www.fpml.org/FpML-5/recordkeeping}FxRateObservable" maxOccurs="unbounded"/>
 *         &lt;element name="accrualRegion" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualRegion" maxOccurs="unbounded"/>
 *         &lt;element name="fixingSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}FxFixingSchedule"/>
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
@XmlType(name = "FxAccrual", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "observable",
    "accrualRegion",
    "fixingSchedule"
})
public class FxAccrual {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected List<FxRateObservable> observable;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected List<FxAccrualRegion> accrualRegion;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FxFixingSchedule fixingSchedule;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the observable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObservable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxRateObservable }
     * 
     * 
     */
    public List<FxRateObservable> getObservable() {
        if (observable == null) {
            observable = new ArrayList<FxRateObservable>();
        }
        return this.observable;
    }

    /**
     * Gets the value of the accrualRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accrualRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccrualRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxAccrualRegion }
     * 
     * 
     */
    public List<FxAccrualRegion> getAccrualRegion() {
        if (accrualRegion == null) {
            accrualRegion = new ArrayList<FxAccrualRegion>();
        }
        return this.accrualRegion;
    }

    /**
     * Gets the value of the fixingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link FxFixingSchedule }
     *     
     */
    public FxFixingSchedule getFixingSchedule() {
        return fixingSchedule;
    }

    /**
     * Sets the value of the fixingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxFixingSchedule }
     *     
     */
    public void setFixingSchedule(FxFixingSchedule value) {
        this.fixingSchedule = value;
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
