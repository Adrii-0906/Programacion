import java.util.Scanner;

public class Boletin2_Ejercicio3 {
    public static void main(String[] args) {
        //Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
        Scanner entrada = new Scanner(System.in);

        int numero;
        for (numero = 1; numero > 0; numero++) {
            System.out.println("Dime un numero");
            numero = entrada.nextInt();
            if (numero == 0) {
                break;
            } else if (numero % 2 != 0) {
                System.out.println(numero+" es impar");
            } else if (numero % 2 == 0) {
                System.out.println(numero+" es par");
            }
        }
    }
}
