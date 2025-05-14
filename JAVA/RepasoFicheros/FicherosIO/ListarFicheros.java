package FicherosIO;


import java.io.File;

public class ListarFicheros {

    public static void main(String[] args) {

        File carpeta = new File("FicherosIO/hola");
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
            System.out.println("Carpeta no encontrada");
        }

    }
}
