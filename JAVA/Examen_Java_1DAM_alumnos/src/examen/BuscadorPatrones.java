package src.examen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que busca un patrón en un archivo de texto usando expresiones regulares.
 */
public class BuscadorPatrones {

    /**
     * Cuenta cuántas veces aparece un patrón en el archivo indicado.
     *
     * @param rutaArchivo Ruta del archivo de texto.
     * @param palabra Palabra regular a buscar.
     * @return Número de coincidencias encontradas.
     */
    public static int contarCoincidencias(String rutaArchivo, String palabra) {

        // TODO: Implementar lectura del archivo y búsqueda del patrón
        int contadorPalabra = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));


            String linea;

            while ((linea = br.readLine()) != null) {
                linea.contains(palabra);
                contadorPalabra++;
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return contadorPalabra;
    }

    public static void main(String[] args) {
        String ruta = "resources/datos.txt";
        String patron = "examen"; // buscar la palabra exacta "examen"
        int resultado = contarCoincidencias(ruta, patron);
        System.out.println("Coincidencias encontradas: " + resultado);
    }
}
