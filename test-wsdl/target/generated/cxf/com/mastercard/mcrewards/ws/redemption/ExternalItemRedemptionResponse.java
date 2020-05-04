
package com.mastercard.mcrewards.ws.redemption;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="pointTotalRemaining" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="redemptionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="redemptionResults" type="{http://redemption.ws.mcrewards.mastercard.com/}ItemRedemptionResult" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "pointTotalRemaining",
    "redemptionDate",
    "redemptionResults"
})
@XmlRootElement(name = "externalItemRedemptionResponse")
public class ExternalItemRedemptionResponse {

    protected Long householdId;
    protected BigDecimal pointTotalRemaining;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar redemptionDate;
    protected List<ItemRedemptionResult> redemptionResults;

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
     * Gets the value of the pointTotalRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointTotalRemaining() {
        return pointTotalRemaining;
    }

    /**
     * Sets the value of the pointTotalRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointTotalRemaining(BigDecimal value) {
        this.pointTotalRemaining = value;
    }

    /**
     * Gets the value of the redemptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRedemptionDate() {
        return redemptionDate;
    }

    /**
     * Sets the value of the redemptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRedemptionDate(XMLGregorianCalendar value) {
        this.redemptionDate = value;
    }

    /**
     * Gets the value of the redemptionResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redemptionResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedemptionResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemRedemptionResult }
     * 
     * 
     */
    public List<ItemRedemptionResult> getRedemptionResults() {
        if (redemptionResults == null) {
            redemptionResults = new ArrayList<ItemRedemptionResult>();
        }
        return this.redemptionResults;
    }

}
