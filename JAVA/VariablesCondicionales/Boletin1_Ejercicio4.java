import java.util.Scanner;

public class Boletin1_Ejercicio4 {
    public static void main(String[] args) {
        //Pedir dos números y decir si son iguales o no.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " es igual " + num2);
        } else {
            System.out.println(num1 + " no es igual " + num2);
        }
    }
}
