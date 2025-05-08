package FicherosIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {
    // Crea un programa que cuente el número total de palabras en el archivo datos.txt y muestre el resultado en la consola.

    public static void main(String[] args) {
        int countP = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/datos.txt"));

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.trim().split("\\s+");

                if(!linea.trim().isEmpty()) {
                    countP += palabras.length;
                    System.out.println(countP);
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}