
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An identifier of an organization that supervises or regulates trading activity, e.g. CFTC, SEC, FSA, ODRF, etc.
 * 
 * <p>Java class for SupervisoryBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupervisoryBody">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/recordkeeping>Scheme">
 *       &lt;attribute name="supervisoryBodyScheme" type="{http://www.fpml.org/FpML-5/recordkeeping}NonEmptyURI" default="http://www.fpml.org/coding-scheme/supervisory-body" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupervisoryBody", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "value"
})
public class SupervisoryBody {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "supervisoryBodyScheme")
    protected String supervisoryBodyScheme;

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
     * Gets the value of the supervisoryBodyScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisoryBodyScheme() {
        if (supervisoryBodyScheme == null) {
            return "http://www.fpml.org/coding-scheme/supervisory-body";
        } else {
            return supervisoryBodyScheme;
        }
    }

    /**
     * Sets the value of the supervisoryBodyScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisoryBodyScheme(String value) {
        this.supervisoryBodyScheme = value;
    }

}
