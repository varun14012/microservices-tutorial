
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
 *         &lt;element name="referenceId" type="{http://customer.ws.mcrewards.mastercard.com/}referenceId" minOccurs="0"/&gt;
 *         &lt;element name="includeLoggedInCustomerAccountsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "referenceId",
    "includeLoggedInCustomerAccountsOnly"
})
@XmlRootElement(name = "getCustomerAccounts")
public class GetCustomerAccounts
    implements Serializable
{

    protected String referenceId;
    @XmlElement(defaultValue = "true")
    protected Boolean includeLoggedInCustomerAccountsOnly;

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the includeLoggedInCustomerAccountsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeLoggedInCustomerAccountsOnly() {
        return includeLoggedInCustomerAccountsOnly;
    }

    /**
     * Sets the value of the includeLoggedInCustomerAccountsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeLoggedInCustomerAccountsOnly(Boolean value) {
        this.includeLoggedInCustomerAccountsOnly = value;
    }

}
