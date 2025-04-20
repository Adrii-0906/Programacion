package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicicio13_B {
    public static void main(String[] args) {
        copiarConTranferTo("src/imagen_copia.jpeg", "src/imagenCopia1.jpeg");
    }
    private static void copiarConTranferTo(String archivoOrigen, String archivoCopia) {
        try {
            // Creamos archivos de entrada y salida
            FileInputStream entrada = new FileInputStream(archivoOrigen);
            FileOutputStream salida = new FileOutputStream(archivoCopia);

            long byteCopiados = entrada.transferTo(salida);
            System.out.println("Archivo copiado correctamente "+ archivoOrigen + " a " + archivoCopia);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
