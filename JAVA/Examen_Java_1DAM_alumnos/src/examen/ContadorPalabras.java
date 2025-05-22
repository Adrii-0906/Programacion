package src.examen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase que cuenta el número total de palabras en un archivo de texto.
 * El alumno debe implementar el metodo contarPalabras(String rutaArchivo).
 */
public class ContadorPalabras {

    /**
     * Cuenta las palabras en el archivo indicado por la ruta.
     *
     * @param rutaArchivo Ruta del archivo de texto.
     * @return Número total de palabras encontradas.
     */
    public static int contarPalabras(String rutaArchivo) {
        // TODO: Implementar lectura del archivo línea a línea y conteo de palabras
        int contarPalabras = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));

            String linea;
            contarPalabras = 0;

            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");

                contarPalabras += palabras.length;
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return contarPalabras;
    }

    public static void main(String[] args) {
        // Ejemplo de ejecución
        String ruta = "resources/datos.txt"; // Asegúrate de que el archivo exista
        int total = contarPalabras(ruta);
        System.out.println("Total de palabras: " + total);
    }
}
