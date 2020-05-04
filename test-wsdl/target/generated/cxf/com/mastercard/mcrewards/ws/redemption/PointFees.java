
package com.mastercard.mcrewards.ws.redemption;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pointFees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pointFees"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalCashValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="totalCashPaid" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="fees" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pointFees", propOrder = {
    "totalCashValue",
    "totalCashPaid",
    "fees"
})
public class PointFees {

    @XmlElement(required = true)
    protected BigDecimal totalCashValue;
    @XmlElement(defaultValue = "0")
    protected BigDecimal totalCashPaid;
    @XmlElement(defaultValue = "0")
    protected BigDecimal fees;

    /**
     * Gets the value of the totalCashValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCashValue() {
        return totalCashValue;
    }

    /**
     * Sets the value of the totalCashValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCashValue(BigDecimal value) {
        this.totalCashValue = value;
    }

    /**
     * Gets the value of the totalCashPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCashPaid() {
        return totalCashPaid;
    }

    /**
     * Sets the value of the totalCashPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCashPaid(BigDecimal value) {
        this.totalCashPaid = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFees(BigDecimal value) {
        this.fees = value;
    }

}
