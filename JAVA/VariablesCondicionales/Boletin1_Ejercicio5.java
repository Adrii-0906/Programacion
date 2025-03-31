import java.util.Scanner;

public class Boletin1_Ejercicio5 {
    public static void main(String[] args) {
        //Pedir un número e indicar si es positivo o negativo.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(num+" es negativo");
            if (num == 0){
                System.out.println(num+" es 0");
            }
        } else {
            System.out.println(num+" es positivo");
        }
    }
}
