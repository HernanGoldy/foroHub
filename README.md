# Challenge Foro Hub

Este proyecto fué realizado para el Challenge del curso de Java y Spring Boot de [Alura Latam](https://www.aluracursos.com/) y [ONE](https://www.oracle.com/ar/education/oracle-next-education/).

### Tecnologías Utilizadas

- Java 17
- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)
- JPA (Java Persistence API)
- Hibernate
- MySQL
- Lombok
- Flyway
- Swagger

### Características

- Registro y autenticación de usuarios.
- Creación y gestión de tópicos.
- Autenticación segura con JWT.
- Endpoints protegidos.
- Documentación API con Swagger.

### Despliegue

Sigue estos pasos para ejecutar el proyecto en tu equipo, recuerda tener instalado el JDK.

1. Clona el repositorio en tu equipo.
2. Importa el proyecto a IntelliJ u otro IDE que soporte Java.
3. Crea la base de datos "forohub" en MySQL.
4. Configura las variables de entorno para la BD en application.properties.
5. Ejecuta el proyecto.
6. Has las pruebas según los endpoints detallados más abajo.

### Endpoints

- `POST /users`: Registrar un nuevo usuario.
- `POST /login`: Iniciar sesión y obtener un token JWT.
- `POST /topics`: Crear un nuevo tópico.
- `GET /topics`: Listar todos los tópicos.
- `DELETE /topics/{id}`: Eliminar un tópico por ID.

---
### Autor

* **Hernán Darío Duarte** - [HernanGoldy](https://github.com/HernanGoldy)