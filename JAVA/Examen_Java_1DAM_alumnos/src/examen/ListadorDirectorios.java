package src.examen;

import java.io.File;

/**
 * Clase que lista todos los archivos y carpetas de un directorio dado.
 */
public class ListadorDirectorios {

    /**
     * Lista el contenido del directorio especificado.
     *
     * @param rutaDirectorio Ruta absoluta o relativa del directorio.
     * @return Array de cadenas con el nombre y tipo de cada elemento.
     */
    public static String[] listarContenido(String rutaDirectorio) {
        // TODO: Implementar el listado de archivos y carpetas

        File carpeta = new File(rutaDirectorio);
        File[] archivos = carpeta.listFiles();

        if (carpeta.exists()) {
            for (File f : archivos) {
                if (f.isDirectory()) {
                    System.out.println("Directorio: " + f.getName());
                } else if (f.isFile()) {
                    System.out.println("Archivo: " + f.getName());
                }
            }
        } else {
            System.out.println("La carpeta no existe");
        }

        return new String[0];
    }

    public static void main(String[] args) {
        String ruta = "resources";
        String[] resultado = listarContenido(ruta);
        for (String s : resultado) {
            System.out.println(s);
        }
    }
}
