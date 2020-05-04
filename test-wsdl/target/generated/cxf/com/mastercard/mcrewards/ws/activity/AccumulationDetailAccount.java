
package com.mastercard.mcrewards.ws.activity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccumulationDetailAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccumulationDetailAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://activity.ws.mcrewards.mastercard.com/}Account"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accumulationDetails" type="{http://activity.ws.mcrewards.mastercard.com/}AccumulationDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccumulationDetailAccount", propOrder = {
    "accumulationDetails"
})
public class AccumulationDetailAccount
    extends Account
{

    protected List<AccumulationDetail> accumulationDetails;

    /**
     * Gets the value of the accumulationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accumulationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccumulationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccumulationDetail }
     * 
     * 
     */
    public List<AccumulationDetail> getAccumulationDetails() {
        if (accumulationDetails == null) {
            accumulationDetails = new ArrayList<AccumulationDetail>();
        }
        return this.accumulationDetails;
    }

}
