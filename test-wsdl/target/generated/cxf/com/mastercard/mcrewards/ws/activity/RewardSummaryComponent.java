
package com.mastercard.mcrewards.ws.activity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RewardSummaryComponent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RewardSummaryComponent"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="adjustment"/&gt;
 *     &lt;enumeration value="expiration"/&gt;
 *     &lt;enumeration value="household"/&gt;
 *     &lt;enumeration value="redemption"/&gt;
 *     &lt;enumeration value="transaction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RewardSummaryComponent")
@XmlEnum
public enum RewardSummaryComponent {

    @XmlEnumValue("adjustment")
    ADJUSTMENT("adjustment"),
    @XmlEnumValue("expiration")
    EXPIRATION("expiration"),
    @XmlEnumValue("household")
    HOUSEHOLD("household"),
    @XmlEnumValue("redemption")
    REDEMPTION("redemption"),
    @XmlEnumValue("transaction")
    TRANSACTION("transaction");
    private final String value;

    RewardSummaryComponent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RewardSummaryComponent fromValue(String v) {
        for (RewardSummaryComponent c: RewardSummaryComponent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
