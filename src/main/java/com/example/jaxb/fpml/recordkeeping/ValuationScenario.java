
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
 * A set of rules for generating a valuation.
 * 
 * <p>Java class for ValuationScenario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValuationScenario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *         &lt;element name="valuationDate" type="{http://www.fpml.org/FpML-5/recordkeeping}IdentifiedDate" minOccurs="0"/>
 *         &lt;element name="marketReference" type="{http://www.fpml.org/FpML-5/recordkeeping}MarketReference" minOccurs="0"/>
 *         &lt;element name="shift" type="{http://www.fpml.org/FpML-5/recordkeeping}PricingParameterShift" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="replacement" type="{http://www.fpml.org/FpML-5/recordkeeping}PricingInputReplacement" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ValuationScenario", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "name",
    "valuationDate",
    "marketReference",
    "shift",
    "replacement"
})
public class ValuationScenario {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String name;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected IdentifiedDate valuationDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MarketReference marketReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PricingParameterShift> shift;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PricingInputReplacement> replacement;
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
     * Gets the value of the valuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedDate }
     *     
     */
    public IdentifiedDate getValuationDate() {
        return valuationDate;
    }

    /**
     * Sets the value of the valuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedDate }
     *     
     */
    public void setValuationDate(IdentifiedDate value) {
        this.valuationDate = value;
    }

    /**
     * Gets the value of the marketReference property.
     * 
     * @return
     *     possible object is
     *     {@link MarketReference }
     *     
     */
    public MarketReference getMarketReference() {
        return marketReference;
    }

    /**
     * Sets the value of the marketReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketReference }
     *     
     */
    public void setMarketReference(MarketReference value) {
        this.marketReference = value;
    }

    /**
     * Gets the value of the shift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingParameterShift }
     * 
     * 
     */
    public List<PricingParameterShift> getShift() {
        if (shift == null) {
            shift = new ArrayList<PricingParameterShift>();
        }
        return this.shift;
    }

    /**
     * Gets the value of the replacement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the replacement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingInputReplacement }
     * 
     * 
     */
    public List<PricingInputReplacement> getReplacement() {
        if (replacement == null) {
            replacement = new ArrayList<PricingInputReplacement>();
        }
        return this.replacement;
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
