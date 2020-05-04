
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
 * <p>Java class for HouseholdPointDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseholdPointDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="householdId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;group ref="{http://customer.ws.mcrewards.mastercard.com/}pointDetailsResponseGroup"/&gt;
 *         &lt;element name="CustomerPoints" type="{http://customer.ws.mcrewards.mastercard.com/}CustomerPointDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseholdPointDetails", propOrder = {
    "householdId",
    "availablePoints",
    "onHoldPoints",
    "previousBalance",
    "pointsEarned",
    "pointsRedeemed",
    "customerPoints"
})
public class HouseholdPointDetails
    implements Serializable
{

    protected long householdId;
    @XmlElement(name = "AvailablePoints")
    protected BigDecimal availablePoints;
    @XmlElement(name = "OnHoldPoints")
    protected BigDecimal onHoldPoints;
    protected BigDecimal previousBalance;
    protected BigDecimal pointsEarned;
    protected BigDecimal pointsRedeemed;
    @XmlElement(name = "CustomerPoints")
    protected List<CustomerPointDetails> customerPoints;

    /**
     * Gets the value of the householdId property.
     * 
     */
    public long getHouseholdId() {
        return householdId;
    }

    /**
     * Sets the value of the householdId property.
     * 
     */
    public void setHouseholdId(long value) {
        this.householdId = value;
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

    /**
     * Gets the value of the customerPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPointDetails }
     * 
     * 
     */
    public List<CustomerPointDetails> getCustomerPoints() {
        if (customerPoints == null) {
            customerPoints = new ArrayList<CustomerPointDetails>();
        }
        return this.customerPoints;
    }

}
