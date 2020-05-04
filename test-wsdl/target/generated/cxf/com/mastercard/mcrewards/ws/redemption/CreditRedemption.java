
package com.mastercard.mcrewards.ws.redemption;

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
 *         &lt;element name="redemptionId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="creditDescription" type="{http://redemption.ws.mcrewards.mastercard.com/}creditDescription" minOccurs="0"/&gt;
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
    "redemptionId",
    "creditDescription",
    "userId"
})
@XmlRootElement(name = "creditRedemption")
public class CreditRedemption {

    protected long redemptionId;
    protected String creditDescription;
    @XmlElement(defaultValue = "MRSWSRED")
    protected String userId;

    /**
     * Gets the value of the redemptionId property.
     * 
     */
    public long getRedemptionId() {
        return redemptionId;
    }

    /**
     * Sets the value of the redemptionId property.
     * 
     */
    public void setRedemptionId(long value) {
        this.redemptionId = value;
    }

    /**
     * Gets the value of the creditDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditDescription() {
        return creditDescription;
    }

    /**
     * Sets the value of the creditDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditDescription(String value) {
        this.creditDescription = value;
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
