
package com.mastercard.mcrewards.ws.redemption;

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
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="redemptionReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="cashBackAmount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minExclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="remainingPointBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="redemptionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "transactionID",
    "redemptionReference",
    "reasonCode",
    "pointsRedeemed",
    "cashBackAmount",
    "remainingPointBalance",
    "redemptionDescription"
})
@XmlRootElement(name = "applyStatementOfCredit")
public class ApplyStatementOfCredit {

    @XmlElement(required = true)
    protected BigDecimal transactionID;
    @XmlElement(required = true)
    protected String redemptionReference;
    protected long reasonCode;
    @XmlElement(required = true)
    protected BigDecimal pointsRedeemed;
    @XmlElement(required = true)
    protected BigDecimal cashBackAmount;
    protected BigDecimal remainingPointBalance;
    protected String redemptionDescription;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionID(BigDecimal value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the redemptionReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionReference() {
        return redemptionReference;
    }

    /**
     * Sets the value of the redemptionReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionReference(String value) {
        this.redemptionReference = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     */
    public long getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     */
    public void setReasonCode(long value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the pointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointsRedeemed() {
        return pointsRedeemed;
    }

    /**
     * Sets the value of the pointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointsRedeemed(BigDecimal value) {
        this.pointsRedeemed = value;
    }

    /**
     * Gets the value of the cashBackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCashBackAmount() {
        return cashBackAmount;
    }

    /**
     * Sets the value of the cashBackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCashBackAmount(BigDecimal value) {
        this.cashBackAmount = value;
    }

    /**
     * Gets the value of the remainingPointBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemainingPointBalance() {
        return remainingPointBalance;
    }

    /**
     * Sets the value of the remainingPointBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemainingPointBalance(BigDecimal value) {
        this.remainingPointBalance = value;
    }

    /**
     * Gets the value of the redemptionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedemptionDescription() {
        return redemptionDescription;
    }

    /**
     * Sets the value of the redemptionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedemptionDescription(String value) {
        this.redemptionDescription = value;
    }

}
