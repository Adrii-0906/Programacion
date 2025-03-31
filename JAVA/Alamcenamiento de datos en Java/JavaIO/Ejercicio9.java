import java.io.File;

public class Ejercicio9 {
    public static void main(String[] args) {
        try {
            File archivoOriginal = new File("src/info9.txt");
            File archivoNuevo = new File("src/datos9.txt");

            if (archivoOriginal.renameTo(archivoNuevo)) {
                System.out.println("Archivo renombrado correctamente de " + archivoOriginal.getName() + " a " + archivoNuevo.getName());
            } else {
                System.out.println("Archivo no renombrado");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
