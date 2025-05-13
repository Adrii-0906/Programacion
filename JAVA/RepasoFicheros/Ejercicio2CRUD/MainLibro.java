package Ejercicio2CRUCD;

import Ejercicio2CRUD.Libro;

import java.util.Scanner;

public class MainLibro {

    public static void main(String[] args) {
        Libro libro = new Libro();
        Scanner sc = new Scanner(System.in);
        libro.cargarJSON();
        int opcion;

        do {
            System.out.println("== CRUD DE LIBROS DE ANIME ==");
            System.out.println("1. Crear libro");
            System.out.println("2. Listar todos los libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Actualizar libro");
            System.out.println("5. Eliminar libro");
            System.out.println("6. Salir y guardar");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    libro.crearLibro();
                    break;
                case 2:
                    libro.listarLibros();
                    break;
                case 3:
                    libro.buscarLibro();
                    break;
                case 4:
                    libro.actualizarLibro();
                    break;
                case 5:
                    libro.eliminarLibro();
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
