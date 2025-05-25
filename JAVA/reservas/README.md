# Agencia de Reservas de Vuelos y Hoteles ✈️🏨

Este proyecto es una aplicación RESTful desarrollada con **Spring Boot** que permite gestionar reservas de vuelos y hoteles. Los usuarios pueden consultar disponibilidad y crear nuevas reservas, siempre que haya plazas disponibles.

---

## 🚀 Tecnologías utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Postman**
- **Maven**

---

## 📦 Estructura del proyecto

```
com.agencia.reservas
│
├── controller/      → Controladores REST para manejar peticiones
├── model/           → Clases de entidad: Hotel, Vuelo, Reserva
├── repository/      → Interfaces que extienden JpaRepository
├── service/         → Lógica de negocio (ej. control de plazas disponibles)
└── application.properties → Configuración de base de datos
```

---

## 🔧 Configuración de base de datos

En `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/Agencia
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASEÑA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> ⚠️ Asegúrate de que la base de datos `Agencia` esté creada en MySQL antes de ejecutar el proyecto.

---

## 🗃️ Esquema de Base de Datos

```sql
CREATE TABLE vuelo (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  destino VARCHAR(255),
  plazas_disponibles INT
);

CREATE TABLE hotel (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(255),
  plazas_disponibles INT
);

CREATE TABLE reserva (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  usuario VARCHAR(255),
  dni VARCHAR(20),
  vuelo_asociado BIGINT,
  hotel_asociado BIGINT,
  FOREIGN KEY (vuelo_asociado) REFERENCES vuelo(id),
  FOREIGN KEY (hotel_asociado) REFERENCES hotel(id)
);
```

---

## 📲 Endpoints disponibles

### 🔹 Hoteles

- `GET /hoteles` → Lista todos los hoteles.
- `POST /hoteles` → Crea un nuevo hotel.  
  **Body ejemplo:**
  ```json
  {
    "nombre": "Hotel Playa",
    "plazasDisponibles": 10
  }
  ```

### 🔹 Vuelos

- `GET /vuelos` → Lista todos los vuelos.
- `POST /vuelos` → Crea un nuevo vuelo.  
  **Body ejemplo:**
  ```json
  {
    "destino": "Madrid",
    "plazasDisponibles": 20
  }
  ```

### 🔹 Reservas

- `GET /reservas` → Muestra todas las reservas.
- `POST /reservas` → Crea una reserva si hay plazas disponibles en el vuelo y hotel.  
  **Body ejemplo:**
  ```json
  {
    "usuario": "Ana Pérez",
    "dni": "12345678X",
    "vuelo": { "id": 1 },
    "hotel": { "id": 2 }
  }
  ```

---

## ✅ Lógica de negocio

- Al crear una reserva:
    - Se valida que haya plazas disponibles en el hotel y vuelo seleccionados.
    - Si hay plazas, se resta 1 plaza a cada uno.
    - Si no hay plazas, se lanza un error y **no se guarda la reserva**.

---

## 📮 Pruebas con Postman

1. Iniciar el servidor Spring Boot.
2. Probar endpoints con `GET` y `POST` desde Postman usando los JSON de ejemplo.
3. Verificar en tu base de datos que los cambios se reflejen correctamente.

