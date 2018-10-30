
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A curve used to model a set of forward interest rates. Used for forecasting interest rates as part of a pricing calculation.
 * 
 * <p>Java class for ForwardRateCurve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForwardRateCurve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assetReference" type="{http://www.fpml.org/FpML-5/recordkeeping}AssetReference" minOccurs="0"/>
 *         &lt;element name="rateCurve" type="{http://www.fpml.org/FpML-5/recordkeeping}TermCurve" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForwardRateCurve", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "assetReference",
    "rateCurve"
})
public class ForwardRateCurve {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AssetReference assetReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TermCurve rateCurve;

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

    /**
     * Gets the value of the rateCurve property.
     * 
     * @return
     *     possible object is
     *     {@link TermCurve }
     *     
     */
    public TermCurve getRateCurve() {
        return rateCurve;
    }

    /**
     * Sets the value of the rateCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermCurve }
     *     
     */
    public void setRateCurve(TermCurve value) {
        this.rateCurve = value;
    }

}
