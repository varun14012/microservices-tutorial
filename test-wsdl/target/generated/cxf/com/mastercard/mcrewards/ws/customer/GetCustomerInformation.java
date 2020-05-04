
package com.mastercard.mcrewards.ws.customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.mastercard.mcrewards.ws.common.BooleanYesNo;


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
 *         &lt;element name="language" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="includeOnlyBasicCustomerInformation" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="includeOnlyDetailedCustomerInformation" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="includeOnlyMappedCustomerInformation" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="includeOnlyDetailedHouseholdInformation" type="{http://common.ws.mcrewards.mastercard.com/}BooleanYesNo" minOccurs="0"/&gt;
 *         &lt;element name="customerInformationComponents" type="{http://customer.ws.mcrewards.mastercard.com/}CustomerInformationComponent" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "language",
    "includeOnlyBasicCustomerInformation",
    "includeOnlyDetailedCustomerInformation",
    "includeOnlyMappedCustomerInformation",
    "includeOnlyDetailedHouseholdInformation",
    "customerInformationComponents"
})
@XmlRootElement(name = "getCustomerInformation")
public class GetCustomerInformation
    implements Serializable
{

    protected String language;
    @XmlSchemaType(name = "string")
    protected BooleanYesNo includeOnlyBasicCustomerInformation;
    @XmlSchemaType(name = "string")
    protected BooleanYesNo includeOnlyDetailedCustomerInformation;
    @XmlSchemaType(name = "string")
    protected BooleanYesNo includeOnlyMappedCustomerInformation;
    @XmlSchemaType(name = "string")
    protected BooleanYesNo includeOnlyDetailedHouseholdInformation;
    @XmlSchemaType(name = "string")
    protected List<CustomerInformationComponent> customerInformationComponents;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the includeOnlyBasicCustomerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getIncludeOnlyBasicCustomerInformation() {
        return includeOnlyBasicCustomerInformation;
    }

    /**
     * Sets the value of the includeOnlyBasicCustomerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setIncludeOnlyBasicCustomerInformation(BooleanYesNo value) {
        this.includeOnlyBasicCustomerInformation = value;
    }

    /**
     * Gets the value of the includeOnlyDetailedCustomerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getIncludeOnlyDetailedCustomerInformation() {
        return includeOnlyDetailedCustomerInformation;
    }

    /**
     * Sets the value of the includeOnlyDetailedCustomerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setIncludeOnlyDetailedCustomerInformation(BooleanYesNo value) {
        this.includeOnlyDetailedCustomerInformation = value;
    }

    /**
     * Gets the value of the includeOnlyMappedCustomerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getIncludeOnlyMappedCustomerInformation() {
        return includeOnlyMappedCustomerInformation;
    }

    /**
     * Sets the value of the includeOnlyMappedCustomerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setIncludeOnlyMappedCustomerInformation(BooleanYesNo value) {
        this.includeOnlyMappedCustomerInformation = value;
    }

    /**
     * Gets the value of the includeOnlyDetailedHouseholdInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanYesNo }
     *     
     */
    public BooleanYesNo getIncludeOnlyDetailedHouseholdInformation() {
        return includeOnlyDetailedHouseholdInformation;
    }

    /**
     * Sets the value of the includeOnlyDetailedHouseholdInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanYesNo }
     *     
     */
    public void setIncludeOnlyDetailedHouseholdInformation(BooleanYesNo value) {
        this.includeOnlyDetailedHouseholdInformation = value;
    }

    /**
     * Gets the value of the customerInformationComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerInformationComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerInformationComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerInformationComponent }
     * 
     * 
     */
    public List<CustomerInformationComponent> getCustomerInformationComponents() {
        if (customerInformationComponents == null) {
            customerInformationComponents = new ArrayList<CustomerInformationComponent>();
        }
        return this.customerInformationComponents;
    }

}
