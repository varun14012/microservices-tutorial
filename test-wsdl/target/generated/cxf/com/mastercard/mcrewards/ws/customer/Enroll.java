
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerFields" type="{http://customer.ws.mcrewards.mastercard.com/}CustomerEnrollmentFields"/&gt;
 *         &lt;element name="customerAccountFields" type="{http://customer.ws.mcrewards.mastercard.com/}CustomerAccountEnrollmentFields"/&gt;
 *         &lt;element name="enrollmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerFields",
    "customerAccountFields",
    "enrollmentTypeCode"
})
@XmlRootElement(name = "enroll")
public class Enroll
    implements Serializable
{

    @XmlElement(required = true)
    protected CustomerEnrollmentFields customerFields;
    @XmlElement(required = true)
    protected CustomerAccountEnrollmentFields customerAccountFields;
    protected String enrollmentTypeCode;

    /**
     * Gets the value of the customerFields property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerEnrollmentFields }
     *     
     */
    public CustomerEnrollmentFields getCustomerFields() {
        return customerFields;
    }

    /**
     * Sets the value of the customerFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerEnrollmentFields }
     *     
     */
    public void setCustomerFields(CustomerEnrollmentFields value) {
        this.customerFields = value;
    }

    /**
     * Gets the value of the customerAccountFields property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountEnrollmentFields }
     *     
     */
    public CustomerAccountEnrollmentFields getCustomerAccountFields() {
        return customerAccountFields;
    }

    /**
     * Sets the value of the customerAccountFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountEnrollmentFields }
     *     
     */
    public void setCustomerAccountFields(CustomerAccountEnrollmentFields value) {
        this.customerAccountFields = value;
    }

    /**
     * Gets the value of the enrollmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentTypeCode() {
        return enrollmentTypeCode;
    }

    /**
     * Sets the value of the enrollmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentTypeCode(String value) {
        this.enrollmentTypeCode = value;
    }

}
