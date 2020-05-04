
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RTRPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTRPreferences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://customer.ws.mcrewards.mastercard.com/}RTRUpdateableParameters"/&gt;
 *         &lt;element name="userIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PWRTRAccountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastFourDigitsOfPWRTRCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minProgramPurchaseThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="maxProgramPurchaseThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="householdPointBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="arsBaseConversionFactors" type="{http://customer.ws.mcrewards.mastercard.com/}arsBaseConversionFactor" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="householdRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="programId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTRPreferences", propOrder = {
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
    "userIdentifier",
    "pwrtrAccountStatus",
    "lastFourDigitsOfPWRTRCard",
    "minProgramPurchaseThreshold",
    "maxProgramPurchaseThreshold",
    "accountStatus",
    "householdPointBalance",
    "arsBaseConversionFactors",
    "householdRole",
    "programId"
})
public class RTRPreferences
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
    protected String userIdentifier;
    @XmlElement(name = "PWRTRAccountStatus")
    protected String pwrtrAccountStatus;
    protected String lastFourDigitsOfPWRTRCard;
    protected BigDecimal minProgramPurchaseThreshold;
    protected BigDecimal maxProgramPurchaseThreshold;
    protected Long accountStatus;
    protected BigDecimal householdPointBalance;
    protected List<ArsBaseConversionFactor> arsBaseConversionFactors;
    protected String householdRole;
    protected Long programId;

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
     * Gets the value of the userIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdentifier() {
        return userIdentifier;
    }

    /**
     * Sets the value of the userIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdentifier(String value) {
        this.userIdentifier = value;
    }

    /**
     * Gets the value of the pwrtrAccountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPWRTRAccountStatus() {
        return pwrtrAccountStatus;
    }

    /**
     * Sets the value of the pwrtrAccountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPWRTRAccountStatus(String value) {
        this.pwrtrAccountStatus = value;
    }

    /**
     * Gets the value of the lastFourDigitsOfPWRTRCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastFourDigitsOfPWRTRCard() {
        return lastFourDigitsOfPWRTRCard;
    }

    /**
     * Sets the value of the lastFourDigitsOfPWRTRCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastFourDigitsOfPWRTRCard(String value) {
        this.lastFourDigitsOfPWRTRCard = value;
    }

    /**
     * Gets the value of the minProgramPurchaseThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinProgramPurchaseThreshold() {
        return minProgramPurchaseThreshold;
    }

    /**
     * Sets the value of the minProgramPurchaseThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinProgramPurchaseThreshold(BigDecimal value) {
        this.minProgramPurchaseThreshold = value;
    }

    /**
     * Gets the value of the maxProgramPurchaseThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxProgramPurchaseThreshold() {
        return maxProgramPurchaseThreshold;
    }

    /**
     * Sets the value of the maxProgramPurchaseThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxProgramPurchaseThreshold(BigDecimal value) {
        this.maxProgramPurchaseThreshold = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountStatus(Long value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the householdPointBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseholdPointBalance() {
        return householdPointBalance;
    }

    /**
     * Sets the value of the householdPointBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHouseholdPointBalance(BigDecimal value) {
        this.householdPointBalance = value;
    }

    /**
     * Gets the value of the arsBaseConversionFactors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arsBaseConversionFactors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArsBaseConversionFactors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArsBaseConversionFactor }
     * 
     * 
     */
    public List<ArsBaseConversionFactor> getArsBaseConversionFactors() {
        if (arsBaseConversionFactors == null) {
            arsBaseConversionFactors = new ArrayList<ArsBaseConversionFactor>();
        }
        return this.arsBaseConversionFactors;
    }

    /**
     * Gets the value of the householdRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdRole() {
        return householdRole;
    }

    /**
     * Sets the value of the householdRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdRole(String value) {
        this.householdRole = value;
    }

    /**
     * Gets the value of the programId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProgramId() {
        return programId;
    }

    /**
     * Sets the value of the programId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProgramId(Long value) {
        this.programId = value;
    }

}
