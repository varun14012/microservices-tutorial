
package com.mastercard.mcrewards.ws.redemption;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemRedemption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemRedemption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://redemption.ws.mcrewards.mastercard.com/}GenericRedemptionItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newShippingAddressSw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="shippingAddressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vendorOfferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="targetAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingAddress" type="{http://redemption.ws.mcrewards.mastercard.com/}ShippingAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemRedemption", propOrder = {
    "sourceItemCode",
    "newShippingAddressSw",
    "shippingAddressId",
    "vendorOfferId",
    "targetAccountId",
    "shippingAddress"
})
public class ItemRedemption
    extends GenericRedemptionItem
{

    protected String sourceItemCode;
    protected boolean newShippingAddressSw;
    protected String shippingAddressId;
    protected String vendorOfferId;
    protected String targetAccountId;
    protected ShippingAddress shippingAddress;

    /**
     * Gets the value of the sourceItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceItemCode() {
        return sourceItemCode;
    }

    /**
     * Sets the value of the sourceItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceItemCode(String value) {
        this.sourceItemCode = value;
    }

    /**
     * Gets the value of the newShippingAddressSw property.
     * 
     */
    public boolean isNewShippingAddressSw() {
        return newShippingAddressSw;
    }

    /**
     * Sets the value of the newShippingAddressSw property.
     * 
     */
    public void setNewShippingAddressSw(boolean value) {
        this.newShippingAddressSw = value;
    }

    /**
     * Gets the value of the shippingAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressId() {
        return shippingAddressId;
    }

    /**
     * Sets the value of the shippingAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressId(String value) {
        this.shippingAddressId = value;
    }

    /**
     * Gets the value of the vendorOfferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorOfferId() {
        return vendorOfferId;
    }

    /**
     * Sets the value of the vendorOfferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorOfferId(String value) {
        this.vendorOfferId = value;
    }

    /**
     * Gets the value of the targetAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAccountId() {
        return targetAccountId;
    }

    /**
     * Sets the value of the targetAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAccountId(String value) {
        this.targetAccountId = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAddress }
     *     
     */
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAddress }
     *     
     */
    public void setShippingAddress(ShippingAddress value) {
        this.shippingAddress = value;
    }

}
