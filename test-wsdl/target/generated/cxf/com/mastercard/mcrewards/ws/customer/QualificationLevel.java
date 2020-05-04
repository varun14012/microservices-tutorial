
package com.mastercard.mcrewards.ws.customer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualificationLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualificationLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Account"/&gt;
 *     &lt;enumeration value="Customer"/&gt;
 *     &lt;enumeration value="Household"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QualificationLevel")
@XmlEnum
public enum QualificationLevel {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("Household")
    HOUSEHOLD("Household");
    private final String value;

    QualificationLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualificationLevel fromValue(String v) {
        for (QualificationLevel c: QualificationLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
