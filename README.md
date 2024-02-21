
Full Power Guide:
https://blog.tericcabrel.com/jwt-authentication-springboot-spring-security/


Arquetipo para los proyectos Spring.

Se colocan las carpetas como se verían en un proyecto real.
Todos los arquetipos son guardados como Features.

Configuramos:
*Ramas base para GitFlow
*Base de datos Oracle con OJDBC --> Descargamos 19c + ojdbc11 + DBeaver (Usuario system + password Alpa...)

Spring Inizializr:
    *Spring Boot Dev Tools
    *Lombok
    *Spring Web
    *Spring Data JPA
    *Spring Security
    *Validation

Nuestras librerias extra:
    *Para DB:
        *Oracle Driver
            <dependency>
                <groupId>com.oracle.database.jdbc</groupId>
                <artifactId>ojdbc11</artifactId>
                <scope>runtime</scope>
            </dependency>
    *Para JWT:
        <dependencies>
            <dependency>
                <groupId>io.jsonwebtoken</groupId>
                <artifactId>jjwt-api</artifactId>
                <version>0.11.5</version>
            </dependency>
            <dependency>
                <groupId>io.jsonwebtoken</groupId>
                <artifactId>jjwt-impl</artifactId>
                <version>0.11.5</version>
            </dependency>
            <dependency>
                <groupId>io.jsonwebtoken</groupId>
                <artifactId>jjwt-jackson</artifactId>
                <version>0.11.5</version>
            </dependency>
        </dependencies>


Si queremos hacerlo microservicios:
    *Eureka Client
    *Hyxtrix


La rama Main contiene una plantilla lo mas simple posible de un proyecto al 100% de tech
La rama dev contiene ejemplos en desarrollo o funcionales pero solo arquetipo
La rama fix implementa ejemplos del dev

