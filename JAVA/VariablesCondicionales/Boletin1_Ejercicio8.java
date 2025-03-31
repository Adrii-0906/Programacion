import java.util.Scanner;

public class Boletin1_Ejercicio8 {
    public static void main(String[] args) {
        //Pedir dos números y decir cual es el mayor o si son iguales.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = entrada.nextInt();

        if (numero == numero2) {
            System.out.println(numero + " es igual a " + numero2);
        } else if (numero > numero2) {
            System.out.println(numero + " es mayor a " + numero2);
        } else {
            System.out.println(numero2 + " es mayor a " + numero);
        }
    }
}
