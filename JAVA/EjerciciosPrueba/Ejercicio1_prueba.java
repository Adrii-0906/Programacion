import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1_prueba {
    public static void main(String[] args) {
        //Realiza un programa que pinte una tableta de turron con un bocado realizado de forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se da alrederor del turron, obviamente no se pude dar un bocado en medio de la tableta.
        Scanner entrada = new Scanner(System.in);

        int fila;
        int columna;
        int mordisco = 3;
        int posicionMordisco = (int)(Math.random()*mordisco);
        String asterisco = "* ";
        int tamanoMordisco = 1;
        int posicion = 0;

        System.out.println("Ingrese el numero de filas: ");
        fila = entrada.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        columna = entrada.nextInt();


        for (int i = 0; i < columna ; i++) {
            for (int j = 0; j <= fila; j++) {
                boolean estaEnBorde = (i==0) || (i==columna-1) || (j==0) ||(j==fila-1);
                if ((posicion >= posicionMordisco) && (posicion < posicionMordisco+tamanoMordisco) && (estaEnBorde)) {
                    
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
