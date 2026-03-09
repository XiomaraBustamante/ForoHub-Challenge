🚀 ForoHub - Challenge Back End (Alura Latam)
Bienvenido a ForoHub, una API REST desarrollada en Java con Spring Boot para la gestión de tópicos de un foro. Este proyecto forma parte del Challenge de formación en Back End de Alura, donde aplicamos conocimientos de persistencia de datos, seguridad y validaciones de negocio.

🛠️ Tecnologías Utilizadas
Java 21 (JDK 21)

Spring Boot 3.5.x

MySQL 8 (Persistencia de datos)

Spring Data JPA / Hibernate

Flyway (Control de versiones de la base de datos)

Spring Security (Autenticación y Autorización)

JWT (JSON Web Token) (Tokens de acceso seguros)

Lombok (Productividad en el código)

Postman (Pruebas de endpoints)

📋 Funcionalidades del CRUD
La API permite gestionar los tópicos del foro con las siguientes reglas de negocio:

Registrar tópico (POST /topicos): Valida que no existan duplicados (mismo título y mensaje) y que todos los campos sean obligatorios.

Listar tópicos (GET /topicos): Muestra los tópicos paginados y ordenados por fecha de creación.

Detalle de tópico (GET /topicos/{id}): Consulta un tópico específico por su ID.

Eliminar tópico (DELETE /topicos/{id}): Elimina un registro de la base de datos tras verificar su existencia.

🔐 Seguridad y Autenticación
El sistema cuenta con una capa de seguridad robusta:

Stateless: La sesión se maneja sin estado mediante tokens.

Autenticación: Es necesario realizar un login exitoso en /login para obtener un Bearer Token.

Autorización: Todas las rutas del CRUD (excepto /login) están protegidas y requieren el token en el Header de la petición.
