
package com.example.jaxb.fpml.recordkeeping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A type representing criteria for defining a query portfolio. The criteria are made up of a QueryParameterId, QueryParameterValue and QueryParameterOperator.
 * 
 * <p>Java class for QueryParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryParameter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryParameterId" type="{http://www.fpml.org/FpML-5/recordkeeping}QueryParameterId" minOccurs="0"/>
 *         &lt;element name="queryParameterValue" type="{http://www.fpml.org/FpML-5/recordkeeping}NormalizedString" minOccurs="0"/>
 *         &lt;element name="queryParameterOperator" type="{http://www.fpml.org/FpML-5/recordkeeping}QueryParameterOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryParameter", namespace = "http://www.fpml.org/FpML-5/recordkeeping", propOrder = {
    "queryParameterId",
    "queryParameterValue",
    "queryParameterOperator"
})
public class QueryParameter {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QueryParameterId queryParameterId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String queryParameterValue;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/recordkeeping")
    protected QueryParameterOperator queryParameterOperator;

    /**
     * Gets the value of the queryParameterId property.
     * 
     * @return
     *     possible object is
     *     {@link QueryParameterId }
     *     
     */
    public QueryParameterId getQueryParameterId() {
        return queryParameterId;
    }

    /**
     * Sets the value of the queryParameterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryParameterId }
     *     
     */
    public void setQueryParameterId(QueryParameterId value) {
        this.queryParameterId = value;
    }

    /**
     * Gets the value of the queryParameterValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryParameterValue() {
        return queryParameterValue;
    }

    /**
     * Sets the value of the queryParameterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryParameterValue(String value) {
        this.queryParameterValue = value;
    }

    /**
     * Gets the value of the queryParameterOperator property.
     * 
     * @return
     *     possible object is
     *     {@link QueryParameterOperator }
     *     
     */
    public QueryParameterOperator getQueryParameterOperator() {
        return queryParameterOperator;
    }

    /**
     * Sets the value of the queryParameterOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryParameterOperator }
     *     
     */
    public void setQueryParameterOperator(QueryParameterOperator value) {
        this.queryParameterOperator = value;
    }

}
