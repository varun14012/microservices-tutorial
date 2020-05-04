
package com.mastercard.mcrewards.ws.activity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseholdPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseholdPoints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="householdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="householdRedeemerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="householdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="previousPointBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="pointsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="pointsAvailable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="pointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lifePointsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="lifePointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ytdPointsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ytdPointsRedeemed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="householdPointsExpire" type="{http://activity.ws.mcrewards.mastercard.com/}HouseholdPointExpire" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="expiredLifetimePoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="expiredYearToDatePoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="pointAgingRule" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pointAgingPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pointExpirationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseholdPoints", propOrder = {
    "householdId",
    "householdRedeemerCode",
    "householdName",
    "previousPointBalance",
    "pointsEarned",
    "pointsAvailable",
    "pointsRedeemed",
    "lifePointsEarned",
    "lifePointsRedeemed",
    "ytdPointsEarned",
    "ytdPointsRedeemed",
    "householdPointsExpire",
    "expiredLifetimePoints",
    "expiredYearToDatePoints",
    "pointAgingRule",
    "pointAgingPeriod",
    "pointExpirationMethod"
})
public class HouseholdPoints {

    protected Long householdId;
    protected String householdRedeemerCode;
    protected String householdName;
    protected BigDecimal previousPointBalance;
    protected BigDecimal pointsEarned;
    protected BigDecimal pointsAvailable;
    protected BigDecimal pointsRedeemed;
    protected BigDecimal lifePointsEarned;
    protected BigDecimal lifePointsRedeemed;
    protected BigDecimal ytdPointsEarned;
    protected BigDecimal ytdPointsRedeemed;
    protected List<HouseholdPointExpire> householdPointsExpire;
    protected BigDecimal expiredLifetimePoints;
    protected BigDecimal expiredYearToDatePoints;
    protected Integer pointAgingRule;
    protected Integer pointAgingPeriod;
    protected String pointExpirationMethod;

    /**
     * Gets the value of the householdId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHouseholdId() {
        return householdId;
    }

    /**
     * Sets the value of the householdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHouseholdId(Long value) {
        this.householdId = value;
    }

    /**
     * Gets the value of the householdRedeemerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdRedeemerCode() {
        return householdRedeemerCode;
    }

    /**
     * Sets the value of the householdRedeemerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdRedeemerCode(String value) {
        this.householdRedeemerCode = value;
    }

    /**
     * Gets the value of the householdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdName() {
        return householdName;
    }

    /**
     * Sets the value of the householdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdName(String value) {
        this.householdName = value;
    }

    /**
     * Gets the value of the previousPointBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreviousPointBalance() {
        return previousPointBalance;
    }

    /**
     * Sets the value of the previousPointBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreviousPointBalance(BigDecimal value) {
        this.previousPointBalance = value;
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
     * Gets the value of the pointsAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointsAvailable() {
        return pointsAvailable;
    }

    /**
     * Sets the value of the pointsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointsAvailable(BigDecimal value) {
        this.pointsAvailable = value;
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
     * Gets the value of the lifePointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLifePointsEarned() {
        return lifePointsEarned;
    }

    /**
     * Sets the value of the lifePointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLifePointsEarned(BigDecimal value) {
        this.lifePointsEarned = value;
    }

    /**
     * Gets the value of the lifePointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLifePointsRedeemed() {
        return lifePointsRedeemed;
    }

    /**
     * Sets the value of the lifePointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLifePointsRedeemed(BigDecimal value) {
        this.lifePointsRedeemed = value;
    }

    /**
     * Gets the value of the ytdPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYtdPointsEarned() {
        return ytdPointsEarned;
    }

    /**
     * Sets the value of the ytdPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYtdPointsEarned(BigDecimal value) {
        this.ytdPointsEarned = value;
    }

    /**
     * Gets the value of the ytdPointsRedeemed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYtdPointsRedeemed() {
        return ytdPointsRedeemed;
    }

    /**
     * Sets the value of the ytdPointsRedeemed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYtdPointsRedeemed(BigDecimal value) {
        this.ytdPointsRedeemed = value;
    }

    /**
     * Gets the value of the householdPointsExpire property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the householdPointsExpire property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseholdPointsExpire().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseholdPointExpire }
     * 
     * 
     */
    public List<HouseholdPointExpire> getHouseholdPointsExpire() {
        if (householdPointsExpire == null) {
            householdPointsExpire = new ArrayList<HouseholdPointExpire>();
        }
        return this.householdPointsExpire;
    }

    /**
     * Gets the value of the expiredLifetimePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpiredLifetimePoints() {
        return expiredLifetimePoints;
    }

    /**
     * Sets the value of the expiredLifetimePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpiredLifetimePoints(BigDecimal value) {
        this.expiredLifetimePoints = value;
    }

    /**
     * Gets the value of the expiredYearToDatePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpiredYearToDatePoints() {
        return expiredYearToDatePoints;
    }

    /**
     * Sets the value of the expiredYearToDatePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpiredYearToDatePoints(BigDecimal value) {
        this.expiredYearToDatePoints = value;
    }

    /**
     * Gets the value of the pointAgingRule property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPointAgingRule() {
        return pointAgingRule;
    }

    /**
     * Sets the value of the pointAgingRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPointAgingRule(Integer value) {
        this.pointAgingRule = value;
    }

    /**
     * Gets the value of the pointAgingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPointAgingPeriod() {
        return pointAgingPeriod;
    }

    /**
     * Sets the value of the pointAgingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPointAgingPeriod(Integer value) {
        this.pointAgingPeriod = value;
    }

    /**
     * Gets the value of the pointExpirationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointExpirationMethod() {
        return pointExpirationMethod;
    }

    /**
     * Sets the value of the pointExpirationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointExpirationMethod(String value) {
        this.pointExpirationMethod = value;
    }

}
