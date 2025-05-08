package FicherosIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6 {
    // Crea un programa que copie el contenido de datos.txt en un nuevo archivo llamado copia.txt, manteniendo el mismo formato.

    public static void main(String[] args) {
        try {
            FileReader lector = new FileReader("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/datos.txt");
            FileWriter escritor = new FileWriter("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/datosCopia.txt");

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
