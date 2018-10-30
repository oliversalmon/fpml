
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The representation of the schedule as an offset relative to another schedule. For example, the settlement schedule may be relative to the expiry schedule by an FxForward offset.
 * 
 * <p>Java class for FxDateOffset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxDateOffset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="convention" type="{http://www.fpml.org/FpML-5/recordkeeping}FxOffsetConventionEnum"/>
 *         &lt;element name="offset" type="{http://www.fpml.org/FpML-5/recordkeeping}Period" minOccurs="0"/>
 *         &lt;element name="relativeTo" type="{http://www.fpml.org/FpML-5/recordkeeping}FxScheduleReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxDateOffset", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "convention",
    "offset",
    "relativeTo"
})
public class FxDateOffset {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "token")
    protected FxOffsetConventionEnum convention;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Period offset;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected FxScheduleReference relativeTo;

    /**
     * Gets the value of the convention property.
     * 
     * @return
     *     possible object is
     *     {@link FxOffsetConventionEnum }
     *     
     */
    public FxOffsetConventionEnum getConvention() {
        return convention;
    }

    /**
     * Sets the value of the convention property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxOffsetConventionEnum }
     *     
     */
    public void setConvention(FxOffsetConventionEnum value) {
        this.convention = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setOffset(Period value) {
        this.offset = value;
    }

    /**
     * Gets the value of the relativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link FxScheduleReference }
     *     
     */
    public FxScheduleReference getRelativeTo() {
        return relativeTo;
    }

    /**
     * Sets the value of the relativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxScheduleReference }
     *     
     */
    public void setRelativeTo(FxScheduleReference value) {
        this.relativeTo = value;
    }

}
