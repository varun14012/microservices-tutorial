
package com.mastercard.mcrewards.ws.diagnostic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.mastercard.mcrewards.ws.common.EmptyElement;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mastercard.mcrewards.ws.diagnostic package. 
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

    private final static QName _DoEcho_QNAME = new QName("http://diagnostic.ws.mcrewards.mastercard.com/", "doEcho");
    private final static QName _DoEchoResponse_QNAME = new QName("http://diagnostic.ws.mcrewards.mastercard.com/", "doEchoResponse");
    private final static QName _GetCurrentVersion_QNAME = new QName("http://diagnostic.ws.mcrewards.mastercard.com/", "getCurrentVersion");
    private final static QName _CurrentVersion_QNAME = new QName("http://diagnostic.ws.mcrewards.mastercard.com/", "CurrentVersion");
    private final static QName _GetApplicationStatus_QNAME = new QName("http://diagnostic.ws.mcrewards.mastercard.com/", "getApplicationStatus");
    private final static QName _ApplicationStatus_QNAME = new QName("http://diagnostic.ws.mcrewards.mastercard.com/", "ApplicationStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mastercard.mcrewards.ws.diagnostic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CurrentVersion }
     * 
     */
    public CurrentVersion createCurrentVersion() {
        return new CurrentVersion();
    }

    /**
     * Create an instance of {@link ApplicationStatus }
     * 
     */
    public ApplicationStatus createApplicationStatus() {
        return new ApplicationStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://diagnostic.ws.mcrewards.mastercard.com/", name = "doEcho")
    public JAXBElement<String> createDoEcho(String value) {
        return new JAXBElement<String>(_DoEcho_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://diagnostic.ws.mcrewards.mastercard.com/", name = "doEchoResponse")
    public JAXBElement<String> createDoEchoResponse(String value) {
        return new JAXBElement<String>(_DoEchoResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmptyElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://diagnostic.ws.mcrewards.mastercard.com/", name = "getCurrentVersion")
    public JAXBElement<EmptyElement> createGetCurrentVersion(EmptyElement value) {
        return new JAXBElement<EmptyElement>(_GetCurrentVersion_QNAME, EmptyElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurrentVersion }{@code >}
     */
    @XmlElementDecl(namespace = "http://diagnostic.ws.mcrewards.mastercard.com/", name = "CurrentVersion")
    public JAXBElement<CurrentVersion> createCurrentVersion(CurrentVersion value) {
        return new JAXBElement<CurrentVersion>(_CurrentVersion_QNAME, CurrentVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyElement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmptyElement }{@code >}
     */
    @XmlElementDecl(namespace = "http://diagnostic.ws.mcrewards.mastercard.com/", name = "getApplicationStatus")
    public JAXBElement<EmptyElement> createGetApplicationStatus(EmptyElement value) {
        return new JAXBElement<EmptyElement>(_GetApplicationStatus_QNAME, EmptyElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApplicationStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://diagnostic.ws.mcrewards.mastercard.com/", name = "ApplicationStatus")
    public JAXBElement<ApplicationStatus> createApplicationStatus(ApplicationStatus value) {
        return new JAXBElement<ApplicationStatus>(_ApplicationStatus_QNAME, ApplicationStatus.class, null, value);
    }

}
