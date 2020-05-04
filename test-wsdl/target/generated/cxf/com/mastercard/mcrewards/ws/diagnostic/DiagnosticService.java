package com.mastercard.mcrewards.ws.diagnostic;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-05-04T17:51:58.776+05:30
 * Generated source version: 3.3.6
 *
 */
@WebService(targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/", name = "DiagnosticService")
@XmlSeeAlso({ObjectFactory.class, com.mastercard.mcrewards.ws.common.ObjectFactory.class})
public interface DiagnosticService {

    @WebMethod(action = "http://diagnostic.ws.mcrewards.mastercard.com/getApplicationStatus")
    @RequestWrapper(localName = "getApplicationStatus", targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.common.EmptyElement")
    @ResponseWrapper(localName = "ApplicationStatus", targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.diagnostic.ApplicationStatus")
    public void getApplicationStatus(

        @WebParam(mode = WebParam.Mode.OUT, name = "SAMLAttributes", targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.lang.String> samlAttributes,
        @WebParam(mode = WebParam.Mode.OUT, name = "DatabaseLink", targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.lang.String> databaseLink,
        @WebParam(mode = WebParam.Mode.OUT, name = "MerchantTerminal", targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.lang.String> merchantTerminal
    ) throws com.mastercard.mcrewards.ws.common.MrsErrorResponse;

    @WebMethod(action = "http://diagnostic.ws.mcrewards.mastercard.com/doEcho")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "doEchoResponse", targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/", partName = "parameters")
    public java.lang.String doEcho(

        @WebParam(partName = "parameters", name = "doEcho", targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/")
        java.lang.String parameters
    ) throws com.mastercard.mcrewards.ws.common.MrsErrorResponse;

    @WebMethod(action = "http://diagnostic.ws.mcrewards.mastercard.com/getCurrentVersion")
    @RequestWrapper(localName = "getCurrentVersion", targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.common.EmptyElement")
    @ResponseWrapper(localName = "CurrentVersion", targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.diagnostic.CurrentVersion")
    public void getCurrentVersion(

        @WebParam(mode = WebParam.Mode.OUT, name = "pomVersion", targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.lang.String> pomVersion,
        @WebParam(mode = WebParam.Mode.OUT, name = "buildDate", targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.lang.String> buildDate,
        @WebParam(mode = WebParam.Mode.OUT, name = "svnRevisionNumber", targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.lang.String> svnRevisionNumber,
        @WebParam(mode = WebParam.Mode.OUT, name = "localIp", targetNamespace = "http://diagnostic.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.lang.String> localIp
    ) throws com.mastercard.mcrewards.ws.common.MrsErrorResponse;
}
