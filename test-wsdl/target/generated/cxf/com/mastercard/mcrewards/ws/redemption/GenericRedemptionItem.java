
package com.mastercard.mcrewards.ws.redemption;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericRedemptionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericRedemptionItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="redemptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardMatrixItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="emailAddressName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personalizedInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redemptionItemDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericRedemptionItem", propOrder = {
    "redemptionNumber",
    "rewardMatrixItemId",
    "quantity",
    "emailAddressName",
    "emailAddress",
    "personalizedInformation",
    "referenceNumber",
    "redemptionItemDesc",
    "sourceItemId"
})
@XmlSeeAlso({
    ItemRedemption.class,
    ExternalItem.class
})
public class GenericRedemptionItem {

    protected String redemptionNumber;
    protected String rewardMatrixItemId;
    protected long quantity;
    protected String emailAddressName;
    protected String emailAddress;
    protected String personalizedInformation;
    protected String referenceNumber;
    protected String redemptionItemDesc;
    protected String sourceItemId;

    /**
     * Gets the value of the redemptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionNumber() {
        return redemptionNumber;
    }

    /**
     * Sets the value of the redemptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionNumber(String value) {
        this.redemptionNumber = value;
    }

    /**
     * Gets the value of the rewardMatrixItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardMatrixItemId() {
        return rewardMatrixItemId;
    }

    /**
     * Sets the value of the rewardMatrixItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardMatrixItemId(String value) {
        this.rewardMatrixItemId = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the emailAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddressName() {
        return emailAddressName;
    }

    /**
     * Sets the value of the emailAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddressName(String value) {
        this.emailAddressName = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the personalizedInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalizedInformation() {
        return personalizedInformation;
    }

    /**
     * Sets the value of the personalizedInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalizedInformation(String value) {
        this.personalizedInformation = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the redemptionItemDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionItemDesc() {
        return redemptionItemDesc;
    }

    /**
     * Sets the value of the redemptionItemDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionItemDesc(String value) {
        this.redemptionItemDesc = value;
    }

    /**
     * Gets the value of the sourceItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceItemId() {
        return sourceItemId;
    }

    /**
     * Sets the value of the sourceItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceItemId(String value) {
        this.sourceItemId = value;
    }

}
