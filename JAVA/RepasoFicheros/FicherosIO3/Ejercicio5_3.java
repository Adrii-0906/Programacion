package FicherosIO3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5_3 {

    //  Crea un programa que cuente el número total de palabras en el archivo datos.txt y muestre el resultado en la consola.

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("FicherosIO3/datos.txt"));

            int contarPalabras = 0;
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.trim().split("\\s+");

                contarPalabras += palabras.length;
            }
            System.out.println(contarPalabras);

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
