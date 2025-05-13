package FicherosIO2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio7_2 {

    //  Escribe un programa que busque una palabra específica dentro del archivo datos.txt e indique cuántas veces aparece.

    public static void main(String[] args) {
        try {
            String palabra = "18";
            FileReader fr = new FileReader("FicherosIO2/datos.txt");
            BufferedReader br = new BufferedReader(fr);

            String linea;
            int numLine = 1;

            while ((linea = br.readLine()) != null) {
                if (linea.contains(palabra)) {
                    System.out.println(palabra);
                    System.out.println("Palabra econtrada en la linea " + numLine);
                }
                numLine++;
            }
            fr.close();
            br.close();

        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
