
package com.mastercard.mcrewards.ws.redemption;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemRedemptionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemRedemptionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="redemptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redemptionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voucherId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redemptionItemDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemRedemptionResult", propOrder = {
    "redemptionNumber",
    "redemptionId",
    "orderInformation",
    "voucherId",
    "referenceNumber",
    "redemptionItemDesc",
    "sourceItemId",
    "sourceItemCode"
})
public class ItemRedemptionResult {

    protected String redemptionNumber;
    protected String redemptionId;
    protected String orderInformation;
    protected String voucherId;
    protected String referenceNumber;
    protected String redemptionItemDesc;
    protected String sourceItemId;
    protected String sourceItemCode;

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
     * Gets the value of the redemptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionId() {
        return redemptionId;
    }

    /**
     * Sets the value of the redemptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionId(String value) {
        this.redemptionId = value;
    }

    /**
     * Gets the value of the orderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInformation() {
        return orderInformation;
    }

    /**
     * Sets the value of the orderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInformation(String value) {
        this.orderInformation = value;
    }

    /**
     * Gets the value of the voucherId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherId() {
        return voucherId;
    }

    /**
     * Sets the value of the voucherId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherId(String value) {
        this.voucherId = value;
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

}
