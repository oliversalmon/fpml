
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A container for the disruption event set
 * 
 * <p>Java class for FxDisruptionEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxDisruptionEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}fxDisruptionEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxDisruptionEvents", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "fxDisruptionEvent"
})
public class FxDisruptionEvents {

    @XmlElementRef(name = "fxDisruptionEvent", namespace = "http://www.fpml.org/FpML-5/recordkeeping", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends FxDisruptionEvent>> fxDisruptionEvent;

    /**
     * Gets the value of the fxDisruptionEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxDisruptionEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxDisruptionEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FxDisruptionEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link FxDisruptionEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link FxDisruptionEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link PriceMateriality }{@code >}
     * {@link JAXBElement }{@code <}{@link FxDisruptionEvent }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends FxDisruptionEvent>> getFxDisruptionEvent() {
        if (fxDisruptionEvent == null) {
            fxDisruptionEvent = new ArrayList<JAXBElement<? extends FxDisruptionEvent>>();
        }
        return this.fxDisruptionEvent;
    }

}
