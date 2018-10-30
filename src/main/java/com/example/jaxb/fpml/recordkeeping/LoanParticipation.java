
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanParticipation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanParticipation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}PCDeliverableObligationCharac">
 *       &lt;sequence>
 *         &lt;element name="qualifyingParticipationSeller" type="{http://www.fpml.org/FpML-5/recordkeeping}String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanParticipation", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "qualifyingParticipationSeller"
})
public class LoanParticipation
    extends PCDeliverableObligationCharac
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected String qualifyingParticipationSeller;

    /**
     * Gets the value of the qualifyingParticipationSeller property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifyingParticipationSeller() {
        return qualifyingParticipationSeller;
    }

    /**
     * Sets the value of the qualifyingParticipationSeller property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifyingParticipationSeller(String value) {
        this.qualifyingParticipationSeller = value;
    }

}
