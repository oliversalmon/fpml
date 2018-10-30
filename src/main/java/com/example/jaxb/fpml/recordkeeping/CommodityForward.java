
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Commodity Forward
 * 
 * <p>Java class for CommodityForward complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityForward">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;element name="valueDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="fixedLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}NonPeriodicFixedPriceLeg"/>
 *           &lt;element name="averagePriceLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}AveragePriceLeg"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/recordkeeping}commodityForwardLeg" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityContent.model" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityForward", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class CommodityForward
    extends Product
{


}
