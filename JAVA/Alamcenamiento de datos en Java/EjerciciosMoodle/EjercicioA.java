package EjerciciosMoodle;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class EjercicioA {
    // EjercicioA. Crear y mover carpetas
    /*
     Implementa un programa que cree, dentro de ‘Documentos’, dos nuevas carpetas: ‘Mis Cosas’ y ‘Alfabeto’. Mueve las carpetas ‘Fotografias’ y ‘Libros’ dentro de ‘Mis Cosas’. Luego crea dentro de ‘Alfabeto’ una
     carpeta por cada letra del alfabeto (en mayúsculas): ‘A’, ‘B’, ‘C’... ‘Z’. Te serán de ayuda los códigos numéricos ASCII: https://elcodigoascii.com.ar
     */

    public static void main(String[] args) {
        File carpeta1 = new File("Documentos/Mis_Cosas");
        File carpeta2 = new File("Documentos/Alfabeto");

        if (carpeta1.mkdir() && carpeta2.mkdir()) {
            System.out.println("Carpetas creadas");
        } else {
            System.out.println("Las capertas ya existen");
        }

        Path origen = Paths.get("Documentos/Fotografias");
        Path origen1 = Paths.get("Documentos/Libros");
        Path destino = Paths.get("Documentos/Mis_Cosas");

        try {
            Files.move(origen, destino);
            System.out.println("La carpeta Fotografias se ha movido perfectamente");

            Files.move(origen1, destino);
            System.out.println("La carpeta Fotografias se ha movido perfectamente");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
