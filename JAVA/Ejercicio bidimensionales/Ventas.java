/*
 *
 * Desarrolla un programa que gestione una tabla de ventas de productos en dos días consecutivos. El programa debe:
 *  - Crear un array bidimensional que almacene las ventas de 3 productos durante 2 días.
 *  - Solicitar al usuario que introduzca las ventas (int) para cada producto y día.
 *  - Mostrar la tabla completa de ventas.
 *  - Calcular y mostrar el total de ventas por producto.
 *  - Determinar qué producto tuvo el mayor total de ventas
 *
 */


import java.util.Scanner;

public class Ventas {
    private static void main(String[] args) {

        int[][] ventas1 = new int[3][2];
        int[][] ventas = {
                {1,2},
                {3,4},
                {5,6}

        };

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print("Ingrese ventas para productos: "+ (i+1) + " del dia " + (j+1) + ": ");
                ventas1[i][j] = sc.nextInt();
            }
        }
        mostrarVentas(ventas);
    }

    private static void mostrarVentas(int[][] ventas) {
        System.out.println("Tabla de ventas: ");
        System.out.println("Lunes  Martes");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Producto " + (i+1) + ": ");
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println(ventas[i][j] + "     ");
            }
            System.out.println();
        }
    }
}
