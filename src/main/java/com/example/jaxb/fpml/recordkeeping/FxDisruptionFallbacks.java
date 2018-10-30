
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A container for the disruption fallback set
 * 
 * <p>Java class for FxDisruptionFallbacks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxDisruptionFallbacks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}fxDisruptionFallback" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxDisruptionFallbacks", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "fxDisruptionFallback"
})
public class FxDisruptionFallbacks {

    @XmlElementRef(name = "fxDisruptionFallback", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends FxDisruptionFallback>> fxDisruptionFallback;

    /**
     * Gets the value of the fxDisruptionFallback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxDisruptionFallback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxDisruptionFallback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Postponement }{@code >}
     * {@link JAXBElement }{@code <}{@link FxDisruptionFallback }{@code >}
     * {@link JAXBElement }{@code <}{@link Postponement }{@code >}
     * {@link JAXBElement }{@code <}{@link FxDisruptionFallback }{@code >}
     * {@link JAXBElement }{@code <}{@link NonDeliverableSubstitute }{@code >}
     * {@link JAXBElement }{@code <}{@link FxFallbackReferencePrice }{@code >}
     * {@link JAXBElement }{@code <}{@link FxDisruptionFallback }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends FxDisruptionFallback>> getFxDisruptionFallback() {
        if (fxDisruptionFallback == null) {
            fxDisruptionFallback = new ArrayList<JAXBElement<? extends FxDisruptionFallback>>();
        }
        return this.fxDisruptionFallback;
    }

}
