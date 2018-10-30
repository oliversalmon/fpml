
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the initial margin calculation applicable to a single piece of collateral.
 * 
 * <p>Java class for InitialMarginCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitialMarginCalculation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="marginRatio" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *             &lt;element name="marginRatioThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="2" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="haircut" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *             &lt;element name="haircutThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="2" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="assetReference" type="{http://www.fpml.org/FpML-5/recordkeeping}AssetReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialMarginCalculation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "marginRatio",
    "marginRatioThreshold",
    "haircut",
    "haircutThreshold",
    "assetReference"
})
public class InitialMarginCalculation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal marginRatio;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<BigDecimal> marginRatioThreshold;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal haircut;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<BigDecimal> haircutThreshold;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AssetReference assetReference;

    /**
     * Gets the value of the marginRatio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarginRatio() {
        return marginRatio;
    }

    /**
     * Sets the value of the marginRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarginRatio(BigDecimal value) {
        this.marginRatio = value;
    }

    /**
     * Gets the value of the marginRatioThreshold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marginRatioThreshold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarginRatioThreshold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getMarginRatioThreshold() {
        if (marginRatioThreshold == null) {
            marginRatioThreshold = new ArrayList<BigDecimal>();
        }
        return this.marginRatioThreshold;
    }

    /**
     * Gets the value of the haircut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHaircut() {
        return haircut;
    }

    /**
     * Sets the value of the haircut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHaircut(BigDecimal value) {
        this.haircut = value;
    }

    /**
     * Gets the value of the haircutThreshold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the haircutThreshold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHaircutThreshold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getHaircutThreshold() {
        if (haircutThreshold == null) {
            haircutThreshold = new ArrayList<BigDecimal>();
        }
        return this.haircutThreshold;
    }

    /**
     * Gets the value of the assetReference property.
     * 
     * @return
     *     possible object is
     *     {@link AssetReference }
     *     
     */
    public AssetReference getAssetReference() {
        return assetReference;
    }

    /**
     * Sets the value of the assetReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetReference }
     *     
     */
    public void setAssetReference(AssetReference value) {
        this.assetReference = value;
    }

}
