
package com.mastercard.mcrewards.ws.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mastercard.mcrewards.ws.common package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AppID_QNAME = new QName("http://common.ws.mcrewards.mastercard.com/", "appID");
    private final static QName _InstitutionName_QNAME = new QName("http://common.ws.mcrewards.mastercard.com/", "institutionName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mastercard.mcrewards.ws.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorResp }
     * 
     */
    public ErrorResp createErrorResp() {
        return new ErrorResp();
    }

    /**
     * Create an instance of {@link HashStringElement }
     * 
     */
    public HashStringElement createHashStringElement() {
        return new HashStringElement();
    }

    /**
     * Create an instance of {@link Identity }
     * 
     */
    public Identity createIdentity() {
        return new Identity();
    }

    /**
     * Create an instance of {@link SuccessResp }
     * 
     */
    public SuccessResp createSuccessResp() {
        return new SuccessResp();
    }

    /**
     * Create an instance of {@link ValidationQuestion }
     * 
     */
    public ValidationQuestion createValidationQuestion() {
        return new ValidationQuestion();
    }

    /**
     * Create an instance of {@link EmptyElement }
     * 
     */
    public EmptyElement createEmptyElement() {
        return new EmptyElement();
    }

    /**
     * Create an instance of {@link EncryptedField }
     * 
     */
    public EncryptedField createEncryptedField() {
        return new EncryptedField();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://common.ws.mcrewards.mastercard.com/", name = "appID")
    public JAXBElement<String> createAppID(String value) {
        return new JAXBElement<String>(_AppID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://common.ws.mcrewards.mastercard.com/", name = "institutionName")
    public JAXBElement<String> createInstitutionName(String value) {
        return new JAXBElement<String>(_InstitutionName_QNAME, String.class, null, value);
    }

}
