package src.examen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Clase que copia un archivo binario (imagen, vídeo, etc.) desde una ruta origen a una ruta destino.
 */
public class CopiaBinaria {

    /**
     * Copia un archivo binario de origen a destino usando FileInputStream y FileOutputStream.
     *
     * @param origen Ruta del archivo de origen.
     * @param destino Ruta del archivo de destino.
     * @return true si la copia fue exitosa, false en caso de error.
     */
    public static boolean copiar(String origen, String destino) {
        try (FileInputStream fis = new FileInputStream(origen);
             FileOutputStream fos = new FileOutputStream(destino)) {
            byte[] buffer = new byte[1024];
            int longitud;
            while ((longitud = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, longitud);
            }
            return true;
        } catch (IOException e) {
            System.err.println("Error copiando archivo: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        String origen = "resources/imagen_original.png";
        String destino = "resources/imagen_copia.png";
        boolean exito = copiar(origen, destino);
        System.out.println(exito ? "Copia realizada con éxito." : "Error al copiar.");
    }
}
