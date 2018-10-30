
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
 * <p>Java class for FxTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accumulationRegion" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetAccumulationRegion" maxOccurs="2"/>
 *         &lt;choice>
 *           &lt;element name="knockoutLevel" type="{http://www.fpml.org/FpML-5/recordkeeping}FxKnockoutLevel"/>
 *           &lt;element name="knockoutCount" type="{http://www.fpml.org/FpML-5/recordkeeping}FxKnockoutCount"/>
 *         &lt;/choice>
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
@XmlType(name = "FxTarget", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "accumulationRegion",
    "knockoutLevel",
    "knockoutCount"
})
public class FxTarget {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected List<FxTargetAccumulationRegion> accumulationRegion;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxKnockoutLevel knockoutLevel;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxKnockoutCount knockoutCount;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the accumulationRegion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accumulationRegion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccumulationRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxTargetAccumulationRegion }
     * 
     * 
     */
    public List<FxTargetAccumulationRegion> getAccumulationRegion() {
        if (accumulationRegion == null) {
            accumulationRegion = new ArrayList<FxTargetAccumulationRegion>();
        }
        return this.accumulationRegion;
    }

    /**
     * Gets the value of the knockoutLevel property.
     * 
     * @return
     *     possible object is
     *     {@link FxKnockoutLevel }
     *     
     */
    public FxKnockoutLevel getKnockoutLevel() {
        return knockoutLevel;
    }

    /**
     * Sets the value of the knockoutLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxKnockoutLevel }
     *     
     */
    public void setKnockoutLevel(FxKnockoutLevel value) {
        this.knockoutLevel = value;
    }

    /**
     * Gets the value of the knockoutCount property.
     * 
     * @return
     *     possible object is
     *     {@link FxKnockoutCount }
     *     
     */
    public FxKnockoutCount getKnockoutCount() {
        return knockoutCount;
    }

    /**
     * Sets the value of the knockoutCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxKnockoutCount }
     *     
     */
    public void setKnockoutCount(FxKnockoutCount value) {
        this.knockoutCount = value;
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
