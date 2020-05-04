
package com.mastercard.mcrewards.ws.catalog;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mastercard.mcrewards.ws.catalog package. 
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

    private final static QName _RewardItemSearchFilterRewardItemPointLevelFrom_QNAME = new QName("http://catalog.ws.mcrewards.mastercard.com/", "rewardItemPointLevelFrom");
    private final static QName _RewardItemSearchFilterRewardItemPointLevelTo_QNAME = new QName("http://catalog.ws.mcrewards.mastercard.com/", "rewardItemPointLevelTo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mastercard.mcrewards.ws.catalog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRewardItems }
     * 
     */
    public GetRewardItems createGetRewardItems() {
        return new GetRewardItems();
    }

    /**
     * Create an instance of {@link RewardItemSearchFilter }
     * 
     */
    public RewardItemSearchFilter createRewardItemSearchFilter() {
        return new RewardItemSearchFilter();
    }

    /**
     * Create an instance of {@link RewardMatrixItems }
     * 
     */
    public RewardMatrixItems createRewardMatrixItems() {
        return new RewardMatrixItems();
    }

    /**
     * Create an instance of {@link RewardMatrixItem }
     * 
     */
    public RewardMatrixItem createRewardMatrixItem() {
        return new RewardMatrixItem();
    }

    /**
     * Create an instance of {@link GetRewardCatalog }
     * 
     */
    public GetRewardCatalog createGetRewardCatalog() {
        return new GetRewardCatalog();
    }

    /**
     * Create an instance of {@link RewardCatalog }
     * 
     */
    public RewardCatalog createRewardCatalog() {
        return new RewardCatalog();
    }

    /**
     * Create an instance of {@link Hierarchy }
     * 
     */
    public Hierarchy createHierarchy() {
        return new Hierarchy();
    }

    /**
     * Create an instance of {@link RewardMatrixItemRedemptionFee }
     * 
     */
    public RewardMatrixItemRedemptionFee createRewardMatrixItemRedemptionFee() {
        return new RewardMatrixItemRedemptionFee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://catalog.ws.mcrewards.mastercard.com/", name = "rewardItemPointLevelFrom", scope = RewardItemSearchFilter.class)
    public JAXBElement<BigDecimal> createRewardItemSearchFilterRewardItemPointLevelFrom(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RewardItemSearchFilterRewardItemPointLevelFrom_QNAME, BigDecimal.class, RewardItemSearchFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://catalog.ws.mcrewards.mastercard.com/", name = "rewardItemPointLevelTo", scope = RewardItemSearchFilter.class)
    public JAXBElement<BigDecimal> createRewardItemSearchFilterRewardItemPointLevelTo(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RewardItemSearchFilterRewardItemPointLevelTo_QNAME, BigDecimal.class, RewardItemSearchFilter.class, value);
    }

}
