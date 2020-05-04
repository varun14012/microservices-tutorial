
package com.mastercard.mcrewards.ws.redemption;

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
 *         &lt;element name="householdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="confirmationEmailSw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="confirmationEmailAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redemptions" type="{http://redemption.ws.mcrewards.mastercard.com/}ItemRedemption" maxOccurs="unbounded"/&gt;
 *         &lt;element name="creditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cvc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cardBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "householdId",
    "confirmationEmailSw",
    "confirmationEmailAddr",
    "redemptions",
    "creditCardNumber",
    "expirationDate",
    "cvc",
    "cardBrand",
    "language",
    "userId"
})
@XmlRootElement(name = "doItemRedemption")
public class DoItemRedemption {

    protected Long householdId;
    protected boolean confirmationEmailSw;
    protected String confirmationEmailAddr;
    @XmlElement(required = true)
    protected List<ItemRedemption> redemptions;
    protected String creditCardNumber;
    protected String expirationDate;
    protected String cvc;
    protected String cardBrand;
    protected String language;
    protected String userId;

    /**
     * Gets the value of the householdId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHouseholdId() {
        return householdId;
    }

    /**
     * Sets the value of the householdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHouseholdId(Long value) {
        this.householdId = value;
    }

    /**
     * Gets the value of the confirmationEmailSw property.
     * 
     */
    public boolean isConfirmationEmailSw() {
        return confirmationEmailSw;
    }

    /**
     * Sets the value of the confirmationEmailSw property.
     * 
     */
    public void setConfirmationEmailSw(boolean value) {
        this.confirmationEmailSw = value;
    }

    /**
     * Gets the value of the confirmationEmailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationEmailAddr() {
        return confirmationEmailAddr;
    }

    /**
     * Sets the value of the confirmationEmailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationEmailAddr(String value) {
        this.confirmationEmailAddr = value;
    }

    /**
     * Gets the value of the redemptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redemptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedemptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemRedemption }
     * 
     * 
     */
    public List<ItemRedemption> getRedemptions() {
        if (redemptions == null) {
            redemptions = new ArrayList<ItemRedemption>();
        }
        return this.redemptions;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the cvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvc() {
        return cvc;
    }

    /**
     * Sets the value of the cvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvc(String value) {
        this.cvc = value;
    }

    /**
     * Gets the value of the cardBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBrand() {
        return cardBrand;
    }

    /**
     * Sets the value of the cardBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBrand(String value) {
        this.cardBrand = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
