package com.productosAPI_REST.ejercicio.repository;

import com.productosAPI_REST.ejercicio.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
