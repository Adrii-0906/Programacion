package repaso;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EA {

    public void creaCopias(String archivoOriginal, String rutaDestino) {
        File archivoAntiguo = new File(archivoOriginal);
        File archivoNuevo = new File(rutaDestino);

        try {
            FileReader lector = new FileReader(archivoAntiguo);
            FileWriter escritor = new FileWriter(archivoNuevo);

            int caracter;
            while ((caracter = lector.read()) != -1) {
                escritor.write(caracter);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void listarCarpetas() {
        File carpeta = new File("repaso/resources/explorador");
        File[] archivos = carpeta.listFiles();

        if (carpeta.exists() && carpeta.isDirectory()) {
            for (File c : archivos) {
                if (c.isFile()) {
                    System.out.println("Archivo: " + c.getName());
                } else if (c.isDirectory()) {
                    System.out.println("Carperta: " + c.getName());
                }
            }
        } else {
            System.out.println("La carpeta no existe");
        }
    }


    public static void main(String[] args) {
        String archivoOriginal = "repaso/resources/explorador/copia.txt";
        EA app = new EA();

//        for (int i = 1; i <= 10; i++) {
//            String nuevoNombre = "repaso/resources/explorador/copia" + i + ".txt";
//            app.creaCopias(archivoOriginal,nuevoNombre);
//        }

        app.listarCarpetas();

    }
}
