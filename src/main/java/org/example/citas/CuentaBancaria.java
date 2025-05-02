//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.05.02 a las 12:32:43 PM CEST 
//


package org.example.citas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cuenta_bancaria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cuenta_bancaria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numero_cuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigo_iban" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="banco" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cuenta_bancaria", namespace = "http://www.example.org/cuenta_bancaria", propOrder = {
    "numeroCuenta",
    "codigoIban",
    "banco",
    "pais"
})
public class CuentaBancaria {

    @XmlElement(name = "numero_cuenta", namespace = "http://www.example.org/cuenta_bancaria", required = true)
    protected String numeroCuenta;
    @XmlElement(name = "codigo_iban", namespace = "http://www.example.org/cuenta_bancaria", required = true)
    protected String codigoIban;
    @XmlElement(namespace = "http://www.example.org/cuenta_bancaria", required = true)
    protected String banco;
    @XmlElement(namespace = "http://www.example.org/cuenta_bancaria", required = true)
    protected String pais;

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCuenta(String value) {
        this.numeroCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoIban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIban() {
        return codigoIban;
    }

    /**
     * Define el valor de la propiedad codigoIban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIban(String value) {
        this.codigoIban = value;
    }

    /**
     * Obtiene el valor de la propiedad banco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanco() {
        return banco;
    }

    /**
     * Define el valor de la propiedad banco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanco(String value) {
        this.banco = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

}
