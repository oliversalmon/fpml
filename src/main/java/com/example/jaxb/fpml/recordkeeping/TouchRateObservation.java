
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TouchRateObservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TouchRateObservation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}TriggerRateObservation">
 *       &lt;choice minOccurs="0">
 *         &lt;sequence>
 *           &lt;element name="exerciseSide" type="{http://www.fpml.org/FpML-5/recordkeeping}ExerciseSideEnum" minOccurs="0"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="settlementType" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementTypeEnum"/>
 *             &lt;element name="cashSettlement" type="{http://www.fpml.org/FpML-5/recordkeeping}SimplePayment"/>
 *             &lt;element name="physicalSettlement" type="{http://www.fpml.org/FpML-5/recordkeeping}PhysicalSettlement"/>
 *           &lt;/choice>
 *           &lt;element name="payment" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativePayment" minOccurs="0"/>
 *           &lt;element name="clearingInstructions" type="{http://www.fpml.org/FpML-5/recordkeeping}ClearingInstructions" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="isExercisable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TouchRateObservation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "exerciseSide",
    "settlementType",
    "cashSettlement",
    "physicalSettlement",
    "payment",
    "clearingInstructions",
    "isExercisable"
})
public class TouchRateObservation
    extends TriggerRateObservation
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "anySimpleType")
    protected String exerciseSide;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected SettlementTypeEnum settlementType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected SimplePayment cashSettlement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected PhysicalSettlement physicalSettlement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NonNegativePayment payment;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ClearingInstructions clearingInstructions;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Boolean isExercisable;

    /**
     * Gets the value of the exerciseSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExerciseSide() {
        return exerciseSide;
    }

    /**
     * Sets the value of the exerciseSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExerciseSide(String value) {
        this.exerciseSide = value;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public SettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public void setSettlementType(SettlementTypeEnum value) {
        this.settlementType = value;
    }

    /**
     * Gets the value of the cashSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link SimplePayment }
     *     
     */
    public SimplePayment getCashSettlement() {
        return cashSettlement;
    }

    /**
     * Sets the value of the cashSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplePayment }
     *     
     */
    public void setCashSettlement(SimplePayment value) {
        this.cashSettlement = value;
    }

    /**
     * Gets the value of the physicalSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalSettlement }
     *     
     */
    public PhysicalSettlement getPhysicalSettlement() {
        return physicalSettlement;
    }

    /**
     * Sets the value of the physicalSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalSettlement }
     *     
     */
    public void setPhysicalSettlement(PhysicalSettlement value) {
        this.physicalSettlement = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativePayment }
     *     
     */
    public NonNegativePayment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativePayment }
     *     
     */
    public void setPayment(NonNegativePayment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the clearingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingInstructions }
     *     
     */
    public ClearingInstructions getClearingInstructions() {
        return clearingInstructions;
    }

    /**
     * Sets the value of the clearingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingInstructions }
     *     
     */
    public void setClearingInstructions(ClearingInstructions value) {
        this.clearingInstructions = value;
    }

    /**
     * Gets the value of the isExercisable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExercisable() {
        return isExercisable;
    }

    /**
     * Sets the value of the isExercisable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExercisable(Boolean value) {
        this.isExercisable = value;
    }

}
