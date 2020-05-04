
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
 *         &lt;element name="oldBankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newBankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldBankCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newBankCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldBankProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newBankProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="actionCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="A"/&gt;
 *               &lt;enumeration value="C"/&gt;
 *               &lt;enumeration value="B"/&gt;
 *               &lt;enumeration value="P"/&gt;
 *               &lt;enumeration value="S"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="accountStatusCode" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
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
    "oldBankAccountNumber",
    "newBankAccountNumber",
    "oldBankCustomerNumber",
    "newBankCustomerNumber",
    "oldBankProductCode",
    "newBankProductCode",
    "actionCode",
    "accountStatusCode"
})
@XmlRootElement(name = "updateLostStolenAccount")
public class UpdateLostStolenAccount
    implements Serializable
{

    protected String oldBankAccountNumber;
    protected String newBankAccountNumber;
    protected String oldBankCustomerNumber;
    protected String newBankCustomerNumber;
    protected String oldBankProductCode;
    protected String newBankProductCode;
    @XmlElement(required = true)
    protected String actionCode;
    protected Short accountStatusCode;

    /**
     * Gets the value of the oldBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldBankAccountNumber() {
        return oldBankAccountNumber;
    }

    /**
     * Sets the value of the oldBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldBankAccountNumber(String value) {
        this.oldBankAccountNumber = value;
    }

    /**
     * Gets the value of the newBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBankAccountNumber() {
        return newBankAccountNumber;
    }

    /**
     * Sets the value of the newBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBankAccountNumber(String value) {
        this.newBankAccountNumber = value;
    }

    /**
     * Gets the value of the oldBankCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldBankCustomerNumber() {
        return oldBankCustomerNumber;
    }

    /**
     * Sets the value of the oldBankCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldBankCustomerNumber(String value) {
        this.oldBankCustomerNumber = value;
    }

    /**
     * Gets the value of the newBankCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBankCustomerNumber() {
        return newBankCustomerNumber;
    }

    /**
     * Sets the value of the newBankCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBankCustomerNumber(String value) {
        this.newBankCustomerNumber = value;
    }

    /**
     * Gets the value of the oldBankProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldBankProductCode() {
        return oldBankProductCode;
    }

    /**
     * Sets the value of the oldBankProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldBankProductCode(String value) {
        this.oldBankProductCode = value;
    }

    /**
     * Gets the value of the newBankProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBankProductCode() {
        return newBankProductCode;
    }

    /**
     * Sets the value of the newBankProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBankProductCode(String value) {
        this.newBankProductCode = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the accountStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getAccountStatusCode() {
        return accountStatusCode;
    }

    /**
     * Sets the value of the accountStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setAccountStatusCode(Short value) {
        this.accountStatusCode = value;
    }

}
