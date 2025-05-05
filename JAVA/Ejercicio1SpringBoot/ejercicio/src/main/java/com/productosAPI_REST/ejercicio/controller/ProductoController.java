package com.productosAPI_REST.ejercicio.controller;

import com.productosAPI_REST.ejercicio.model.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductoController {

    List<Producto> productos = new ArrayList<>();
    int idCounter = 0;

    public ProductoController() {
        // Anadimos algunos productos de ejemplo
        productos.add(new Producto(idCounter++, "PortatilOscar", 1080.99));
        productos.add(new Producto(idCounter++, "tabletJavi", 8000));
        productos.add(new Producto(idCounter++, "AuricularesMegaTroll", 100));
    }

    @GetMapping("/productos")
    public List<Producto> obtenerProducto() {
        return productos;
    }

    @PostMapping("/productos")
    public Producto crearProducto(@RequestBody Producto producto) {
        producto.setId(idCounter++);
        productos.add(producto);
        return producto;
    }

    @PutMapping("/prodfucto/{id}")
    public Producto actualizarProducto(@RequestBody Producto productoActualizado, @PathVariable int id) {

        for (Producto producto : productos) {
            if (producto.getId() == id) {
                producto.setNombre(productoActualizado.getNombre());
                producto.setPrecio((productoActualizado.getPrecio()));
                return producto;
            }
        }
        return null;
    }

    @DeleteMapping("/producto/{id}")
    public void eliminarProducto(@PathVariable int id) {
        productos.removeIf(producto -> producto.getId() == id);
    }
}