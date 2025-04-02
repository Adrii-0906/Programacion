package JavaIO;

import java.io.*;

public class Ejercicio4 {
    public static void main(String[] args) throws FileNotFoundException {
        // Agregar contenido a un archivo
        try {
            BufferedWriter bw = new BufferedWriter((new FileWriter("src/datos.txt")));

            bw.write("Hola patron");
            bw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
