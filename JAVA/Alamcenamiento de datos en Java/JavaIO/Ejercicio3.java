package JavaIO;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Leer un archivo línea por línea
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/datos.txt"));

            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
