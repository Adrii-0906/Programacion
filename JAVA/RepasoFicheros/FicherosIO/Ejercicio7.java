package FicherosIO;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio7 {
    // Escribe un programa que busque una palabra específica dentro del archivo datos.txt e indique cuántas veces aparece.


    public static void main(String[] args) {
        String palabraBuscada = "me";
        boolean encontrada = false;

        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/datos.txt"));
            String linea;
            int numLine = 1;

            while ((linea = br.readLine()) != null) {
                if (linea.contains(palabraBuscada)) {
                    System.out.println("Palabra encontrada en la linea " + numLine + ": " + linea);
                    encontrada = true;
                }
                numLine++;
            }

            br.close();

            if (!encontrada) {
                System.out.println("La palabra no ha sido encontrada");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
