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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para LogItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LogItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTypeID" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}LogItemCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="SeverityCode" type="{http://sap.com/xi/AP/Common/GDT}LogItemSeverityCode" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceMessageElementName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://sap.com/xi/AP/Common/GDT}LogItemNote"/&gt;
 *         &lt;element name="NoteTemplateText" type="{http://sap.com/xi/AP/Common/GDT}LogItemNoteTemplateText" minOccurs="0"/&gt;
 *         &lt;element name="LogItemNotePlaceholderSubstitutionList" type="{http://sap.com/xi/AP/Common/GDT}LogItemNotePlaceholderSubstitutionList" minOccurs="0"/&gt;
 *         &lt;element name="WebURI" type="{http://sap.com/xi/AP/Common/GDT}WebURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogItem", propOrder = {
    "typeID",
    "categoryCode",
    "severityCode",
    "referenceObjectNodeSenderTechnicalID",
    "referenceMessageElementName",
    "note",
    "noteTemplateText",
    "logItemNotePlaceholderSubstitutionList",
    "webURI"
})
public class LogItem {

    @XmlElement(name = "TypeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeID;
    @XmlElement(name = "CategoryCode")
    protected LogItemCategoryCode categoryCode;
    @XmlElement(name = "SeverityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String severityCode;
    @XmlElement(name = "ReferenceObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceObjectNodeSenderTechnicalID;
    @XmlElement(name = "ReferenceMessageElementName")
    protected String referenceMessageElementName;
    @XmlElement(name = "Note", required = true)
    protected String note;
    @XmlElement(name = "NoteTemplateText")
    protected String noteTemplateText;
    @XmlElement(name = "LogItemNotePlaceholderSubstitutionList")
    protected LogItemNotePlaceholderSubstitutionList logItemNotePlaceholderSubstitutionList;
    @XmlElement(name = "WebURI")
    @XmlSchemaType(name = "anyURI")
    protected String webURI;

    /**
     * Obtiene el valor de la propiedad typeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeID() {
        return typeID;
    }

    /**
     * Define el valor de la propiedad typeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeID(String value) {
        this.typeID = value;
    }

    /**
     * Obtiene el valor de la propiedad categoryCode.
     * 
     * @return
     *     possible object is
     *     {@link LogItemCategoryCode }
     *     
     */
    public LogItemCategoryCode getCategoryCode() {
        return categoryCode;
    }

    /**
     * Define el valor de la propiedad categoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LogItemCategoryCode }
     *     
     */
    public void setCategoryCode(LogItemCategoryCode value) {
        this.categoryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad severityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverityCode() {
        return severityCode;
    }

    /**
     * Define el valor de la propiedad severityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverityCode(String value) {
        this.severityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceObjectNodeSenderTechnicalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceObjectNodeSenderTechnicalID() {
        return referenceObjectNodeSenderTechnicalID;
    }

    /**
     * Define el valor de la propiedad referenceObjectNodeSenderTechnicalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceObjectNodeSenderTechnicalID(String value) {
        this.referenceObjectNodeSenderTechnicalID = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceMessageElementName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceMessageElementName() {
        return referenceMessageElementName;
    }

    /**
     * Define el valor de la propiedad referenceMessageElementName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceMessageElementName(String value) {
        this.referenceMessageElementName = value;
    }

    /**
     * Obtiene el valor de la propiedad note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Define el valor de la propiedad note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Obtiene el valor de la propiedad noteTemplateText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteTemplateText() {
        return noteTemplateText;
    }

    /**
     * Define el valor de la propiedad noteTemplateText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteTemplateText(String value) {
        this.noteTemplateText = value;
    }

    /**
     * Obtiene el valor de la propiedad logItemNotePlaceholderSubstitutionList.
     * 
     * @return
     *     possible object is
     *     {@link LogItemNotePlaceholderSubstitutionList }
     *     
     */
    public LogItemNotePlaceholderSubstitutionList getLogItemNotePlaceholderSubstitutionList() {
        return logItemNotePlaceholderSubstitutionList;
    }

    /**
     * Define el valor de la propiedad logItemNotePlaceholderSubstitutionList.
     * 
     * @param value
     *     allowed object is
     *     {@link LogItemNotePlaceholderSubstitutionList }
     *     
     */
    public void setLogItemNotePlaceholderSubstitutionList(LogItemNotePlaceholderSubstitutionList value) {
        this.logItemNotePlaceholderSubstitutionList = value;
    }

    /**
     * Obtiene el valor de la propiedad webURI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebURI() {
        return webURI;
    }

    /**
     * Define el valor de la propiedad webURI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebURI(String value) {
        this.webURI = value;
    }

}
