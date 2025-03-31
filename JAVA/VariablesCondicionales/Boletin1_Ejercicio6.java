import java.util.Scanner;

public class Boletin1_Ejercicio6 {
    public static void main(String[] args) {
        //Pedir dos números y decir si uno es múltiplo del otro.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();

        if (num % num2 == 0) {
            System.out.println(num+" es multiplo de "+num2);
        } else {
            System.out.println(num+" no es multiplo de "+num2);
        }
    }
}
