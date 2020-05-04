
package com.mastercard.mcrewards.ws.household;

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
 *         &lt;element name="householdId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="householdName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "householdName"
})
@XmlRootElement(name = "updateHouseholdName")
public class UpdateHouseholdName {

    protected long householdId;
    @XmlElement(required = true)
    protected String householdName;

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

}
