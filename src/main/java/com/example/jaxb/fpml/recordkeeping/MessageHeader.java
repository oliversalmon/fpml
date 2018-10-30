
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the content model for a generic message header that is refined by its derived classes.
 * 
 * <p>Java class for MessageHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://www.fpml.org/FpML-5/recordkeeping}MessageId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHeader", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "messageId"
})
@XmlSeeAlso({
    ExceptionMessageHeader.class,
    ResponseMessageHeader.class,
    RequestMessageHeader.class,
    NotificationMessageHeader.class
})
public abstract class MessageHeader {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected MessageId messageId;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageId }
     *     
     */
    public MessageId getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageId }
     *     
     */
    public void setMessageId(MessageId value) {
        this.messageId = value;
    }

}
