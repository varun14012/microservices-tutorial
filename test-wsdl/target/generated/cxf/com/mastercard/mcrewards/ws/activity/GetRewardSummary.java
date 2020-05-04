
package com.mastercard.mcrewards.ws.activity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="householdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="excludeAcctsNotBelongingToCustomerSw" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rewardSummaryComponent" type="{http://activity.ws.mcrewards.mastercard.com/}RewardSummaryComponent" maxOccurs="unbounded"/&gt;
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
    "householdId",
    "fromDate",
    "toDate",
    "excludeAcctsNotBelongingToCustomerSw",
    "language",
    "rewardSummaryComponent"
})
@XmlRootElement(name = "getRewardSummary")
public class GetRewardSummary {

    protected Long householdId;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDate;
    protected boolean excludeAcctsNotBelongingToCustomerSw;
    protected String language;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<RewardSummaryComponent> rewardSummaryComponent;

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
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the excludeAcctsNotBelongingToCustomerSw property.
     * 
     */
    public boolean isExcludeAcctsNotBelongingToCustomerSw() {
        return excludeAcctsNotBelongingToCustomerSw;
    }

    /**
     * Sets the value of the excludeAcctsNotBelongingToCustomerSw property.
     * 
     */
    public void setExcludeAcctsNotBelongingToCustomerSw(boolean value) {
        this.excludeAcctsNotBelongingToCustomerSw = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the rewardSummaryComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rewardSummaryComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRewardSummaryComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RewardSummaryComponent }
     * 
     * 
     */
    public List<RewardSummaryComponent> getRewardSummaryComponent() {
        if (rewardSummaryComponent == null) {
            rewardSummaryComponent = new ArrayList<RewardSummaryComponent>();
        }
        return this.rewardSummaryComponent;
    }

}
