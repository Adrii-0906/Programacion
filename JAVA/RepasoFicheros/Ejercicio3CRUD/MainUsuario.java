package Ejercicio3CRUD;

import java.util.Scanner;

public class MainUsuario {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.cargarJSON();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("== MENU DE USUARIOS ==");
            System.out.println("1. Crear usuario");
            System.out.println("2. Listar todos los usuarios");
            System.out.println("3. Buscar un usuario");
            System.out.println("4. Actualizar usuario");
            System.out.println("5. Eliminar usuario");
            System.out.println("6. Salir y guardar");
            System.out.println();
            System.out.println("Elige una de las opciones: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    usuario.crearUsuario();
                    break;
                case 2:
                    usuario.listarTodosLosUsuarios();
                    break;
                case 3:
                    usuario.buscarUsuario();
                    break;
                case 4:
                    usuario.actualizarUsuario();
                    break;
                case 5:
                    usuario.eliminarUsuario();
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
