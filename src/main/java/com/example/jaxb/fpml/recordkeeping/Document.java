
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The abstract base type from which all FpML compliant messages and documents must be derived.
 * 
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.fpml.org/FpML-5/recordkeeping}VersionAttributes.atts"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlSeeAlso({
    DataDocument.class,
    Message.class
})
public abstract class Document {

    @XmlAttribute(name = "fpmlVersion", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fpmlVersion;
    @XmlAttribute(name = "expectedBuild")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger expectedBuild;
    @XmlAttribute(name = "actualBuild")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger actualBuild;

    /**
     * Gets the value of the fpmlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpmlVersion() {
        return fpmlVersion;
    }

    /**
     * Sets the value of the fpmlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpmlVersion(String value) {
        this.fpmlVersion = value;
    }

    /**
     * Gets the value of the expectedBuild property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpectedBuild() {
        return expectedBuild;
    }

    /**
     * Sets the value of the expectedBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpectedBuild(BigInteger value) {
        this.expectedBuild = value;
    }

    /**
     * Gets the value of the actualBuild property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActualBuild() {
        if (actualBuild == null) {
            return new BigInteger("5");
        } else {
            return actualBuild;
        }
    }

    /**
     * Sets the value of the actualBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActualBuild(BigInteger value) {
        this.actualBuild = value;
    }

}
