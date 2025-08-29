# cleanapp - Proyecto de Aplicación Java EE

`cleanapp` es un proyecto de aplicación web desarrollado en Java EE utilizando el framework Spring Boot.
Este proyecto está diseñado para interactuar con una base de datos MySQL, siguiendo una arquitectura limpia y modular.

## Características Principales

* **Arquitectura Limpia:** La aplicación está organizada en capas (`application`, `domain`, `infrastructure`) para separar las responsabilidades y facilitar el mantenimiento.
* **Gestión de Dependencias:** Utiliza **Maven** para gestionar las librerías y dependencias del proyecto.
* **Base de Datos:** Se conecta a un gestor de base de datos **MySQL**. Las credenciales de conexión se gestionan a través del archivo `application.yml`.
* **Testing:** Incluye **pruebas unitarias** con Spring Boot para asegurar la fiabilidad y correcto funcionamiento de los componentes.
* **Framework:** El proyecto fue inicializado con **Spring Initializr**.

## Estructura del Proyecto

La siguiente es la estructura de directorios principal que sigue el proyecto:
├── application
│   ├── newfolder
│   └── usecase
│       ├── CheckDbHealthService.java
│       └── RegistrarClienteService.java
├── domain
│   ├── model
│   └── port
│       ├── in
│       │   └── CheckDbHealthUseCase.java
│       └── out
│           └── SqlHealthPort.java
├── infrastructure
│   ├── config
│   ├── persistencia
│   └── web
│       ├── ClienteController.java
│       └── HealthController.java
├── resources
│   └── application.yml
└── test
└── java
└── com
└── esfe
└── cleanapp
└── DbConnectionSmokeTest.java
-------------------------------------------------------------------------------------------------------------------------
## Primeros Pasos

Para configurar y ejecutar el proyecto localmente, sigue estos pasos:

1.  **Clona el repositorio:**
    ```bash
    git clone [https://github.com/PBFrank/cleanapp.git](https://github.com/PBFrank/cleanapp.git)
    ```

2.  **Configura la base de datos MySQL:**
    * Crea una base de datos MySQL.
    * Actualiza las credenciales de la base de datos en el archivo `src/main/resources/application.yml`.
    * Como un plus puedes ayudarte con MAIVEN

3.  **Ejecuta el proyecto:**
    * Puedes usar tu IDE (`IntelliJ IDEA`, `Eclipse`, etc.) para ejecutar la clase principal `CleanappApplication.java`.
    * Alternativamente, desde la línea de comandos, navega a la raíz del proyecto y ejecuta:
        ```bash
        mvn spring-boot:run
        ```

## Pruebas Unitarias

El proyecto incluye pruebas unitarias para asegurar la calidad del código.
