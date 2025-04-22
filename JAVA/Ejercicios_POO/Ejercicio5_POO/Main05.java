package Ejercicio5_POO;

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) throws ParkingException {
        Scanner entrada = new Scanner(System.in);


        Parking parking1 = new Parking("Centro", 10);
        int opcion;

        do {

            System.out.println("----------MENU----------");
            System.out.println("1. Entrada del coche.");
            System.out.println("2. Salida de coche.");
            System.out.println("3. Mostrar parking");
            System.out.println("4. Salir del parking");
            System.out.println();
            System.out.println("Selecciona una opcion:");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                entrada.nextLine();
                System.out.println("Introduce la matricula del coche: ");
                String matricula = entrada.nextLine();
                System.out.println("Introduce la plaza del parking: ");
                int plazita = entrada.nextInt();
                System.out.println(parking1.entrada(matricula, plazita));
            } else if (opcion == 2) {
                entrada.nextLine();
                System.out.println("Introduce la matricula del coche: ");
                String matricula = entrada.nextLine();
                System.out.println(parking1.salida(matricula));
                System.out.println(parking1.getPlazasTotales());
                System.out.println(parking1.getPlazasLibres());
                System.out.println(parking1.getPlazasOcupadas());
            } else if (opcion == 3) {
                System.out.println(parking1);
            } else {
                System.out.println("Dato incorreto");
            }
        } while (opcion != 4);
        System.out.println("Saliendo del programa");
    }
}
