import java.util.Scanner;

public class Boletin2_Ejercicio4 {
    public static void main(String[] args) {
        //Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
        Scanner entrada = new Scanner(System.in);

        int numero;
        int contador = 0;

        for (numero = 1; numero <= 10; numero++) {
            System.out.print("Ingrese un numero: ");
            numero = entrada.nextInt();
            if (numero == 0) {
                break;
            } else if (numero < 0) {
                contador++;
            }
        }
        System.out.println("Se han introducido "+contador+" numeros negativos");
    }
}
