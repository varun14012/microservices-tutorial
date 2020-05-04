
package com.mastercard.mcrewards.ws.eupuserprofile;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mastercard.mcrewards.ws.eupuserprofile package. 
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

    private final static QName _ISUserProfile_QNAME = new QName("http://eupuserprofile.ws.mcrewards.mastercard.com/", "ISUserProfile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mastercard.mcrewards.ws.eupuserprofile
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ISUserProfile }
     * 
     */
    public ISUserProfile createISUserProfile() {
        return new ISUserProfile();
    }

    /**
     * Create an instance of {@link ISAgreement }
     * 
     */
    public ISAgreement createISAgreement() {
        return new ISAgreement();
    }

    /**
     * Create an instance of {@link ISAccess }
     * 
     */
    public ISAccess createISAccess() {
        return new ISAccess();
    }

    /**
     * Create an instance of {@link ISAddress }
     * 
     */
    public ISAddress createISAddress() {
        return new ISAddress();
    }

    /**
     * Create an instance of {@link ISContact }
     * 
     */
    public ISContact createISContact() {
        return new ISContact();
    }

    /**
     * Create an instance of {@link ISJobInfo }
     * 
     */
    public ISJobInfo createISJobInfo() {
        return new ISJobInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISUserProfile }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISUserProfile }{@code >}
     */
    @XmlElementDecl(namespace = "http://eupuserprofile.ws.mcrewards.mastercard.com/", name = "ISUserProfile")
    public JAXBElement<ISUserProfile> createISUserProfile(ISUserProfile value) {
        return new JAXBElement<ISUserProfile>(_ISUserProfile_QNAME, ISUserProfile.class, null, value);
    }

}
