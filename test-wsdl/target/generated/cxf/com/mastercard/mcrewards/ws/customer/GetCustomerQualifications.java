
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


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
 *         &lt;element name="qualificationLevel" type="{http://customer.ws.mcrewards.mastercard.com/}QualificationLevel"/&gt;
 *         &lt;element name="qualificationStatus" type="{http://customer.ws.mcrewards.mastercard.com/}QualificationStatus" minOccurs="0"/&gt;
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "qualificationLevel",
    "qualificationStatus",
    "fromDate",
    "toDate"
})
@XmlRootElement(name = "getCustomerQualifications")
public class GetCustomerQualifications
    implements Serializable
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected QualificationLevel qualificationLevel;
    @XmlSchemaType(name = "string")
    protected QualificationStatus qualificationStatus;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date fromDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date toDate;

    /**
     * Gets the value of the qualificationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link QualificationLevel }
     *     
     */
    public QualificationLevel getQualificationLevel() {
        return qualificationLevel;
    }

    /**
     * Sets the value of the qualificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationLevel }
     *     
     */
    public void setQualificationLevel(QualificationLevel value) {
        this.qualificationLevel = value;
    }

    /**
     * Gets the value of the qualificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QualificationStatus }
     *     
     */
    public QualificationStatus getQualificationStatus() {
        return qualificationStatus;
    }

    /**
     * Sets the value of the qualificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificationStatus }
     *     
     */
    public void setQualificationStatus(QualificationStatus value) {
        this.qualificationStatus = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(Date value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDate(Date value) {
        this.toDate = value;
    }

}
