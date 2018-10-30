
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing the correlation amount of a correlation swap.
 * 
 * <p>Java class for Correlation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Correlation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CalculationFromObservation">
 *       &lt;sequence>
 *         &lt;element name="notionalAmount" type="{http://www.fpml.org/FpML-5/recordkeeping}NonNegativeMoney"/>
 *         &lt;element name="correlationStrikePrice" type="{http://www.fpml.org/FpML-5/recordkeeping}CorrelationValue"/>
 *         &lt;element name="boundedCorrelation" type="{http://www.fpml.org/FpML-5/recordkeeping}BoundedCorrelation" minOccurs="0"/>
 *         &lt;element name="numberOfDataSeries" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Correlation", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class Correlation
    extends CalculationFromObservation
{


}
