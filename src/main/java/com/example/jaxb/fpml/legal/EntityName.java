
package com.example.jaxb.fpml.legal;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The name of the reference entity. A free format string. FpML does not define usage rules for this element.
 * 
 * <p>Java class for EntityName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityName">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fpml.org/FpML-5/legal>Scheme">
 *       &lt;attribute name="entityNameScheme" type="{http://www.fpml.org/FpML-5/legal}NonEmptyURI" default="http://www.fpml.org/coding-scheme/external/entity-name-RED-1-0" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityName", namespace = "http://www.fpml.org/FpML-5/legal", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class EntityName {

    @XmlValue
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String value;
    @XmlAttribute(name = "entityNameScheme")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String entityNameScheme;

    /**
     * The base class for all types which define coding schemes that are allowed to be empty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the entityNameScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEntityNameScheme() {
        if (entityNameScheme == null) {
            return "http://www.fpml.org/coding-scheme/external/entity-name-RED-1-0";
        } else {
            return entityNameScheme;
        }
    }

    /**
     * Sets the value of the entityNameScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-10-30T08:17:37+00:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEntityNameScheme(String value) {
        this.entityNameScheme = value;
    }

}
