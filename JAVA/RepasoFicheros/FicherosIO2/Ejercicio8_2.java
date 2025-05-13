package FicherosIO2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio8_2 {

    //  Crea un programa que cuente cuántas líneas tiene el archivo datos.txt y muestre el total.

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("FicherosIO2/datos.txt"));

            String linea;
            int contatdorLinea = 0;

            while ((linea = br.readLine()) != null) {
                contatdorLinea++;
            }
            System.out.println(contatdorLinea);


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
