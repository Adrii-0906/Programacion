package JavaNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ejercicio7NIO {
    public static void main(String[] args) {
        Path path = Paths.get("src/datos.txt");
        String palabraBuscada = "tiene";
        try {
            Stream<String> stream = Files.lines(path);
            Files.readAllLines(path);
            long cuenta = stream.filter(line -> line.contains(palabraBuscada)).count();
            System.out.println("La palabra buscada es: " + palabraBuscada + " y aparece: " + cuenta + " veces.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
