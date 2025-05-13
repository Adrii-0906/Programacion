package FicherosIO2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5_2 {

    //  Crea un programa que cuente el número total de palabras en el archivo datos.txt y muestre el resultado en la consola.

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("FicherosIO2/datos.txt"));

            String linea;
            int contador = 0;

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                if (!linea.isEmpty()) {
                    String[] palabras = linea.trim().split("\\s+");

                    contador += palabras.length;
                }
            }
            System.out.println(contador);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
