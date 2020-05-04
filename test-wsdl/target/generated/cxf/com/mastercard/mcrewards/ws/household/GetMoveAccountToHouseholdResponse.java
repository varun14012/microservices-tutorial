
package com.mastercard.mcrewards.ws.household;

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
 *         &lt;element name="newHouseholdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "newHouseholdId"
})
@XmlRootElement(name = "getMoveAccountToHouseholdResponse")
public class GetMoveAccountToHouseholdResponse {

    protected String newHouseholdId;

    /**
     * Gets the value of the newHouseholdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewHouseholdId() {
        return newHouseholdId;
    }

    /**
     * Sets the value of the newHouseholdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewHouseholdId(String value) {
        this.newHouseholdId = value;
    }

}
