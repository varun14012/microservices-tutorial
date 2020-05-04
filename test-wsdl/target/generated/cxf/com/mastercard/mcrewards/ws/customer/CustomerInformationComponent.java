
package com.mastercard.mcrewards.ws.customer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerInformationComponent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerInformationComponent"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cards"/&gt;
 *     &lt;enumeration value="detailedCards"/&gt;
 *     &lt;enumeration value="households"/&gt;
 *     &lt;enumeration value="detailedHouseholds"/&gt;
 *     &lt;enumeration value="pooling"/&gt;
 *     &lt;enumeration value="maps"/&gt;
 *     &lt;enumeration value="customerInformation"/&gt;
 *     &lt;enumeration value="detailedCustomerInformation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerInformationComponent")
@XmlEnum
public enum CustomerInformationComponent {

    @XmlEnumValue("cards")
    CARDS("cards"),
    @XmlEnumValue("detailedCards")
    DETAILED_CARDS("detailedCards"),
    @XmlEnumValue("households")
    HOUSEHOLDS("households"),
    @XmlEnumValue("detailedHouseholds")
    DETAILED_HOUSEHOLDS("detailedHouseholds"),
    @XmlEnumValue("pooling")
    POOLING("pooling"),
    @XmlEnumValue("maps")
    MAPS("maps"),
    @XmlEnumValue("customerInformation")
    CUSTOMER_INFORMATION("customerInformation"),
    @XmlEnumValue("detailedCustomerInformation")
    DETAILED_CUSTOMER_INFORMATION("detailedCustomerInformation");
    private final String value;

    CustomerInformationComponent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerInformationComponent fromValue(String v) {
        for (CustomerInformationComponent c: CustomerInformationComponent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
