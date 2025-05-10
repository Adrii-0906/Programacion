package FicherosIO;

import java.io.File;

public class Ejercicio11 {

    // Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.

    public static void main(String[] args) {

        File carpeta = new File("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/hola");

        File[] archivos = carpeta.listFiles();

        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile()) {
                    System.out.println("Archivo: " + archivo.getName());
                } else if (archivo.isDirectory()) {
                    System.out.println("Carpeta: " + archivo.getName());
                }
            }
        } else {
            System.out.println("La carpeta no existe o no es una carpeta");
        }
    }
}
