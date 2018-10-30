
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentalPhysicalLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentalPhysicalLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PhysicalSwapLeg">
 *       &lt;sequence>
 *         &lt;element name="numberOfAllowances" type="{http://www.fpml.org/FpML-5/recordkeeping}UnitQuantity"/>
 *         &lt;element name="environmental" type="{http://www.fpml.org/FpML-5/recordkeeping}EnvironmentalProduct"/>
 *         &lt;element name="abandonmentOfScheme" type="{http://www.fpml.org/FpML-5/recordkeeping}EnvironmentalAbandonmentOfSchemeEnum" minOccurs="0"/>
 *         &lt;element name="deliveryDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="paymentDate" type="{http://www.fpml.org/FpML-5/recordkeeping}DateOffset" minOccurs="0"/>
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCentersOrReference.model" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="failureToDeliverApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eEPParameters" type="{http://www.fpml.org/FpML-5/recordkeeping}EEPParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentalPhysicalLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "numberOfAllowances",
    "environmental",
    "abandonmentOfScheme",
    "deliveryDate",
    "paymentDate",
    "businessCentersReference",
    "businessCenters",
    "failureToDeliverApplicable",
    "eepParameters"
})
public class EnvironmentalPhysicalLeg
    extends PhysicalSwapLeg
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected UnitQuantity numberOfAllowances;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected EnvironmentalProduct environmental;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected EnvironmentalAbandonmentOfSchemeEnum abandonmentOfScheme;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected AdjustableOrRelativeDate deliveryDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected DateOffset paymentDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCentersReference businessCentersReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenters businessCenters;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean failureToDeliverApplicable;
    @XmlElement(name = "eEPParameters", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected EEPParameters eepParameters;

    /**
     * Gets the value of the numberOfAllowances property.
     * 
     * @return
     *     possible object is
     *     {@link UnitQuantity }
     *     
     */
    public UnitQuantity getNumberOfAllowances() {
        return numberOfAllowances;
    }

    /**
     * Sets the value of the numberOfAllowances property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitQuantity }
     *     
     */
    public void setNumberOfAllowances(UnitQuantity value) {
        this.numberOfAllowances = value;
    }

    /**
     * Gets the value of the environmental property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalProduct }
     *     
     */
    public EnvironmentalProduct getEnvironmental() {
        return environmental;
    }

    /**
     * Sets the value of the environmental property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalProduct }
     *     
     */
    public void setEnvironmental(EnvironmentalProduct value) {
        this.environmental = value;
    }

    /**
     * Gets the value of the abandonmentOfScheme property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalAbandonmentOfSchemeEnum }
     *     
     */
    public EnvironmentalAbandonmentOfSchemeEnum getAbandonmentOfScheme() {
        return abandonmentOfScheme;
    }

    /**
     * Sets the value of the abandonmentOfScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalAbandonmentOfSchemeEnum }
     *     
     */
    public void setAbandonmentOfScheme(EnvironmentalAbandonmentOfSchemeEnum value) {
        this.abandonmentOfScheme = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setDeliveryDate(AdjustableOrRelativeDate value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOffset }
     *     
     */
    public DateOffset getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOffset }
     *     
     */
    public void setPaymentDate(DateOffset value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the businessCentersReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCentersReference }
     *     
     */
    public BusinessCentersReference getBusinessCentersReference() {
        return businessCentersReference;
    }

    /**
     * Sets the value of the businessCentersReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCentersReference }
     *     
     */
    public void setBusinessCentersReference(BusinessCentersReference value) {
        this.businessCentersReference = value;
    }

    /**
     * Gets the value of the businessCenters property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenters }
     *     
     */
    public BusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    /**
     * Sets the value of the businessCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenters }
     *     
     */
    public void setBusinessCenters(BusinessCenters value) {
        this.businessCenters = value;
    }

    /**
     * Gets the value of the failureToDeliverApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailureToDeliverApplicable() {
        return failureToDeliverApplicable;
    }

    /**
     * Sets the value of the failureToDeliverApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailureToDeliverApplicable(Boolean value) {
        this.failureToDeliverApplicable = value;
    }

    /**
     * Gets the value of the eepParameters property.
     * 
     * @return
     *     possible object is
     *     {@link EEPParameters }
     *     
     */
    public EEPParameters getEEPParameters() {
        return eepParameters;
    }

    /**
     * Sets the value of the eepParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EEPParameters }
     *     
     */
    public void setEEPParameters(EEPParameters value) {
        this.eepParameters = value;
    }

}
