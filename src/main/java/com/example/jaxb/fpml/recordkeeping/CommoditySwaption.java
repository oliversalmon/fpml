
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Commodity Swaption.
 * 
 * <p>Java class for CommoditySwaption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommoditySwaption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BuyerSeller.model"/>
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/recordkeeping}PutCallEnum"/>
 *         &lt;element name="commoditySwap" type="{http://www.fpml.org/FpML-5/recordkeeping}CommoditySwaptionUnderlying"/>
 *         &lt;element name="physicalExercise" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPhysicalExercise" minOccurs="0"/>
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPremium" minOccurs="0"/>
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
@XmlType(name = "CommoditySwaption", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class CommoditySwaption
    extends Product
{


}
