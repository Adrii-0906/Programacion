package FicherosIO2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6_2 {

    //  Crea un programa que copie el contenido de datos.txt en un nuevo archivo llamado copia.txt, manteniendo el mismo formato.

    public static void main(String[] args) {
        String archivoViejo = "FicherosIO2/datos.txt";
        String archivoCopia = "FicherosIO2/datosCopia.txt";

        try {
            FileReader lector = new FileReader(archivoViejo);
            FileWriter escritor = new FileWriter(archivoCopia);

            int caracter;

            while ((caracter = lector.read()) != -1) {
                escritor.write(caracter);
            }

            lector.close();
            escritor.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
