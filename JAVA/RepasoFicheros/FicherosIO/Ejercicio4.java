package FicherosIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio4 {
    // Modifica el archivo datos.txt para agregar nuevas líneas de texto sin borrar el contenido anterior.

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/datos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.newLine();
            bw.write("Mi amigo se llama Pepito");

            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
