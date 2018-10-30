
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
 * A set of valuation inputs and results. This structure can be used for requesting valuations, or for reporting them. In general, the request fills in fewer elements.
 * 
 * <p>Java class for ValuationSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValuationSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *         &lt;element name="valuationScenario" type="{http://www.fpml.org/FpML-5/recordkeeping}ValuationScenario" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valuationScenarioReference" type="{http://www.fpml.org/FpML-5/recordkeeping}ValuationScenarioReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="baseParty" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyReference" minOccurs="0"/>
 *         &lt;element name="quotationCharacteristics" type="{http://www.fpml.org/FpML-5/recordkeeping}QuotationCharacteristics" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sensitivitySetDefinition" type="{http://www.fpml.org/FpML-5/recordkeeping}SensitivitySetDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://www.fpml.org/FpML-5/recordkeeping}ValuationSetDetail" minOccurs="0"/>
 *         &lt;element name="assetValuation" type="{http://www.fpml.org/FpML-5/recordkeeping}AssetValuation" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ValuationSet", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "name",
    "valuationScenario",
    "valuationScenarioReference",
    "baseParty",
    "quotationCharacteristics",
    "sensitivitySetDefinition",
    "detail",
    "assetValuation"
})
public class ValuationSet {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String name;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ValuationScenario> valuationScenario;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<ValuationScenarioReference> valuationScenarioReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PartyReference baseParty;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<QuotationCharacteristics> quotationCharacteristics;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<SensitivitySetDefinition> sensitivitySetDefinition;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ValuationSetDetail detail;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<AssetValuation> assetValuation;
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
     * Gets the value of the valuationScenario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuationScenario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValuationScenario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValuationScenario }
     * 
     * 
     */
    public List<ValuationScenario> getValuationScenario() {
        if (valuationScenario == null) {
            valuationScenario = new ArrayList<ValuationScenario>();
        }
        return this.valuationScenario;
    }

    /**
     * Gets the value of the valuationScenarioReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuationScenarioReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValuationScenarioReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValuationScenarioReference }
     * 
     * 
     */
    public List<ValuationScenarioReference> getValuationScenarioReference() {
        if (valuationScenarioReference == null) {
            valuationScenarioReference = new ArrayList<ValuationScenarioReference>();
        }
        return this.valuationScenarioReference;
    }

    /**
     * Gets the value of the baseParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyReference }
     *     
     */
    public PartyReference getBaseParty() {
        return baseParty;
    }

    /**
     * Sets the value of the baseParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyReference }
     *     
     */
    public void setBaseParty(PartyReference value) {
        this.baseParty = value;
    }

    /**
     * Gets the value of the quotationCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotationCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotationCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotationCharacteristics }
     * 
     * 
     */
    public List<QuotationCharacteristics> getQuotationCharacteristics() {
        if (quotationCharacteristics == null) {
            quotationCharacteristics = new ArrayList<QuotationCharacteristics>();
        }
        return this.quotationCharacteristics;
    }

    /**
     * Gets the value of the sensitivitySetDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sensitivitySetDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSensitivitySetDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensitivitySetDefinition }
     * 
     * 
     */
    public List<SensitivitySetDefinition> getSensitivitySetDefinition() {
        if (sensitivitySetDefinition == null) {
            sensitivitySetDefinition = new ArrayList<SensitivitySetDefinition>();
        }
        return this.sensitivitySetDefinition;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationSetDetail }
     *     
     */
    public ValuationSetDetail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationSetDetail }
     *     
     */
    public void setDetail(ValuationSetDetail value) {
        this.detail = value;
    }

    /**
     * Gets the value of the assetValuation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetValuation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetValuation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetValuation }
     * 
     * 
     */
    public List<AssetValuation> getAssetValuation() {
        if (assetValuation == null) {
            assetValuation = new ArrayList<AssetValuation>();
        }
        return this.assetValuation;
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
