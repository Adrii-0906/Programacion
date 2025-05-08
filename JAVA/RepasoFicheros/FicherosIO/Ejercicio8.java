package FicherosIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio8 {
    //  Crea un programa que cuente cuántas líneas tiene el archivo datos.txt y muestre el total.

    public static void main(String[] args) {

        int countLine = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/datos.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                countLine++;
            }
            System.out.println("En el archivo datos.txt hay " + countLine + " lineas.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
