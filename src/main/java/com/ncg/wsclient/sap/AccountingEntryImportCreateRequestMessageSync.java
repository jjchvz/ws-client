//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.05.12 a las 09:47:15 AM VET 
//


package com.ncg.wsclient.sap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountingEntryImportCreateRequestMessage_sync complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountingEntryImportCreateRequestMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasicMessageHeader" type="{http://sap.com/xi/AP/Common/GDT}BusinessDocumentBasicMessageHeader"/&gt;
 *         &lt;element name="AccountingEntryImport" type="{http://0050180878-one-off.sap.com/Y8PZZIGMY_}AccountingEntryImportCreateRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingEntryImportCreateRequestMessage_sync", namespace = "http://0050180878-one-off.sap.com/Y8PZZIGMY_", propOrder = {
    "basicMessageHeader",
    "accountingEntryImport"
})
public class AccountingEntryImportCreateRequestMessageSync {

    @XmlElement(name = "BasicMessageHeader", required = true)
    protected BusinessDocumentBasicMessageHeader basicMessageHeader;
    @XmlElement(name = "AccountingEntryImport", required = true)
    protected AccountingEntryImportCreateRequest accountingEntryImport;

    /**
     * Obtiene el valor de la propiedad basicMessageHeader.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentBasicMessageHeader }
     *     
     */
    public BusinessDocumentBasicMessageHeader getBasicMessageHeader() {
        return basicMessageHeader;
    }

    /**
     * Define el valor de la propiedad basicMessageHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentBasicMessageHeader }
     *     
     */
    public void setBasicMessageHeader(BusinessDocumentBasicMessageHeader value) {
        this.basicMessageHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad accountingEntryImport.
     * 
     * @return
     *     possible object is
     *     {@link AccountingEntryImportCreateRequest }
     *     
     */
    public AccountingEntryImportCreateRequest getAccountingEntryImport() {
        return accountingEntryImport;
    }

    /**
     * Define el valor de la propiedad accountingEntryImport.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingEntryImportCreateRequest }
     *     
     */
    public void setAccountingEntryImport(AccountingEntryImportCreateRequest value) {
        this.accountingEntryImport = value;
    }

}
