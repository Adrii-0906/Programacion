package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio13 {
    public static void main(String[] args) {
        copiarArchivoBinario("src/imagenOriginal.jpeg","src/imagen_copia.jpeg");
    }
    private static void copiarArchivoBinario(String archivoOrigen, String archivoCopia) {
        try {
            // Creamos archivos de entrada y salida
            FileInputStream entrada = new FileInputStream(archivoOrigen);
            FileOutputStream salida = new FileOutputStream(archivoCopia);

            // Buffer para leer
            byte[] buffer = new byte[4896];
            int bytesLeidos;
            while ((bytesLeidos = entrada.read(buffer)) != -1) {
                salida.write(buffer, 0, bytesLeidos);
            }
            entrada.close();
            salida.close();
            System.out.println("Archivo copiado correctamente "+ archivoOrigen + " a " + archivoCopia);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
