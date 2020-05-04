
package com.mastercard.mcrewards.ws.adjustment;

import java.math.BigDecimal;
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
 *         &lt;element name="toBankCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toBankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toBankProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pointTransferAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="fromBankCustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromBankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromBankProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromHouseholdEligibilityToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentValueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adjustmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="offerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "toBankCustomerNumber",
    "toBankAccountNumber",
    "toBankProductCode",
    "pointTransferAmount",
    "fromBankCustomerNumber",
    "fromBankAccountNumber",
    "fromBankProductCode",
    "fromHouseholdEligibilityToken",
    "adjustmentValueCode",
    "adjustmentReason",
    "adjustmentTypeCode",
    "offerIdentifier",
    "userId"
})
@XmlRootElement(name = "adjustAccountPoints")
public class AdjustAccountPoints {

    @XmlElement(required = true)
    protected String toBankCustomerNumber;
    @XmlElement(required = true)
    protected String toBankAccountNumber;
    @XmlElement(required = true)
    protected String toBankProductCode;
    @XmlElement(required = true)
    protected BigDecimal pointTransferAmount;
    protected String fromBankCustomerNumber;
    protected String fromBankAccountNumber;
    protected String fromBankProductCode;
    protected String fromHouseholdEligibilityToken;
    protected String adjustmentValueCode;
    @XmlElement(required = true)
    protected String adjustmentReason;
    protected long adjustmentTypeCode;
    protected String offerIdentifier;
    @XmlElement(required = true)
    protected String userId;

    /**
     * Gets the value of the toBankCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToBankCustomerNumber() {
        return toBankCustomerNumber;
    }

    /**
     * Sets the value of the toBankCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToBankCustomerNumber(String value) {
        this.toBankCustomerNumber = value;
    }

    /**
     * Gets the value of the toBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToBankAccountNumber() {
        return toBankAccountNumber;
    }

    /**
     * Sets the value of the toBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToBankAccountNumber(String value) {
        this.toBankAccountNumber = value;
    }

    /**
     * Gets the value of the toBankProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToBankProductCode() {
        return toBankProductCode;
    }

    /**
     * Sets the value of the toBankProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToBankProductCode(String value) {
        this.toBankProductCode = value;
    }

    /**
     * Gets the value of the pointTransferAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointTransferAmount() {
        return pointTransferAmount;
    }

    /**
     * Sets the value of the pointTransferAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointTransferAmount(BigDecimal value) {
        this.pointTransferAmount = value;
    }

    /**
     * Gets the value of the fromBankCustomerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBankCustomerNumber() {
        return fromBankCustomerNumber;
    }

    /**
     * Sets the value of the fromBankCustomerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBankCustomerNumber(String value) {
        this.fromBankCustomerNumber = value;
    }

    /**
     * Gets the value of the fromBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBankAccountNumber() {
        return fromBankAccountNumber;
    }

    /**
     * Sets the value of the fromBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBankAccountNumber(String value) {
        this.fromBankAccountNumber = value;
    }

    /**
     * Gets the value of the fromBankProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBankProductCode() {
        return fromBankProductCode;
    }

    /**
     * Sets the value of the fromBankProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBankProductCode(String value) {
        this.fromBankProductCode = value;
    }

    /**
     * Gets the value of the fromHouseholdEligibilityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromHouseholdEligibilityToken() {
        return fromHouseholdEligibilityToken;
    }

    /**
     * Sets the value of the fromHouseholdEligibilityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromHouseholdEligibilityToken(String value) {
        this.fromHouseholdEligibilityToken = value;
    }

    /**
     * Gets the value of the adjustmentValueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentValueCode() {
        return adjustmentValueCode;
    }

    /**
     * Sets the value of the adjustmentValueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentValueCode(String value) {
        this.adjustmentValueCode = value;
    }

    /**
     * Gets the value of the adjustmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentReason() {
        return adjustmentReason;
    }

    /**
     * Sets the value of the adjustmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentReason(String value) {
        this.adjustmentReason = value;
    }

    /**
     * Gets the value of the adjustmentTypeCode property.
     * 
     */
    public long getAdjustmentTypeCode() {
        return adjustmentTypeCode;
    }

    /**
     * Sets the value of the adjustmentTypeCode property.
     * 
     */
    public void setAdjustmentTypeCode(long value) {
        this.adjustmentTypeCode = value;
    }

    /**
     * Gets the value of the offerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferIdentifier() {
        return offerIdentifier;
    }

    /**
     * Sets the value of the offerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferIdentifier(String value) {
        this.offerIdentifier = value;
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
