package FicherosIO2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1_2 {
    //  Crea un programa en Java que cree un archivo de texto llamado datos.txt y escriba dentro de él un mensaje de bienvenida.

    public static void main(String[] args) {
        try {
            File archivo = new File("FicherosIO2/datos.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));

            bw.write("Hola te damos la bienvenida a este archivo");
            bw.newLine();
            bw.write("Mi nombre es Adrian");

            bw.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
