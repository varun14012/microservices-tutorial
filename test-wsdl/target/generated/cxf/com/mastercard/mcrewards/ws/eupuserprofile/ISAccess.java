
package com.mastercard.mcrewards.ws.eupuserprofile;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ISAccess"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mcFeatureDataSet" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="requiredAuthLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="securidToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISAccess", propOrder = {
    "mcFeatureDataSet",
    "requiredAuthLevel",
    "securidToken"
})
public class ISAccess {

    @XmlElement(nillable = true)
    protected List<String> mcFeatureDataSet;
    protected String requiredAuthLevel;
    protected String securidToken;

    /**
     * Gets the value of the mcFeatureDataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mcFeatureDataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMcFeatureDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMcFeatureDataSet() {
        if (mcFeatureDataSet == null) {
            mcFeatureDataSet = new ArrayList<String>();
        }
        return this.mcFeatureDataSet;
    }

    /**
     * Gets the value of the requiredAuthLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredAuthLevel() {
        return requiredAuthLevel;
    }

    /**
     * Sets the value of the requiredAuthLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredAuthLevel(String value) {
        this.requiredAuthLevel = value;
    }

    /**
     * Gets the value of the securidToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuridToken() {
        return securidToken;
    }

    /**
     * Sets the value of the securidToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuridToken(String value) {
        this.securidToken = value;
    }

}
