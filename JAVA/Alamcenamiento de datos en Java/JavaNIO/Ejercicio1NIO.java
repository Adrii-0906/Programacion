package JavaNIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejercicio1NIO {
    public static void main(String[] args) {
        Path path = Paths.get("src/ejercicio1NIO.txt"); // Aqui es donde vamos a definir la ruta del archivo

        List<String> contenido = List.of("Trababajando con el paquete java.NIO. Ficheros grandes...");

        try {
            Files.write(path, contenido, StandardCharsets.UTF_8);
            System.out.println("Se ha escrito y creado el archivo perfectamente");
            System.out.println("Nombre del archivo: " + path.getFileName());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
