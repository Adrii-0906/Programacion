package src.examen;

import java.util.Scanner;

/**
 * Clase principal del gestor de contactos.
 * El alumno debe implementar el menú y la lógica de interacción con la clase Agenda.
 */
public class ProbarAgenda {

    public static void main(String[] args) {

        // TODO: Implementar lógica del menú interactivo
        Contacto contacto1 = new Contacto("Adrian", "1234", "adrian@gmail.com");
        Contacto contacto2 = new Contacto("Pepe", "123", "pepe@gmail.com");
        Agenda agenda = new Agenda();
        agenda.cargarJSON();

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n== GESTOR DE CONTACTOS DE MI AGENDA ==");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Listar todos los contactos");
            System.out.println("5. Guardar y salir");
            System.out.print("Elige una opción: ");

            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    // TODO: Llamar a método para agregar contacto
                    agenda.agregarContacto(contacto1);
                    agenda.agregarContacto(contacto2);
                    break;
                case 2:
                    // TODO: Llamar a método para eliminar contacto
                    agenda.eliminarContacto("Ana");
                    break;
                case 3:
                    // TODO: Llamar a método para buscar contacto
                    agenda.buscarContacto("Ana");
                    break;
                case 4:
                    // TODO: Llamar a método para listar contactos
                    agenda.listarTodosLosContactos();
                    break;
                case 5:
                    // TODO: Guardar en JSON antes de salir
                    agenda.guardarJSON();
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        sc.close();
        System.out.println("¡Hasta pronto!");
    }
}
