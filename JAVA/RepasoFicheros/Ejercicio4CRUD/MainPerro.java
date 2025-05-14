package Ejercicio4CRUD;

import java.util.Scanner;

public class MainPerro {

    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.cargarJSON();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(" == MENU DE PERROS ==");
            System.out.println("1. Crear perros");
            System.out.println("2. Listar todos los perros");
            System.out.println("3. Buscar un perro");
            System.out.println("4. Actualizar perros");
            System.out.println("5. Eliminar perro");
            System.out.println("6. Salir y guardar");
            System.out.println("Dime la opcion que quieres elegir: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    perro.crearPerro();
                    break;
                case 2:
                    perro.listarTodosLosPerros();
                    break;
                case 3:
                    perro.buscarPerro();
                    break;
                case 4:
                    perro.actualizarPerro();
                    break;
                case 5:
                    perro.eliminarPerro();
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
