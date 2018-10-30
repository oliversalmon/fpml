
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes an alternative set of price sources
 * 
 * <p>Java class for FxFallbackReferencePrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxFallbackReferencePrice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FxDisruptionFallback">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}PrioritizedRateSource.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxFallbackReferencePrice", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "primaryRateSource",
    "secondaryRateSource"
})
public class FxFallbackReferencePrice
    extends FxDisruptionFallback
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SettlementRateOption primaryRateSource;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<SettlementRateOption> secondaryRateSource;

    /**
     * Gets the value of the primaryRateSource property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementRateOption }
     *     
     */
    public SettlementRateOption getPrimaryRateSource() {
        return primaryRateSource;
    }

    /**
     * Sets the value of the primaryRateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementRateOption }
     *     
     */
    public void setPrimaryRateSource(SettlementRateOption value) {
        this.primaryRateSource = value;
    }

    /**
     * Gets the value of the secondaryRateSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryRateSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryRateSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementRateOption }
     * 
     * 
     */
    public List<SettlementRateOption> getSecondaryRateSource() {
        if (secondaryRateSource == null) {
            secondaryRateSource = new ArrayList<SettlementRateOption>();
        }
        return this.secondaryRateSource;
    }

}
