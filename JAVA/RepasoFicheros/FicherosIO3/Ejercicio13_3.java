package FicherosIO3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio13_3 {

    // Crea un programa que copie un archivo binario (por ejemplo, una imagen .jpg o un vídeo .mp4) de un directorio a otro sin modificar su contenido.

    public static void main(String[] args) {


         try {
             FileInputStream imagenOriginal = new FileInputStream("FicherosIO3/intell.png");
             FileOutputStream imagenCoppiada = new FileOutputStream("FicherosIO3/intell1.png");

             byte[] buffer = new byte[1024];
             int byteLeidos;

             while ((byteLeidos = imagenOriginal.read(buffer)) != -1) {
                 imagenCoppiada.write(buffer, 0, byteLeidos);
             }


         } catch (IOException e) {
             System.out.println("Error: " + e.getMessage());
         }
    }
}
