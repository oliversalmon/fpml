
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type that can be used to hold an identifier for a report instance.
 * 
 * <p>Java class for ReportId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportId">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/recordkeeping>NonEmptyScheme">
 *       &lt;attribute name="reportIdScheme" type="{http://www.fpml.org/FpML-5/recordkeeping}NonEmptyURI" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportId", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "value"
})
public class ReportId {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "reportIdScheme")
    protected String reportIdScheme;

    /**
     * The base class for all types which define coding schemes that must be populated.
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
     * Gets the value of the reportIdScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportIdScheme() {
        return reportIdScheme;
    }

    /**
     * Sets the value of the reportIdScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportIdScheme(String value) {
        this.reportIdScheme = value;
    }

}
