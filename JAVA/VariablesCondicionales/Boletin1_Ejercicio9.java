import java.util.Scanner;

public class Boletin1_Ejercicio9 {
    public static void main(String[] args) {
        //Pedir dos números y mostrarlos ordenados de mayor a menor.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println(num1+" "+num2);
        } else {
            System.out.println(num2+" "+num1);
        }
    }
}
