
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Household complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Household"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="householdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="householdRedeemerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="householdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="householdPointBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="householdOnHoldPoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Household", propOrder = {
    "householdId",
    "householdRedeemerCode",
    "householdName",
    "householdPointBalance",
    "householdOnHoldPoints"
})
public class Household
    implements Serializable
{

    protected Long householdId;
    protected String householdRedeemerCode;
    protected String householdName;
    protected BigDecimal householdPointBalance;
    protected BigDecimal householdOnHoldPoints;

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
     * Gets the value of the householdOnHoldPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseholdOnHoldPoints() {
        return householdOnHoldPoints;
    }

    /**
     * Sets the value of the householdOnHoldPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHouseholdOnHoldPoints(BigDecimal value) {
        this.householdOnHoldPoints = value;
    }

}
