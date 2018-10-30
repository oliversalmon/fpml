
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The type of transmission contingency, i.e. what portion of the transmission the delivery obligations are applicable.
 * 
 * <p>Java class for ElectricityTransmissionContingencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricityTransmissionContingencyType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/recordkeeping>Scheme">
 *       &lt;attribute name="electricityTransmissionContingencyScheme" type="{http://www.fpml.org/FpML-5/recordkeeping}NonEmptyURI" default="http://www.fpml.org/coding-scheme/electricity-transmission-contingency" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityTransmissionContingencyType", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "value"
})
public class ElectricityTransmissionContingencyType {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "electricityTransmissionContingencyScheme")
    protected String electricityTransmissionContingencyScheme;

    /**
     * The base class for all types which define coding schemes that are allowed to be empty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the electricityTransmissionContingencyScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectricityTransmissionContingencyScheme() {
        if (electricityTransmissionContingencyScheme == null) {
            return "http://www.fpml.org/coding-scheme/electricity-transmission-contingency";
        } else {
            return electricityTransmissionContingencyScheme;
        }
    }

    /**
     * Sets the value of the electricityTransmissionContingencyScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectricityTransmissionContingencyScheme(String value) {
        this.electricityTransmissionContingencyScheme = value;
    }

}
