import java.io.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/datos.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/copiaDatos.txt"));

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            br.close();
            bw.close();
            System.out.println("Archivo copiado correctamente");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
