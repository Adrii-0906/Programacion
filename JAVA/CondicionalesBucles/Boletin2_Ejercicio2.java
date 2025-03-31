import java.util.Scanner;

public class Boletin2_Ejercicio2 {
    public static void main(String[] args) {
        //Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
        Scanner entrada = new Scanner(System.in);

        int numero;
        for (numero = 1; numero > 0; numero++) {
            System.out.println("Dime un numero");
            numero = entrada.nextInt();
            if (numero == 0) {
                break;
            }
        }
    }
}
