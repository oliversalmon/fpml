
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Descrines the characteristics for American exercise in FX digital options.
 * 
 * <p>Java class for FxDigitalAmericanExercise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxDigitalAmericanExercise">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Exercise">
 *       &lt;sequence>
 *         &lt;element name="commencementDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="expiryTime" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessCenterTime" minOccurs="0"/>
 *         &lt;element name="cutName" type="{http://www.fpml.org/FpML-5/recordkeeping}CutName" minOccurs="0"/>
 *         &lt;element name="latestValueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxDigitalAmericanExercise", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "commencementDate",
    "expiryDate",
    "expiryTime",
    "cutName",
    "latestValueDate"
})
@XmlSeeAlso({
    FxAmericanExercise.class
})
public class FxDigitalAmericanExercise
    extends Exercise
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    protected AdjustableOrRelativeDate commencementDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessCenterTime expiryTime;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CutName cutName;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar latestValueDate;

    /**
     * Gets the value of the commencementDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getCommencementDate() {
        return commencementDate;
    }

    /**
     * Sets the value of the commencementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setCommencementDate(AdjustableOrRelativeDate value) {
        this.commencementDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the expiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenterTime }
     *     
     */
    public BusinessCenterTime getExpiryTime() {
        return expiryTime;
    }

    /**
     * Sets the value of the expiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenterTime }
     *     
     */
    public void setExpiryTime(BusinessCenterTime value) {
        this.expiryTime = value;
    }

    /**
     * Gets the value of the cutName property.
     * 
     * @return
     *     possible object is
     *     {@link CutName }
     *     
     */
    public CutName getCutName() {
        return cutName;
    }

    /**
     * Sets the value of the cutName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CutName }
     *     
     */
    public void setCutName(CutName value) {
        this.cutName = value;
    }

    /**
     * Gets the value of the latestValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestValueDate() {
        return latestValueDate;
    }

    /**
     * Sets the value of the latestValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestValueDate(XMLGregorianCalendar value) {
        this.latestValueDate = value;
    }

}
