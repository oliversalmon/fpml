
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A message type retracting a previous credit event notification.
 * 
 * <p>Java class for CreditEventNotificationRetracted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditEventNotificationRetracted">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fpml.org/FpML-5/recordkeeping}NonCorrectableRequestMessage">
 *       &lt;sequence>
 *         &lt;element name="creditEventNotice" type="{http://www.fpml.org/FpML-5/recordkeeping}CreditEventNoticeDocument" minOccurs="0"/>
 *         &lt;element name="party" type="{http://www.fpml.org/FpML-5/recordkeeping}Party" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditEventNotificationRetracted", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "creditEventNotice",
    "party"
})
public class CreditEventNotificationRetracted
    extends NonCorrectableRequestMessage
{

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CreditEventNoticeDocument creditEventNotice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<Party> party;

    /**
     * Gets the value of the creditEventNotice property.
     * 
     * @return
     *     possible object is
     *     {@link CreditEventNoticeDocument }
     *     
     */
    public CreditEventNoticeDocument getCreditEventNotice() {
        return creditEventNotice;
    }

    /**
     * Sets the value of the creditEventNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditEventNoticeDocument }
     *     
     */
    public void setCreditEventNotice(CreditEventNoticeDocument value) {
        this.creditEventNotice = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

}
