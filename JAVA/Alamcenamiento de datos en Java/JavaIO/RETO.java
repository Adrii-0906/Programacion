/*
    Como convertir system.out en un objeto PrintWritter?
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RETO {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/datos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int totalPalabras = 0;
            while((linea = br.readLine()) != null) {
                String[] palabras = linea.split(" ");

                for (String palabra : palabras) {
                    totalPalabras++;
                }
            }
            br.close();
            System.out.println(totalPalabras);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());;
        }
    }
}
