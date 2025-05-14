package FicherosIO3;

import java.io.File;
import java.io.IOException;

public class Ejercicio11_3 {

    //  Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.

    public static void main(String[] args) {

        File carpeta = new File("FicherosIO3/Padre");

        File[] archivos = carpeta.listFiles();

        if (carpeta.exists()) {
            for (File f : archivos) {
                if (f.isFile()) {
                    System.out.println("Archivo: " + f.getName());
                } else if (f.isDirectory()) {
                    System.out.println("Carpeta: " + f.getName());
                }
            }
        } else {
            System.out.println("La carpeta no existe");
        }

    }
}
