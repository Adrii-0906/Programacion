package JavaNIO;

import java.io.IOException;
import java.nio.file.*;

public class Ejercicio6NIO {
    public static void main(String[] args) {
        Path origen = Paths.get("src/datos.txt");
        Path destino = Paths.get("src/ejercicio6NIO.txt");

        try {
            Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("El archivo se ha copiado correctamente");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
