//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.15 at 10:14:31 PM CET 
//


package gov.loc.zing.srw;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.loc.zing.srw package. 
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

    private final static QName _RecordPacking_QNAME = new QName("http://www.loc.gov/zing/srw/", "recordPacking");
    private final static QName _RecordData_QNAME = new QName("http://www.loc.gov/zing/srw/", "recordData");
    private final static QName _Value_QNAME = new QName("http://www.loc.gov/zing/srw/", "value");
    private final static QName _Term_QNAME = new QName("http://www.loc.gov/zing/srw/", "term");
    private final static QName _ExplainResponse_QNAME = new QName("http://www.loc.gov/zing/srw/", "explainResponse");
    private final static QName _ExtraRequestData_QNAME = new QName("http://www.loc.gov/zing/srw/", "extraRequestData");
    private final static QName _ScanResponse_QNAME = new QName("http://www.loc.gov/zing/srw/", "scanResponse");
    private final static QName _ExplainRequest_QNAME = new QName("http://www.loc.gov/zing/srw/", "explainRequest");
    private final static QName _NumberOfRecords_QNAME = new QName("http://www.loc.gov/zing/srw/", "numberOfRecords");
    private final static QName _MaximumRecords_QNAME = new QName("http://www.loc.gov/zing/srw/", "maximumRecords");
    private final static QName _ResultSetId_QNAME = new QName("http://www.loc.gov/zing/srw/", "resultSetId");
    private final static QName _ResultSetIdleTime_QNAME = new QName("http://www.loc.gov/zing/srw/", "resultSetIdleTime");
    private final static QName _SearchRetrieveResponse_QNAME = new QName("http://www.loc.gov/zing/srw/", "searchRetrieveResponse");
    private final static QName _Records_QNAME = new QName("http://www.loc.gov/zing/srw/", "records");
    private final static QName _Schema_QNAME = new QName("http://www.loc.gov/zing/srw/", "schema");
    private final static QName _EchoedExplainRequest_QNAME = new QName("http://www.loc.gov/zing/srw/", "echoedExplainRequest");
    private final static QName _ExtraResponseData_QNAME = new QName("http://www.loc.gov/zing/srw/", "extraResponseData");
    private final static QName _ExtraTermData_QNAME = new QName("http://www.loc.gov/zing/srw/", "extraTermData");
    private final static QName _RecordXPath_QNAME = new QName("http://www.loc.gov/zing/srw/", "recordXPath");
    private final static QName _MaximumTerms_QNAME = new QName("http://www.loc.gov/zing/srw/", "maximumTerms");
    private final static QName _Diagnostics_QNAME = new QName("http://www.loc.gov/zing/srw/", "diagnostics");
    private final static QName _ResultSetTTL_QNAME = new QName("http://www.loc.gov/zing/srw/", "resultSetTTL");
    private final static QName _Ascending_QNAME = new QName("http://www.loc.gov/zing/srw/", "ascending");
    private final static QName _ScanClause_QNAME = new QName("http://www.loc.gov/zing/srw/", "scanClause");
    private final static QName _StartRecord_QNAME = new QName("http://www.loc.gov/zing/srw/", "startRecord");
    private final static QName _DisplayTerm_QNAME = new QName("http://www.loc.gov/zing/srw/", "displayTerm");
    private final static QName _NextRecordPosition_QNAME = new QName("http://www.loc.gov/zing/srw/", "nextRecordPosition");
    private final static QName _Terms_QNAME = new QName("http://www.loc.gov/zing/srw/", "terms");
    private final static QName _SearchRetrieveRequest_QNAME = new QName("http://www.loc.gov/zing/srw/", "searchRetrieveRequest");
    private final static QName _Record_QNAME = new QName("http://www.loc.gov/zing/srw/", "record");
    private final static QName _Path_QNAME = new QName("http://www.loc.gov/zing/srw/", "path");
    private final static QName _MissingValue_QNAME = new QName("http://www.loc.gov/zing/srw/", "missingValue");
    private final static QName _ExtraRecordData_QNAME = new QName("http://www.loc.gov/zing/srw/", "extraRecordData");
    private final static QName _ScanRequest_QNAME = new QName("http://www.loc.gov/zing/srw/", "scanRequest");
    private final static QName _EchoedSearchRetrieveRequest_QNAME = new QName("http://www.loc.gov/zing/srw/", "echoedSearchRetrieveRequest");
    private final static QName _ResponsePosition_QNAME = new QName("http://www.loc.gov/zing/srw/", "responsePosition");
    private final static QName _EchoedScanRequest_QNAME = new QName("http://www.loc.gov/zing/srw/", "echoedScanRequest");
    private final static QName _SortKeys_QNAME = new QName("http://www.loc.gov/zing/srw/", "sortKeys");
    private final static QName _RecordPosition_QNAME = new QName("http://www.loc.gov/zing/srw/", "recordPosition");
    private final static QName _RecordSchema_QNAME = new QName("http://www.loc.gov/zing/srw/", "recordSchema");
    private final static QName _SortKey_QNAME = new QName("http://www.loc.gov/zing/srw/", "sortKey");
    private final static QName _Version_QNAME = new QName("http://www.loc.gov/zing/srw/", "version");
    private final static QName _CaseSensitive_QNAME = new QName("http://www.loc.gov/zing/srw/", "caseSensitive");
    private final static QName _Query_QNAME = new QName("http://www.loc.gov/zing/srw/", "query");
    private final static QName _Stylesheet_QNAME = new QName("http://www.loc.gov/zing/srw/", "stylesheet");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.loc.zing.srw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExplainRequestType }
     * 
     */
    public ExplainRequestType createExplainRequestType() {
        return new ExplainRequestType();
    }

    /**
     * Create an instance of {@link RecordsType }
     * 
     */
    public RecordsType createRecordsType() {
        return new RecordsType();
    }

    /**
     * Create an instance of {@link SearchRetrieveResponseType }
     * 
     */
    public SearchRetrieveResponseType createSearchRetrieveResponseType() {
        return new SearchRetrieveResponseType();
    }

    /**
     * Create an instance of {@link ExtraDataType }
     * 
     */
    public ExtraDataType createExtraDataType() {
        return new ExtraDataType();
    }

    /**
     * Create an instance of {@link ScanRequestType }
     * 
     */
    public ScanRequestType createScanRequestType() {
        return new ScanRequestType();
    }

    /**
     * Create an instance of {@link ExplainResponseType }
     * 
     */
    public ExplainResponseType createExplainResponseType() {
        return new ExplainResponseType();
    }

    /**
     * Create an instance of {@link ScanResponseType }
     * 
     */
    public ScanResponseType createScanResponseType() {
        return new ScanResponseType();
    }

    /**
     * Create an instance of {@link TermsType }
     * 
     */
    public TermsType createTermsType() {
        return new TermsType();
    }

    /**
     * Create an instance of {@link SearchRetrieveRequestType }
     * 
     */
    public SearchRetrieveRequestType createSearchRetrieveRequestType() {
        return new SearchRetrieveRequestType();
    }

    /**
     * Create an instance of {@link RecordType }
     * 
     */
    public RecordType createRecordType() {
        return new RecordType();
    }

    /**
     * Create an instance of {@link TermType }
     * 
     */
    public TermType createTermType() {
        return new TermType();
    }

    /**
     * Create an instance of {@link StringOrXmlFragment }
     * 
     */
    public StringOrXmlFragment createStringOrXmlFragment() {
        return new StringOrXmlFragment();
    }

    /**
     * Create an instance of {@link DiagnosticsType }
     * 
     */
    public DiagnosticsType createDiagnosticsType() {
        return new DiagnosticsType();
    }

    /**
     * Create an instance of {@link SortKeyType }
     * 
     */
    public SortKeyType createSortKeyType() {
        return new SortKeyType();
    }

    /**
     * Create an instance of {@link EchoedSearchRetrieveRequestType }
     * 
     */
    public EchoedSearchRetrieveRequestType createEchoedSearchRetrieveRequestType() {
        return new EchoedSearchRetrieveRequestType();
    }

    /**
     * Create an instance of {@link EchoedScanRequestType }
     * 
     */
    public EchoedScanRequestType createEchoedScanRequestType() {
        return new EchoedScanRequestType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link XSortKeysType }
     * 
     */
    public XSortKeysType createXSortKeysType() {
        return new XSortKeysType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link XmlFragment }
     * 
     */
    public XmlFragment createXmlFragment() {
        return new XmlFragment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "recordPacking")
    public JAXBElement<String> createRecordPacking(String value) {
        return new JAXBElement<String>(_RecordPacking_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringOrXmlFragment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "recordData")
    public JAXBElement<StringOrXmlFragment> createRecordData(StringOrXmlFragment value) {
        return new JAXBElement<StringOrXmlFragment>(_RecordData_QNAME, StringOrXmlFragment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "term")
    public JAXBElement<TermType> createTerm(TermType value) {
        return new JAXBElement<TermType>(_Term_QNAME, TermType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExplainResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "explainResponse")
    public JAXBElement<ExplainResponseType> createExplainResponse(ExplainResponseType value) {
        return new JAXBElement<ExplainResponseType>(_ExplainResponse_QNAME, ExplainResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "extraRequestData")
    public JAXBElement<ExtraDataType> createExtraRequestData(ExtraDataType value) {
        return new JAXBElement<ExtraDataType>(_ExtraRequestData_QNAME, ExtraDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScanResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "scanResponse")
    public JAXBElement<ScanResponseType> createScanResponse(ScanResponseType value) {
        return new JAXBElement<ScanResponseType>(_ScanResponse_QNAME, ScanResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExplainRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "explainRequest")
    public JAXBElement<ExplainRequestType> createExplainRequest(ExplainRequestType value) {
        return new JAXBElement<ExplainRequestType>(_ExplainRequest_QNAME, ExplainRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "numberOfRecords")
    public JAXBElement<BigInteger> createNumberOfRecords(BigInteger value) {
        return new JAXBElement<BigInteger>(_NumberOfRecords_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "maximumRecords")
    public JAXBElement<BigInteger> createMaximumRecords(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaximumRecords_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "resultSetId")
    public JAXBElement<String> createResultSetId(String value) {
        return new JAXBElement<String>(_ResultSetId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "resultSetIdleTime")
    public JAXBElement<BigInteger> createResultSetIdleTime(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResultSetIdleTime_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRetrieveResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "searchRetrieveResponse")
    public JAXBElement<SearchRetrieveResponseType> createSearchRetrieveResponse(SearchRetrieveResponseType value) {
        return new JAXBElement<SearchRetrieveResponseType>(_SearchRetrieveResponse_QNAME, SearchRetrieveResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "records")
    public JAXBElement<RecordsType> createRecords(RecordsType value) {
        return new JAXBElement<RecordsType>(_Records_QNAME, RecordsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "schema")
    public JAXBElement<String> createSchema(String value) {
        return new JAXBElement<String>(_Schema_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExplainRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "echoedExplainRequest")
    public JAXBElement<ExplainRequestType> createEchoedExplainRequest(ExplainRequestType value) {
        return new JAXBElement<ExplainRequestType>(_EchoedExplainRequest_QNAME, ExplainRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "extraResponseData")
    public JAXBElement<ExtraDataType> createExtraResponseData(ExtraDataType value) {
        return new JAXBElement<ExtraDataType>(_ExtraResponseData_QNAME, ExtraDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "extraTermData")
    public JAXBElement<ExtraDataType> createExtraTermData(ExtraDataType value) {
        return new JAXBElement<ExtraDataType>(_ExtraTermData_QNAME, ExtraDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "recordXPath")
    public JAXBElement<String> createRecordXPath(String value) {
        return new JAXBElement<String>(_RecordXPath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "maximumTerms")
    public JAXBElement<BigInteger> createMaximumTerms(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaximumTerms_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagnosticsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "diagnostics")
    public JAXBElement<DiagnosticsType> createDiagnostics(DiagnosticsType value) {
        return new JAXBElement<DiagnosticsType>(_Diagnostics_QNAME, DiagnosticsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "resultSetTTL")
    public JAXBElement<BigInteger> createResultSetTTL(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResultSetTTL_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "ascending")
    public JAXBElement<Boolean> createAscending(Boolean value) {
        return new JAXBElement<Boolean>(_Ascending_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "scanClause")
    public JAXBElement<String> createScanClause(String value) {
        return new JAXBElement<String>(_ScanClause_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "startRecord", defaultValue = "1")
    public JAXBElement<BigInteger> createStartRecord(BigInteger value) {
        return new JAXBElement<BigInteger>(_StartRecord_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "displayTerm")
    public JAXBElement<String> createDisplayTerm(String value) {
        return new JAXBElement<String>(_DisplayTerm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "nextRecordPosition")
    public JAXBElement<BigInteger> createNextRecordPosition(BigInteger value) {
        return new JAXBElement<BigInteger>(_NextRecordPosition_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "terms")
    public JAXBElement<TermsType> createTerms(TermsType value) {
        return new JAXBElement<TermsType>(_Terms_QNAME, TermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchRetrieveRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "searchRetrieveRequest")
    public JAXBElement<SearchRetrieveRequestType> createSearchRetrieveRequest(SearchRetrieveRequestType value) {
        return new JAXBElement<SearchRetrieveRequestType>(_SearchRetrieveRequest_QNAME, SearchRetrieveRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "record")
    public JAXBElement<RecordType> createRecord(RecordType value) {
        return new JAXBElement<RecordType>(_Record_QNAME, RecordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "path")
    public JAXBElement<String> createPath(String value) {
        return new JAXBElement<String>(_Path_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "missingValue")
    public JAXBElement<String> createMissingValue(String value) {
        return new JAXBElement<String>(_MissingValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtraDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "extraRecordData")
    public JAXBElement<ExtraDataType> createExtraRecordData(ExtraDataType value) {
        return new JAXBElement<ExtraDataType>(_ExtraRecordData_QNAME, ExtraDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScanRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "scanRequest")
    public JAXBElement<ScanRequestType> createScanRequest(ScanRequestType value) {
        return new JAXBElement<ScanRequestType>(_ScanRequest_QNAME, ScanRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoedSearchRetrieveRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "echoedSearchRetrieveRequest")
    public JAXBElement<EchoedSearchRetrieveRequestType> createEchoedSearchRetrieveRequest(EchoedSearchRetrieveRequestType value) {
        return new JAXBElement<EchoedSearchRetrieveRequestType>(_EchoedSearchRetrieveRequest_QNAME, EchoedSearchRetrieveRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "responsePosition", defaultValue = "1")
    public JAXBElement<BigInteger> createResponsePosition(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResponsePosition_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoedScanRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "echoedScanRequest")
    public JAXBElement<EchoedScanRequestType> createEchoedScanRequest(EchoedScanRequestType value) {
        return new JAXBElement<EchoedScanRequestType>(_EchoedScanRequest_QNAME, EchoedScanRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "sortKeys")
    public JAXBElement<String> createSortKeys(String value) {
        return new JAXBElement<String>(_SortKeys_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "recordPosition")
    public JAXBElement<BigInteger> createRecordPosition(BigInteger value) {
        return new JAXBElement<BigInteger>(_RecordPosition_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "recordSchema")
    public JAXBElement<String> createRecordSchema(String value) {
        return new JAXBElement<String>(_RecordSchema_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortKeyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "sortKey")
    public JAXBElement<SortKeyType> createSortKey(SortKeyType value) {
        return new JAXBElement<SortKeyType>(_SortKey_QNAME, SortKeyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "caseSensitive")
    public JAXBElement<Boolean> createCaseSensitive(Boolean value) {
        return new JAXBElement<Boolean>(_CaseSensitive_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "query")
    public JAXBElement<String> createQuery(String value) {
        return new JAXBElement<String>(_Query_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.loc.gov/zing/srw/", name = "stylesheet")
    public JAXBElement<String> createStylesheet(String value) {
        return new JAXBElement<String>(_Stylesheet_QNAME, String.class, null, value);
    }

}
