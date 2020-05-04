
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseholdPoolingDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseholdPoolingDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pointPoolingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="totalPointBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseholdPoolingDetail", propOrder = {
    "pointPoolingEnabled",
    "totalPointBalance"
})
public class HouseholdPoolingDetail
    implements Serializable
{

    protected Boolean pointPoolingEnabled;
    protected BigDecimal totalPointBalance;

    /**
     * Gets the value of the pointPoolingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPointPoolingEnabled() {
        return pointPoolingEnabled;
    }

    /**
     * Sets the value of the pointPoolingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPointPoolingEnabled(Boolean value) {
        this.pointPoolingEnabled = value;
    }

    /**
     * Gets the value of the totalPointBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPointBalance() {
        return totalPointBalance;
    }

    /**
     * Sets the value of the totalPointBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPointBalance(BigDecimal value) {
        this.totalPointBalance = value;
    }

}
