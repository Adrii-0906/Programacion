package FicherosIO3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio7_3 {

    //  Escribe un programa que busque una palabra específica dentro del archivo datos.txt e indique cuántas veces aparece.

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("FicherosIO3/datos.txt"));

            String palarbraBuscada = "nombre";
            String linea;
            int numLine = 0;

            while ((linea = br.readLine()) != null) {
                if (linea.contains(palarbraBuscada)) {
                    System.out.println(palarbraBuscada);
                    numLine++;
                }
            }
            System.out.println(numLine);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
