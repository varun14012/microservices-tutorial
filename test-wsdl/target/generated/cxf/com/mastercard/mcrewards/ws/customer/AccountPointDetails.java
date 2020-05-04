
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountPointDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountPointDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;group ref="{http://customer.ws.mcrewards.mastercard.com/}pointDetailsResponseGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountPointDetails", propOrder = {
    "accountId",
    "availablePoints",
    "onHoldPoints",
    "previousBalance",
    "pointsEarned",
    "pointsRedeemed"
})
public class AccountPointDetails
    implements Serializable
{

    protected long accountId;
    @XmlElement(name = "AvailablePoints")
    protected BigDecimal availablePoints;
    @XmlElement(name = "OnHoldPoints")
    protected BigDecimal onHoldPoints;
    protected BigDecimal previousBalance;
    protected BigDecimal pointsEarned;
    protected BigDecimal pointsRedeemed;

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
     * Gets the value of the availablePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailablePoints() {
        return availablePoints;
    }

    /**
     * Sets the value of the availablePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailablePoints(BigDecimal value) {
        this.availablePoints = value;
    }

    /**
     * Gets the value of the onHoldPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnHoldPoints() {
        return onHoldPoints;
    }

    /**
     * Sets the value of the onHoldPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnHoldPoints(BigDecimal value) {
        this.onHoldPoints = value;
    }

    /**
     * Gets the value of the previousBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreviousBalance() {
        return previousBalance;
    }

    /**
     * Sets the value of the previousBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreviousBalance(BigDecimal value) {
        this.previousBalance = value;
    }

    /**
     * Gets the value of the pointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointsEarned() {
        return pointsEarned;
    }

    /**
     * Sets the value of the pointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointsEarned(BigDecimal value) {
        this.pointsEarned = value;
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

}
