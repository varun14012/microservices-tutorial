
package com.mastercard.mcrewards.ws.redemption;

import java.math.BigDecimal;
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
 *         &lt;element name="pointsAvailable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="creditResults" type="{http://redemption.ws.mcrewards.mastercard.com/}CreditResult" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "pointsAvailable",
    "creditResults"
})
@XmlRootElement(name = "creditTravelRedemptionResponse")
public class CreditTravelRedemptionResponse {

    protected BigDecimal pointsAvailable;
    protected List<CreditResult> creditResults;

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
     * Gets the value of the creditResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditResult }
     * 
     * 
     */
    public List<CreditResult> getCreditResults() {
        if (creditResults == null) {
            creditResults = new ArrayList<CreditResult>();
        }
        return this.creditResults;
    }

}
