
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
import com.mastercard.mcrewards.ws.common.BooleanYesNo;
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
 *         &lt;element name="householdIndicator" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="qualificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="actionCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="A"/&gt;
 *               &lt;enumeration value="D"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "householdIndicator",
    "qualificationCode",
    "actionCode",
    "beginDate",
    "endDate"
})
@XmlRootElement(name = "saveQualification")
public class SaveQualification
    implements Serializable
{

    @XmlSchemaType(name = "string")
    protected BooleanYesNo householdIndicator;
    @XmlElement(required = true)
    protected String qualificationCode;
    @XmlElement(required = true)
    protected String actionCode;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date beginDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date endDate;

    /**
     * Gets the value of the householdIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getHouseholdIndicator() {
        return householdIndicator;
    }

    /**
     * Sets the value of the householdIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setHouseholdIndicator(BooleanYesNo value) {
        this.householdIndicator = value;
    }

    /**
     * Gets the value of the qualificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationCode() {
        return qualificationCode;
    }

    /**
     * Sets the value of the qualificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationCode(String value) {
        this.qualificationCode = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(Date value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

}
