
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing return swaps including return swaps (long form), total return swaps, and variance swaps.
 * 
 * <p>Java class for ReturnSwap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnSwap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}ReturnSwapBase">
 *       &lt;sequence>
 *         &lt;element name="earlyTermination" type="{http://www.fpml.org/FpML-5/recordkeeping}ReturnSwapEarlyTermination" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extraordinaryEvents" type="{http://www.fpml.org/FpML-5/recordkeeping}ExtraordinaryEvents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnSwap", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class ReturnSwap
    extends ReturnSwapBase
{


}
