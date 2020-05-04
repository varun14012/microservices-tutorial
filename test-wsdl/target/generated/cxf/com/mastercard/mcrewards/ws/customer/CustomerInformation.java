
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
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
 *         &lt;element name="icaCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="referenceId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="internetBankId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cards" type="{http://customer.ws.mcrewards.mastercard.com/}Card" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="households" type="{http://customer.ws.mcrewards.mastercard.com/}Household" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="householdPoolingDetail" type="{http://customer.ws.mcrewards.mastercard.com/}HouseholdPoolingDetail" minOccurs="0"/&gt;
 *         &lt;element name="customerMaps" type="{http://customer.ws.mcrewards.mastercard.com/}CustomerMap" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://customer.ws.mcrewards.mastercard.com/}Customer" minOccurs="0"/&gt;
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
    "icaCode",
    "referenceId",
    "internetBankId",
    "cards",
    "households",
    "householdPoolingDetail",
    "customerMaps",
    "customer"
})
@XmlRootElement(name = "CustomerInformation")
public class CustomerInformation
    implements Serializable
{

    protected String icaCode;
    protected String referenceId;
    protected Long internetBankId;
    protected List<Card> cards;
    protected List<Household> households;
    protected HouseholdPoolingDetail householdPoolingDetail;
    protected List<CustomerMap> customerMaps;
    protected Customer customer;

    /**
     * Gets the value of the icaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcaCode() {
        return icaCode;
    }

    /**
     * Sets the value of the icaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcaCode(String value) {
        this.icaCode = value;
    }

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
     * Gets the value of the internetBankId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInternetBankId() {
        return internetBankId;
    }

    /**
     * Sets the value of the internetBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInternetBankId(Long value) {
        this.internetBankId = value;
    }

    /**
     * Gets the value of the cards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Card }
     * 
     * 
     */
    public List<Card> getCards() {
        if (cards == null) {
            cards = new ArrayList<Card>();
        }
        return this.cards;
    }

    /**
     * Gets the value of the households property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the households property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseholds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Household }
     * 
     * 
     */
    public List<Household> getHouseholds() {
        if (households == null) {
            households = new ArrayList<Household>();
        }
        return this.households;
    }

    /**
     * Gets the value of the householdPoolingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link HouseholdPoolingDetail }
     *     
     */
    public HouseholdPoolingDetail getHouseholdPoolingDetail() {
        return householdPoolingDetail;
    }

    /**
     * Sets the value of the householdPoolingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseholdPoolingDetail }
     *     
     */
    public void setHouseholdPoolingDetail(HouseholdPoolingDetail value) {
        this.householdPoolingDetail = value;
    }

    /**
     * Gets the value of the customerMaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerMaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerMaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMap }
     * 
     * 
     */
    public List<CustomerMap> getCustomerMaps() {
        if (customerMaps == null) {
            customerMaps = new ArrayList<CustomerMap>();
        }
        return this.customerMaps;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

}
