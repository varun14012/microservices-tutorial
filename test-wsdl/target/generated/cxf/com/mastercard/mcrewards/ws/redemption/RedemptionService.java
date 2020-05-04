package com.mastercard.mcrewards.ws.redemption;

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
 * 2020-05-04T17:51:59.253+05:30
 * Generated source version: 3.3.6
 *
 */
@WebService(targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", name = "RedemptionService")
@XmlSeeAlso({ObjectFactory.class, com.mastercard.mcrewards.ws.common.ObjectFactory.class})
public interface RedemptionService {

    @WebMethod(action = "http://redemption.ws.mcrewards.mastercard.com/creditTravelRedemption")
    @RequestWrapper(localName = "creditTravelRedemption", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.redemption.CreditTravelRedemption")
    @ResponseWrapper(localName = "creditTravelRedemptionResponse", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.redemption.CreditTravelRedemptionResponse")
    public void creditTravelRedemption(

        @WebParam(name = "userId", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.lang.String userId,
        @WebParam(name = "credit", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        com.mastercard.mcrewards.ws.redemption.Credit credit,
        @WebParam(mode = WebParam.Mode.OUT, name = "pointsAvailable", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.math.BigDecimal> pointsAvailable,
        @WebParam(mode = WebParam.Mode.OUT, name = "creditResults", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.util.List<com.mastercard.mcrewards.ws.redemption.CreditResult>> creditResults
    ) throws com.mastercard.mcrewards.ws.common.MrsErrorResponse;

    @WebMethod(action = "http://redemption.ws.mcrewards.mastercard.com/statementOfCredit")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "applyStatementOfCreditResponse", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", partName = "parameters")
    public ApplyStatementOfCreditResponse statementOfCredit(

        @WebParam(partName = "parameters", name = "applyStatementOfCredit", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        ApplyStatementOfCredit parameters
    ) throws com.mastercard.mcrewards.ws.common.MrsErrorResponse;

    @WebMethod(action = "http://redemption.ws.mcrewards.mastercard.com/getDefaultCashbackRedemptionAccount")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "defaultCashbackRedemptionAccount", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", partName = "parameters")
    public java.lang.String getDefaultCashbackRedemptionAccount(

        @WebParam(partName = "parameters", name = "getDefaultCashbackRedemptionAccount", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        GetDefaultCashbackRedemptionAccount parameters
    ) throws com.mastercard.mcrewards.ws.common.MrsErrorResponse;

    @WebMethod(action = "http://redemption.ws.mcrewards.mastercard.com/doTravelRedemption")
    @RequestWrapper(localName = "doTravelRedemption", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.redemption.DoTravelRedemption")
    @ResponseWrapper(localName = "travelRedemptionResponse", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.redemption.TravelRedemptionResponse")
    public void doTravelRedemption(

        @WebParam(name = "userId", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.lang.String userId,
        @WebParam(name = "redemptions", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.util.List<com.mastercard.mcrewards.ws.redemption.TravelRedemption> redemptions,
        @WebParam(mode = WebParam.Mode.OUT, name = "pointTotalRemaining", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.math.BigDecimal> pointTotalRemaining,
        @WebParam(mode = WebParam.Mode.OUT, name = "redemptionResults", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.util.List<com.mastercard.mcrewards.ws.redemption.TravelRedemptionResult>> redemptionResults
    ) throws com.mastercard.mcrewards.ws.common.MrsErrorResponse;

    @WebMethod(action = "http://redemption.ws.mcrewards.mastercard.com/getEligibleCashbackRedemptionAccounts")
    @RequestWrapper(localName = "getEligibleCashbackRedemptionAccounts", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.common.EmptyElement")
    @ResponseWrapper(localName = "EligibleCashbackRedemptionAccounts", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.redemption.EligibleCashbackRedemptionAccounts")
    @WebResult(name = "Households", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
    public java.util.List<com.mastercard.mcrewards.ws.redemption.CashbackRedemptionHousehold> getEligibleCashbackRedemptionAccounts()
 throws com.mastercard.mcrewards.ws.common.MrsErrorResponse;

    @WebMethod(action = "http://redemption.ws.mcrewards.mastercard.com/creditRedemption")
    @RequestWrapper(localName = "creditRedemption", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.redemption.CreditRedemption")
    @ResponseWrapper(localName = "creditRedemptionResponse", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.redemption.CreditRedemptionResponse")
    public void creditRedemption(

        @WebParam(name = "redemptionId", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        long redemptionId,
        @WebParam(name = "creditDescription", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.lang.String creditDescription,
        @WebParam(name = "userId", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.lang.String userId,
        @WebParam(mode = WebParam.Mode.OUT, name = "pointsAvailable", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.math.BigDecimal> pointsAvailable,
        @WebParam(mode = WebParam.Mode.OUT, name = "creditResults", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.util.List<com.mastercard.mcrewards.ws.redemption.CreditResult>> creditResults
    ) throws com.mastercard.mcrewards.ws.common.MrsErrorResponse;

    @WebMethod(action = "http://redemption.ws.mcrewards.mastercard.com/setDefaultCashbackRedemptionAccount")
    @RequestWrapper(localName = "setDefaultCashbackRedemptionAccount", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.redemption.SetDefaultCashbackRedemptionAccount")
    @ResponseWrapper(localName = "setDefaultCashbackRedemptionAccountResult", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.common.SuccessResp")
    @WebResult(name = "success", targetNamespace = "http://common.ws.mcrewards.mastercard.com/")
    public boolean setDefaultCashbackRedemptionAccount(

        @WebParam(name = "bankAccountNumber", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.lang.String bankAccountNumber
    ) throws com.mastercard.mcrewards.ws.common.MrsErrorResponse;

    @WebMethod(action = "http://redemption.ws.mcrewards.mastercard.com/externalItemRedemption")
    @RequestWrapper(localName = "externalItemRedemption", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.redemption.ExternalItemRedemption")
    @ResponseWrapper(localName = "externalItemRedemptionResponse", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.redemption.ExternalItemRedemptionResponse")
    public void externalItemRedemption(

        @WebParam(name = "userId", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.lang.String userId,
        @WebParam(name = "redemptions", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.util.List<com.mastercard.mcrewards.ws.redemption.ExternalItem> redemptions,
        @WebParam(mode = WebParam.Mode.OUT, name = "householdId", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.lang.Long> householdId,
        @WebParam(mode = WebParam.Mode.OUT, name = "pointTotalRemaining", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.math.BigDecimal> pointTotalRemaining,
        @WebParam(mode = WebParam.Mode.OUT, name = "redemptionDate", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<javax.xml.datatype.XMLGregorianCalendar> redemptionDate,
        @WebParam(mode = WebParam.Mode.OUT, name = "redemptionResults", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.util.List<com.mastercard.mcrewards.ws.redemption.ItemRedemptionResult>> redemptionResults
    ) throws com.mastercard.mcrewards.ws.common.MrsErrorResponse;

    @WebMethod(action = "http://redemption.ws.mcrewards.mastercard.com/doItemRedemption")
    @RequestWrapper(localName = "doItemRedemption", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.redemption.DoItemRedemption")
    @ResponseWrapper(localName = "doItemRedemptionResponse", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/", className = "com.mastercard.mcrewards.ws.redemption.DoItemRedemptionResponse")
    public void doItemRedemption(

        @WebParam(mode = WebParam.Mode.INOUT, name = "householdId", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.lang.Long> householdId,
        @WebParam(name = "confirmationEmailSw", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        boolean confirmationEmailSw,
        @WebParam(name = "confirmationEmailAddr", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.lang.String confirmationEmailAddr,
        @WebParam(name = "redemptions", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.util.List<com.mastercard.mcrewards.ws.redemption.ItemRedemption> redemptions,
        @WebParam(name = "creditCardNumber", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.lang.String creditCardNumber,
        @WebParam(name = "expirationDate", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.lang.String expirationDate,
        @WebParam(name = "cvc", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.lang.String cvc,
        @WebParam(name = "cardBrand", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.lang.String cardBrand,
        @WebParam(name = "language", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.lang.String language,
        @WebParam(name = "userId", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        java.lang.String userId,
        @WebParam(mode = WebParam.Mode.OUT, name = "pointTotalRemaining", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.math.BigDecimal> pointTotalRemaining,
        @WebParam(mode = WebParam.Mode.OUT, name = "redemptionDate", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<javax.xml.datatype.XMLGregorianCalendar> redemptionDate,
        @WebParam(mode = WebParam.Mode.OUT, name = "redemptionResults", targetNamespace = "http://redemption.ws.mcrewards.mastercard.com/")
        javax.xml.ws.Holder<java.util.List<com.mastercard.mcrewards.ws.redemption.ItemRedemptionResult>> redemptionResults
    ) throws com.mastercard.mcrewards.ws.common.MrsErrorResponse;
}
