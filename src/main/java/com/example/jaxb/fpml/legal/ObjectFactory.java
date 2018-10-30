
package com.example.jaxb.fpml.legal;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example package. 
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

    private final static QName _EuropeanExercise_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "europeanExercise");
    private final static QName _InstrumentTradeDetails_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "instrumentTradeDetails");
    private final static QName _Basket_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "basket");
    private final static QName _Commodity_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "commodity");
    private final static QName _StandardCsa2013EnglishLaw_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "standardCsa2013EnglishLaw");
    private final static QName _Loan_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "loan");
    private final static QName _Equity_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "equity");
    private final static QName _StandardCsa2014NewYorkLaw_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "standardCsa2014NewYorkLaw");
    private final static QName _UnderlyingAsset_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "underlyingAsset");
    private final static QName _Exercise_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "exercise");
    private final static QName _SimpleIrSwap_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "simpleIrSwap");
    private final static QName _Fx_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "fx");
    private final static QName _Mortgage_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "mortgage");
    private final static QName _Cash_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "cash");
    private final static QName _SimpleCreditDefaultSwap_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "simpleCreditDefaultSwap");
    private final static QName _MutualFund_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "mutualFund");
    private final static QName _ContractualDocument_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "contractualDocument");
    private final static QName _CurveInstrument_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "curveInstrument");
    private final static QName _Warrant_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "warrant");
    private final static QName _BermudaExercise_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "bermudaExercise");
    private final static QName _StandardCsa2013NewYorkLaw_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "standardCsa2013NewYorkLaw");
    private final static QName _AmericanExercise_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "americanExercise");
    private final static QName _Product_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "product");
    private final static QName _SimpleFra_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "simpleFra");
    private final static QName _Bond_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "bond");
    private final static QName _StandardCsa_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "standardCsa");
    private final static QName _Index_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "index");
    private final static QName _StandardCsa2014EnglishLaw_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "standardCsa2014EnglishLaw");
    private final static QName _ConvertibleBond_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "convertibleBond");
    private final static QName _Future_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "future");
    private final static QName _ExchangeTradedFund_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "exchangeTradedFund");
    private final static QName _Strategy_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "strategy");
    private final static QName _RateIndex_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "rateIndex");
    private final static QName _LegalDocument_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "legalDocument");
    private final static QName _Option_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "option");
    private final static QName _Deposit_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "deposit");
    private final static QName _PriceCleanNetPrice_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "cleanNetPrice");
    private final static QName _PriceDeterminationMethod_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "determinationMethod");
    private final static QName _PriceAccruedInterestPrice_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "accruedInterestPrice");
    private final static QName _PriceFxConversion_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "fxConversion");
    private final static QName _PriceQuotationCharacteristics_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "quotationCharacteristics");
    private final static QName _PriceNetPrice_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "netPrice");
    private final static QName _PriceAmountRelativeTo_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "amountRelativeTo");
    private final static QName _PriceCommission_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "commission");
    private final static QName _PriceGrossPrice_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "grossPrice");
    private final static QName _LegalEntityEntityName_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "entityName");
    private final static QName _LegalEntityEntityId_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "entityId");
    private final static QName _PartyDocumentIdentifierDocumentVersion_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "documentVersion");
    private final static QName _PartyDocumentIdentifierDocumentId_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "documentId");
    private final static QName _PaymentDetailPaymentDate_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "paymentDate");
    private final static QName _PaymentDetailPaymentRule_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "paymentRule");
    private final static QName _PaymentDetailPaymentAmount_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "paymentAmount");
    private final static QName _BasketBasketConstituent_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "basketConstituent");
    private final static QName _BasketBasketCurrency_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "basketCurrency");
    private final static QName _BasketBasketId_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "basketId");
    private final static QName _BasketOpenUnits_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "openUnits");
    private final static QName _BasketBasketVersion_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "basketVersion");
    private final static QName _BasketBasketName_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "basketName");
    private final static QName _BasketBasketDivisor_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "basketDivisor");
    private final static QName _CreditNotationsCreditNotation_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "creditNotation");
    private final static QName _CreditNotationsCondition_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "condition");
    private final static QName _CreditRatingDebtDebtType_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "debtType");
    private final static QName _AccountServicingParty_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "servicingParty");
    private final static QName _AccountAccountName_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "accountName");
    private final static QName _AccountAccountType_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "accountType");
    private final static QName _AccountAccountId_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "accountId");
    private final static QName _AccountAccountBeneficiary_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "accountBeneficiary");
    private final static QName _NetAndGrossGross_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "gross");
    private final static QName _NetAndGrossNet_QNAME = new QName("http://www.fpml.org/FpML-5/legal", "net");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DayCount }
     * 
     */
    public DayCount createDayCount() {
        return new DayCount();
    }

    /**
     * Create an instance of {@link InstrumentTradeDetails }
     * 
     */
    public InstrumentTradeDetails createInstrumentTradeDetails() {
        return new InstrumentTradeDetails();
    }

    /**
     * Create an instance of {@link Basket }
     * 
     */
    public Basket createBasket() {
        return new Basket();
    }

    /**
     * Create an instance of {@link Commodity }
     * 
     */
    public Commodity createCommodity() {
        return new Commodity();
    }

    /**
     * Create an instance of {@link StandardCreditSupportAnnex2013EnglishLaw }
     * 
     */
    public StandardCreditSupportAnnex2013EnglishLaw createStandardCreditSupportAnnex2013EnglishLaw() {
        return new StandardCreditSupportAnnex2013EnglishLaw();
    }

    /**
     * Create an instance of {@link Loan }
     * 
     */
    public Loan createLoan() {
        return new Loan();
    }

    /**
     * Create an instance of {@link EuropeanExercise }
     * 
     */
    public EuropeanExercise createEuropeanExercise() {
        return new EuropeanExercise();
    }

    /**
     * Create an instance of {@link Exercise }
     * 
     */
    public Exercise createExercise() {
        return new Exercise();
    }

    /**
     * Create an instance of {@link SimpleIRSwap }
     * 
     */
    public SimpleIRSwap createSimpleIRSwap() {
        return new SimpleIRSwap();
    }

    /**
     * Create an instance of {@link EquityAsset }
     * 
     */
    public EquityAsset createEquityAsset() {
        return new EquityAsset();
    }

    /**
     * Create an instance of {@link StandardCreditSupportAnnex2014NewYorkLaw }
     * 
     */
    public StandardCreditSupportAnnex2014NewYorkLaw createStandardCreditSupportAnnex2014NewYorkLaw() {
        return new StandardCreditSupportAnnex2014NewYorkLaw();
    }

    /**
     * Create an instance of {@link FxRateAsset }
     * 
     */
    public FxRateAsset createFxRateAsset() {
        return new FxRateAsset();
    }

    /**
     * Create an instance of {@link Mortgage }
     * 
     */
    public Mortgage createMortgage() {
        return new Mortgage();
    }

    /**
     * Create an instance of {@link ExchangeTradedContract }
     * 
     */
    public ExchangeTradedContract createExchangeTradedContract() {
        return new ExchangeTradedContract();
    }

    /**
     * Create an instance of {@link Cash }
     * 
     */
    public Cash createCash() {
        return new Cash();
    }

    /**
     * Create an instance of {@link SimpleCreditDefaultSwap }
     * 
     */
    public SimpleCreditDefaultSwap createSimpleCreditDefaultSwap() {
        return new SimpleCreditDefaultSwap();
    }

    /**
     * Create an instance of {@link MutualFund }
     * 
     */
    public MutualFund createMutualFund() {
        return new MutualFund();
    }

    /**
     * Create an instance of {@link SimpleFra }
     * 
     */
    public SimpleFra createSimpleFra() {
        return new SimpleFra();
    }

    /**
     * Create an instance of {@link BermudaExercise }
     * 
     */
    public BermudaExercise createBermudaExercise() {
        return new BermudaExercise();
    }

    /**
     * Create an instance of {@link StandardCreditSupportAnnex2013NewYorkLaw }
     * 
     */
    public StandardCreditSupportAnnex2013NewYorkLaw createStandardCreditSupportAnnex2013NewYorkLaw() {
        return new StandardCreditSupportAnnex2013NewYorkLaw();
    }

    /**
     * Create an instance of {@link AmericanExercise }
     * 
     */
    public AmericanExercise createAmericanExercise() {
        return new AmericanExercise();
    }

    /**
     * Create an instance of {@link Index }
     * 
     */
    public Index createIndex() {
        return new Index();
    }

    /**
     * Create an instance of {@link StandardCreditSupportAnnex2014EnglishLaw }
     * 
     */
    public StandardCreditSupportAnnex2014EnglishLaw createStandardCreditSupportAnnex2014EnglishLaw() {
        return new StandardCreditSupportAnnex2014EnglishLaw();
    }

    /**
     * Create an instance of {@link Bond }
     * 
     */
    public Bond createBond() {
        return new Bond();
    }

    /**
     * Create an instance of {@link ConvertibleBond }
     * 
     */
    public ConvertibleBond createConvertibleBond() {
        return new ConvertibleBond();
    }

    /**
     * Create an instance of {@link Future }
     * 
     */
    public Future createFuture() {
        return new Future();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link ExchangeTradedFund }
     * 
     */
    public ExchangeTradedFund createExchangeTradedFund() {
        return new ExchangeTradedFund();
    }

    /**
     * Create an instance of {@link Strategy }
     * 
     */
    public Strategy createStrategy() {
        return new Strategy();
    }

    /**
     * Create an instance of {@link RateIndex }
     * 
     */
    public RateIndex createRateIndex() {
        return new RateIndex();
    }

    /**
     * Create an instance of {@link LegalDocument }
     * 
     */
    public LegalDocument createLegalDocument() {
        return new LegalDocument();
    }

    /**
     * Create an instance of {@link ExchangeTradedOption }
     * 
     */
    public ExchangeTradedOption createExchangeTradedOption() {
        return new ExchangeTradedOption();
    }

    /**
     * Create an instance of {@link LegalEntity }
     * 
     */
    public LegalEntity createLegalEntity() {
        return new LegalEntity();
    }

    /**
     * Create an instance of {@link ReportingCurrencyType }
     * 
     */
    public ReportingCurrencyType createReportingCurrencyType() {
        return new ReportingCurrencyType();
    }

    /**
     * Create an instance of {@link LegalDocumentStyle }
     * 
     */
    public LegalDocumentStyle createLegalDocumentStyle() {
        return new LegalDocumentStyle();
    }

    /**
     * Create an instance of {@link QuoteTiming }
     * 
     */
    public QuoteTiming createQuoteTiming() {
        return new QuoteTiming();
    }

    /**
     * Create an instance of {@link EligibleCollateral }
     * 
     */
    public EligibleCollateral createEligibleCollateral() {
        return new EligibleCollateral();
    }

    /**
     * Create an instance of {@link InitialMarginInterestRateTerms }
     * 
     */
    public InitialMarginInterestRateTerms createInitialMarginInterestRateTerms() {
        return new InitialMarginInterestRateTerms();
    }

    /**
     * Create an instance of {@link BusinessCenters }
     * 
     */
    public BusinessCenters createBusinessCenters() {
        return new BusinessCenters();
    }

    /**
     * Create an instance of {@link Currency }
     * 
     */
    public Currency createCurrency() {
        return new Currency();
    }

    /**
     * Create an instance of {@link EligibleAsset }
     * 
     */
    public EligibleAsset createEligibleAsset() {
        return new EligibleAsset();
    }

    /**
     * Create an instance of {@link DocumentReference }
     * 
     */
    public DocumentReference createDocumentReference() {
        return new DocumentReference();
    }

    /**
     * Create an instance of {@link ElectedTransportCurrency }
     * 
     */
    public ElectedTransportCurrency createElectedTransportCurrency() {
        return new ElectedTransportCurrency();
    }

    /**
     * Create an instance of {@link PartyDocumentIdentifier }
     * 
     */
    public PartyDocumentIdentifier createPartyDocumentIdentifier() {
        return new PartyDocumentIdentifier();
    }

    /**
     * Create an instance of {@link CreditRating }
     * 
     */
    public CreditRating createCreditRating() {
        return new CreditRating();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link Offset }
     * 
     */
    public Offset createOffset() {
        return new Offset();
    }

    /**
     * Create an instance of {@link CashflowType }
     * 
     */
    public CashflowType createCashflowType() {
        return new CashflowType();
    }

    /**
     * Create an instance of {@link BusinessUnit }
     * 
     */
    public BusinessUnit createBusinessUnit() {
        return new BusinessUnit();
    }

    /**
     * Create an instance of {@link ClearanceSystem }
     * 
     */
    public ClearanceSystem createClearanceSystem() {
        return new ClearanceSystem();
    }

    /**
     * Create an instance of {@link BasketId }
     * 
     */
    public BasketId createBasketId() {
        return new BasketId();
    }

    /**
     * Create an instance of {@link AccountReference }
     * 
     */
    public AccountReference createAccountReference() {
        return new AccountReference();
    }

    /**
     * Create an instance of {@link SettlementDay }
     * 
     */
    public SettlementDay createSettlementDay() {
        return new SettlementDay();
    }

    /**
     * Create an instance of {@link LegalDocumentHistory }
     * 
     */
    public LegalDocumentHistory createLegalDocumentHistory() {
        return new LegalDocumentHistory();
    }

    /**
     * Create an instance of {@link UnderlyerInterestLeg }
     * 
     */
    public UnderlyerInterestLeg createUnderlyerInterestLeg() {
        return new UnderlyerInterestLeg();
    }

    /**
     * Create an instance of {@link Party }
     * 
     */
    public Party createParty() {
        return new Party();
    }

    /**
     * Create an instance of {@link IssuerId }
     * 
     */
    public IssuerId createIssuerId() {
        return new IssuerId();
    }

    /**
     * Create an instance of {@link PartyContactInformation }
     * 
     */
    public PartyContactInformation createPartyContactInformation() {
        return new PartyContactInformation();
    }

    /**
     * Create an instance of {@link EligibilityToHoldCollateral }
     * 
     */
    public EligibilityToHoldCollateral createEligibilityToHoldCollateral() {
        return new EligibilityToHoldCollateral();
    }

    /**
     * Create an instance of {@link DividendPayout }
     * 
     */
    public DividendPayout createDividendPayout() {
        return new DividendPayout();
    }

    /**
     * Create an instance of {@link EmbeddedOptionType }
     * 
     */
    public EmbeddedOptionType createEmbeddedOptionType() {
        return new EmbeddedOptionType();
    }

    /**
     * Create an instance of {@link CreditRatingScale }
     * 
     */
    public CreditRatingScale createCreditRatingScale() {
        return new CreditRatingScale();
    }

    /**
     * Create an instance of {@link ExchangeDate }
     * 
     */
    public ExchangeDate createExchangeDate() {
        return new ExchangeDate();
    }

    /**
     * Create an instance of {@link LegalDocumentId }
     * 
     */
    public LegalDocumentId createLegalDocumentId() {
        return new LegalDocumentId();
    }

    /**
     * Create an instance of {@link InformationSource }
     * 
     */
    public InformationSource createInformationSource() {
        return new InformationSource();
    }

    /**
     * Create an instance of {@link OtherProvisions }
     * 
     */
    public OtherProvisions createOtherProvisions() {
        return new OtherProvisions();
    }

    /**
     * Create an instance of {@link UseOfPostedCreditSupport }
     * 
     */
    public UseOfPostedCreditSupport createUseOfPostedCreditSupport() {
        return new UseOfPostedCreditSupport();
    }

    /**
     * Create an instance of {@link SpreadScheduleReference }
     * 
     */
    public SpreadScheduleReference createSpreadScheduleReference() {
        return new SpreadScheduleReference();
    }

    /**
     * Create an instance of {@link PartyPortfolioName }
     * 
     */
    public PartyPortfolioName createPartyPortfolioName() {
        return new PartyPortfolioName();
    }

    /**
     * Create an instance of {@link ExerciseFee }
     * 
     */
    public ExerciseFee createExerciseFee() {
        return new ExerciseFee();
    }

    /**
     * Create an instance of {@link AccountId }
     * 
     */
    public AccountId createAccountId() {
        return new AccountId();
    }

    /**
     * Create an instance of {@link IndependentAmountDetermination }
     * 
     */
    public IndependentAmountDetermination createIndependentAmountDetermination() {
        return new IndependentAmountDetermination();
    }

    /**
     * Create an instance of {@link Commission }
     * 
     */
    public Commission createCommission() {
        return new Commission();
    }

    /**
     * Create an instance of {@link PartyName }
     * 
     */
    public PartyName createPartyName() {
        return new PartyName();
    }

    /**
     * Create an instance of {@link ProductId }
     * 
     */
    public ProductId createProductId() {
        return new ProductId();
    }

    /**
     * Create an instance of {@link IndependentAmountInterestRate }
     * 
     */
    public IndependentAmountInterestRate createIndependentAmountInterestRate() {
        return new IndependentAmountInterestRate();
    }

    /**
     * Create an instance of {@link IdentifiedCurrency }
     * 
     */
    public IdentifiedCurrency createIdentifiedCurrency() {
        return new IdentifiedCurrency();
    }

    /**
     * Create an instance of {@link InformationProvider }
     * 
     */
    public InformationProvider createInformationProvider() {
        return new InformationProvider();
    }

    /**
     * Create an instance of {@link BusinessUnitReference }
     * 
     */
    public BusinessUnitReference createBusinessUnitReference() {
        return new BusinessUnitReference();
    }

    /**
     * Create an instance of {@link LegalDocumentType }
     * 
     */
    public LegalDocumentType createLegalDocumentType() {
        return new LegalDocumentType();
    }

    /**
     * Create an instance of {@link PartyRole }
     * 
     */
    public PartyRole createPartyRole() {
        return new PartyRole();
    }

    /**
     * Create an instance of {@link IndependentAmountEligibility }
     * 
     */
    public IndependentAmountEligibility createIndependentAmountEligibility() {
        return new IndependentAmountEligibility();
    }

    /**
     * Create an instance of {@link CreditSeniority }
     * 
     */
    public CreditSeniority createCreditSeniority() {
        return new CreditSeniority();
    }

    /**
     * Create an instance of {@link IndustryClassification }
     * 
     */
    public IndustryClassification createIndustryClassification() {
        return new IndustryClassification();
    }

    /**
     * Create an instance of {@link InstrumentId }
     * 
     */
    public InstrumentId createInstrumentId() {
        return new InstrumentId();
    }

    /**
     * Create an instance of {@link PendingPayment }
     * 
     */
    public PendingPayment createPendingPayment() {
        return new PendingPayment();
    }

    /**
     * Create an instance of {@link CreditRatingDebt }
     * 
     */
    public CreditRatingDebt createCreditRatingDebt() {
        return new CreditRatingDebt();
    }

    /**
     * Create an instance of {@link AdjustableOrRelativeDate }
     * 
     */
    public AdjustableOrRelativeDate createAdjustableOrRelativeDate() {
        return new AdjustableOrRelativeDate();
    }

    /**
     * Create an instance of {@link GoverningLaw }
     * 
     */
    public GoverningLaw createGoverningLaw() {
        return new GoverningLaw();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link AssetClass }
     * 
     */
    public AssetClass createAssetClass() {
        return new AssetClass();
    }

    /**
     * Create an instance of {@link QuotationCharacteristics }
     * 
     */
    public QuotationCharacteristics createQuotationCharacteristics() {
        return new QuotationCharacteristics();
    }

    /**
     * Create an instance of {@link CommodityBase }
     * 
     */
    public CommodityBase createCommodityBase() {
        return new CommodityBase();
    }

    /**
     * Create an instance of {@link DeterminationMethod }
     * 
     */
    public DeterminationMethod createDeterminationMethod() {
        return new DeterminationMethod();
    }

    /**
     * Create an instance of {@link InstrumentTradePricing }
     * 
     */
    public InstrumentTradePricing createInstrumentTradePricing() {
        return new InstrumentTradePricing();
    }

    /**
     * Create an instance of {@link InstrumentTradeQuantity }
     * 
     */
    public InstrumentTradeQuantity createInstrumentTradeQuantity() {
        return new InstrumentTradeQuantity();
    }

    /**
     * Create an instance of {@link FxRate }
     * 
     */
    public FxRate createFxRate() {
        return new FxRate();
    }

    /**
     * Create an instance of {@link LegalDocumentIdentity }
     * 
     */
    public LegalDocumentIdentity createLegalDocumentIdentity() {
        return new LegalDocumentIdentity();
    }

    /**
     * Create an instance of {@link ConstituentWeight }
     * 
     */
    public ConstituentWeight createConstituentWeight() {
        return new ConstituentWeight();
    }

    /**
     * Create an instance of {@link Step }
     * 
     */
    public Step createStep() {
        return new Step();
    }

    /**
     * Create an instance of {@link NetAndGross }
     * 
     */
    public NetAndGross createNetAndGross() {
        return new NetAndGross();
    }

    /**
     * Create an instance of {@link SpreadScheduleType }
     * 
     */
    public SpreadScheduleType createSpreadScheduleType() {
        return new SpreadScheduleType();
    }

    /**
     * Create an instance of {@link CommodityInformationSource }
     * 
     */
    public CommodityInformationSource createCommodityInformationSource() {
        return new CommodityInformationSource();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link IndependentAmounts }
     * 
     */
    public IndependentAmounts createIndependentAmounts() {
        return new IndependentAmounts();
    }

    /**
     * Create an instance of {@link RelativeDates }
     * 
     */
    public RelativeDates createRelativeDates() {
        return new RelativeDates();
    }

    /**
     * Create an instance of {@link AssetPool }
     * 
     */
    public AssetPool createAssetPool() {
        return new AssetPool();
    }

    /**
     * Create an instance of {@link CreditNotation }
     * 
     */
    public CreditNotation createCreditNotation() {
        return new CreditNotation();
    }

    /**
     * Create an instance of {@link CreditNotations }
     * 
     */
    public CreditNotations createCreditNotations() {
        return new CreditNotations();
    }

    /**
     * Create an instance of {@link CommodityInformationProvider }
     * 
     */
    public CommodityInformationProvider createCommodityInformationProvider() {
        return new CommodityInformationProvider();
    }

    /**
     * Create an instance of {@link LegalEntityReference }
     * 
     */
    public LegalEntityReference createLegalEntityReference() {
        return new LegalEntityReference();
    }

    /**
     * Create an instance of {@link ProductReference }
     * 
     */
    public ProductReference createProductReference() {
        return new ProductReference();
    }

    /**
     * Create an instance of {@link TradeId }
     * 
     */
    public TradeId createTradeId() {
        return new TradeId();
    }

    /**
     * Create an instance of {@link AdjustableOrRelativeDates }
     * 
     */
    public AdjustableOrRelativeDates createAdjustableOrRelativeDates() {
        return new AdjustableOrRelativeDates();
    }

    /**
     * Create an instance of {@link DebtType }
     * 
     */
    public DebtType createDebtType() {
        return new DebtType();
    }

    /**
     * Create an instance of {@link QuotedCurrencyPair }
     * 
     */
    public QuotedCurrencyPair createQuotedCurrencyPair() {
        return new QuotedCurrencyPair();
    }

    /**
     * Create an instance of {@link DisputeResolution }
     * 
     */
    public DisputeResolution createDisputeResolution() {
        return new DisputeResolution();
    }

    /**
     * Create an instance of {@link ExerciseFeeSchedule }
     * 
     */
    public ExerciseFeeSchedule createExerciseFeeSchedule() {
        return new ExerciseFeeSchedule();
    }

    /**
     * Create an instance of {@link EntityId }
     * 
     */
    public EntityId createEntityId() {
        return new EntityId();
    }

    /**
     * Create an instance of {@link CommodityDetails }
     * 
     */
    public CommodityDetails createCommodityDetails() {
        return new CommodityDetails();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link TradeIdentifierExtended }
     * 
     */
    public TradeIdentifierExtended createTradeIdentifierExtended() {
        return new TradeIdentifierExtended();
    }

    /**
     * Create an instance of {@link QuantityUnit }
     * 
     */
    public QuantityUnit createQuantityUnit() {
        return new QuantityUnit();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link UnderlyingAssetTranche }
     * 
     */
    public UnderlyingAssetTranche createUnderlyingAssetTranche() {
        return new UnderlyingAssetTranche();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link PartialExercise }
     * 
     */
    public PartialExercise createPartialExercise() {
        return new PartialExercise();
    }

    /**
     * Create an instance of {@link Math }
     * 
     */
    public Math createMath() {
        return new Math();
    }

    /**
     * Create an instance of {@link DayCountDenominator }
     * 
     */
    public DayCountDenominator createDayCountDenominator() {
        return new DayCountDenominator();
    }

    /**
     * Create an instance of {@link ScheduleReference }
     * 
     */
    public ScheduleReference createScheduleReference() {
        return new ScheduleReference();
    }

    /**
     * Create an instance of {@link DateReference }
     * 
     */
    public DateReference createDateReference() {
        return new DateReference();
    }

    /**
     * Create an instance of {@link PartyRoleType }
     * 
     */
    public PartyRoleType createPartyRoleType() {
        return new PartyRoleType();
    }

    /**
     * Create an instance of {@link FloatingRateIndex }
     * 
     */
    public FloatingRateIndex createFloatingRateIndex() {
        return new FloatingRateIndex();
    }

    /**
     * Create an instance of {@link VersionedTradeId }
     * 
     */
    public VersionedTradeId createVersionedTradeId() {
        return new VersionedTradeId();
    }

    /**
     * Create an instance of {@link Lien }
     * 
     */
    public Lien createLien() {
        return new Lien();
    }

    /**
     * Create an instance of {@link AdjustableDates }
     * 
     */
    public AdjustableDates createAdjustableDates() {
        return new AdjustableDates();
    }

    /**
     * Create an instance of {@link SpreadSchedule }
     * 
     */
    public SpreadSchedule createSpreadSchedule() {
        return new SpreadSchedule();
    }

    /**
     * Create an instance of {@link LegalDocumentAdmendment }
     * 
     */
    public LegalDocumentAdmendment createLegalDocumentAdmendment() {
        return new LegalDocumentAdmendment();
    }

    /**
     * Create an instance of {@link BusinessCentersReference }
     * 
     */
    public BusinessCentersReference createBusinessCentersReference() {
        return new BusinessCentersReference();
    }

    /**
     * Create an instance of {@link PersonId }
     * 
     */
    public PersonId createPersonId() {
        return new PersonId();
    }

    /**
     * Create an instance of {@link PartyRoles }
     * 
     */
    public PartyRoles createPartyRoles() {
        return new PartyRoles();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link FutureId }
     * 
     */
    public FutureId createFutureId() {
        return new FutureId();
    }

    /**
     * Create an instance of {@link AccountName }
     * 
     */
    public AccountName createAccountName() {
        return new AccountName();
    }

    /**
     * Create an instance of {@link HoldingPostedCollateral }
     * 
     */
    public HoldingPostedCollateral createHoldingPostedCollateral() {
        return new HoldingPostedCollateral();
    }

    /**
     * Create an instance of {@link MultipleExercise }
     * 
     */
    public MultipleExercise createMultipleExercise() {
        return new MultipleExercise();
    }

    /**
     * Create an instance of {@link RelativeDateOffset }
     * 
     */
    public RelativeDateOffset createRelativeDateOffset() {
        return new RelativeDateOffset();
    }

    /**
     * Create an instance of {@link FormulaComponent }
     * 
     */
    public FormulaComponent createFormulaComponent() {
        return new FormulaComponent();
    }

    /**
     * Create an instance of {@link EntityName }
     * 
     */
    public EntityName createEntityName() {
        return new EntityName();
    }

    /**
     * Create an instance of {@link PartyGroupType }
     * 
     */
    public PartyGroupType createPartyGroupType() {
        return new PartyGroupType();
    }

    /**
     * Create an instance of {@link Collateral }
     * 
     */
    public Collateral createCollateral() {
        return new Collateral();
    }

    /**
     * Create an instance of {@link UnderlyerLoanRate }
     * 
     */
    public UnderlyerLoanRate createUnderlyerLoanRate() {
        return new UnderlyerLoanRate();
    }

    /**
     * Create an instance of {@link IdentifiedDate }
     * 
     */
    public IdentifiedDate createIdentifiedDate() {
        return new IdentifiedDate();
    }

    /**
     * Create an instance of {@link AmountReference }
     * 
     */
    public AmountReference createAmountReference() {
        return new AmountReference();
    }

    /**
     * Create an instance of {@link PricingModel }
     * 
     */
    public PricingModel createPricingModel() {
        return new PricingModel();
    }

    /**
     * Create an instance of {@link CustodianTerms }
     * 
     */
    public CustodianTerms createCustodianTerms() {
        return new CustodianTerms();
    }

    /**
     * Create an instance of {@link PaymentDetail }
     * 
     */
    public PaymentDetail createPaymentDetail() {
        return new PaymentDetail();
    }

    /**
     * Create an instance of {@link AmountSchedule }
     * 
     */
    public AmountSchedule createAmountSchedule() {
        return new AmountSchedule();
    }

    /**
     * Create an instance of {@link PortfolioName }
     * 
     */
    public PortfolioName createPortfolioName() {
        return new PortfolioName();
    }

    /**
     * Create an instance of {@link CreditRatingNotation }
     * 
     */
    public CreditRatingNotation createCreditRatingNotation() {
        return new CreditRatingNotation();
    }

    /**
     * Create an instance of {@link Portfolio }
     * 
     */
    public Portfolio createPortfolio() {
        return new Portfolio();
    }

    /**
     * Create an instance of {@link ExistingCreditSupportAnnex }
     * 
     */
    public ExistingCreditSupportAnnex createExistingCreditSupportAnnex() {
        return new ExistingCreditSupportAnnex();
    }

    /**
     * Create an instance of {@link InstrumentTradePrincipal }
     * 
     */
    public InstrumentTradePrincipal createInstrumentTradePrincipal() {
        return new InstrumentTradePrincipal();
    }

    /**
     * Create an instance of {@link TradeIdentifier }
     * 
     */
    public TradeIdentifier createTradeIdentifier() {
        return new TradeIdentifier();
    }

    /**
     * Create an instance of {@link LegIdentifier }
     * 
     */
    public LegIdentifier createLegIdentifier() {
        return new LegIdentifier();
    }

    /**
     * Create an instance of {@link DayCountFraction }
     * 
     */
    public DayCountFraction createDayCountFraction() {
        return new DayCountFraction();
    }

    /**
     * Create an instance of {@link PartyId }
     * 
     */
    public PartyId createPartyId() {
        return new PartyId();
    }

    /**
     * Create an instance of {@link AssetMeasureType }
     * 
     */
    public AssetMeasureType createAssetMeasureType() {
        return new AssetMeasureType();
    }

    /**
     * Create an instance of {@link LegalDocumentPublisher }
     * 
     */
    public LegalDocumentPublisher createLegalDocumentPublisher() {
        return new LegalDocumentPublisher();
    }

    /**
     * Create an instance of {@link FacilityType }
     * 
     */
    public FacilityType createFacilityType() {
        return new FacilityType();
    }

    /**
     * Create an instance of {@link LinkId }
     * 
     */
    public LinkId createLinkId() {
        return new LinkId();
    }

    /**
     * Create an instance of {@link BasketConstituent }
     * 
     */
    public BasketConstituent createBasketConstituent() {
        return new BasketConstituent();
    }

    /**
     * Create an instance of {@link TransportCurrency }
     * 
     */
    public TransportCurrency createTransportCurrency() {
        return new TransportCurrency();
    }

    /**
     * Create an instance of {@link CouponType }
     * 
     */
    public CouponType createCouponType() {
        return new CouponType();
    }

    /**
     * Create an instance of {@link TelephoneNumber }
     * 
     */
    public TelephoneNumber createTelephoneNumber() {
        return new TelephoneNumber();
    }

    /**
     * Create an instance of {@link Unit }
     * 
     */
    public Unit createUnit() {
        return new Unit();
    }

    /**
     * Create an instance of {@link RateSourcePage }
     * 
     */
    public RateSourcePage createRateSourcePage() {
        return new RateSourcePage();
    }

    /**
     * Create an instance of {@link DeliveryNearby }
     * 
     */
    public DeliveryNearby createDeliveryNearby() {
        return new DeliveryNearby();
    }

    /**
     * Create an instance of {@link Formula }
     * 
     */
    public Formula createFormula() {
        return new Formula();
    }

    /**
     * Create an instance of {@link PartyReference }
     * 
     */
    public PartyReference createPartyReference() {
        return new PartyReference();
    }

    /**
     * Create an instance of {@link SpecifiedRate }
     * 
     */
    public SpecifiedRate createSpecifiedRate() {
        return new SpecifiedRate();
    }

    /**
     * Create an instance of {@link BusinessCenterTime }
     * 
     */
    public BusinessCenterTime createBusinessCenterTime() {
        return new BusinessCenterTime();
    }

    /**
     * Create an instance of {@link DocumentIdentity }
     * 
     */
    public DocumentIdentity createDocumentIdentity() {
        return new DocumentIdentity();
    }

    /**
     * Create an instance of {@link BasicQuotation }
     * 
     */
    public BasicQuotation createBasicQuotation() {
        return new BasicQuotation();
    }

    /**
     * Create an instance of {@link FxSpotRateSource }
     * 
     */
    public FxSpotRateSource createFxSpotRateSource() {
        return new FxSpotRateSource();
    }

    /**
     * Create an instance of {@link Period }
     * 
     */
    public Period createPeriod() {
        return new Period();
    }

    /**
     * Create an instance of {@link BusinessCenter }
     * 
     */
    public BusinessCenter createBusinessCenter() {
        return new BusinessCenter();
    }

    /**
     * Create an instance of {@link NotionalReference }
     * 
     */
    public NotionalReference createNotionalReference() {
        return new NotionalReference();
    }

    /**
     * Create an instance of {@link BasketName }
     * 
     */
    public BasketName createBasketName() {
        return new BasketName();
    }

    /**
     * Create an instance of {@link BusinessDayAdjustments }
     * 
     */
    public BusinessDayAdjustments createBusinessDayAdjustments() {
        return new BusinessDayAdjustments();
    }

    /**
     * Create an instance of {@link ActualPrice }
     * 
     */
    public ActualPrice createActualPrice() {
        return new ActualPrice();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link ProductComponentIdentifier }
     * 
     */
    public ProductComponentIdentifier createProductComponentIdentifier() {
        return new ProductComponentIdentifier();
    }

    /**
     * Create an instance of {@link IndependentAmount }
     * 
     */
    public IndependentAmount createIndependentAmount() {
        return new IndependentAmount();
    }

    /**
     * Create an instance of {@link LegalDocumentHeader }
     * 
     */
    public LegalDocumentHeader createLegalDocumentHeader() {
        return new LegalDocumentHeader();
    }

    /**
     * Create an instance of {@link RelatedParty }
     * 
     */
    public RelatedParty createRelatedParty() {
        return new RelatedParty();
    }

    /**
     * Create an instance of {@link StrategyComponentIdentification }
     * 
     */
    public StrategyComponentIdentification createStrategyComponentIdentification() {
        return new StrategyComponentIdentification();
    }

    /**
     * Create an instance of {@link CreditRatingAgency }
     * 
     */
    public CreditRatingAgency createCreditRatingAgency() {
        return new CreditRatingAgency();
    }

    /**
     * Create an instance of {@link MortgageSector }
     * 
     */
    public MortgageSector createMortgageSector() {
        return new MortgageSector();
    }

    /**
     * Create an instance of {@link FxConversion }
     * 
     */
    public FxConversion createFxConversion() {
        return new FxConversion();
    }

    /**
     * Create an instance of {@link DateRange }
     * 
     */
    public DateRange createDateRange() {
        return new DateRange();
    }

    /**
     * Create an instance of {@link AdjustableDate }
     * 
     */
    public AdjustableDate createAdjustableDate() {
        return new AdjustableDate();
    }

    /**
     * Create an instance of {@link CountryCode }
     * 
     */
    public CountryCode createCountryCode() {
        return new CountryCode();
    }

    /**
     * Create an instance of {@link PartyTradeIdentifierReference }
     * 
     */
    public PartyTradeIdentifierReference createPartyTradeIdentifierReference() {
        return new PartyTradeIdentifierReference();
    }

    /**
     * Create an instance of {@link PartyTradeIdentifier }
     * 
     */
    public PartyTradeIdentifier createPartyTradeIdentifier() {
        return new PartyTradeIdentifier();
    }

    /**
     * Create an instance of {@link OrganizationType }
     * 
     */
    public OrganizationType createOrganizationType() {
        return new OrganizationType();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link ContactInformation }
     * 
     */
    public ContactInformation createContactInformation() {
        return new ContactInformation();
    }

    /**
     * Create an instance of {@link PriceQuoteUnits }
     * 
     */
    public PriceQuoteUnits createPriceQuoteUnits() {
        return new PriceQuoteUnits();
    }

    /**
     * Create an instance of {@link StreetAddress }
     * 
     */
    public StreetAddress createStreetAddress() {
        return new StreetAddress();
    }

    /**
     * Create an instance of {@link LegalDocumentName }
     * 
     */
    public LegalDocumentName createLegalDocumentName() {
        return new LegalDocumentName();
    }

    /**
     * Create an instance of {@link LegId }
     * 
     */
    public LegId createLegId() {
        return new LegId();
    }

    /**
     * Create an instance of {@link HoldingAndUsingPostedCollateral }
     * 
     */
    public HoldingAndUsingPostedCollateral createHoldingAndUsingPostedCollateral() {
        return new HoldingAndUsingPostedCollateral();
    }

    /**
     * Create an instance of {@link IndependentAmountEligibleCollateral }
     * 
     */
    public IndependentAmountEligibleCollateral createIndependentAmountEligibleCollateral() {
        return new IndependentAmountEligibleCollateral();
    }

    /**
     * Create an instance of {@link ExchangeId }
     * 
     */
    public ExchangeId createExchangeId() {
        return new ExchangeId();
    }

    /**
     * Create an instance of {@link DayCount.CurrencySpecificDayCount }
     * 
     */
    public DayCount.CurrencySpecificDayCount createDayCountCurrencySpecificDayCount() {
        return new DayCount.CurrencySpecificDayCount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuropeanExercise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "europeanExercise", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "exercise")
    public JAXBElement<EuropeanExercise> createEuropeanExercise(EuropeanExercise value) {
        return new JAXBElement<EuropeanExercise>(_EuropeanExercise_QNAME, EuropeanExercise.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstrumentTradeDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "instrumentTradeDetails", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "product")
    public JAXBElement<InstrumentTradeDetails> createInstrumentTradeDetails(InstrumentTradeDetails value) {
        return new JAXBElement<InstrumentTradeDetails>(_InstrumentTradeDetails_QNAME, InstrumentTradeDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Basket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "basket", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<Basket> createBasket(Basket value) {
        return new JAXBElement<Basket>(_Basket_QNAME, Basket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Commodity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "commodity", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<Commodity> createCommodity(Commodity value) {
        return new JAXBElement<Commodity>(_Commodity_QNAME, Commodity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnex2013EnglishLaw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "standardCsa2013EnglishLaw", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "standardCsa")
    public JAXBElement<StandardCreditSupportAnnex2013EnglishLaw> createStandardCsa2013EnglishLaw(StandardCreditSupportAnnex2013EnglishLaw value) {
        return new JAXBElement<StandardCreditSupportAnnex2013EnglishLaw>(_StandardCsa2013EnglishLaw_QNAME, StandardCreditSupportAnnex2013EnglishLaw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Loan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "loan", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<Loan> createLoan(Loan value) {
        return new JAXBElement<Loan>(_Loan_QNAME, Loan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquityAsset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "equity", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<EquityAsset> createEquity(EquityAsset value) {
        return new JAXBElement<EquityAsset>(_Equity_QNAME, EquityAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnex2014NewYorkLaw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "standardCsa2014NewYorkLaw", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "standardCsa")
    public JAXBElement<StandardCreditSupportAnnex2014NewYorkLaw> createStandardCsa2014NewYorkLaw(StandardCreditSupportAnnex2014NewYorkLaw value) {
        return new JAXBElement<StandardCreditSupportAnnex2014NewYorkLaw>(_StandardCsa2014NewYorkLaw_QNAME, StandardCreditSupportAnnex2014NewYorkLaw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Asset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "underlyingAsset")
    public JAXBElement<Asset> createUnderlyingAsset(Asset value) {
        return new JAXBElement<Asset>(_UnderlyingAsset_QNAME, Asset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exercise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "exercise")
    public JAXBElement<Exercise> createExercise(Exercise value) {
        return new JAXBElement<Exercise>(_Exercise_QNAME, Exercise.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleIRSwap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "simpleIrSwap", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "curveInstrument")
    public JAXBElement<SimpleIRSwap> createSimpleIrSwap(SimpleIRSwap value) {
        return new JAXBElement<SimpleIRSwap>(_SimpleIrSwap_QNAME, SimpleIRSwap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FxRateAsset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "fx", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "curveInstrument")
    public JAXBElement<FxRateAsset> createFx(FxRateAsset value) {
        return new JAXBElement<FxRateAsset>(_Fx_QNAME, FxRateAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mortgage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "mortgage", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<Mortgage> createMortgage(Mortgage value) {
        return new JAXBElement<Mortgage>(_Mortgage_QNAME, Mortgage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cash }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "cash", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<Cash> createCash(Cash value) {
        return new JAXBElement<Cash>(_Cash_QNAME, Cash.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleCreditDefaultSwap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "simpleCreditDefaultSwap", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "curveInstrument")
    public JAXBElement<SimpleCreditDefaultSwap> createSimpleCreditDefaultSwap(SimpleCreditDefaultSwap value) {
        return new JAXBElement<SimpleCreditDefaultSwap>(_SimpleCreditDefaultSwap_QNAME, SimpleCreditDefaultSwap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MutualFund }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "mutualFund", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<MutualFund> createMutualFund(MutualFund value) {
        return new JAXBElement<MutualFund>(_MutualFund_QNAME, MutualFund.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractualDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "contractualDocument")
    public JAXBElement<ContractualDocument> createContractualDocument(ContractualDocument value) {
        return new JAXBElement<ContractualDocument>(_ContractualDocument_QNAME, ContractualDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Asset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "curveInstrument")
    public JAXBElement<Asset> createCurveInstrument(Asset value) {
        return new JAXBElement<Asset>(_CurveInstrument_QNAME, Asset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeTradedContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "warrant", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<ExchangeTradedContract> createWarrant(ExchangeTradedContract value) {
        return new JAXBElement<ExchangeTradedContract>(_Warrant_QNAME, ExchangeTradedContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BermudaExercise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "bermudaExercise", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "exercise")
    public JAXBElement<BermudaExercise> createBermudaExercise(BermudaExercise value) {
        return new JAXBElement<BermudaExercise>(_BermudaExercise_QNAME, BermudaExercise.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnex2013NewYorkLaw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "standardCsa2013NewYorkLaw", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "standardCsa")
    public JAXBElement<StandardCreditSupportAnnex2013NewYorkLaw> createStandardCsa2013NewYorkLaw(StandardCreditSupportAnnex2013NewYorkLaw value) {
        return new JAXBElement<StandardCreditSupportAnnex2013NewYorkLaw>(_StandardCsa2013NewYorkLaw_QNAME, StandardCreditSupportAnnex2013NewYorkLaw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmericanExercise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "americanExercise", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "exercise")
    public JAXBElement<AmericanExercise> createAmericanExercise(AmericanExercise value) {
        return new JAXBElement<AmericanExercise>(_AmericanExercise_QNAME, AmericanExercise.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleFra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "simpleFra", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "curveInstrument")
    public JAXBElement<SimpleFra> createSimpleFra(SimpleFra value) {
        return new JAXBElement<SimpleFra>(_SimpleFra_QNAME, SimpleFra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bond }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "bond", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<Bond> createBond(Bond value) {
        return new JAXBElement<Bond>(_Bond_QNAME, Bond.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnexBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "standardCsa", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "contractualDocument")
    public JAXBElement<StandardCreditSupportAnnexBase> createStandardCsa(StandardCreditSupportAnnexBase value) {
        return new JAXBElement<StandardCreditSupportAnnexBase>(_StandardCsa_QNAME, StandardCreditSupportAnnexBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Index }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "index", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<Index> createIndex(Index value) {
        return new JAXBElement<Index>(_Index_QNAME, Index.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardCreditSupportAnnex2014EnglishLaw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "standardCsa2014EnglishLaw", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "standardCsa")
    public JAXBElement<StandardCreditSupportAnnex2014EnglishLaw> createStandardCsa2014EnglishLaw(StandardCreditSupportAnnex2014EnglishLaw value) {
        return new JAXBElement<StandardCreditSupportAnnex2014EnglishLaw>(_StandardCsa2014EnglishLaw_QNAME, StandardCreditSupportAnnex2014EnglishLaw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertibleBond }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "convertibleBond", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<ConvertibleBond> createConvertibleBond(ConvertibleBond value) {
        return new JAXBElement<ConvertibleBond>(_ConvertibleBond_QNAME, ConvertibleBond.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Future }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "future", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<Future> createFuture(Future value) {
        return new JAXBElement<Future>(_Future_QNAME, Future.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeTradedFund }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "exchangeTradedFund", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<ExchangeTradedFund> createExchangeTradedFund(ExchangeTradedFund value) {
        return new JAXBElement<ExchangeTradedFund>(_ExchangeTradedFund_QNAME, ExchangeTradedFund.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Strategy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "strategy", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "product")
    public JAXBElement<Strategy> createStrategy(Strategy value) {
        return new JAXBElement<Strategy>(_Strategy_QNAME, Strategy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RateIndex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "rateIndex", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "curveInstrument")
    public JAXBElement<RateIndex> createRateIndex(RateIndex value) {
        return new JAXBElement<RateIndex>(_RateIndex_QNAME, RateIndex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "legalDocument")
    public JAXBElement<LegalDocument> createLegalDocument(LegalDocument value) {
        return new JAXBElement<LegalDocument>(_LegalDocument_QNAME, LegalDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeTradedOption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "option", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "underlyingAsset")
    public JAXBElement<ExchangeTradedOption> createOption(ExchangeTradedOption value) {
        return new JAXBElement<ExchangeTradedOption>(_Option_QNAME, ExchangeTradedOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "deposit", substitutionHeadNamespace = "http://www.fpml.org/FpML-5/legal", substitutionHeadName = "curveInstrument")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "cleanNetPrice", scope = Price.class)
    public JAXBElement<BigDecimal> createPriceCleanNetPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PriceCleanNetPrice_QNAME, BigDecimal.class, Price.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeterminationMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "determinationMethod", scope = Price.class)
    public JAXBElement<DeterminationMethod> createPriceDeterminationMethod(DeterminationMethod value) {
        return new JAXBElement<DeterminationMethod>(_PriceDeterminationMethod_QNAME, DeterminationMethod.class, Price.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "accruedInterestPrice", scope = Price.class)
    public JAXBElement<BigDecimal> createPriceAccruedInterestPrice(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PriceAccruedInterestPrice_QNAME, BigDecimal.class, Price.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FxConversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "fxConversion", scope = Price.class)
    public JAXBElement<FxConversion> createPriceFxConversion(FxConversion value) {
        return new JAXBElement<FxConversion>(_PriceFxConversion_QNAME, FxConversion.class, Price.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotationCharacteristics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "quotationCharacteristics", scope = Price.class)
    public JAXBElement<QuotationCharacteristics> createPriceQuotationCharacteristics(QuotationCharacteristics value) {
        return new JAXBElement<QuotationCharacteristics>(_PriceQuotationCharacteristics_QNAME, QuotationCharacteristics.class, Price.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "netPrice", scope = Price.class)
    public JAXBElement<ActualPrice> createPriceNetPrice(ActualPrice value) {
        return new JAXBElement<ActualPrice>(_PriceNetPrice_QNAME, ActualPrice.class, Price.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "amountRelativeTo", scope = Price.class)
    public JAXBElement<AmountReference> createPriceAmountRelativeTo(AmountReference value) {
        return new JAXBElement<AmountReference>(_PriceAmountRelativeTo_QNAME, AmountReference.class, Price.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Commission }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "commission", scope = Price.class)
    public JAXBElement<Commission> createPriceCommission(Commission value) {
        return new JAXBElement<Commission>(_PriceCommission_QNAME, Commission.class, Price.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "grossPrice", scope = Price.class)
    public JAXBElement<ActualPrice> createPriceGrossPrice(ActualPrice value) {
        return new JAXBElement<ActualPrice>(_PriceGrossPrice_QNAME, ActualPrice.class, Price.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "entityName", scope = LegalEntity.class)
    public JAXBElement<EntityName> createLegalEntityEntityName(EntityName value) {
        return new JAXBElement<EntityName>(_LegalEntityEntityName_QNAME, EntityName.class, LegalEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "entityId", scope = LegalEntity.class)
    public JAXBElement<EntityId> createLegalEntityEntityId(EntityId value) {
        return new JAXBElement<EntityId>(_LegalEntityEntityId_QNAME, EntityId.class, LegalEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "documentVersion", scope = PartyDocumentIdentifier.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPartyDocumentIdentifierDocumentVersion(String value) {
        return new JAXBElement<String>(_PartyDocumentIdentifierDocumentVersion_QNAME, String.class, PartyDocumentIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalDocumentId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "documentId", scope = PartyDocumentIdentifier.class)
    public JAXBElement<LegalDocumentId> createPartyDocumentIdentifierDocumentId(LegalDocumentId value) {
        return new JAXBElement<LegalDocumentId>(_PartyDocumentIdentifierDocumentId_QNAME, LegalDocumentId.class, PartyDocumentIdentifier.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdjustableOrRelativeDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "paymentDate", scope = PaymentDetail.class)
    public JAXBElement<AdjustableOrRelativeDate> createPaymentDetailPaymentDate(AdjustableOrRelativeDate value) {
        return new JAXBElement<AdjustableOrRelativeDate>(_PaymentDetailPaymentDate_QNAME, AdjustableOrRelativeDate.class, PaymentDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "paymentRule", scope = PaymentDetail.class)
    public JAXBElement<PaymentRule> createPaymentDetailPaymentRule(PaymentRule value) {
        return new JAXBElement<PaymentRule>(_PaymentDetailPaymentRule_QNAME, PaymentRule.class, PaymentDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Money }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "paymentAmount", scope = PaymentDetail.class)
    public JAXBElement<Money> createPaymentDetailPaymentAmount(Money value) {
        return new JAXBElement<Money>(_PaymentDetailPaymentAmount_QNAME, Money.class, PaymentDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasketConstituent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "basketConstituent", scope = Basket.class)
    public JAXBElement<BasketConstituent> createBasketBasketConstituent(BasketConstituent value) {
        return new JAXBElement<BasketConstituent>(_BasketBasketConstituent_QNAME, BasketConstituent.class, Basket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Currency }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "basketCurrency", scope = Basket.class)
    public JAXBElement<Currency> createBasketBasketCurrency(Currency value) {
        return new JAXBElement<Currency>(_BasketBasketCurrency_QNAME, Currency.class, Basket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasketId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "basketId", scope = Basket.class)
    public JAXBElement<BasketId> createBasketBasketId(BasketId value) {
        return new JAXBElement<BasketId>(_BasketBasketId_QNAME, BasketId.class, Basket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "openUnits", scope = Basket.class)
    public JAXBElement<BigDecimal> createBasketOpenUnits(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BasketOpenUnits_QNAME, BigDecimal.class, Basket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "basketVersion", scope = Basket.class)
    public JAXBElement<BigInteger> createBasketBasketVersion(BigInteger value) {
        return new JAXBElement<BigInteger>(_BasketBasketVersion_QNAME, BigInteger.class, Basket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasketName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "basketName", scope = Basket.class)
    public JAXBElement<BasketName> createBasketBasketName(BasketName value) {
        return new JAXBElement<BasketName>(_BasketBasketName_QNAME, BasketName.class, Basket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "basketDivisor", scope = Basket.class)
    public JAXBElement<BigDecimal> createBasketBasketDivisor(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_BasketBasketDivisor_QNAME, BigDecimal.class, Basket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditNotation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "creditNotation", scope = CreditNotations.class)
    public JAXBElement<CreditNotation> createCreditNotationsCreditNotation(CreditNotation value) {
        return new JAXBElement<CreditNotation>(_CreditNotationsCreditNotation_QNAME, CreditNotation.class, CreditNotations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantifierEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "condition", scope = CreditNotations.class)
    public JAXBElement<QuantifierEnum> createCreditNotationsCondition(QuantifierEnum value) {
        return new JAXBElement<QuantifierEnum>(_CreditNotationsCondition_QNAME, QuantifierEnum.class, CreditNotations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantifierEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "condition", scope = CreditRatingDebt.class)
    public JAXBElement<QuantifierEnum> createCreditRatingDebtCondition(QuantifierEnum value) {
        return new JAXBElement<QuantifierEnum>(_CreditNotationsCondition_QNAME, QuantifierEnum.class, CreditRatingDebt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebtType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "debtType", scope = CreditRatingDebt.class)
    public JAXBElement<DebtType> createCreditRatingDebtDebtType(DebtType value) {
        return new JAXBElement<DebtType>(_CreditRatingDebtDebtType_QNAME, DebtType.class, CreditRatingDebt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "servicingParty", scope = Account.class)
    public JAXBElement<PartyReference> createAccountServicingParty(PartyReference value) {
        return new JAXBElement<PartyReference>(_AccountServicingParty_QNAME, PartyReference.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "accountName", scope = Account.class)
    public JAXBElement<AccountName> createAccountAccountName(AccountName value) {
        return new JAXBElement<AccountName>(_AccountAccountName_QNAME, AccountName.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "accountType", scope = Account.class)
    public JAXBElement<AccountType> createAccountAccountType(AccountType value) {
        return new JAXBElement<AccountType>(_AccountAccountType_QNAME, AccountType.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "accountId", scope = Account.class)
    public JAXBElement<AccountId> createAccountAccountId(AccountId value) {
        return new JAXBElement<AccountId>(_AccountAccountId_QNAME, AccountId.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "accountBeneficiary", scope = Account.class)
    public JAXBElement<PartyReference> createAccountAccountBeneficiary(PartyReference value) {
        return new JAXBElement<PartyReference>(_AccountAccountBeneficiary_QNAME, PartyReference.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "gross", scope = NetAndGross.class)
    public JAXBElement<BigDecimal> createNetAndGrossGross(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NetAndGrossGross_QNAME, BigDecimal.class, NetAndGross.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fpml.org/FpML-5/legal", name = "net", scope = NetAndGross.class)
    public JAXBElement<BigDecimal> createNetAndGrossNet(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NetAndGrossNet_QNAME, BigDecimal.class, NetAndGross.class, value);
    }

}
