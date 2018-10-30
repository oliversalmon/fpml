
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A structure describing an option expiring (i.e. passing its last exercise time and becoming worthless.)
 * 
 * <p>Java class for OptionExpiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionExpiry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}AbstractEvent">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="originalTrade" type="{http://www.fpml.org/FpML-5/recordkeeping}Trade"/>
 *           &lt;element name="tradeIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyTradeIdentifier" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="exerciseProcedure" type="{http://www.fpml.org/FpML-5/recordkeeping}ExerciseProcedureOption" minOccurs="0"/>
 *         &lt;element name="actionOnExpiration" type="{http://www.fpml.org/FpML-5/recordkeeping}ActionOnExpiration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionExpiry", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "originalTrade",
    "tradeIdentifier",
    "date",
    "time",
    "exerciseProcedure",
    "actionOnExpiration"
})
public class OptionExpiry
    extends AbstractEvent
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Trade originalTrade;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PartyTradeIdentifier> tradeIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExerciseProcedureOption exerciseProcedure;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ActionOnExpiration actionOnExpiration;

    /**
     * Gets the value of the originalTrade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getOriginalTrade() {
        return originalTrade;
    }

    /**
     * Sets the value of the originalTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setOriginalTrade(Trade value) {
        this.originalTrade = value;
    }

    /**
     * Gets the value of the tradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeIdentifier }
     * 
     * 
     */
    public List<PartyTradeIdentifier> getTradeIdentifier() {
        if (tradeIdentifier == null) {
            tradeIdentifier = new ArrayList<PartyTradeIdentifier>();
        }
        return this.tradeIdentifier;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the exerciseProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseProcedureOption }
     *     
     */
    public ExerciseProcedureOption getExerciseProcedure() {
        return exerciseProcedure;
    }

    /**
     * Sets the value of the exerciseProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseProcedureOption }
     *     
     */
    public void setExerciseProcedure(ExerciseProcedureOption value) {
        this.exerciseProcedure = value;
    }

    /**
     * Gets the value of the actionOnExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link ActionOnExpiration }
     *     
     */
    public ActionOnExpiration getActionOnExpiration() {
        return actionOnExpiration;
    }

    /**
     * Sets the value of the actionOnExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionOnExpiration }
     *     
     */
    public void setActionOnExpiration(ActionOnExpiration value) {
        this.actionOnExpiration = value;
    }

}
