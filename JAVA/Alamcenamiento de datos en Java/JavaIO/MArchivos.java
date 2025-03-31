package JavaIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Crear N archivo, nombre(1).txt, nombre(2).txt,.... nombre(n).txt en la carpeta que se solicita al usuario. Dentro de cada archivo debe esrcribirse la frase "Este es el fichero nombre(n).txt"

public class MArchivos {
    public static void main(String[] args) {
        String nombreBase;
        String rutasCarpetas;
        int numArchivos;
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario la carpeta donde has creado los archivos
        System.out.println("Ingrese la carpeta donde has creado los archivos: ");
        rutasCarpetas = sc.nextLine();
        System.out.println("---------------------------------------------------------------------");

        // Solicita al usuario el nombre base de los archivos
        System.out.println("Ingrese el nombre base de los archivos: ");
        nombreBase = sc.nextLine();
        System.out.println("---------------------------------------------------------------------");

        // Ingrese el numero de archivos que quieres crear
        System.out.println("Ingrese el numero de archivos a crear: ");
        numArchivos = sc.nextInt();
        System.out.println("---------------------------------------------------------------------");

        // Crea los archivos
        crearArchivosMultiples(rutasCarpetas, nombreBase, numArchivos);
        sc.close();
    }

    public static void crearArchivosMultiples(String rutasCarpeta, String nombreBase, int numArchivos) {
        File carpeta = new File(rutasCarpeta);
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }

        for (int i = 1; i <= numArchivos; i++) {
            String nombreArchivo = nombreBase + "(" + i + ").txt";
            File archivo = new File(carpeta, nombreArchivo);

            try {
                FileWriter escribir = new FileWriter(nombreArchivo);
                escribir.write("Este es el fichero " + numArchivos);
                System.out.println("Archivo creado correctamente " + archivo.getAbsolutePath());
                escribir.close();
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
