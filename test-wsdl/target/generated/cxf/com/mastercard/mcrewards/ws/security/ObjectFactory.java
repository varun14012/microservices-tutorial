
package com.mastercard.mcrewards.ws.security;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mastercard.mcrewards.ws.security package. 
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

    private final static QName _GetCompanySecurityGroups_QNAME = new QName("http://security.ws.mcrewards.mastercard.com/", "getCompanySecurityGroups");
    private final static QName _CompanySecurityGroups_QNAME = new QName("http://security.ws.mcrewards.mastercard.com/", "CompanySecurityGroups");
    private final static QName _GetRedemptionCenters_QNAME = new QName("http://security.ws.mcrewards.mastercard.com/", "getRedemptionCenters");
    private final static QName _RedemptionCenters_QNAME = new QName("http://security.ws.mcrewards.mastercard.com/", "RedemptionCenters");
    private final static QName _MRSLanguages_QNAME = new QName("http://security.ws.mcrewards.mastercard.com/", "MRSLanguages");
    private final static QName _GetSAMLAttributes_QNAME = new QName("http://security.ws.mcrewards.mastercard.com/", "getSAMLAttributes");
    private final static QName _GetFirstRegisteredLdapId_QNAME = new QName("http://security.ws.mcrewards.mastercard.com/", "getFirstRegisteredLdapId");
    private final static QName _FirstRegisteredLdapId_QNAME = new QName("http://security.ws.mcrewards.mastercard.com/", "firstRegisteredLdapId");
    private final static QName _GACreate_QNAME = new QName("http://security.ws.mcrewards.mastercard.com/", "GACreate");
    private final static QName _GAModify_QNAME = new QName("http://security.ws.mcrewards.mastercard.com/", "GAModify");
    private final static QName _GADelete_QNAME = new QName("http://security.ws.mcrewards.mastercard.com/", "GADelete");
    private final static QName _GAResponse_QNAME = new QName("http://security.ws.mcrewards.mastercard.com/", "GAResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mastercard.mcrewards.ws.security
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateCSRToken }
     * 
     */
    public ValidateCSRToken createValidateCSRToken() {
        return new ValidateCSRToken();
    }

    /**
     * Create an instance of {@link ValidateCSRTokenResponse }
     * 
     */
    public ValidateCSRTokenResponse createValidateCSRTokenResponse() {
        return new ValidateCSRTokenResponse();
    }

    /**
     * Create an instance of {@link ConfirmPartnerRegistration }
     * 
     */
    public ConfirmPartnerRegistration createConfirmPartnerRegistration() {
        return new ConfirmPartnerRegistration();
    }

    /**
     * Create an instance of {@link ConfirmPartnerRegistrationResponse }
     * 
     */
    public ConfirmPartnerRegistrationResponse createConfirmPartnerRegistrationResponse() {
        return new ConfirmPartnerRegistrationResponse();
    }

    /**
     * Create an instance of {@link ConfirmJitRegistration }
     * 
     */
    public ConfirmJitRegistration createConfirmJitRegistration() {
        return new ConfirmJitRegistration();
    }

    /**
     * Create an instance of {@link ConfirmJitRegistrationResponse }
     * 
     */
    public ConfirmJitRegistrationResponse createConfirmJitRegistrationResponse() {
        return new ConfirmJitRegistrationResponse();
    }

    /**
     * Create an instance of {@link GetCompanySecurityGroups }
     * 
     */
    public GetCompanySecurityGroups createGetCompanySecurityGroups() {
        return new GetCompanySecurityGroups();
    }

    /**
     * Create an instance of {@link CompanySecurityGroups }
     * 
     */
    public CompanySecurityGroups createCompanySecurityGroups() {
        return new CompanySecurityGroups();
    }

    /**
     * Create an instance of {@link GetRedemptionCenters }
     * 
     */
    public GetRedemptionCenters createGetRedemptionCenters() {
        return new GetRedemptionCenters();
    }

    /**
     * Create an instance of {@link RedemptionCenters }
     * 
     */
    public RedemptionCenters createRedemptionCenters() {
        return new RedemptionCenters();
    }

    /**
     * Create an instance of {@link MRSLanguages }
     * 
     */
    public MRSLanguages createMRSLanguages() {
        return new MRSLanguages();
    }

    /**
     * Create an instance of {@link GetSAMLAttributes }
     * 
     */
    public GetSAMLAttributes createGetSAMLAttributes() {
        return new GetSAMLAttributes();
    }

    /**
     * Create an instance of {@link Attributes }
     * 
     */
    public Attributes createAttributes() {
        return new Attributes();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link GetFirstRegisteredLdapId }
     * 
     */
    public GetFirstRegisteredLdapId createGetFirstRegisteredLdapId() {
        return new GetFirstRegisteredLdapId();
    }

    /**
     * Create an instance of {@link FirstRegisteredLdapId }
     * 
     */
    public FirstRegisteredLdapId createFirstRegisteredLdapId() {
        return new FirstRegisteredLdapId();
    }

    /**
     * Create an instance of {@link GaCreate }
     * 
     */
    public GaCreate createGaCreate() {
        return new GaCreate();
    }

    /**
     * Create an instance of {@link GaModify }
     * 
     */
    public GaModify createGaModify() {
        return new GaModify();
    }

    /**
     * Create an instance of {@link GaDelete }
     * 
     */
    public GaDelete createGaDelete() {
        return new GaDelete();
    }

    /**
     * Create an instance of {@link GAResponse }
     * 
     */
    public GAResponse createGAResponse() {
        return new GAResponse();
    }

    /**
     * Create an instance of {@link CompanySecurityGroup }
     * 
     */
    public CompanySecurityGroup createCompanySecurityGroup() {
        return new CompanySecurityGroup();
    }

    /**
     * Create an instance of {@link RedemptionCenter }
     * 
     */
    public RedemptionCenter createRedemptionCenter() {
        return new RedemptionCenter();
    }

    /**
     * Create an instance of {@link MRSLanguage }
     * 
     */
    public MRSLanguage createMRSLanguage() {
        return new MRSLanguage();
    }

    /**
     * Create an instance of {@link GAException }
     * 
     */
    public GAException createGAException() {
        return new GAException();
    }

    /**
     * Create an instance of {@link SecurityUser }
     * 
     */
    public SecurityUser createSecurityUser() {
        return new SecurityUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompanySecurityGroups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompanySecurityGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://security.ws.mcrewards.mastercard.com/", name = "getCompanySecurityGroups")
    public JAXBElement<GetCompanySecurityGroups> createGetCompanySecurityGroups(GetCompanySecurityGroups value) {
        return new JAXBElement<GetCompanySecurityGroups>(_GetCompanySecurityGroups_QNAME, GetCompanySecurityGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanySecurityGroups }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompanySecurityGroups }{@code >}
     */
    @XmlElementDecl(namespace = "http://security.ws.mcrewards.mastercard.com/", name = "CompanySecurityGroups")
    public JAXBElement<CompanySecurityGroups> createCompanySecurityGroups(CompanySecurityGroups value) {
        return new JAXBElement<CompanySecurityGroups>(_CompanySecurityGroups_QNAME, CompanySecurityGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRedemptionCenters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRedemptionCenters }{@code >}
     */
    @XmlElementDecl(namespace = "http://security.ws.mcrewards.mastercard.com/", name = "getRedemptionCenters")
    public JAXBElement<GetRedemptionCenters> createGetRedemptionCenters(GetRedemptionCenters value) {
        return new JAXBElement<GetRedemptionCenters>(_GetRedemptionCenters_QNAME, GetRedemptionCenters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionCenters }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RedemptionCenters }{@code >}
     */
    @XmlElementDecl(namespace = "http://security.ws.mcrewards.mastercard.com/", name = "RedemptionCenters")
    public JAXBElement<RedemptionCenters> createRedemptionCenters(RedemptionCenters value) {
        return new JAXBElement<RedemptionCenters>(_RedemptionCenters_QNAME, RedemptionCenters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MRSLanguages }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MRSLanguages }{@code >}
     */
    @XmlElementDecl(namespace = "http://security.ws.mcrewards.mastercard.com/", name = "MRSLanguages")
    public JAXBElement<MRSLanguages> createMRSLanguages(MRSLanguages value) {
        return new JAXBElement<MRSLanguages>(_MRSLanguages_QNAME, MRSLanguages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSAMLAttributes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSAMLAttributes }{@code >}
     */
    @XmlElementDecl(namespace = "http://security.ws.mcrewards.mastercard.com/", name = "getSAMLAttributes")
    public JAXBElement<GetSAMLAttributes> createGetSAMLAttributes(GetSAMLAttributes value) {
        return new JAXBElement<GetSAMLAttributes>(_GetSAMLAttributes_QNAME, GetSAMLAttributes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFirstRegisteredLdapId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFirstRegisteredLdapId }{@code >}
     */
    @XmlElementDecl(namespace = "http://security.ws.mcrewards.mastercard.com/", name = "getFirstRegisteredLdapId")
    public JAXBElement<GetFirstRegisteredLdapId> createGetFirstRegisteredLdapId(GetFirstRegisteredLdapId value) {
        return new JAXBElement<GetFirstRegisteredLdapId>(_GetFirstRegisteredLdapId_QNAME, GetFirstRegisteredLdapId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstRegisteredLdapId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FirstRegisteredLdapId }{@code >}
     */
    @XmlElementDecl(namespace = "http://security.ws.mcrewards.mastercard.com/", name = "firstRegisteredLdapId")
    public JAXBElement<FirstRegisteredLdapId> createFirstRegisteredLdapId(FirstRegisteredLdapId value) {
        return new JAXBElement<FirstRegisteredLdapId>(_FirstRegisteredLdapId_QNAME, FirstRegisteredLdapId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GaCreate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GaCreate }{@code >}
     */
    @XmlElementDecl(namespace = "http://security.ws.mcrewards.mastercard.com/", name = "GACreate")
    public JAXBElement<GaCreate> createGACreate(GaCreate value) {
        return new JAXBElement<GaCreate>(_GACreate_QNAME, GaCreate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GaModify }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GaModify }{@code >}
     */
    @XmlElementDecl(namespace = "http://security.ws.mcrewards.mastercard.com/", name = "GAModify")
    public JAXBElement<GaModify> createGAModify(GaModify value) {
        return new JAXBElement<GaModify>(_GAModify_QNAME, GaModify.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GaDelete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GaDelete }{@code >}
     */
    @XmlElementDecl(namespace = "http://security.ws.mcrewards.mastercard.com/", name = "GADelete")
    public JAXBElement<GaDelete> createGADelete(GaDelete value) {
        return new JAXBElement<GaDelete>(_GADelete_QNAME, GaDelete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GAResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GAResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://security.ws.mcrewards.mastercard.com/", name = "GAResponse")
    public JAXBElement<GAResponse> createGAResponse(GAResponse value) {
        return new JAXBElement<GAResponse>(_GAResponse_QNAME, GAResponse.class, null, value);
    }

}
