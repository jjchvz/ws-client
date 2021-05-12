//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.05.12 a las 09:47:15 AM VET 
//


package com.ncg.wsclient.sap;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para AccountingEntryImportCreateRequest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountingEntryImportCreateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="ChartOfAccountsCode" type="{http://sap.com/xi/AP/FinancialAccounting/Global}ChartOfAccountsCode" minOccurs="0"/&gt;
 *         &lt;element name="AccountingDocumentTypeCode" type="{http://sap.com/xi/AP/FinancialAccounting/Global}AccountingDocumentTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BusinessTransactionTypeCode" type="{http://sap.com/xi/AP/FinancialAccounting/Global}AccountingBusinessTransactionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCurrencyCode" type="{http://sap.com/xi/AP/Common/GDT}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="AccountingClosingStepCode" type="{http://sap.com/xi/AP/FinancialAccounting/Global}AccountingClosingStepCode" minOccurs="0"/&gt;
 *         &lt;element name="EntryDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="PostingDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Note" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingEntryImportCreateRequest", namespace = "http://0050180878-one-off.sap.com/Y8PZZIGMY_", propOrder = {
    "companyID",
    "chartOfAccountsCode",
    "accountingDocumentTypeCode",
    "businessTransactionTypeCode",
    "transactionCurrencyCode",
    "accountingClosingStepCode",
    "entryDate",
    "postingDate",
    "note"
})
public class AccountingEntryImportCreateRequest {

    @XmlElement(name = "CompanyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyID;
    @XmlElement(name = "ChartOfAccountsCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String chartOfAccountsCode;
    @XmlElement(name = "AccountingDocumentTypeCode")
    protected AccountingDocumentTypeCode accountingDocumentTypeCode;
    @XmlElement(name = "BusinessTransactionTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessTransactionTypeCode;
    @XmlElement(name = "TransactionCurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transactionCurrencyCode;
    @XmlElement(name = "AccountingClosingStepCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountingClosingStepCode;
    @XmlElement(name = "EntryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlElement(name = "PostingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar postingDate;
    @XmlElement(name = "Note")
    protected SHORTNote note;

    /**
     * Obtiene el valor de la propiedad companyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * Define el valor de la propiedad companyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyID(String value) {
        this.companyID = value;
    }

    /**
     * Obtiene el valor de la propiedad chartOfAccountsCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChartOfAccountsCode() {
        return chartOfAccountsCode;
    }

    /**
     * Define el valor de la propiedad chartOfAccountsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChartOfAccountsCode(String value) {
        this.chartOfAccountsCode = value;
    }

    /**
     * Obtiene el valor de la propiedad accountingDocumentTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link AccountingDocumentTypeCode }
     *     
     */
    public AccountingDocumentTypeCode getAccountingDocumentTypeCode() {
        return accountingDocumentTypeCode;
    }

    /**
     * Define el valor de la propiedad accountingDocumentTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingDocumentTypeCode }
     *     
     */
    public void setAccountingDocumentTypeCode(AccountingDocumentTypeCode value) {
        this.accountingDocumentTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad businessTransactionTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTransactionTypeCode() {
        return businessTransactionTypeCode;
    }

    /**
     * Define el valor de la propiedad businessTransactionTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTransactionTypeCode(String value) {
        this.businessTransactionTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCurrencyCode() {
        return transactionCurrencyCode;
    }

    /**
     * Define el valor de la propiedad transactionCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCurrencyCode(String value) {
        this.transactionCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad accountingClosingStepCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingClosingStepCode() {
        return accountingClosingStepCode;
    }

    /**
     * Define el valor de la propiedad accountingClosingStepCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingClosingStepCode(String value) {
        this.accountingClosingStepCode = value;
    }

    /**
     * Obtiene el valor de la propiedad entryDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Define el valor de la propiedad entryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad postingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostingDate() {
        return postingDate;
    }

    /**
     * Define el valor de la propiedad postingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostingDate(XMLGregorianCalendar value) {
        this.postingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad note.
     * 
     * @return
     *     possible object is
     *     {@link SHORTNote }
     *     
     */
    public SHORTNote getNote() {
        return note;
    }

    /**
     * Define el valor de la propiedad note.
     * 
     * @param value
     *     allowed object is
     *     {@link SHORTNote }
     *     
     */
    public void setNote(SHORTNote value) {
        this.note = value;
    }

}
