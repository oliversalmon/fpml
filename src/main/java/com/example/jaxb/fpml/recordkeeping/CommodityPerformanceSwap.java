
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type describing a commodity performance swap in which one leg pays out based on the return on a reference commodity index or commodity reference price.
 * 
 * <p>Java class for CommodityPerformanceSwap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityPerformanceSwap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPerformanceSwapBase">
 *       &lt;sequence>
 *         &lt;element name="earlyTermination" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPerformanceSwapEarlyTermination" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityPerformanceSwap", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class CommodityPerformanceSwap
    extends CommodityPerformanceSwapBase
{


}
