package FicherosIO;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    // Escribe un programa en Java que lea el archivo datos.txt carácter por carácter y muestre el contenido en la pantalla.

    public static void main(String[] args) {
         try {
             FileReader fr = new FileReader("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/datos.txt");

             int caracter;

             while ((caracter = fr.read()) != -1) {
                 System.out.println( (char) caracter);
             }

         } catch (IOException e) {
             System.out.println("Error: " + e.getMessage());
         }
    }
}
