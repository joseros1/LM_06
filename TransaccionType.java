//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.05.02 a las 12:32:43 PM CEST 
//


package org.example.citas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transaccionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transaccionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cuenta_origen_bancaria" type="{http://www.example.org/cuenta_bancaria}cuenta_bancaria"/&gt;
 *         &lt;element name="cuenta_destino_bancaria" type="{http://www.example.org/cuenta_bancaria}cuenta_bancaria"/&gt;
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaccionType", namespace = "http://www.example.org/transaccion", propOrder = {
    "cuentaOrigenBancaria",
    "cuentaDestinoBancaria",
    "monto"
})
public class TransaccionType {

    @XmlElement(name = "cuenta_origen_bancaria", namespace = "http://www.example.org/transaccion", required = true)
    protected CuentaBancaria cuentaOrigenBancaria;
    @XmlElement(name = "cuenta_destino_bancaria", namespace = "http://www.example.org/transaccion", required = true)
    protected CuentaBancaria cuentaDestinoBancaria;
    @XmlElement(namespace = "http://www.example.org/transaccion", required = true)
    protected BigDecimal monto;

    /**
     * Obtiene el valor de la propiedad cuentaOrigenBancaria.
     * 
     * @return
     *     possible object is
     *     {@link CuentaBancaria }
     *     
     */
    public CuentaBancaria getCuentaOrigenBancaria() {
        return cuentaOrigenBancaria;
    }

    /**
     * Define el valor de la propiedad cuentaOrigenBancaria.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentaBancaria }
     *     
     */
    public void setCuentaOrigenBancaria(CuentaBancaria value) {
        this.cuentaOrigenBancaria = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaDestinoBancaria.
     * 
     * @return
     *     possible object is
     *     {@link CuentaBancaria }
     *     
     */
    public CuentaBancaria getCuentaDestinoBancaria() {
        return cuentaDestinoBancaria;
    }

    /**
     * Define el valor de la propiedad cuentaDestinoBancaria.
     * 
     * @param value
     *     allowed object is
     *     {@link CuentaBancaria }
     *     
     */
    public void setCuentaDestinoBancaria(CuentaBancaria value) {
        this.cuentaDestinoBancaria = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonto(BigDecimal value) {
        this.monto = value;
    }

}
