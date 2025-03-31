import java.util.Scanner;

public class Boletin2_Ejercicio1 {
    public static void main(String[] args) {
        //Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
        Scanner entrada = new Scanner(System.in);

        int num;

        do {
            System.out.println("Ingrese un numero: ");
            num = entrada.nextInt();
            int cuadrado = num*num;
            System.out.println(cuadrado);
        }while (num > 0);
    }
}
