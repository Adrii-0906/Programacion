package FicherosIO3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3_3 {

    //  Desarrolla un programa en Java que lea el archivo datos.txt línea por línea e imprima cada línea en la consola.

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("FicherosIO3/datos.txt"));

            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
