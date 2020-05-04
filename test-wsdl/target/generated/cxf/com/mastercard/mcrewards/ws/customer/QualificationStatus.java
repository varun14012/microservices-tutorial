
package com.mastercard.mcrewards.ws.customer;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualificationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualificationStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Qualified"/&gt;
 *     &lt;enumeration value="Processed"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *     &lt;enumeration value="Recurring"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QualificationStatus")
@XmlEnum
public enum QualificationStatus {

    @XmlEnumValue("Qualified")
    QUALIFIED("Qualified"),
    @XmlEnumValue("Processed")
    PROCESSED("Processed"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Recurring")
    RECURRING("Recurring");
    private final String value;

    QualificationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualificationStatus fromValue(String v) {
        for (QualificationStatus c: QualificationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
