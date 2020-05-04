
package com.mastercard.mcrewards.ws.household;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="bankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="validateHHAddAnswers" type="{http://household.ws.mcrewards.mastercard.com/}ValidateHHAddAnswer" maxOccurs="unbounded"/&gt;
 *         &lt;element name="validationMethodCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "bankAccountNumber",
    "validateHHAddAnswers",
    "validationMethodCode"
})
@XmlRootElement(name = "validateCustomerHHAdd")
public class ValidateCustomerHHAdd {

    protected long householdId;
    @XmlElement(required = true)
    protected String bankAccountNumber;
    @XmlElement(required = true)
    protected List<ValidateHHAddAnswer> validateHHAddAnswers;
    @XmlElement(required = true)
    protected String validationMethodCode;

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
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the validateHHAddAnswers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validateHHAddAnswers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidateHHAddAnswers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidateHHAddAnswer }
     * 
     * 
     */
    public List<ValidateHHAddAnswer> getValidateHHAddAnswers() {
        if (validateHHAddAnswers == null) {
            validateHHAddAnswers = new ArrayList<ValidateHHAddAnswer>();
        }
        return this.validateHHAddAnswers;
    }

    /**
     * Gets the value of the validationMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationMethodCode() {
        return validationMethodCode;
    }

    /**
     * Sets the value of the validationMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationMethodCode(String value) {
        this.validationMethodCode = value;
    }

}
