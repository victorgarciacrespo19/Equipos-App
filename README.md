# Proyecto Equipos App

Este proyecto es una aplicación basada en una arquitectura de **microservicios**, desarrollada principalmente con **Java** y **Quarkus**. El sistema permite la gestión integral de equipos deportivos, jugadores y sus respectivos contratos.

## 🚀 Tecnologías Principales

*   **Backend:** Java 21, Quarkus, Maven.
*   **Base de Datos Relacional:** PostgreSQL 18.
*   **Caché:** Redis.
*   **Migraciones de BD:** Flyway.
*   **Contenerización y Orquestación:** Docker, Docker Compose.
*   **Servidor Web / Proxy Inverso:** Nginx.

## 🏗️ Arquitectura de Microservicios

El sistema está dividido en varios módulos y servicios independientes de acuerdo a su dominio de negocio:

*   **`ws-equipos`**: Microservicio encargado de la gestión de equipos deportivos (Teams).
*   **`ws-jugadores`**: Microservicio encargado de la gestión de los jugadores (Players).
*   **`ws-contratos`**: Microservicio que administra los contratos que vinculan a jugadores con equipos.
*   **`aggregator`**: Servicio agregador (BFF / API Gateway) que unifica las llamadas a los distintos microservicios subyacentes.
*   **`domain`** y **`shared-quarkus`**: Librerías y módulos compartidos de dominio y configuración común para los microservicios.

## 🛠️ Cómo ejecutar el proyecto en local

El proyecto está completamente preparado para entornos locales usando contenedores, lo que facilita su despliegue sin configuraciones adicionales previas.

1.  Asegúrate de tener instalado **Docker** y **Docker Compose**.
2.  Sitúate en la carpeta `app/equipos-app` donde se encuentra el fichero `docker-compose.yml`.
3.  Ejecuta el siguiente comando para levantar toda la infraestructura:

    ```bash
    docker compose up 
    ```

Tras ejecutar este comando, se iniciarán las bases de datos (PostgreSQL, Redis), se ejecutarán las migraciones con Flyway y se levantarán todos los microservicios junto con Nginx en el puerto `80`.

👨‍💻 Autor

Víctor García Crespo
