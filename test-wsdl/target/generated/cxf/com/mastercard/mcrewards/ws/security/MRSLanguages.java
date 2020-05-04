
package com.mastercard.mcrewards.ws.security;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MRSLanguages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MRSLanguages"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MRSLanguage" type="{http://security.ws.mcrewards.mastercard.com/}MRSLanguage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MRSLanguages", propOrder = {
    "mrsLanguage"
})
public class MRSLanguages {

    @XmlElement(name = "MRSLanguage")
    protected List<MRSLanguage> mrsLanguage;

    /**
     * Gets the value of the mrsLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mrsLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMRSLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MRSLanguage }
     * 
     * 
     */
    public List<MRSLanguage> getMRSLanguage() {
        if (mrsLanguage == null) {
            mrsLanguage = new ArrayList<MRSLanguage>();
        }
        return this.mrsLanguage;
    }

}
