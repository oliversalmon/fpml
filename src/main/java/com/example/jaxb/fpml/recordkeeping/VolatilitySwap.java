
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A Volatility Swap.
 * 
 * <p>Java class for VolatilitySwap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolatilitySwap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}NettedSwapBase">
 *       &lt;sequence>
 *         &lt;element name="volatilityLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}VolatilityLeg" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolatilitySwap", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class VolatilitySwap
    extends NettedSwapBase
{


}
