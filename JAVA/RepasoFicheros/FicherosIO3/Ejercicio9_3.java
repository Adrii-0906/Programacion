package FicherosIO3;

import java.io.File;

public class Ejercicio9_3 {

    // Desarrolla un programa que renombre el archivo datos.txt a informacion.txt, verificando que la operación se haya realizado con éxito.

    public static void main(String[] args) {
        File archivo = new File("FicherosIO3/datos.txt");
        File archivoNuevo = new File("FicherosIO3/informacion.txt");

        archivo.renameTo(archivoNuevo);

    }


}
