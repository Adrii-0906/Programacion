package Ejercicio5CRUD;

import java.util.Scanner;

public class MainCancion {

    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        cancion.cargarJSON();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("== MENU DE CANCIONES ==");
            System.out.println("1. Crear cancion");
            System.out.println("2. Listar todas las canciones");
            System.out.println("3. Buscar cancion");
            System.out.println("4. Actualizar cancion");
            System.out.println("5. Eliminar cancion");
            System.out.println("6. Salir y guardar");
            System.out.println("Elige una de las opciones: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    cancion.crearCancion();
                    break;
                case 2:
                    cancion.listarTodasLasCanciones();
                    break;
                case 3:
                    cancion.buscarCancion();
                    break;
                case 4:
                    cancion.actualizarCancion();
                    break;
                case 5:
                    cancion.eliminarCancion();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 6);
    }
}
