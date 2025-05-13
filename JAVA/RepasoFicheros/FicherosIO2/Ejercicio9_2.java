package FicherosIO2;

import java.io.*;

public class Ejercicio9_2 {

    // Desarrolla un programa que renombre el archivo datos.txt a informacion.txt, verificando que la operación se haya realizado con éxito.

    public static void main(String[] args) {

        File archivoViejo = new File("FicherosIO2/datos.txt");
        File archivoRenombrado = new File("FicherosIO2/informacion.txt");

        if (archivoRenombrado.exists()) {
            System.out.println("El archivo ya existe");
        } else {
            archivoViejo.renameTo(archivoRenombrado);
            System.out.println("Archivo renombrado correctamente");
        }
    }
}
