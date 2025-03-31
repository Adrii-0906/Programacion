import java.util.Random;
import java.util.Scanner;

public class Boletin2_Ejercicio5 {
    public static void main(String[] args) {
        //Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta.
        Scanner entrada = new Scanner(System.in);

        int N = (int) (Math.random() * 100);
        int numero;
        for (numero = 1; numero > 0; numero++) {
            System.out.println("Dime un numero");
            numero = entrada.nextInt();
            if (numero == N) {
                System.out.println("El numero es correcto");
                break;
            } else if (numero > N) {
                System.out.println("El numero es mayor que el numero aleatorio");
            } else if (numero < N) {
                System.out.println("El numero es menor que el numero aleatorio");
            }
        }

    }
}
