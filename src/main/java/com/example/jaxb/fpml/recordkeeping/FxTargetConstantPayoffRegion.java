
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * A fixing region in which the payoff is a constant value (a binary|digital payoff, or zero).
 * 
 * <p>Java class for FxTargetConstantPayoffRegion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxTargetConstantPayoffRegion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetPayoffRegion">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetRegionBound.model"/>
 *         &lt;element name="payoff" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetConstantPayoff" minOccurs="0"/>
 *         &lt;element name="physicalSettlement" type="{http://www.fpml.org/FpML-5/recordkeeping}FxTargetPhysicalSettlement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxTargetConstantPayoffRegion", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "rest"
})
public class FxTargetConstantPayoffRegion
    extends FxTargetPayoffRegion
{

    @XmlElementRefs({
        @XmlElementRef(name = "upperBound", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lowerBound", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "physicalSettlement", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "payoff", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "UpperBound" is used by two different parts of a schema. See: 
     * line 910 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/recordkeeping/fpml-fx-targets-5-10.xsd
     * line 899 of file:/Users/oliverbuckley-salmon/git/fpml/src/main/xsd/recordkeeping/fpml-fx-targets-5-10.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FxTargetRegionUpperBound }{@code >}
     * {@link JAXBElement }{@code <}{@link FxTargetRegionLowerBound }{@code >}
     * {@link JAXBElement }{@code <}{@link FxTargetPhysicalSettlement }{@code >}
     * {@link JAXBElement }{@code <}{@link FxTargetConstantPayoff }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
