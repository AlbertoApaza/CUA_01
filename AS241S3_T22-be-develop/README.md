## 🚀 API de Gestión de Productos - Spring Boot + SQL Server + Docker + Postman

Este proyecto es una API REST para gestionar productos, desarrollada con Spring Boot y conectada a una base de datos SQL Server que se ejecuta mediante Docker. Se puede probar fácilmente con Postman.

  ## 01 - 🧩 Extensiones recomendadas en Visual Studio Code
  
  Instala las siguientes extensiones:
  
  ✅ Extension Pack for Java
  
  ✅ Database Client (útil para probar conexiones SQL Server desde VS Code)

  ## 02 - ☕ Instalación del JDK 17 en Codespace o Local
  
  ```bash
  sdk install java 17.0.14-jbr
  ```
  Si usas GitHub Codespaces o una terminal nueva, este comando instalará el JDK requerido para ejecutar el proyecto Spring Boot.
  
  ## 03 - 🐳 Iniciar contenedor SQL Server con Docker
  
  Levanta el contenedor con el siguiente comando:

  ```bash
  docker container run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=MyPassword24" -e "MSSQL_PID=Developer" -p 14033:1433 -d mcr.microsoft.com/mssql/server:2019-latest
  ```
  Esto inicia SQL Server en el puerto 14033 con la contraseña MyPassword24.
  
  ## 04 - 📁 Archivos principales del proyecto
  
  - Example.java: clase entidad con atributos dentro de la tabla maestra asignada por cada integrante.
  
  - ExampleRepository.java: interfaz que extiende JpaRepository para acceder a la base de datos.
  
  - ExampleService.java: define métodos como listar, guardar, actualizar, eliminar y restaurar productos.
  
  - ExampleServiceImpl.java: contiene la lógica de negocio, incluyendo cambios de estado (activo/inactivo).
  
  - EjemploRest.java: controlador REST que maneja las solicitudes HTTP.
  
  ## 05 - 🔄 Funciones disponibles en la API
  
  | Método | Ruta                    | Descripción                       |
  | ------ | ----------------------- | --------------------------------- |
  | GET    | `/example`              | Lista todos los datos de la tabla |
  | GET    | `/example/{id}`         | Obtiene un datos por ID           |
  | POST   | `/example/save`         | Crea un nuevo dato                |
  | PUT    | `/example/update`       | Actualiza un dato existente       |
  | DELETE | `/example/delete/{id}`  | Elimina (lógicamente) un dato     |
  | PUT    | `/example/restore/{id}` | Restaura un dato eliminado        |
  
  ## 06 - 📬 Pruebas con Postman
  
  --
  
  ## 07 - ✅ Listo para usar
  
  ✔ Spring Boot conectado a SQL Server
  
  ✔ Contenedor Docker operativo

✔ API funcional

✔ Postman listo para pruebas

✔ Código limpio y bien estructurado
