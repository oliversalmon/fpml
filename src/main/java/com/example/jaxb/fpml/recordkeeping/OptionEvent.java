
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}AbstractEvent">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="originalTrade" type="{http://www.fpml.org/FpML-5/recordkeeping}Trade"/>
 *           &lt;element name="tradeIdentifier" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyTradeIdentifier" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="knockIn" type="{http://www.fpml.org/FpML-5/recordkeeping}TriggerRateObservation"/>
 *           &lt;element name="knockOut" type="{http://www.fpml.org/FpML-5/recordkeeping}KnockOutRateObservation"/>
 *           &lt;element name="touch" type="{http://www.fpml.org/FpML-5/recordkeeping}TouchRateObservation" maxOccurs="2"/>
 *           &lt;element name="noTouch" type="{http://www.fpml.org/FpML-5/recordkeeping}NoTouchRateObservation"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionEvent", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "originalTrade",
    "tradeIdentifier",
    "knockIn",
    "knockOut",
    "touch",
    "noTouch"
})
public class OptionEvent
    extends AbstractEvent
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected Trade originalTrade;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PartyTradeIdentifier> tradeIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected TriggerRateObservation knockIn;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected KnockOutRateObservation knockOut;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<TouchRateObservation> touch;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected NoTouchRateObservation noTouch;

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
     * Gets the value of the knockIn property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerRateObservation }
     *     
     */
    public TriggerRateObservation getKnockIn() {
        return knockIn;
    }

    /**
     * Sets the value of the knockIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerRateObservation }
     *     
     */
    public void setKnockIn(TriggerRateObservation value) {
        this.knockIn = value;
    }

    /**
     * Gets the value of the knockOut property.
     * 
     * @return
     *     possible object is
     *     {@link KnockOutRateObservation }
     *     
     */
    public KnockOutRateObservation getKnockOut() {
        return knockOut;
    }

    /**
     * Sets the value of the knockOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnockOutRateObservation }
     *     
     */
    public void setKnockOut(KnockOutRateObservation value) {
        this.knockOut = value;
    }

    /**
     * Gets the value of the touch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the touch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTouch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TouchRateObservation }
     * 
     * 
     */
    public List<TouchRateObservation> getTouch() {
        if (touch == null) {
            touch = new ArrayList<TouchRateObservation>();
        }
        return this.touch;
    }

    /**
     * Gets the value of the noTouch property.
     * 
     * @return
     *     possible object is
     *     {@link NoTouchRateObservation }
     *     
     */
    public NoTouchRateObservation getNoTouch() {
        return noTouch;
    }

    /**
     * Sets the value of the noTouch property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoTouchRateObservation }
     *     
     */
    public void setNoTouch(NoTouchRateObservation value) {
        this.noTouch = value;
    }

}
