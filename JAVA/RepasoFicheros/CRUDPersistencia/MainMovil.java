package CRUDPersistencia;

import java.util.Scanner;

public class MainMovil {

    public static void main(String[] args) {
        Movil movil = new Movil();
        int opcion;
        movil.cargarMoviles();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("---- MENU CRUD (con JSON) ----");
            System.out.println("1. Crear moviles");
            System.out.println("2. Listar moviles");
            System.out.println("3. Actualizar moviles");
            System.out.println("4. Eliminar moviles");
            System.out.println("5. Salir y guardar");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    movil.crearMovil();
                    break;
                case 2:
                    movil.leerMovil();
                    break;
                case 3:
                    movil.actualizarMovil();
                    break;
                case 4:
                    movil.eliminarMovil();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (5 != opcion);
    }
}
