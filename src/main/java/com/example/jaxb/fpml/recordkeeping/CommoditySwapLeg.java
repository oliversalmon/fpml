
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract base class for all commodity swap legs
 * 
 * <p>Java class for CommoditySwapLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommoditySwapLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Leg">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommoditySwapLeg", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlSeeAlso({
    NonPeriodicFixedPriceLeg.class,
    AveragePriceLeg.class,
    PhysicalSwapLeg.class,
    FinancialSwapLeg.class
})
public abstract class CommoditySwapLeg
    extends Leg
{


}
