import java.util.Scanner;
import Prueba.par;
public class numParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();
        System.out.println("Ingrese otro numero: ");

        if (par.esPar(num)) {
            System.out.println(num + " es par");
        } else {
            System.out.println(num + " es impar");
        }
    }
}
