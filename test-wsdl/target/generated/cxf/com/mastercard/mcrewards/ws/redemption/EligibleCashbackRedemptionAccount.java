
package com.mastercard.mcrewards.ws.redemption;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EligibleCashbackRedemptionAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EligibleCashbackRedemptionAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="belongsToLoggedInCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="BanLast4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fulfillmentCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligibleCashbackRedemptionAccount", propOrder = {
    "accountId",
    "belongsToLoggedInCustomer",
    "banLast4",
    "productName",
    "fulfillmentCd"
})
public class EligibleCashbackRedemptionAccount {

    protected long accountId;
    protected boolean belongsToLoggedInCustomer;
    @XmlElement(name = "BanLast4", required = true)
    protected String banLast4;
    @XmlElement(required = true)
    protected String productName;
    protected String fulfillmentCd;

    /**
     * Gets the value of the accountId property.
     * 
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the belongsToLoggedInCustomer property.
     * 
     */
    public boolean isBelongsToLoggedInCustomer() {
        return belongsToLoggedInCustomer;
    }

    /**
     * Sets the value of the belongsToLoggedInCustomer property.
     * 
     */
    public void setBelongsToLoggedInCustomer(boolean value) {
        this.belongsToLoggedInCustomer = value;
    }

    /**
     * Gets the value of the banLast4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanLast4() {
        return banLast4;
    }

    /**
     * Sets the value of the banLast4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanLast4(String value) {
        this.banLast4 = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the fulfillmentCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentCd() {
        return fulfillmentCd;
    }

    /**
     * Sets the value of the fulfillmentCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentCd(String value) {
        this.fulfillmentCd = value;
    }

}
