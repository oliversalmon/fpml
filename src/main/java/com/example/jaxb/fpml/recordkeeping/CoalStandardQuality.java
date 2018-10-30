
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The quality attributes of the coal to be delivered.
 * 
 * <p>Java class for CoalStandardQuality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoalStandardQuality">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityCoalComposition.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityCoalProperties.model"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityCoalReducingAtmosphere.model"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoalStandardQuality", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "moisture",
    "ash",
    "sulfur",
    "so2",
    "_volatile",
    "btUperLB",
    "topSize",
    "finesPassingScreen",
    "grindability",
    "ashFusionTemperature",
    "initialDeformation",
    "softeningHeightWidth",
    "softeningHeightHalfWidth",
    "fluid"
})
public class CoalStandardQuality {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributePercentage moisture;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributePercentage ash;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributePercentage sulfur;
    @XmlElement(name = "SO2", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributePercentage so2;
    @XmlElement(name = "volatile", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributePercentage _volatile;
    @XmlElement(name = "BTUperLB", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributeDecimal btUperLB;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributeDecimal topSize;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributeDecimal finesPassingScreen;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributeDecimal grindability;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributeDecimal ashFusionTemperature;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributeDecimal initialDeformation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributeDecimal softeningHeightWidth;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributeDecimal softeningHeightHalfWidth;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CoalAttributeDecimal fluid;

    /**
     * Gets the value of the moisture property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributePercentage }
     *     
     */
    public CoalAttributePercentage getMoisture() {
        return moisture;
    }

    /**
     * Sets the value of the moisture property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributePercentage }
     *     
     */
    public void setMoisture(CoalAttributePercentage value) {
        this.moisture = value;
    }

    /**
     * Gets the value of the ash property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributePercentage }
     *     
     */
    public CoalAttributePercentage getAsh() {
        return ash;
    }

    /**
     * Sets the value of the ash property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributePercentage }
     *     
     */
    public void setAsh(CoalAttributePercentage value) {
        this.ash = value;
    }

    /**
     * Gets the value of the sulfur property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributePercentage }
     *     
     */
    public CoalAttributePercentage getSulfur() {
        return sulfur;
    }

    /**
     * Sets the value of the sulfur property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributePercentage }
     *     
     */
    public void setSulfur(CoalAttributePercentage value) {
        this.sulfur = value;
    }

    /**
     * Gets the value of the so2 property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributePercentage }
     *     
     */
    public CoalAttributePercentage getSO2() {
        return so2;
    }

    /**
     * Sets the value of the so2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributePercentage }
     *     
     */
    public void setSO2(CoalAttributePercentage value) {
        this.so2 = value;
    }

    /**
     * Gets the value of the volatile property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributePercentage }
     *     
     */
    public CoalAttributePercentage getVolatile() {
        return _volatile;
    }

    /**
     * Sets the value of the volatile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributePercentage }
     *     
     */
    public void setVolatile(CoalAttributePercentage value) {
        this._volatile = value;
    }

    /**
     * Gets the value of the btUperLB property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public CoalAttributeDecimal getBTUperLB() {
        return btUperLB;
    }

    /**
     * Sets the value of the btUperLB property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public void setBTUperLB(CoalAttributeDecimal value) {
        this.btUperLB = value;
    }

    /**
     * Gets the value of the topSize property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public CoalAttributeDecimal getTopSize() {
        return topSize;
    }

    /**
     * Sets the value of the topSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public void setTopSize(CoalAttributeDecimal value) {
        this.topSize = value;
    }

    /**
     * Gets the value of the finesPassingScreen property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public CoalAttributeDecimal getFinesPassingScreen() {
        return finesPassingScreen;
    }

    /**
     * Sets the value of the finesPassingScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public void setFinesPassingScreen(CoalAttributeDecimal value) {
        this.finesPassingScreen = value;
    }

    /**
     * Gets the value of the grindability property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public CoalAttributeDecimal getGrindability() {
        return grindability;
    }

    /**
     * Sets the value of the grindability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public void setGrindability(CoalAttributeDecimal value) {
        this.grindability = value;
    }

    /**
     * Gets the value of the ashFusionTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public CoalAttributeDecimal getAshFusionTemperature() {
        return ashFusionTemperature;
    }

    /**
     * Sets the value of the ashFusionTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public void setAshFusionTemperature(CoalAttributeDecimal value) {
        this.ashFusionTemperature = value;
    }

    /**
     * Gets the value of the initialDeformation property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public CoalAttributeDecimal getInitialDeformation() {
        return initialDeformation;
    }

    /**
     * Sets the value of the initialDeformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public void setInitialDeformation(CoalAttributeDecimal value) {
        this.initialDeformation = value;
    }

    /**
     * Gets the value of the softeningHeightWidth property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public CoalAttributeDecimal getSofteningHeightWidth() {
        return softeningHeightWidth;
    }

    /**
     * Sets the value of the softeningHeightWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public void setSofteningHeightWidth(CoalAttributeDecimal value) {
        this.softeningHeightWidth = value;
    }

    /**
     * Gets the value of the softeningHeightHalfWidth property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public CoalAttributeDecimal getSofteningHeightHalfWidth() {
        return softeningHeightHalfWidth;
    }

    /**
     * Sets the value of the softeningHeightHalfWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public void setSofteningHeightHalfWidth(CoalAttributeDecimal value) {
        this.softeningHeightHalfWidth = value;
    }

    /**
     * Gets the value of the fluid property.
     * 
     * @return
     *     possible object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public CoalAttributeDecimal getFluid() {
        return fluid;
    }

    /**
     * Sets the value of the fluid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoalAttributeDecimal }
     *     
     */
    public void setFluid(CoalAttributeDecimal value) {
        this.fluid = value;
    }

}
