
package com.mastercard.mcrewards.ws.security;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanySecurityGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanySecurityGroups"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanySecurityGroup" type="{http://security.ws.mcrewards.mastercard.com/}CompanySecurityGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanySecurityGroups", propOrder = {
    "companySecurityGroup"
})
public class CompanySecurityGroups {

    @XmlElement(name = "CompanySecurityGroup")
    protected List<CompanySecurityGroup> companySecurityGroup;

    /**
     * Gets the value of the companySecurityGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companySecurityGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanySecurityGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanySecurityGroup }
     * 
     * 
     */
    public List<CompanySecurityGroup> getCompanySecurityGroup() {
        if (companySecurityGroup == null) {
            companySecurityGroup = new ArrayList<CompanySecurityGroup>();
        }
        return this.companySecurityGroup;
    }

}
