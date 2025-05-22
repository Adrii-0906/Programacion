package FicherosIO;

import java.io.File;
import java.io.IOException;

public class CrearVariasCarpetas {

    public static void main(String[] args) throws IOException {
        String[] rutas = {
                "FicherosIO/Padre/padre.txt",
                "FicherosIO/Madre/madre.txt",
                "FicherosIO/Hijo/hijo.txt"
        };

        for (String r : rutas) {
            new File(r).createNewFile();
        }
    }
}
