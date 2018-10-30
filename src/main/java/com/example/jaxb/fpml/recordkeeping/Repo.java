
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A Repo, modeled as an FpML:Product. Note: this Repo model is a candidate model for further industry input.
 * 
 * <p>Java class for Repo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Repo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}Product">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="fixedRateSchedule" type="{http://www.fpml.org/FpML-5/recordkeeping}Schedule"/>
 *           &lt;element name="floatingRateCalculation" type="{http://www.fpml.org/FpML-5/recordkeeping}FloatingRateCalculation"/>
 *         &lt;/choice>
 *         &lt;element name="dayCountFraction" type="{http://www.fpml.org/FpML-5/recordkeeping}DayCountFraction"/>
 *         &lt;choice>
 *           &lt;element name="duration" type="{http://www.fpml.org/FpML-5/recordkeeping}RepoDurationEnum"/>
 *           &lt;sequence>
 *             &lt;element name="callingParty" type="{http://www.fpml.org/FpML-5/recordkeeping}CallingPartyEnum"/>
 *             &lt;element name="callDate" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOrRelativeDate" minOccurs="0"/>
 *             &lt;choice minOccurs="0">
 *               &lt;element name="noticePeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}AdjustableOffset"/>
 *               &lt;element name="partyNoticePeriod" type="{http://www.fpml.org/FpML-5/recordkeeping}PartyNoticePeriod" maxOccurs="2"/>
 *             &lt;/choice>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="initialMargin" type="{http://www.fpml.org/FpML-5/recordkeeping}InitialMargin" minOccurs="0"/>
 *         &lt;element name="nearLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}RepoNearLeg"/>
 *         &lt;element name="farLeg" type="{http://www.fpml.org/FpML-5/recordkeeping}RepoFarLeg" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;group ref="{http://www.fpml.org/FpML-5/recordkeeping}BondEquity.model" maxOccurs="unbounded"/>
 *           &lt;element name="triParty" type="{http://www.fpml.org/FpML-5/recordkeeping}TriParty"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Repo", namespace = "http://www.fpml.org/FpML-5/recordkeeping")
public class Repo
    extends Product
{


}
