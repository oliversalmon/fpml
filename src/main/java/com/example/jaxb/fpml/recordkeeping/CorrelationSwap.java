
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A Correlation Swap modelled using a single netted leg.
 * 
 * <p>Java class for CorrelationSwap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrelationSwap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}NettedSwapBase">
 *       &lt;sequence>
 *         &lt;element name="correlationLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}CorrelationLeg"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrelationSwap", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class CorrelationSwap
    extends NettedSwapBase
{


}
