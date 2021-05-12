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
 * <p>Clase Java para LogItemNotePlaceholderSubstitutionList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LogItemNotePlaceholderSubstitutionList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstPlaceholderID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTemplatePlaceholderID"/&gt;
 *         &lt;element name="SecondPlaceholderID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTemplatePlaceholderID" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPlaceholderID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTemplatePlaceholderID" minOccurs="0"/&gt;
 *         &lt;element name="FourthPlaceholderID" type="{http://sap.com/xi/AP/Common/GDT}LogItemTemplatePlaceholderID" minOccurs="0"/&gt;
 *         &lt;element name="FirstPlaceholderSubstitutionText" type="{http://sap.com/xi/AP/Common/GDT}LogItemPlaceholderSubstitutionText"/&gt;
 *         &lt;element name="SecondPlaceholderSubstitutionText" type="{http://sap.com/xi/AP/Common/GDT}LogItemPlaceholderSubstitutionText" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPlaceholderSubstitutionText" type="{http://sap.com/xi/AP/Common/GDT}LogItemPlaceholderSubstitutionText" minOccurs="0"/&gt;
 *         &lt;element name="FourthPlaceholderSubstitutionText" type="{http://sap.com/xi/AP/Common/GDT}LogItemPlaceholderSubstitutionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogItemNotePlaceholderSubstitutionList", propOrder = {
    "firstPlaceholderID",
    "secondPlaceholderID",
    "thirdPlaceholderID",
    "fourthPlaceholderID",
    "firstPlaceholderSubstitutionText",
    "secondPlaceholderSubstitutionText",
    "thirdPlaceholderSubstitutionText",
    "fourthPlaceholderSubstitutionText"
})
public class LogItemNotePlaceholderSubstitutionList {

    @XmlElement(name = "FirstPlaceholderID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstPlaceholderID;
    @XmlElement(name = "SecondPlaceholderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String secondPlaceholderID;
    @XmlElement(name = "ThirdPlaceholderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String thirdPlaceholderID;
    @XmlElement(name = "FourthPlaceholderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fourthPlaceholderID;
    @XmlElement(name = "FirstPlaceholderSubstitutionText", required = true)
    protected String firstPlaceholderSubstitutionText;
    @XmlElement(name = "SecondPlaceholderSubstitutionText")
    protected String secondPlaceholderSubstitutionText;
    @XmlElement(name = "ThirdPlaceholderSubstitutionText")
    protected String thirdPlaceholderSubstitutionText;
    @XmlElement(name = "FourthPlaceholderSubstitutionText")
    protected String fourthPlaceholderSubstitutionText;

    /**
     * Obtiene el valor de la propiedad firstPlaceholderID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPlaceholderID() {
        return firstPlaceholderID;
    }

    /**
     * Define el valor de la propiedad firstPlaceholderID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPlaceholderID(String value) {
        this.firstPlaceholderID = value;
    }

    /**
     * Obtiene el valor de la propiedad secondPlaceholderID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondPlaceholderID() {
        return secondPlaceholderID;
    }

    /**
     * Define el valor de la propiedad secondPlaceholderID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondPlaceholderID(String value) {
        this.secondPlaceholderID = value;
    }

    /**
     * Obtiene el valor de la propiedad thirdPlaceholderID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPlaceholderID() {
        return thirdPlaceholderID;
    }

    /**
     * Define el valor de la propiedad thirdPlaceholderID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPlaceholderID(String value) {
        this.thirdPlaceholderID = value;
    }

    /**
     * Obtiene el valor de la propiedad fourthPlaceholderID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthPlaceholderID() {
        return fourthPlaceholderID;
    }

    /**
     * Define el valor de la propiedad fourthPlaceholderID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthPlaceholderID(String value) {
        this.fourthPlaceholderID = value;
    }

    /**
     * Obtiene el valor de la propiedad firstPlaceholderSubstitutionText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPlaceholderSubstitutionText() {
        return firstPlaceholderSubstitutionText;
    }

    /**
     * Define el valor de la propiedad firstPlaceholderSubstitutionText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPlaceholderSubstitutionText(String value) {
        this.firstPlaceholderSubstitutionText = value;
    }

    /**
     * Obtiene el valor de la propiedad secondPlaceholderSubstitutionText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondPlaceholderSubstitutionText() {
        return secondPlaceholderSubstitutionText;
    }

    /**
     * Define el valor de la propiedad secondPlaceholderSubstitutionText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondPlaceholderSubstitutionText(String value) {
        this.secondPlaceholderSubstitutionText = value;
    }

    /**
     * Obtiene el valor de la propiedad thirdPlaceholderSubstitutionText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPlaceholderSubstitutionText() {
        return thirdPlaceholderSubstitutionText;
    }

    /**
     * Define el valor de la propiedad thirdPlaceholderSubstitutionText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPlaceholderSubstitutionText(String value) {
        this.thirdPlaceholderSubstitutionText = value;
    }

    /**
     * Obtiene el valor de la propiedad fourthPlaceholderSubstitutionText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthPlaceholderSubstitutionText() {
        return fourthPlaceholderSubstitutionText;
    }

    /**
     * Define el valor de la propiedad fourthPlaceholderSubstitutionText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthPlaceholderSubstitutionText(String value) {
        this.fourthPlaceholderSubstitutionText = value;
    }

}
