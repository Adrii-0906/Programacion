package ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class LectorCSV {
    public static void main(String[] args) {
        // TODO: Leer el archivo "resources/datos.csv" y mostrar su contenido formateado por columnas

        try {

            BufferedReader br = new BufferedReader(new FileReader("resources/datos.csv"));

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] filas = linea.split(",");
                System.out.println(Arrays.toString(filas));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
