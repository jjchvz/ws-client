//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.05.12 a las 09:47:15 AM VET 
//


package com.ncg.wsclient.sap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ncg.wsclient.sap package. 
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

    private final static QName _AccountingEntryImportCreateConfirmationSync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "AccountingEntryImportCreateConfirmation_sync");
    private final static QName _AccountingEntryImportCreateRequestSync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "AccountingEntryImportCreateRequest_sync");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ncg.wsclient.sap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountingEntryImportCreateConfirmationMessageSync }
     * 
     */
    public AccountingEntryImportCreateConfirmationMessageSync createAccountingEntryImportCreateConfirmationMessageSync() {
        return new AccountingEntryImportCreateConfirmationMessageSync();
    }

    /**
     * Create an instance of {@link AccountingEntryImportCreateRequestMessageSync }
     * 
     */
    public AccountingEntryImportCreateRequestMessageSync createAccountingEntryImportCreateRequestMessageSync() {
        return new AccountingEntryImportCreateRequestMessageSync();
    }

    /**
     * Create an instance of {@link StandardFaultMessage }
     * 
     */
    public StandardFaultMessage createStandardFaultMessage() {
        return new StandardFaultMessage();
    }

    /**
     * Create an instance of {@link ExchangeFaultData }
     * 
     */
    public ExchangeFaultData createExchangeFaultData() {
        return new ExchangeFaultData();
    }

    /**
     * Create an instance of {@link StandardFaultMessageExtension }
     * 
     */
    public StandardFaultMessageExtension createStandardFaultMessageExtension() {
        return new StandardFaultMessageExtension();
    }

    /**
     * Create an instance of {@link ExchangeLogData }
     * 
     */
    public ExchangeLogData createExchangeLogData() {
        return new ExchangeLogData();
    }

    /**
     * Create an instance of {@link AccountingEntryImportCreateConfirmation }
     * 
     */
    public AccountingEntryImportCreateConfirmation createAccountingEntryImportCreateConfirmation() {
        return new AccountingEntryImportCreateConfirmation();
    }

    /**
     * Create an instance of {@link AccountingEntryImportCreateRequest }
     * 
     */
    public AccountingEntryImportCreateRequest createAccountingEntryImportCreateRequest() {
        return new AccountingEntryImportCreateRequest();
    }

    /**
     * Create an instance of {@link AccountingDocumentTypeCode }
     * 
     */
    public AccountingDocumentTypeCode createAccountingDocumentTypeCode() {
        return new AccountingDocumentTypeCode();
    }

    /**
     * Create an instance of {@link BusinessDocumentBasicMessageHeader }
     * 
     */
    public BusinessDocumentBasicMessageHeader createBusinessDocumentBasicMessageHeader() {
        return new BusinessDocumentBasicMessageHeader();
    }

    /**
     * Create an instance of {@link BusinessDocumentMessageID }
     * 
     */
    public BusinessDocumentMessageID createBusinessDocumentMessageID() {
        return new BusinessDocumentMessageID();
    }

    /**
     * Create an instance of {@link BusinessTransactionDocumentID }
     * 
     */
    public BusinessTransactionDocumentID createBusinessTransactionDocumentID() {
        return new BusinessTransactionDocumentID();
    }

    /**
     * Create an instance of {@link Log }
     * 
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link LogItem }
     * 
     */
    public LogItem createLogItem() {
        return new LogItem();
    }

    /**
     * Create an instance of {@link LogItemCategoryCode }
     * 
     */
    public LogItemCategoryCode createLogItemCategoryCode() {
        return new LogItemCategoryCode();
    }

    /**
     * Create an instance of {@link LogItemNotePlaceholderSubstitutionList }
     * 
     */
    public LogItemNotePlaceholderSubstitutionList createLogItemNotePlaceholderSubstitutionList() {
        return new LogItemNotePlaceholderSubstitutionList();
    }

    /**
     * Create an instance of {@link SHORTNote }
     * 
     */
    public SHORTNote createSHORTNote() {
        return new SHORTNote();
    }

    /**
     * Create an instance of {@link UUID }
     * 
     */
    public UUID createUUID() {
        return new UUID();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingEntryImportCreateConfirmationMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountingEntryImportCreateConfirmationMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "AccountingEntryImportCreateConfirmation_sync")
    public JAXBElement<AccountingEntryImportCreateConfirmationMessageSync> createAccountingEntryImportCreateConfirmationSync(AccountingEntryImportCreateConfirmationMessageSync value) {
        return new JAXBElement<AccountingEntryImportCreateConfirmationMessageSync>(_AccountingEntryImportCreateConfirmationSync_QNAME, AccountingEntryImportCreateConfirmationMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingEntryImportCreateRequestMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountingEntryImportCreateRequestMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "AccountingEntryImportCreateRequest_sync")
    public JAXBElement<AccountingEntryImportCreateRequestMessageSync> createAccountingEntryImportCreateRequestSync(AccountingEntryImportCreateRequestMessageSync value) {
        return new JAXBElement<AccountingEntryImportCreateRequestMessageSync>(_AccountingEntryImportCreateRequestSync_QNAME, AccountingEntryImportCreateRequestMessageSync.class, null, value);
    }

}
