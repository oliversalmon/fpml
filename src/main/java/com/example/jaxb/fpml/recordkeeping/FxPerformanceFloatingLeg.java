
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Fx Performance Floating Leg describes Floating FX Rate Payer.
 * 
 * <p>Java class for FxPerformanceFloatingLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxPerformanceFloatingLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}FxPerformanceLeg">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxPerformanceFloatingLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class FxPerformanceFloatingLeg
    extends FxPerformanceLeg
{


}
