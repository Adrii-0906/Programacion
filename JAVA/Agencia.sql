DROP DATABASE IF EXISTS AgenciaViaje;
CREATE DATABASE IF NOT EXISTS AgenciaViaje;
USE AgenciaViaje;

CREATE TABLE hotel (
id BIGINT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(255) NOT NULL,
categoria VARCHAR(255) NOT NULL,
precio DECIMAL(10, 2) NOT NULL,
disponibilidad BOOLEAN NOT NULL
);
CREATE TABLE vuelo (
id BIGINT PRIMARY KEY AUTO_INCREMENT,
compania VARCHAR(255) NOT NULL,
fecha DATE NOT NULL,
precio DECIMAL(10, 2) NOT NULL,
plazas_disponibles INT NOT NULL
);
CREATE TABLE reserva (
id BIGINT PRIMARY KEY AUTO_INCREMENT,
usuario VARCHAR(255) NOT NULL,
dni VARCHAR(20) NOT NULL,
vuelo_asociado BIGINT,
hotel_asociado BIGINT,
FOREIGN KEY (vuelo_asociado) REFERENCES vuelo(id),
FOREIGN KEY (hotel_asociado) REFERENCES hotel(id)
);


-- Insertar hoteles
INSERT INTO hotel (nombre, categoria, precio, disponibilidad) 
VALUES ('Hotel Paraíso', 4, 120.50, TRUE);

INSERT INTO hotel (nombre, categoria, precio, disponibilidad) VALUES
('Hotel Costa Azul', 3, 80.00, TRUE),
('Gran Resort Playa', 5, 200.00, TRUE),
('Hostal La Sierra', 2, 45.50, FALSE);

INSERT INTO vuelo (compania, fecha, precio, plazas_disponibles) VALUES
('SkyFly', '2025-07-15', 180.00, 15),
('JetExpress', '2025-06-20', 220.50, 0),
('AirNova', '2025-08-01', 150.00, 5);


INSERT INTO vuelo (compania, fecha, precio, plazas_disponibles) 
VALUES ('AirSpring', '2025-06-10', 250.00, 10);

select * from hotel;
select * from vuelo;


