package FicherosIO3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.util.Arrays;

public class Ejercicio12_3 {

    //  Crea un programa que lea un archivo CSV llamado datos.csv y muestre su contenido en formato tabla.

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("FicherosIO3/datos.csv"));

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] filas = linea.split(",");
                System.out.println(Arrays.toString(filas));
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
