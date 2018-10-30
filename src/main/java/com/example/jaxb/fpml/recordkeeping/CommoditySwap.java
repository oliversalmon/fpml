
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The commodity swap product model is designed to support fixed-float swaps, float-float swaps, fixed vs. physical swaps, float vs. physical swaps as well as, weather specific swaps. Its design is fully compatible with other FpML products and the product reuses standard common types.
 * 
 * <p>Java class for CommoditySwap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommoditySwap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommoditySwapDetails.model"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommoditySwap", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class CommoditySwap
    extends Product
{


}
