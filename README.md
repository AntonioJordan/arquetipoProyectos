Arquetipo para los proyectos Spring.

La estructura en general de ramas se muestra así para recordar como es una ramificación de un proyecto Profesional Serio.

Los Arquetipos se situan en la carpeta  --> Feature
Los Proyectos serios se situan en la c. --> Fix



Configuramos:
*Ramas base para GitFlow
*Base de datos Oracle con OJDBC --> Descargamos 19c + ojdbc11 + DBeaver (Usuario system + password Alpa...)

Spring Inizializr:
*Spring Boot Dev Tools
*Lombok
*Spring Web
*Spring Data JPA
*Oracle Driver
*Spring Security
*Validation

    Si queremos hacerlo microservicios:
        *Eureka Client
        *Hyxtrix


La rama Main contiene una plantilla lo mas simple posible de un proyecto al 100% de tech
La rama dev contiene ejemplos en desarrollo o funcionales pero solo arquetipo
La rama fix implementa ejemplos del dev


El proyecto ideal es aquel que tiene
    +Lombok
    +Base datos Oracle o Mongo
    +JWT y Spring Security integrado a la API
    +Una buena ruta desde controller a BD
    +Buena documentación por SwaggerUI/SpringDocs
    +Optionals, streams, lambdas y reactividad.
    +Buena integración en Testing Junit5/Mockito
    


