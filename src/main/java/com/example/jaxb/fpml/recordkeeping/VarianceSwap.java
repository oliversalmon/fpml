
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A Variance Swap.
 * 
 * <p>Java class for VarianceSwap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VarianceSwap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}NettedSwapBase">
 *       &lt;sequence>
 *         &lt;element name="varianceLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}VarianceLeg" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VarianceSwap", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class VarianceSwap
    extends NettedSwapBase
{


}
