
package com.mastercard.mcrewards.ws.activity;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Adjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adjustment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adjustment", propOrder = {
    "adjustmentDate",
    "adjustmentDescription",
    "adjustmentReason",
    "adjustmentValue"
})
public class Adjustment {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar adjustmentDate;
    protected String adjustmentDescription;
    protected String adjustmentReason;
    protected BigDecimal adjustmentValue;

    /**
     * Gets the value of the adjustmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdjustmentDate() {
        return adjustmentDate;
    }

    /**
     * Sets the value of the adjustmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdjustmentDate(XMLGregorianCalendar value) {
        this.adjustmentDate = value;
    }

    /**
     * Gets the value of the adjustmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentDescription() {
        return adjustmentDescription;
    }

    /**
     * Sets the value of the adjustmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentDescription(String value) {
        this.adjustmentDescription = value;
    }

    /**
     * Gets the value of the adjustmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentReason() {
        return adjustmentReason;
    }

    /**
     * Sets the value of the adjustmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentReason(String value) {
        this.adjustmentReason = value;
    }

    /**
     * Gets the value of the adjustmentValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjustmentValue() {
        return adjustmentValue;
    }

    /**
     * Sets the value of the adjustmentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjustmentValue(BigDecimal value) {
        this.adjustmentValue = value;
    }

}
