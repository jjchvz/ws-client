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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="standard" type="{http://sap.com/xi/AP/Common/Global}ExchangeFaultData"/&gt;
 *         &lt;element name="addition" type="{http://sap.com/xi/AP/Common/Global}StandardFaultMessageExtension"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "standard",
    "addition"
})
@XmlRootElement(name = "StandardFaultMessage", namespace = "http://sap.com/xi/AP/Common/Global")
public class StandardFaultMessage {

    @XmlElement(required = true)
    protected ExchangeFaultData standard;
    @XmlElement(required = true)
    protected StandardFaultMessageExtension addition;

    /**
     * Obtiene el valor de la propiedad standard.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeFaultData }
     *     
     */
    public ExchangeFaultData getStandard() {
        return standard;
    }

    /**
     * Define el valor de la propiedad standard.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeFaultData }
     *     
     */
    public void setStandard(ExchangeFaultData value) {
        this.standard = value;
    }

    /**
     * Obtiene el valor de la propiedad addition.
     * 
     * @return
     *     possible object is
     *     {@link StandardFaultMessageExtension }
     *     
     */
    public StandardFaultMessageExtension getAddition() {
        return addition;
    }

    /**
     * Define el valor de la propiedad addition.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardFaultMessageExtension }
     *     
     */
    public void setAddition(StandardFaultMessageExtension value) {
        this.addition = value;
    }

}
