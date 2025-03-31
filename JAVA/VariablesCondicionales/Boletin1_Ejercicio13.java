import java.util.Scanner;

public class Boletin1_Ejercicio13 {
    public static void main(String[] args) {
        //Pedir un número entre 0 y 9.999, decir si es capicúa.
        Scanner sc = new Scanner(System.in);

        String numeroReves = "";

        System.out.println("Ingrese el numero: ");
        char [] numero = sc.nextLine().toCharArray();

        for (int i = numero.length - 1; i >= 0; i--) {
            numeroReves += numero[i];
        }
        if (numero == numeroReves.toCharArray()) {
            System.out.println("El numero "+numero+" es capicua");
        } else {
            System.out.println("El numero "+numero+" no es capicua");
        }

    }
}
