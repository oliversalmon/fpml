
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Under 2002 Definitions, When entering into the Transaction, the parties should specify whether, for purposes of determining the initial Share price, they are agreeing to (a) a specific initial price (in which case, the initialLevel element should be populated with the price) or (b) use the price of a Share at the close of the regular trading session on the Trade Date (in which case the closingLevel element should be populated as true) or (c) in the case of a forward starting transaction only, use the Official Settlement Price of the Expiring Contract on the Observation Start Date (in which case expiring Level element should be populated as true). Under 2011 definitions, When entering into the Transaction, the parties should specify whether, for purposes of determining the OPSD Pricing Election, they are agreeing to (a) an agreed price (in which case, the initialLevel element should be populated with the price) or (b) use the Index Close Pricing (Official), (in which case closingLevel element should be populated as true) or (c) use OSP Pricing (in which case the initialLevelSource element should be populated with “OSPPrice”).
 * 
 * <p>Java class for Volatility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Volatility">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CalculationFromObservation">
 *       &lt;sequence>
 *         &lt;element name="volatilityCap" type="{http://www.fpml.org/FpML-5/recordkeeping}VolatilityCap" minOccurs="0"/>
 *         &lt;element name="volatilityStrikePrice" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeDecimal"/>
 *         &lt;element name="vegaNotionalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Volatility", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class Volatility
    extends CalculationFromObservation
{


}
