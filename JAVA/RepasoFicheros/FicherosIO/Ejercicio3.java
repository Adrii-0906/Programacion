package FicherosIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    // Desarrolla un programa en Java que lea el archivo datos.txt línea por línea e imprima cada línea en la consola.

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/datos.txt"));

            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
