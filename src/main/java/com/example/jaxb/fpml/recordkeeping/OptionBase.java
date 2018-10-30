
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type for defining the common features of options.
 * 
 * <p>Java class for OptionBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Option">
 *       &lt;sequence>
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/recordkeeping}OptionTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionBase", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
@XmlSeeAlso({
    OptionBaseExtended.class
})
public abstract class OptionBase
    extends Option
{


}
