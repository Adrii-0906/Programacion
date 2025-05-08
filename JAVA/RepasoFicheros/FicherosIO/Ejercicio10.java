package FicherosIO;

import java.io.File;

public class Ejercicio10 {
    // Crea un programa que elimine el archivo informacion.txt y muestre un mensaje confirmando su eliminación.

    public static void main(String[] args) {
        File archivo = new File("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/informacion.txt");

        if (archivo.delete()) {
            System.out.println("El archivo se ha eliminado correctamente");
        } else {
            System.out.println("No se ha podido eliminar el archivo " + archivo);
        }
    }
}
