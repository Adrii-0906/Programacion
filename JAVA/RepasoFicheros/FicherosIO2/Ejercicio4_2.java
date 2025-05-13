package FicherosIO2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio4_2 {

    //  Modifica el archivo datos.txt para agregar nuevas líneas de texto sin borrar el contenido anterior.

    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("FicherosIO2/datos.txt", true));

            bw.newLine();
            bw.write("Tengo 18 anios");

            bw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
