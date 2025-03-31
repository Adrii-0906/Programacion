import java.util.Scanner;
public class Boletin1_Ejercicio12 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
        String numeroReves = "";
        System.out.println("Ingrese el numero: ");
        char [] numero = sc.nextLine().toCharArray();
        for (int i = numero.length - 1; i >= 0; i--) {
            numeroReves += numero[i];
        }
        System.out.println(numeroReves);
    }
}
