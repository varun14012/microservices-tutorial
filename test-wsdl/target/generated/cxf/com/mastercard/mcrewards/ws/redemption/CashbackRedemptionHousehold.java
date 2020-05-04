
package com.mastercard.mcrewards.ws.redemption;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashbackRedemptionHousehold complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashbackRedemptionHousehold"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="householdId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="householdName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cashbackRedemptionAccounts" type="{http://redemption.ws.mcrewards.mastercard.com/}EligibleCashbackRedemptionAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashbackRedemptionHousehold", propOrder = {
    "householdId",
    "householdName",
    "cashbackRedemptionAccounts"
})
public class CashbackRedemptionHousehold {

    protected long householdId;
    @XmlElement(required = true)
    protected String householdName;
    protected List<EligibleCashbackRedemptionAccount> cashbackRedemptionAccounts;

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
     * Gets the value of the cashbackRedemptionAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashbackRedemptionAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashbackRedemptionAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EligibleCashbackRedemptionAccount }
     * 
     * 
     */
    public List<EligibleCashbackRedemptionAccount> getCashbackRedemptionAccounts() {
        if (cashbackRedemptionAccounts == null) {
            cashbackRedemptionAccounts = new ArrayList<EligibleCashbackRedemptionAccount>();
        }
        return this.cashbackRedemptionAccounts;
    }

}
