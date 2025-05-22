package FicherosIO;

import java.io.File;
import java.io.IOException;

public class ListarArchivos {

    public static void main(String[] args) {

        File carpeta = new File("FicherosIO");

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
