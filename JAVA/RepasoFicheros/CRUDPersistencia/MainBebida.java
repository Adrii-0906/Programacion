package CRUDPersistencia;

import java.util.Scanner;

public class MainBebida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bebida b = new Bebida();
        b.cargarBebidas();
        int opcion;

        do {
            System.out.println("---- MENU CRUD (con JSON) ----");
            System.out.println("1. Crear bebidas");
            System.out.println("2. Listar bebidas");
            System.out.println("3. Actualizar bebida");
            System.out.println("4. Eliminar bebida");
            System.out.println("5. Salir y guardar");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    b.crearBebida();
                    break;
                case 2:
                    b.leerBebida();
                    break;
                case 3:
                    b.actualizarBebida();
                    break;
                case 4:
                    b.eliminarBebida();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.\n");
            }
        } while (opcion != 5);
    }
}
