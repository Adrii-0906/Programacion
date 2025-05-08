package FicherosIO;

import java.io.File;
import java.io.IOException;

public class Ejercicio9 {

    // Desarrolla un programa que renombre el archivo datos.txt a informacion.txt, verificando que la operación se haya realizado con éxito.
    public static void main(String[] args) {

            File archivoViejo = new File("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/datos.txt");
            File archivoNuevo = new File("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/informacion.txt");

            if (archivoViejo.renameTo(archivoNuevo)) {
                System.out.println("El archivo " + archivoViejo.getName() + " se llama ahora " + archivoNuevo.getName());
            } else {
                System.out.println("El archivo " + archivoViejo.getName() + " no se le ha podido cambiar el nombre");
            }
    }
}
