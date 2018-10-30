
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the variance amount of a variance swap.
 * 
 * <p>Java class for Variance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Variance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CalculationFromObservation">
 *       &lt;sequence>
 *         &lt;element name="varianceAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney"/>
 *         &lt;choice>
 *           &lt;element name="volatilityStrikePrice" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeDecimal"/>
 *           &lt;element name="varianceStrikePrice" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeDecimal"/>
 *         &lt;/choice>
 *         &lt;element name="varianceCap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="unadjustedVarianceCap" type="{http://www.fpml.org/FpML-5/recordkeeping}PositiveDecimal" minOccurs="0"/>
 *         &lt;element name="boundedVariance" type="{http://www.fpml.org/FpML-5/recordkeeping}BoundedVariance" minOccurs="0"/>
 *         &lt;element name="exchangeTradedContractNearest" type="{http://www.fpml.org/FpML-5/recordkeeping}ExchangeTradedContract" minOccurs="0"/>
 *         &lt;element name="vegaNotionalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variance", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class Variance
    extends CalculationFromObservation
{


}
