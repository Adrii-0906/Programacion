package FicherosIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio12 {
    // Crea un programa que copie un archivo binario (por ejemplo, una imagen .jpg o un vídeo .mp4) de un directorio a otro sin modificar su contenido.

    public static void main(String[] args) {
        String rutaOrigen = "/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/demon.jpg";
        String rutaDestino = "/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/FicherosIO/demonCopiado.jpg";
        try {
            FileInputStream is = new FileInputStream("FicherosIO/demon.jpg");
            FileOutputStream os = new FileOutputStream("FicherosIO/demonCopia.jpg");


            byte[] buffer = new byte[1024];
            int bytesLeidos;

            while ((bytesLeidos = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesLeidos);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
