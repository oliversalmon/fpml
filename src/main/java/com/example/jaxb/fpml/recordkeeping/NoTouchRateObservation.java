
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NoTouchRateObservation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoTouchRateObservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="observationStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="observationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="lowerBarrier" type="{http://www.fpml.org/FpML-5/recordkeeping}NoTouchLowerBarrierObservation"/>
 *             &lt;element name="upperBarrier" type="{http://www.fpml.org/FpML-5/recordkeeping}NoTouchUpperBarrierObservation" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="upperBarrier" type="{http://www.fpml.org/FpML-5/recordkeeping}NoTouchUpperBarrierObservation"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="exerciseSide" type="{http://www.fpml.org/FpML-5/recordkeeping}ExerciseSideEnum" minOccurs="0"/>
 *             &lt;choice minOccurs="0">
 *               &lt;element name="settlementType" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementTypeEnum"/>
 *               &lt;element name="cashSettlement" type="{http://www.fpml.org/FpML-5/recordkeeping}SimplePayment"/>
 *               &lt;element name="physicalSettlement" type="{http://www.fpml.org/FpML-5/recordkeeping}PhysicalSettlement"/>
 *             &lt;/choice>
 *             &lt;element name="payment" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativePayment" minOccurs="0"/>
 *             &lt;element name="clearingInstructions" type="{http://www.fpml.org/FpML-5/recordkeeping}ClearingInstructions" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="isExercisable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoTouchRateObservation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "content"
})
public class NoTouchRateObservation {

    @XmlElementRefs({
        @XmlElementRef(name = "observationStartDate", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exerciseSide", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "upperBarrier", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "isExercisable", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "observationEndDate", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "payment", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "settlementType", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lowerBarrier", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clearingInstructions", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cashSettlement", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "physicalSettlement", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "UpperBarrier" is used by two different parts of a schema. See: 
     * line 204 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/recordkeeping/fpml-business-events-5-10.xsd
     * line 202 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/recordkeeping/fpml-business-events-5-10.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link NoTouchUpperBarrierObservation }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link NonNegativePayment }{@code >}
     * {@link JAXBElement }{@code <}{@link SettlementTypeEnum }{@code >}
     * {@link JAXBElement }{@code <}{@link NoTouchLowerBarrierObservation }{@code >}
     * {@link JAXBElement }{@code <}{@link ClearingInstructions }{@code >}
     * {@link JAXBElement }{@code <}{@link SimplePayment }{@code >}
     * {@link JAXBElement }{@code <}{@link PhysicalSettlement }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
