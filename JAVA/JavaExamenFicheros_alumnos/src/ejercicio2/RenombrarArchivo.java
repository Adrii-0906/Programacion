package ejercicio2;

import java.io.File;

public class RenombrarArchivo {
    public static void main(String[] args) {
        // TODO: Renombrar el archivo "resources/info9.txt" a "resources/datos9.txt" si existe

        File archivoViejo = new File("resources/info9.txt");
        File archivoNuevo = new File("resources/datos9.txt");

        if (archivoNuevo.exists()) {
            System.out.println("El archivo ya existe");
        } else {
            archivoViejo.renameTo(archivoNuevo);
            System.out.println("Nombre cambiado correctamente");
        }
    }
}
