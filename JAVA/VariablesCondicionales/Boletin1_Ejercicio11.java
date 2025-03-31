import java.util.Scanner;

public class Boletin1_Ejercicio11 {
    public static void main(String[] args) {
        //Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
        Scanner entrada =new Scanner(System.in);

        System.out.println("Ingrese un numero entre (0-9999): ");
        int num=entrada.nextInt();

        if (num < 10) {
            System.out.println(num+" tiene 1 cifra");
        } else if (num < 100) {
            System.out.println(num+" tiene 2 cifras");
        } else if (num < 1000) {
            System.out.println(num+" tiene 3 cifras");
        } else if (num < 10000) {
            System.out.println(num+" tiene 4 cifras");
        } else {
            System.out.println(num+" no es valido");
        }
    }
}
