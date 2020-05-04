
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="enterpriseSiteId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankAccountNumber" type="{http://customer.ws.mcrewards.mastercard.com/}encryptedField"/&gt;
 *         &lt;element name="validateAnswers" type="{http://customer.ws.mcrewards.mastercard.com/}ValidateAnswer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "enterpriseSiteId",
    "bankAccountNumber",
    "validateAnswers"
})
@XmlRootElement(name = "validateCustomer")
public class ValidateCustomer
    implements Serializable
{

    protected String enterpriseSiteId;
    @XmlElement(required = true)
    protected EncryptedField bankAccountNumber;
    protected List<ValidateAnswer> validateAnswers;

    /**
     * Gets the value of the enterpriseSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseSiteId() {
        return enterpriseSiteId;
    }

    /**
     * Sets the value of the enterpriseSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseSiteId(String value) {
        this.enterpriseSiteId = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedField }
     *     
     */
    public EncryptedField getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedField }
     *     
     */
    public void setBankAccountNumber(EncryptedField value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the validateAnswers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validateAnswers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidateAnswers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidateAnswer }
     * 
     * 
     */
    public List<ValidateAnswer> getValidateAnswers() {
        if (validateAnswers == null) {
            validateAnswers = new ArrayList<ValidateAnswer>();
        }
        return this.validateAnswers;
    }

}
