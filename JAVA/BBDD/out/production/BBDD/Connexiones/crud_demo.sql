DROP DATABASE IF EXISTS crud_demo;
CREATE DATABASE IF NOT EXISTS crud_demo;

USE crud_demo;

CREATE TABLE IF NOT EXISTS usuarios (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) NOT NULL,
email VARCHAR(100) NOT NULL UNIQUE
);