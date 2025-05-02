# LM_06
# Proyecto JAXB: De XML a Objetos Java

![Java](https://img.shields.io/badge/Java-1.8-blue) ![Maven](https://img.shields.io/badge/Maven-3.8.x-red) ![JAXB](https://img.shields.io/badge/JAXB-2.3.2-green)

## Descripción
Este proyecto muestra cómo generar clases Java a partir de esquemas XML (XSD) usando JAXB, con Maven en IntelliJ IDEA. Incluye ejemplos de:

- XSD simple
- XSD complejo (100+ elementos)
- Esquemas compuestos (importación entre XSD)

## Estructura del Proyecto

```bash
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org.example.citas       # Clases generadas para Citas
│   │   └── resources
│   │       ├── simple.xsd
│   │       ├── complejo.xsd
│   │       ├── cuenta_bancaria.xsd
│   │       └── transaccion.xsd
│   └── test
│       └── java                       # Pruebas unitarias (opcional)
└── README.md                          # Documentación del proyecto
```

## Requisitos

- Java 1.8
- Maven 3.6 o superior
- IntelliJ IDEA 

## Instalación y Configuración

1. **Clonar el repositorio**
   ```bash
git clone https://github.com/tu-usuario/mi-proyecto.git
cd mi-proyecto
```

2. **Configurar Java y Maven**
   - Asegúrate de tener instalada la JDK 1.8.
   - Configura la variable `JAVA_HOME` apuntando a tu instalación de Java 1.8.
   - Verifica que Maven está en tu `PATH`.

3. **Agregar dependencias y plugins al `pom.xml`**

   ```xml
   <build>
     <plugins>
       <!-- Plugin JAXB2 Maven -->
       <plugin>
         <groupId>org.codehaus.mojo</groupId>
         <artifactId>jaxb2-maven-plugin</artifactId>
         <version>2.5.0</version>
         <executions>
           <execution>
             <goals>
               <goal>xjc</goal>
             </goals>
           </execution>
         </executions>
         <configuration>
           <schemas>
             <schema>src/main/resources/simple.xsd</schema>
             <schema>src/main/resources/complejo.xsd</schema>
             <schema>src/main/resources/cuenta_bancaria.xsd</schema>
             <schema>src/main/resources/transaccion.xsd</schema>
           </schemas>
           <packageName>org.example.citas</packageName>
         </configuration>
       </plugin>
     </plugins>
   </build>
   ```

## Generación de Clases

Ejecuta los objetivos de Maven:

```bash
mvn clean install
```

Esto generará las clases JAXB en `target/generated-sources/jaxb` y las copiará a `src/main/java`.

## Uso

```java
import org.example.citas.Citas;

// Ejemplo de lectura de un XML de citas
JAXBContext ctx = JAXBContext.newInstance(Citas.class);
Unmarshaller um = ctx.createUnmarshaller();
Citas citas = (Citas) um.unmarshal(new File("src/main/resources/citas.xml"));

for (Citas.Cita cita : citas.getCita()) {
    System.out.println(cita.getPaciente().getNombre());
}
```
