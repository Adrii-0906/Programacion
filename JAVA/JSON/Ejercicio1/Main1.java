package Ejercicio1;

/*
    Crear un producto con nombre y precio. Guardado en un JSON y volver a leerlo

    Pasos:
    1. Crear la clase producto /
    2. Crear el objeto Producto en un programa Main /
    3. Guardar el objeto o los objetos en un JSON
    4. Leer el archivo
    5. Mostrar los datos en consola
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) throws IOException {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("CocaCola", 1.3));
        productos.add(new Producto("Nestie", 1.5));

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        // Escribimos en el JSON
        mapper.writeValue(new File("/home/adrian/Documentos/1DAM/Programación/JAVA/JSON/Ejercicio1/productoJSON.json"), productos);
        System.out.println("Archivo creado correctamente");

        // Leer el JSON
        List<Producto> productosLeidos = mapper.readValue(new File("/home/adrian/Documentos/1DAM/Programación/JAVA/JSON/Ejercicio1/productoJSON.json"),
                mapper.getTypeFactory().constructCollectionType(List.class, Producto.class));

        for (Producto p: productosLeidos) {
            System.out.println(p);
        }
    }
}
