package EjerciciosDeRepaso;

import java.io.*;

public class CopiaArchivos {

    public void copiarArchivos(String rutaOriginal, String rutaDestino) {

        try {
            FileReader lector = new FileReader(rutaOriginal);
            FileWriter escritor = new FileWriter(rutaDestino);

            int caracter;

            while ((caracter = lector.read()) != -1) {
                escritor.write(caracter);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        CopiaArchivos app = new CopiaArchivos();
        String rutaOriginal = "EjerciciosDeRepaso/resources/explorador/copiar.txt";

        for (int i = 1; i <= 10;i++) {
            String rutaDestino = "EjerciciosDeRepaso/resources/explorador/copiar"+i+".txt";
            app.copiarArchivos(rutaOriginal,rutaDestino);
        }
    }
}
