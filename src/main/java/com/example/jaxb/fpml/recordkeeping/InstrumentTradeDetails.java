
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The economics of a trade of a multiply traded instrument.
 * 
 * <p>Java class for InstrumentTradeDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrumentTradeDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BuyerSeller.model"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}underlyingAsset" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.fpml.org/FpML-5/recordkeeping}InstrumentTradeQuantity" minOccurs="0"/>
 *         &lt;element name="pricing" type="{http://www.fpml.org/FpML-5/recordkeeping}InstrumentTradePricing" minOccurs="0"/>
 *         &lt;element name="principal" type="{http://www.fpml.org/FpML-5/recordkeeping}InstrumentTradePrincipal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentTradeDetails", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class InstrumentTradeDetails
    extends Product
{


}
