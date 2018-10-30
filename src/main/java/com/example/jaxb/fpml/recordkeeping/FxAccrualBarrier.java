
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FxAccrualBarrier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxAccrualBarrier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FxComplexBarrierBase">
 *       &lt;sequence>
 *         &lt;element name="accrualRetention" type="{http://www.fpml.org/FpML-5/recordkeeping}FxAccrualKnockoutBarrierRetentionEnum" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="observableReference" type="{http://www.fpml.org/FpML-5/recordkeeping}FxRateObservableReference"/>
 *           &lt;sequence>
 *             &lt;element name="quotedCurrencyPair" type="{http://www.fpml.org/FpML-5/recordkeeping}QuotedCurrencyPair"/>
 *             &lt;element name="informationSource" type="{http://www.fpml.org/FpML-5/recordkeeping}InformationSource" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
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
@XmlType(name = "FxAccrualBarrier", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "accrualRetention",
    "observableReference",
    "quotedCurrencyPair",
    "informationSource"
})
public class FxAccrualBarrier
    extends FxComplexBarrierBase
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected FxAccrualKnockoutBarrierRetentionEnum accrualRetention;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected FxRateObservableReference observableReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QuotedCurrencyPair quotedCurrencyPair;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<InformationSource> informationSource;

    /**
     * Gets the value of the accrualRetention property.
     * 
     * @return
     *     possible object is
     *     {@link FxAccrualKnockoutBarrierRetentionEnum }
     *     
     */
    public FxAccrualKnockoutBarrierRetentionEnum getAccrualRetention() {
        return accrualRetention;
    }

    /**
     * Sets the value of the accrualRetention property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxAccrualKnockoutBarrierRetentionEnum }
     *     
     */
    public void setAccrualRetention(FxAccrualKnockoutBarrierRetentionEnum value) {
        this.accrualRetention = value;
    }

    /**
     * Gets the value of the observableReference property.
     * 
     * @return
     *     possible object is
     *     {@link FxRateObservableReference }
     *     
     */
    public FxRateObservableReference getObservableReference() {
        return observableReference;
    }

    /**
     * Sets the value of the observableReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxRateObservableReference }
     *     
     */
    public void setObservableReference(FxRateObservableReference value) {
        this.observableReference = value;
    }

    /**
     * Gets the value of the quotedCurrencyPair property.
     * 
     * @return
     *     possible object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public QuotedCurrencyPair getQuotedCurrencyPair() {
        return quotedCurrencyPair;
    }

    /**
     * Sets the value of the quotedCurrencyPair property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotedCurrencyPair }
     *     
     */
    public void setQuotedCurrencyPair(QuotedCurrencyPair value) {
        this.quotedCurrencyPair = value;
    }

    /**
     * Gets the value of the informationSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationSource }
     * 
     * 
     */
    public List<InformationSource> getInformationSource() {
        if (informationSource == null) {
            informationSource = new ArrayList<InformationSource>();
        }
        return this.informationSource;
    }

}
