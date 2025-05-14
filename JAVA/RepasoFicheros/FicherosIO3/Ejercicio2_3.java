package FicherosIO3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2_3 {

    //  Escribe un programa en Java que lea el archivo datos.txt carácter por carácter y muestre el contenido en la pantalla.

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("FicherosIO3/datos.txt");

            int caracater;

            while ((caracater = fr.read()) != -1) {
                System.out.println((char) caracater);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
