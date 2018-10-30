
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommodityBasketOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityBasketOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Option">
 *       &lt;sequence>
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/recordkeeping}PutCallEnum"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityBasketOptionFeatures.model" minOccurs="0"/>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityBasket.model"/>
 *         &lt;sequence>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="strikePriceUnderlyingReference" type="{http://www.fpml.org/FpML-5/recordkeeping}StrikePriceUnderlyingReference"/>
 *             &lt;element name="strikePriceBasketReference" type="{http://www.fpml.org/FpML-5/recordkeeping}StrikePriceBasketReference"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityStrikePrice.model"/>
 *             &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityFloatingStrikePrice.model"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="exercise" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityExerciseBasket"/>
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPremium" maxOccurs="unbounded"/>
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
@XmlType(name = "CommodityBasketOption", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class CommodityBasketOption
    extends Option
{


}
