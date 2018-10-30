
package com.example.jaxb.fpml.recordkeeping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type that represents information about a person connected with a trade or business process.
 * 
 * <p>Java class for Person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="honorific" type="{http://www.fpml.org/FpML-5/recordkeeping}NormalizedString" minOccurs="0"/>
 *           &lt;element name="firstName" type="{http://www.fpml.org/FpML-5/recordkeeping}NormalizedString" minOccurs="0"/>
 *           &lt;choice minOccurs="0">
 *             &lt;element name="middleName" type="{http://www.fpml.org/FpML-5/recordkeeping}NormalizedString" maxOccurs="unbounded"/>
 *             &lt;element name="initial" type="{http://www.fpml.org/FpML-5/recordkeeping}Initial" maxOccurs="unbounded"/>
 *           &lt;/choice>
 *           &lt;element name="surname" type="{http://www.fpml.org/FpML-5/recordkeeping}NormalizedString" minOccurs="0"/>
 *           &lt;element name="suffix" type="{http://www.fpml.org/FpML-5/recordkeeping}NormalizedString" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="personId" type="{http://www.fpml.org/FpML-5/recordkeeping}PersonId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessUnitReference" type="{http://www.fpml.org/FpML-5/recordkeeping}BusinessUnitReference" minOccurs="0"/>
 *         &lt;element name="contactInfo" type="{http://www.fpml.org/FpML-5/recordkeeping}ContactInformation" minOccurs="0"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.fpml.org/FpML-5/recordkeeping}CountryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "honorific",
    "firstName",
    "middleName",
    "initial",
    "surname",
    "suffix",
    "personId",
    "businessUnitReference",
    "contactInfo",
    "dateOfBirth",
    "country"
})
public class Person {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String honorific;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String firstName;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> middleName;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> initial;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String surname;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String suffix;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected List<PersonId> personId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected BusinessUnitReference businessUnitReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected ContactInformation contactInfo;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected CountryCode country;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the honorific property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHonorific() {
        return honorific;
    }

    /**
     * Sets the value of the honorific property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHonorific(String value) {
        this.honorific = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<String>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the initial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the initial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInitial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInitial() {
        if (initial == null) {
            initial = new ArrayList<String>();
        }
        return this.initial;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonId }
     * 
     * 
     */
    public List<PersonId> getPersonId() {
        if (personId == null) {
            personId = new ArrayList<PersonId>();
        }
        return this.personId;
    }

    /**
     * Gets the value of the businessUnitReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessUnitReference }
     *     
     */
    public BusinessUnitReference getBusinessUnitReference() {
        return businessUnitReference;
    }

    /**
     * Sets the value of the businessUnitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessUnitReference }
     *     
     */
    public void setBusinessUnitReference(BusinessUnitReference value) {
        this.businessUnitReference = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation }
     *     
     */
    public ContactInformation getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation }
     *     
     */
    public void setContactInfo(ContactInformation value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountry(CountryCode value) {
        this.country = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
