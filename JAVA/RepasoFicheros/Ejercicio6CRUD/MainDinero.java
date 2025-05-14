package Ejercicio6CRUD;

import java.util.Scanner;

public class MainDinero {

    public static void main(String[] args) {
        Dinero dinero = new Dinero();
        dinero.cargarJSON();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("== GESTION DE DINERO ==");
            System.out.println("1. Crear dinero");
            System.out.println("2. Listar todo el dinero");
            System.out.println("3. Buscar dinero");
            System.out.println("4. Actualizar dinero");
            System.out.println("5. Eliminar dinero");
            System.out.println("6. Salir y guardar");
            System.out.println("Elige una de las opciones: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    dinero.crearDinero();
                    break;
                case 2:
                    dinero.listarTodoElDinero();
                    break;
                case 3:
                    dinero.buscarDinero();
                    break;
                case 4:
                    dinero.actualizarDinero();
                    break;
                case 5:
                    dinero.eliminarDinero();
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
