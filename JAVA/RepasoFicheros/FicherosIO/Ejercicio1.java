package FicherosIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    //  Crea un programa en Java que cree un archivo de texto llamado datos.txt y escriba dentro de él un mensaje de bienvenida.

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/datos.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hola te damos la bienvenida a mi primer archivo");
            bw.newLine();
            bw.write("Me llamo Adrian y tengo 18 años");

            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error: " +e.getMessage());
        }
    }
}
