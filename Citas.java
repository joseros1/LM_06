//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.05.02 a las 12:32:43 PM CEST 
//


package org.example.citas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="cita" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="paciente"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="horario"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="mañana"/&gt;
 *                         &lt;enumeration value="tarde"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="especialidad"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Oftalmología"/&gt;
 *                         &lt;enumeration value="Fisioterapia y rehabilitación"/&gt;
 *                         &lt;enumeration value="Cardiología"/&gt;
 *                         &lt;enumeration value="Ginecología y obstetricia"/&gt;
 *                         &lt;enumeration value="Salud mental"/&gt;
 *                         &lt;enumeration value="ORL"/&gt;
 *                         &lt;enumeration value="Dental"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="tipoCita"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                             &lt;element name="codigoPoliza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/choice&gt;
 *                           &lt;attribute name="tipo" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="libre"/&gt;
 *                                 &lt;enumeration value="seguro"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="urgente" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="medicoAsignado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="duracionEstimada" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "cita"
})
@XmlRootElement(name = "citas")
public class Citas {

    @XmlElement(required = true)
    protected List<Citas.Cita> cita;

    /**
     * Gets the value of the cita property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cita property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCita().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Citas.Cita }
     * 
     * 
     */
    public List<Citas.Cita> getCita() {
        if (cita == null) {
            cita = new ArrayList<Citas.Cita>();
        }
        return this.cita;
    }


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
     *         &lt;element name="paciente"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="horario"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="mañana"/&gt;
     *               &lt;enumeration value="tarde"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="especialidad"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Oftalmología"/&gt;
     *               &lt;enumeration value="Fisioterapia y rehabilitación"/&gt;
     *               &lt;enumeration value="Cardiología"/&gt;
     *               &lt;enumeration value="Ginecología y obstetricia"/&gt;
     *               &lt;enumeration value="Salud mental"/&gt;
     *               &lt;enumeration value="ORL"/&gt;
     *               &lt;enumeration value="Dental"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="tipoCita"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                   &lt;element name="codigoPoliza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/choice&gt;
     *                 &lt;attribute name="tipo" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="libre"/&gt;
     *                       &lt;enumeration value="seguro"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="urgente" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="medicoAsignado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="duracionEstimada" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
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
        "paciente",
        "fecha",
        "horario",
        "especialidad",
        "tipoCita",
        "urgente",
        "medicoAsignado",
        "duracionEstimada"
    })
    public static class Cita {

        @XmlElement(required = true)
        protected Citas.Cita.Paciente paciente;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fecha;
        @XmlElement(required = true)
        protected String horario;
        @XmlElement(required = true)
        protected String especialidad;
        @XmlElement(required = true)
        protected Citas.Cita.TipoCita tipoCita;
        protected boolean urgente;
        protected String medicoAsignado;
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger duracionEstimada;

        /**
         * Obtiene el valor de la propiedad paciente.
         * 
         * @return
         *     possible object is
         *     {@link Citas.Cita.Paciente }
         *     
         */
        public Citas.Cita.Paciente getPaciente() {
            return paciente;
        }

        /**
         * Define el valor de la propiedad paciente.
         * 
         * @param value
         *     allowed object is
         *     {@link Citas.Cita.Paciente }
         *     
         */
        public void setPaciente(Citas.Cita.Paciente value) {
            this.paciente = value;
        }

        /**
         * Obtiene el valor de la propiedad fecha.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFecha() {
            return fecha;
        }

        /**
         * Define el valor de la propiedad fecha.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFecha(XMLGregorianCalendar value) {
            this.fecha = value;
        }

        /**
         * Obtiene el valor de la propiedad horario.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHorario() {
            return horario;
        }

        /**
         * Define el valor de la propiedad horario.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHorario(String value) {
            this.horario = value;
        }

        /**
         * Obtiene el valor de la propiedad especialidad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEspecialidad() {
            return especialidad;
        }

        /**
         * Define el valor de la propiedad especialidad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEspecialidad(String value) {
            this.especialidad = value;
        }

        /**
         * Obtiene el valor de la propiedad tipoCita.
         * 
         * @return
         *     possible object is
         *     {@link Citas.Cita.TipoCita }
         *     
         */
        public Citas.Cita.TipoCita getTipoCita() {
            return tipoCita;
        }

        /**
         * Define el valor de la propiedad tipoCita.
         * 
         * @param value
         *     allowed object is
         *     {@link Citas.Cita.TipoCita }
         *     
         */
        public void setTipoCita(Citas.Cita.TipoCita value) {
            this.tipoCita = value;
        }

        /**
         * Obtiene el valor de la propiedad urgente.
         * 
         */
        public boolean isUrgente() {
            return urgente;
        }

        /**
         * Define el valor de la propiedad urgente.
         * 
         */
        public void setUrgente(boolean value) {
            this.urgente = value;
        }

        /**
         * Obtiene el valor de la propiedad medicoAsignado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMedicoAsignado() {
            return medicoAsignado;
        }

        /**
         * Define el valor de la propiedad medicoAsignado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMedicoAsignado(String value) {
            this.medicoAsignado = value;
        }

        /**
         * Obtiene el valor de la propiedad duracionEstimada.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuracionEstimada() {
            return duracionEstimada;
        }

        /**
         * Define el valor de la propiedad duracionEstimada.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuracionEstimada(BigInteger value) {
            this.duracionEstimada = value;
        }


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
         *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "dni",
            "nombre",
            "apellidos",
            "fechaNacimiento",
            "telefono",
            "email"
        })
        public static class Paciente {

            @XmlElement(required = true)
            protected String dni;
            @XmlElement(required = true)
            protected String nombre;
            @XmlElement(required = true)
            protected String apellidos;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar fechaNacimiento;
            @XmlElement(required = true)
            protected String telefono;
            protected String email;

            /**
             * Obtiene el valor de la propiedad dni.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDni() {
                return dni;
            }

            /**
             * Define el valor de la propiedad dni.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDni(String value) {
                this.dni = value;
            }

            /**
             * Obtiene el valor de la propiedad nombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
                return nombre;
            }

            /**
             * Define el valor de la propiedad nombre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombre(String value) {
                this.nombre = value;
            }

            /**
             * Obtiene el valor de la propiedad apellidos.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApellidos() {
                return apellidos;
            }

            /**
             * Define el valor de la propiedad apellidos.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApellidos(String value) {
                this.apellidos = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaNacimiento.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getFechaNacimiento() {
                return fechaNacimiento;
            }

            /**
             * Define el valor de la propiedad fechaNacimiento.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setFechaNacimiento(XMLGregorianCalendar value) {
                this.fechaNacimiento = value;
            }

            /**
             * Obtiene el valor de la propiedad telefono.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelefono() {
                return telefono;
            }

            /**
             * Define el valor de la propiedad telefono.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelefono(String value) {
                this.telefono = value;
            }

            /**
             * Obtiene el valor de la propiedad email.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Define el valor de la propiedad email.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;choice&gt;
         *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *         &lt;element name="codigoPoliza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/choice&gt;
         *       &lt;attribute name="tipo" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="libre"/&gt;
         *             &lt;enumeration value="seguro"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cargo",
            "codigoPoliza"
        })
        public static class TipoCita {

            protected BigDecimal cargo;
            protected String codigoPoliza;
            @XmlAttribute(name = "tipo", required = true)
            protected String tipo;

            /**
             * Obtiene el valor de la propiedad cargo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCargo() {
                return cargo;
            }

            /**
             * Define el valor de la propiedad cargo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCargo(BigDecimal value) {
                this.cargo = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoPoliza.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoPoliza() {
                return codigoPoliza;
            }

            /**
             * Define el valor de la propiedad codigoPoliza.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoPoliza(String value) {
                this.codigoPoliza = value;
            }

            /**
             * Obtiene el valor de la propiedad tipo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipo() {
                return tipo;
            }

            /**
             * Define el valor de la propiedad tipo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipo(String value) {
                this.tipo = value;
            }

        }

    }

}
