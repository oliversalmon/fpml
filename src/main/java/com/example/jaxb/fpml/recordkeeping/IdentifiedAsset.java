
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A generic type describing an identified asset.
 * 
 * <p>Java class for IdentifiedAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifiedAsset">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Asset">
 *       &lt;sequence>
 *         &lt;element name="instrumentId" type="{http://www.fpml.org/FpML-5/recordkeeping}InstrumentId" maxOccurs="unbounded"/>
 *         &lt;element name="description" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifiedAsset", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "instrumentId",
    "description"
})
@XmlSeeAlso({
    Commodity.class,
    UnderlyingAsset.class
})
public abstract class IdentifiedAsset
    extends Asset
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected List<InstrumentId> instrumentId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String description;

    /**
     * Gets the value of the instrumentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrumentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrumentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentId }
     * 
     * 
     */
    public List<InstrumentId> getInstrumentId() {
        if (instrumentId == null) {
            instrumentId = new ArrayList<InstrumentId>();
        }
        return this.instrumentId;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
