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
 * <p>Clase Java para AccountingEntryImportCreateConfirmationMessage_sync complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountingEntryImportCreateConfirmationMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountingEntryImport" type="{http://0050180878-one-off.sap.com/Y8PZZIGMY_}AccountingEntryImportCreateConfirmation" minOccurs="0"/&gt;
 *         &lt;element name="Log" type="{http://sap.com/xi/AP/Common/GDT}Log"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingEntryImportCreateConfirmationMessage_sync", namespace = "http://0050180878-one-off.sap.com/Y8PZZIGMY_", propOrder = {
    "accountingEntryImport",
    "log"
})
public class AccountingEntryImportCreateConfirmationMessageSync {

    @XmlElement(name = "AccountingEntryImport")
    protected AccountingEntryImportCreateConfirmation accountingEntryImport;
    @XmlElement(name = "Log", required = true)
    protected Log log;

    /**
     * Obtiene el valor de la propiedad accountingEntryImport.
     * 
     * @return
     *     possible object is
     *     {@link AccountingEntryImportCreateConfirmation }
     *     
     */
    public AccountingEntryImportCreateConfirmation getAccountingEntryImport() {
        return accountingEntryImport;
    }

    /**
     * Define el valor de la propiedad accountingEntryImport.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingEntryImportCreateConfirmation }
     *     
     */
    public void setAccountingEntryImport(AccountingEntryImportCreateConfirmation value) {
        this.accountingEntryImport = value;
    }

    /**
     * Obtiene el valor de la propiedad log.
     * 
     * @return
     *     possible object is
     *     {@link Log }
     *     
     */
    public Log getLog() {
        return log;
    }

    /**
     * Define el valor de la propiedad log.
     * 
     * @param value
     *     allowed object is
     *     {@link Log }
     *     
     */
    public void setLog(Log value) {
        this.log = value;
    }

}
