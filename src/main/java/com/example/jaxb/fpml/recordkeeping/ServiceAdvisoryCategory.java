
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type that can be used to describe the category of an advisory message, e.g.. Availability, Rules, Products, etc., etc..
 * 
 * <p>Java class for ServiceAdvisoryCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAdvisoryCategory">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/recordkeeping>Scheme">
 *       &lt;attribute name="serviceAdvisoryCategoryScheme" type="{http://www.fpml.org/FpML-5/recordkeeping}NonEmptyURI" default="http://www.fpml.org/coding-scheme/service-advisory-category" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAdvisoryCategory", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "value"
})
public class ServiceAdvisoryCategory {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "serviceAdvisoryCategoryScheme")
    protected String serviceAdvisoryCategoryScheme;

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
     * Gets the value of the serviceAdvisoryCategoryScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAdvisoryCategoryScheme() {
        if (serviceAdvisoryCategoryScheme == null) {
            return "http://www.fpml.org/coding-scheme/service-advisory-category";
        } else {
            return serviceAdvisoryCategoryScheme;
        }
    }

    /**
     * Sets the value of the serviceAdvisoryCategoryScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAdvisoryCategoryScheme(String value) {
        this.serviceAdvisoryCategoryScheme = value;
    }

}
