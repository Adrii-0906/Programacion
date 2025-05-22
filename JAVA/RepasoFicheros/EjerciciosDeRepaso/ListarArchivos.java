package EjerciciosDeRepaso;

import java.io.File;

public class ListarArchivos {
    /*
    Crea una clase llamada ExploradorArchivos que realice las siguientes operaciones:

    Listar todos los archivos y carpetas contenidos en la ruta "/resources/explorador/"

    Hacer 10 copias de un archivo, por ejemplo copiar.txt (debes crearlo) y que las copias se encuentren en la carpeta

    Crear una estructura de subdirectorios dentro de "/resources/explorador/" que tenga la siguiente forma:
        "/resources/explorador/volcan/descenso/aprobar/programacion/ y dentro de ella debe contener un archivo llamado "centroTierra.txt"

     */

    public void listarArchivos() {
        File carpeta = new File("EjerciciosDeRepaso/resources/explorador");

        File[] archivos = carpeta.listFiles();

        if (carpeta.exists()) {
            for (File f : archivos) {
                if (f.isFile()) {
                    System.out.println("Archivo: " + f.getName());
                } else if (f.isDirectory()) {
                    System.out.println("Carpeta: " + f.getName());
                }
            }
        } else {
            System.out.println("La carpeta no existe");
        }
    }

    public static void main(String[] args) {
        ListarArchivos app = new ListarArchivos();

        app.listarArchivos();
    }
}
