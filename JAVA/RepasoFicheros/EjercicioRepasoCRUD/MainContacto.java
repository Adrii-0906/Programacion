package EjercicioRepasoCRUD;

import java.util.Scanner;

public class MainContacto {

    public static void main(String[] args) {
        Contacto contacto = new Contacto();
        Scanner sc = new Scanner(System.in);
        contacto.cargarContactos();
        int opcion;

        do {
            System.out.println("== GESTOR DE CONTACTOS ==");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Listar todos los contactos");
            System.out.println("5. Actualizar contacto");
            System.out.println("6. Salir y guardar");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    contacto.crearContacto();
                    break;
                case 2:
                    contacto.eliminarContacto();
                    break;
                case 3:
                    contacto.buscarContacto();
                    break;
                case 4:
                    contacto.leerContactos();
                    break;
                case 5:
                    contacto.actualizarContactos();
                    break;
                default:
                    System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 6);
    }
}
