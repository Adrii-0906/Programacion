package FicherosIO2;

import java.io.File;
import java.io.IOException;

public class Ejercicio10_2 {

    // Crea un programa que elimine el archivo informacion.txt y muestre un mensaje confirmando su eliminación.

    public static void main(String[] args) {
        File archivo = new File("FicherosIO2/informacion.txt");

        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Archivo eliminado correctamente");
        } else {
            System.out.println("El archivo no existe");
        }
    }
}
