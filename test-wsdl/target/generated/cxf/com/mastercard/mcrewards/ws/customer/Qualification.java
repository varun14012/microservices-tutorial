
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for Qualification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Qualification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qualificationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qualificationLevelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalQualificationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qualificationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="qualificationDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qualificationStatus" type="{http://customer.ws.mcrewards.mastercard.com/}QualificationStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Qualification", propOrder = {
    "qualificationId",
    "qualificationLevelId",
    "externalQualificationId",
    "qualificationName",
    "qualificationDateTime",
    "qualificationDesc",
    "qualificationStatus"
})
public class Qualification
    implements Serializable
{

    protected String qualificationId;
    protected String qualificationLevelId;
    protected String externalQualificationId;
    protected String qualificationName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date qualificationDateTime;
    protected String qualificationDesc;
    @XmlSchemaType(name = "string")
    protected QualificationStatus qualificationStatus;

    /**
     * Gets the value of the qualificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationId() {
        return qualificationId;
    }

    /**
     * Sets the value of the qualificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationId(String value) {
        this.qualificationId = value;
    }

    /**
     * Gets the value of the qualificationLevelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationLevelId() {
        return qualificationLevelId;
    }

    /**
     * Sets the value of the qualificationLevelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationLevelId(String value) {
        this.qualificationLevelId = value;
    }

    /**
     * Gets the value of the externalQualificationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalQualificationId() {
        return externalQualificationId;
    }

    /**
     * Sets the value of the externalQualificationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalQualificationId(String value) {
        this.externalQualificationId = value;
    }

    /**
     * Gets the value of the qualificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationName() {
        return qualificationName;
    }

    /**
     * Sets the value of the qualificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationName(String value) {
        this.qualificationName = value;
    }

    /**
     * Gets the value of the qualificationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getQualificationDateTime() {
        return qualificationDateTime;
    }

    /**
     * Sets the value of the qualificationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationDateTime(Date value) {
        this.qualificationDateTime = value;
    }

    /**
     * Gets the value of the qualificationDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationDesc() {
        return qualificationDesc;
    }

    /**
     * Sets the value of the qualificationDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationDesc(String value) {
        this.qualificationDesc = value;
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

}
