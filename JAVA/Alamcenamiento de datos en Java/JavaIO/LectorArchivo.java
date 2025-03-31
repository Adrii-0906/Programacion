/*
Programa que recibe el nombre de un archivo como argumento y muestra su contenido por consola
*/
import java.io.FileWriter;
import java.io.IOException;

public class LectorArchivo {
    public static void main(String[] args) {
        try {
            FileWriter entrada = new FileWriter("src/datos.txt");
            entrada.write("Hola como estas. ");
            entrada.write("Me llamo Adrian");
            entrada.close();
            if (args.length > 0) {
                System.out.println("El argumento es :" + args[0]);
            } else {
                System.out.println("No existe el argumento");
            }
        } catch (IOException e) { e.printStackTrace(); }
    }


}
