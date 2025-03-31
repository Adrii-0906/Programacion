package JavaIO;

import java.io.*;

public class Ejercicio1 {
    // Crea un programa en Java que cree un archivo de texto llamado `datos.txt` y escriba dentro de él un mensaje de bienvenida.

    public static void main(String[] args) {
        try {
            BufferedReader entrada = new BufferedReader(new FileReader("src/entrada.txt"));
            BufferedWriter salida = new BufferedWriter(new FileWriter("src/salida.txt"));
            String linea;
            int contador = 0;
            while ((linea = entrada.readLine()) != null) {
                salida.write(linea.toUpperCase());
                contador++;
            }
            salida.close();
            System.out.println("Las lineas que tiene el fichero son: " + contador);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
