
package com.mastercard.mcrewards.ws.security;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedemptionCenters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedemptionCenters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RedemptionCenter" type="{http://security.ws.mcrewards.mastercard.com/}RedemptionCenter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionCenters", propOrder = {
    "redemptionCenter"
})
public class RedemptionCenters {

    @XmlElement(name = "RedemptionCenter")
    protected List<RedemptionCenter> redemptionCenter;

    /**
     * Gets the value of the redemptionCenter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redemptionCenter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedemptionCenter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedemptionCenter }
     * 
     * 
     */
    public List<RedemptionCenter> getRedemptionCenter() {
        if (redemptionCenter == null) {
            redemptionCenter = new ArrayList<RedemptionCenter>();
        }
        return this.redemptionCenter;
    }

}
