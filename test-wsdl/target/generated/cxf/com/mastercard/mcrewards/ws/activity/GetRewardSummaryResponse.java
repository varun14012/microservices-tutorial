
package com.mastercard.mcrewards.ws.activity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="household" type="{http://activity.ws.mcrewards.mastercard.com/}HouseholdPoints" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="accumulationDetailAccounts" type="{http://activity.ws.mcrewards.mastercard.com/}AccumulationDetailAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentAccounts" type="{http://activity.ws.mcrewards.mastercard.com/}AdjustmentAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="redemptionAccounts" type="{http://activity.ws.mcrewards.mastercard.com/}RedemptionAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "referenceId",
    "household",
    "accumulationDetailAccounts",
    "adjustmentAccounts",
    "redemptionAccounts"
})
@XmlRootElement(name = "getRewardSummaryResponse")
public class GetRewardSummaryResponse {

    protected String referenceId;
    protected List<HouseholdPoints> household;
    protected List<AccumulationDetailAccount> accumulationDetailAccounts;
    protected List<AdjustmentAccount> adjustmentAccounts;
    protected List<RedemptionAccount> redemptionAccounts;

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the household property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the household property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHousehold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseholdPoints }
     * 
     * 
     */
    public List<HouseholdPoints> getHousehold() {
        if (household == null) {
            household = new ArrayList<HouseholdPoints>();
        }
        return this.household;
    }

    /**
     * Gets the value of the accumulationDetailAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accumulationDetailAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccumulationDetailAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccumulationDetailAccount }
     * 
     * 
     */
    public List<AccumulationDetailAccount> getAccumulationDetailAccounts() {
        if (accumulationDetailAccounts == null) {
            accumulationDetailAccounts = new ArrayList<AccumulationDetailAccount>();
        }
        return this.accumulationDetailAccounts;
    }

    /**
     * Gets the value of the adjustmentAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustmentAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustmentAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdjustmentAccount }
     * 
     * 
     */
    public List<AdjustmentAccount> getAdjustmentAccounts() {
        if (adjustmentAccounts == null) {
            adjustmentAccounts = new ArrayList<AdjustmentAccount>();
        }
        return this.adjustmentAccounts;
    }

    /**
     * Gets the value of the redemptionAccounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redemptionAccounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedemptionAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedemptionAccount }
     * 
     * 
     */
    public List<RedemptionAccount> getRedemptionAccounts() {
        if (redemptionAccounts == null) {
            redemptionAccounts = new ArrayList<RedemptionAccount>();
        }
        return this.redemptionAccounts;
    }

}
