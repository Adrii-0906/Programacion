package FicherosIO3;

import java.io.File;

public class Ejercicio10_3 {

    //  Crea un programa que elimine el archivo informacion.txt y muestre un mensaje confirmando su eliminación.

    public static void main(String[] args) {

        File archivo = new File("FicherosIO3/informacion.txt");

        archivo.delete();
    }
}
