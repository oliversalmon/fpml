
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure describing how disruption for a specified currency pair should be handled
 * 
 * <p>Java class for FxDisruption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxDisruption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}Currency" minOccurs="0"/>
 *         &lt;element name="referenceCurrency" type="{http://www.fpml.org/FpML-5/recordkeeping}Currency" minOccurs="0"/>
 *         &lt;element name="provisions" type="{http://www.fpml.org/FpML-5/recordkeeping}FxDisruptionProvisions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxDisruption", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "baseCurrency",
    "referenceCurrency",
    "provisions"
})
public class FxDisruption {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Currency baseCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Currency referenceCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<FxDisruptionProvisions> provisions;

    /**
     * Gets the value of the baseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Sets the value of the baseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setBaseCurrency(Currency value) {
        this.baseCurrency = value;
    }

    /**
     * Gets the value of the referenceCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getReferenceCurrency() {
        return referenceCurrency;
    }

    /**
     * Sets the value of the referenceCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setReferenceCurrency(Currency value) {
        this.referenceCurrency = value;
    }

    /**
     * Gets the value of the provisions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provisions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvisions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FxDisruptionProvisions }
     * 
     * 
     */
    public List<FxDisruptionProvisions> getProvisions() {
        if (provisions == null) {
            provisions = new ArrayList<FxDisruptionProvisions>();
        }
        return this.provisions;
    }

}
