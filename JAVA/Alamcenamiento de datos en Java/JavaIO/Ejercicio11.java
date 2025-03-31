import java.io.File;

public class Ejercicio11 {
    public static void main(String[] args) {
        File carpeta = new File("src");

        if (carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles();

            for (File f : archivos) {
                if (f.isFile()) {
                    System.out.println(f.getName() + " - " + f.length() + " bytes");
                }
            }
        } else {
            System.out.println("Error no se a proporcinado bien la ruta");
        }
    }
}
