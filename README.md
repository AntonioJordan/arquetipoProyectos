
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


Este Arquetipo funciona correctamente seguir guía --> https://blog.tericcabrel.com/jwt-authentication-springboot-spring-security/

EndPoints de Control de acceso:
        POST --> http://localhost:8080/auth/signup
        POST --> http://localhost:8080/auth/login
        
        Envíamos por Body: 
        {
            "email": "toni@aaaa",
            "password": "absxcnscisncisn",
            "fullName": "Toni"
        }

        Una vez logado, metemos el token en postman por Bearer Token
        GET --> http://localhost:8080/users/me


Explicación del Proyecto:

    -Creamos una BD, con User, esto será por Oracle
    
    -Usamos Entity User, User implementa UserDetails de Spring eso nos mete automaticamente 
    métodos validadores que ponemos a True para que funcione al login.
    
    -Creamos un Controller para el Authentication, este tendrá 2 endpoints signup para crear cuenta y
    login para volver a entrar, ámbos nos metemos por Postman para usarlo. Este nos devuelve el Token como
    login Response

    -Usamos SecurityConfiguration para decir que Url's se admiten para auth, cuales dejamos sin auth y cuales con.


