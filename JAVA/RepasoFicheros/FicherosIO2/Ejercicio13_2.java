package FicherosIO2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio13_2 {

    // Crea un programa que copie un archivo binario (por ejemplo, una imagen .jpg o un vídeo .mp4) de un directorio a otro sin modificar su contenido.

    public static void main(String[] args) {
        try {
            FileInputStream is = new FileInputStream("FicherosIO2/video.mp4");
            FileOutputStream os = new FileOutputStream("FicherosIO2/videoCopiado.mp4");

            byte[] buffer = new byte[4096];
            int byteLeidos;

            while ((byteLeidos = is.read(buffer)) != -1) {
                os.write(buffer, 0, byteLeidos);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
