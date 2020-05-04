
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setRTRPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setRTRPreferences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://customer.ws.mcrewards.mastercard.com/}RTRUpdateableParameters"/&gt;
 *         &lt;element name="burnAccelerator" type="{http://customer.ws.mcrewards.mastercard.com/}BurnAccelerator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setRTRPreferences", propOrder = {
    "rtrAccountOptInStatus",
    "receiveEmailSw",
    "receiveSMSSw",
    "emailAddress",
    "smsNumber",
    "minAccountPurchaseThreshold",
    "fixedAccountRedemptionAmount",
    "receiveRedemptionNotificationsSw",
    "receiveEligiblePurchaseNotificationsSw",
    "receiveIneligiblePurchaseNotificationsSw",
    "burnAccelerator"
})
public class SetRTRPreferences
    implements Serializable
{

    @XmlElement(name = "RTRAccountOptInStatus")
    protected String rtrAccountOptInStatus;
    protected Boolean receiveEmailSw;
    protected Boolean receiveSMSSw;
    protected String emailAddress;
    @XmlElement(name = "SMSNumber")
    protected String smsNumber;
    protected BigDecimal minAccountPurchaseThreshold;
    protected BigDecimal fixedAccountRedemptionAmount;
    protected Boolean receiveRedemptionNotificationsSw;
    protected Boolean receiveEligiblePurchaseNotificationsSw;
    protected Boolean receiveIneligiblePurchaseNotificationsSw;
    protected BurnAccelerator burnAccelerator;

    /**
     * Gets the value of the rtrAccountOptInStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTRAccountOptInStatus() {
        return rtrAccountOptInStatus;
    }

    /**
     * Sets the value of the rtrAccountOptInStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTRAccountOptInStatus(String value) {
        this.rtrAccountOptInStatus = value;
    }

    /**
     * Gets the value of the receiveEmailSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiveEmailSw() {
        return receiveEmailSw;
    }

    /**
     * Sets the value of the receiveEmailSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiveEmailSw(Boolean value) {
        this.receiveEmailSw = value;
    }

    /**
     * Gets the value of the receiveSMSSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiveSMSSw() {
        return receiveSMSSw;
    }

    /**
     * Sets the value of the receiveSMSSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiveSMSSw(Boolean value) {
        this.receiveSMSSw = value;
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
     * Gets the value of the smsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSMSNumber() {
        return smsNumber;
    }

    /**
     * Sets the value of the smsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSMSNumber(String value) {
        this.smsNumber = value;
    }

    /**
     * Gets the value of the minAccountPurchaseThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAccountPurchaseThreshold() {
        return minAccountPurchaseThreshold;
    }

    /**
     * Sets the value of the minAccountPurchaseThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAccountPurchaseThreshold(BigDecimal value) {
        this.minAccountPurchaseThreshold = value;
    }

    /**
     * Gets the value of the fixedAccountRedemptionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedAccountRedemptionAmount() {
        return fixedAccountRedemptionAmount;
    }

    /**
     * Sets the value of the fixedAccountRedemptionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedAccountRedemptionAmount(BigDecimal value) {
        this.fixedAccountRedemptionAmount = value;
    }

    /**
     * Gets the value of the receiveRedemptionNotificationsSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiveRedemptionNotificationsSw() {
        return receiveRedemptionNotificationsSw;
    }

    /**
     * Sets the value of the receiveRedemptionNotificationsSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiveRedemptionNotificationsSw(Boolean value) {
        this.receiveRedemptionNotificationsSw = value;
    }

    /**
     * Gets the value of the receiveEligiblePurchaseNotificationsSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiveEligiblePurchaseNotificationsSw() {
        return receiveEligiblePurchaseNotificationsSw;
    }

    /**
     * Sets the value of the receiveEligiblePurchaseNotificationsSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiveEligiblePurchaseNotificationsSw(Boolean value) {
        this.receiveEligiblePurchaseNotificationsSw = value;
    }

    /**
     * Gets the value of the receiveIneligiblePurchaseNotificationsSw property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReceiveIneligiblePurchaseNotificationsSw() {
        return receiveIneligiblePurchaseNotificationsSw;
    }

    /**
     * Sets the value of the receiveIneligiblePurchaseNotificationsSw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReceiveIneligiblePurchaseNotificationsSw(Boolean value) {
        this.receiveIneligiblePurchaseNotificationsSw = value;
    }

    /**
     * Gets the value of the burnAccelerator property.
     * 
     * @return
     *     possible object is
     *     {@link BurnAccelerator }
     *     
     */
    public BurnAccelerator getBurnAccelerator() {
        return burnAccelerator;
    }

    /**
     * Sets the value of the burnAccelerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BurnAccelerator }
     *     
     */
    public void setBurnAccelerator(BurnAccelerator value) {
        this.burnAccelerator = value;
    }

}
