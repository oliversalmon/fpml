
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxAccrualRegionLowerBound complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAccrualRegionLowerBound">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{http://www.fpml.org/FpML-5/recordkeeping}FxRegionLowerBoundDirectionEnum"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualConditionLevel.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxAccrualRegionLowerBound", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "condition",
    "level",
    "quoteBasis",
    "strikeReference",
    "averageStrikeReference",
    "triggerReference"
})
public class FxAccrualRegionLowerBound {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected FxRegionLowerBoundDirectionEnum condition;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxLevel level;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected QuoteBasisEnum quoteBasis;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxAccrualStrikeReference strikeReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxAccrualAverageStrikeReference averageStrikeReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxAccrualTriggerReference triggerReference;

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link FxRegionLowerBoundDirectionEnum }
     *     
     */
    public FxRegionLowerBoundDirectionEnum getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxRegionLowerBoundDirectionEnum }
     *     
     */
    public void setCondition(FxRegionLowerBoundDirectionEnum value) {
        this.condition = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link FxLevel }
     *     
     */
    public FxLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxLevel }
     *     
     */
    public void setLevel(FxLevel value) {
        this.level = value;
    }

    /**
     * Gets the value of the quoteBasis property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteBasisEnum }
     *     
     */
    public QuoteBasisEnum getQuoteBasis() {
        return quoteBasis;
    }

    /**
     * Sets the value of the quoteBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteBasisEnum }
     *     
     */
    public void setQuoteBasis(QuoteBasisEnum value) {
        this.quoteBasis = value;
    }

    /**
     * Gets the value of the strikeReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxAccrualStrikeReference }
     *     
     */
    public FxAccrualStrikeReference getStrikeReference() {
        return strikeReference;
    }

    /**
     * Sets the value of the strikeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxAccrualStrikeReference }
     *     
     */
    public void setStrikeReference(FxAccrualStrikeReference value) {
        this.strikeReference = value;
    }

    /**
     * Gets the value of the averageStrikeReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxAccrualAverageStrikeReference }
     *     
     */
    public FxAccrualAverageStrikeReference getAverageStrikeReference() {
        return averageStrikeReference;
    }

    /**
     * Sets the value of the averageStrikeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxAccrualAverageStrikeReference }
     *     
     */
    public void setAverageStrikeReference(FxAccrualAverageStrikeReference value) {
        this.averageStrikeReference = value;
    }

    /**
     * Gets the value of the triggerReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxAccrualTriggerReference }
     *     
     */
    public FxAccrualTriggerReference getTriggerReference() {
        return triggerReference;
    }

    /**
     * Sets the value of the triggerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxAccrualTriggerReference }
     *     
     */
    public void setTriggerReference(FxAccrualTriggerReference value) {
        this.triggerReference = value;
    }

}
