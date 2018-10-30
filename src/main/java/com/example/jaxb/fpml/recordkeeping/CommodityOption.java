
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a commodity option product type. The product support for financially-settled exercises or exercise into physical forward contracts written on precious and non-precious metals. options in FpML is based on the creation of a 'commodityOption' product. The product references the 'commodity' underlyer in order to support the underlying asset of the option.
 * 
 * <p>Java class for CommodityOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BuyerSeller.model"/>
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/recordkeeping}PutCallEnum"/>
 *         &lt;choice minOccurs="0">
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityFinancialOption.model"/>
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPhysicalOption.model"/>
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}CommodityWeatherOption.model"/>
 *         &lt;/choice>
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/recordkeeping}CommodityPremium" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CommodityOption", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class CommodityOption
    extends Product
{


}
