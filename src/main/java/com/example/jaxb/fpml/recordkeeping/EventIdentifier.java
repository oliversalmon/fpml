
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of a business event, for example through its correlation id or a business identifier.
 * 
 * <p>Java class for EventIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CorrelationId.model"/>
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}Sequence.model" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="tradeIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}TradeIdentifier"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventIdentifier", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "correlationId",
    "sequenceNumber",
    "tradeIdentifier"
})
public class EventIdentifier {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<CorrelationId> correlationId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TradeIdentifier tradeIdentifier;

    /**
     * Gets the value of the correlationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrelationId }
     * 
     * 
     */
    public List<CorrelationId> getCorrelationId() {
        if (correlationId == null) {
            correlationId = new ArrayList<CorrelationId>();
        }
        return this.correlationId;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the tradeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TradeIdentifier }
     *     
     */
    public TradeIdentifier getTradeIdentifier() {
        return tradeIdentifier;
    }

    /**
     * Sets the value of the tradeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeIdentifier }
     *     
     */
    public void setTradeIdentifier(TradeIdentifier value) {
        this.tradeIdentifier = value;
    }

}
