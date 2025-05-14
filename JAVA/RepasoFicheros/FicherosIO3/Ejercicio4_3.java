package FicherosIO3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio4_3 {

    //  Modifica el archivo datos.txt para agregar nuevas líneas de texto sin borrar el contenido anterior.

    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("FicherosIO3/datos.txt", true));

            bw.newLine();
            bw.write("Programacion la mejor asignatura");

            bw.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
