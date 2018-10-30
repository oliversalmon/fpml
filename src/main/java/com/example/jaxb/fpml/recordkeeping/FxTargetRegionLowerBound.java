
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxTargetRegionLowerBound complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTargetRegionLowerBound">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{http://www.fpml.org/FpML-5/recordkeeping}FxRegionLowerBoundDirectionEnum"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetConditionLevel.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTargetRegionLowerBound", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "condition",
    "level",
    "strikeReference",
    "pivotReference",
    "barrierReference",
    "levelReference"
})
public class FxTargetRegionLowerBound {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected FxRegionLowerBoundDirectionEnum condition;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxLevel level;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxStrikeReference strikeReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxPivotReference pivotReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxComplexBarrierBaseReference barrierReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxLevelReference levelReference;

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
     * Gets the value of the strikeReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxStrikeReference }
     *     
     */
    public FxStrikeReference getStrikeReference() {
        return strikeReference;
    }

    /**
     * Sets the value of the strikeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxStrikeReference }
     *     
     */
    public void setStrikeReference(FxStrikeReference value) {
        this.strikeReference = value;
    }

    /**
     * Gets the value of the pivotReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxPivotReference }
     *     
     */
    public FxPivotReference getPivotReference() {
        return pivotReference;
    }

    /**
     * Sets the value of the pivotReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxPivotReference }
     *     
     */
    public void setPivotReference(FxPivotReference value) {
        this.pivotReference = value;
    }

    /**
     * Gets the value of the barrierReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxComplexBarrierBaseReference }
     *     
     */
    public FxComplexBarrierBaseReference getBarrierReference() {
        return barrierReference;
    }

    /**
     * Sets the value of the barrierReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxComplexBarrierBaseReference }
     *     
     */
    public void setBarrierReference(FxComplexBarrierBaseReference value) {
        this.barrierReference = value;
    }

    /**
     * Gets the value of the levelReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxLevelReference }
     *     
     */
    public FxLevelReference getLevelReference() {
        return levelReference;
    }

    /**
     * Sets the value of the levelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxLevelReference }
     *     
     */
    public void setLevelReference(FxLevelReference value) {
        this.levelReference = value;
    }

}
