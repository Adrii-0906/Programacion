package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEquipo {
    ArrayList<Equipo> equipos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Crear equipo
    public void crearEquipo() {

        System.out.println("Dime la id del equipo: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime le nombre del equipo: ");
        String nombre = sc.nextLine();

        System.out.println("Dime los titulos que tiene el equipo: ");
        int titulos =  sc.nextInt();
        sc.nextLine();

        equipos.add(new Equipo(id, nombre, titulos));
    }

    // Leer
    public void leerEquipos() {
        System.out.println("Lista de equipos");

        for (Equipo equipo : equipos) {
            System.out.println(equipo);
        }
        System.out.println();
    }

    // Actualizar
    public void actulizarEquipo() {
        System.out.println("Dime la id del equipo que desea actulizar");
        int id = sc.nextInt();
        sc.nextLine();
        for (Equipo equipo : equipos) {
            if (equipo.getId() == id) {
                System.out.println("Dime un nombre nuevo para el equipo");
                String nuevoNombre = sc.nextLine();
                equipo.setNombre(nuevoNombre);
                System.out.println("Equipo actulizado");
                return;
            }
        }
        System.out.println("La id no se ha registrado");
    }

    // Eliminar
    public void eliminarEquipo() {
        System.out.println("Dime la id del equipo que desea eliminar");
        int id = sc.nextInt();
        sc.nextLine();
        for (Equipo equipo : equipos) {
            if (equipo.getId() == id) {
                equipos.remove(equipo);
                System.out.println("Equipo eliminado correctamente");
                return;
            }
        }
        System.out.println("La id no se ha registrado");
    }

    // Menu
    public void menu() {

        int opcion;

        do {
            System.out.println("---- MENU CRUD ----");
            System.out.println("1. Crear equipo");
            System.out.println("2. Listar equipos");
            System.out.println("3. Actualizar equipo");
            System.out.println("4. Eliminar equipo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    crearEquipo();
                    break;
                case 2:
                    leerEquipos();
                    break;
                case 3:
                    actulizarEquipo();
                    break;
                case 4:
                    eliminarEquipo();
                    break;
                case 5:
                    System.out.println("Saliendo");
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);
    }

    public static void main(String[] args) {
        MainEquipo app = new MainEquipo();
        app.menu();
    }
}
