package FicherosIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    //  Crea un programa en Java que cree un archivo de texto llamado datos.txt y escriba dentro de él un mensaje de bienvenida.

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("FicherosIO/datos.txt"));

            bw.write("Hola como estas");
            bw.newLine();
            bw.write("Me llamo Adrian");

            bw.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
