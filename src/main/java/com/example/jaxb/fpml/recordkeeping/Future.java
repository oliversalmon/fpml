
package com.example.jaxb.fpml.recordkeeping;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An exchange traded future contract.
 * 
 * <p>Java class for Future complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Future">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}ExchangeTraded">
 *       &lt;sequence>
 *         &lt;element name="multiplier" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="futureContractReference" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="maturity" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="contractYearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *         &lt;/choice>
 *         &lt;sequence>
 *           &lt;element name="underlyer" type="{http://www.fpml.org/FpML-5/recordkeeping}ExchangeTradedContractUnderlyer" minOccurs="0"/>
 *           &lt;element name="settlementType" type="{http://www.fpml.org/FpML-5/recordkeeping}SettlementTypeEnum" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Future", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "multiplier",
    "futureContractReference",
    "maturity",
    "contractYearMonth",
    "underlyer",
    "settlementType"
})
public class Future
    extends ExchangeTraded
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BigDecimal multiplier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String futureContractReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maturity;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar contractYearMonth;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ExchangeTradedContractUnderlyer underlyer;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "token")
    protected SettlementTypeEnum settlementType;

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier(BigDecimal value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the futureContractReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFutureContractReference() {
        return futureContractReference;
    }

    /**
     * Sets the value of the futureContractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFutureContractReference(String value) {
        this.futureContractReference = value;
    }

    /**
     * Gets the value of the maturity property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaturity() {
        return maturity;
    }

    /**
     * Sets the value of the maturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaturity(XMLGregorianCalendar value) {
        this.maturity = value;
    }

    /**
     * Gets the value of the contractYearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractYearMonth() {
        return contractYearMonth;
    }

    /**
     * Sets the value of the contractYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractYearMonth(XMLGregorianCalendar value) {
        this.contractYearMonth = value;
    }

    /**
     * Gets the value of the underlyer property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeTradedContractUnderlyer }
     *     
     */
    public ExchangeTradedContractUnderlyer getUnderlyer() {
        return underlyer;
    }

    /**
     * Sets the value of the underlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeTradedContractUnderlyer }
     *     
     */
    public void setUnderlyer(ExchangeTradedContractUnderlyer value) {
        this.underlyer = value;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public SettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public void setSettlementType(SettlementTypeEnum value) {
        this.settlementType = value;
    }

}
