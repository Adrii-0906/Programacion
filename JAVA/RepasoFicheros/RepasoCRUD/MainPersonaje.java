package RepasoCRUD;

import java.util.Scanner;

public class MainPersonaje {

    public static void main(String[] args) {
        Personaje personaje = new Personaje();
        Scanner sc = new Scanner(System.in);
        personaje.cargarJSON();
        int opcion;

        do {
            System.out.println("== CRUD DE PERSONAJES DE ANIME ==");
            System.out.println("1. Crear personaje");
            System.out.println("2. Listar todos los personajes");
            System.out.println("3. Buscar personajes");
            System.out.println("4. Actualizar personaje");
            System.out.println("5. Eliminar personaje");
            System.out.println("6. Salir y guardar");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    personaje.crearPersonaje();
                    break;
                case 2:
                    personaje.listarTodosPersonajes();
                    break;
                case 3:
                    personaje.buscarPersonaje();
                    break;
                case 4:
                    personaje.actualizarPersonaje();
                    break;
                case 5:
                    personaje.eliminarPersonaje();
                    break;
                case 6:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 6);
    }
}
