package FicherosIO2;

import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2_2 {

    //  Escribe un programa en Java que lea el archivo datos.txt carácter por carácter y muestre el contenido en la pantalla.

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("FicherosIO2/datos.txt");

            int caracter;

            while ((caracter = fr.read()) != -1) {
                System.out.println((char) caracter);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
