package FicherosIO3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio8_3 {

    //  Crea un programa que cuente cuántas líneas tiene el archivo datos.txt y muestre el total.

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("FicherosIO3/datos.txt"));

            String linea;
            int numLine = 0;

            while ((linea = br.readLine()) != null) {
                numLine++;
            }
            System.out.println(numLine);


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
