import java.util.Scanner;

public class Boletin1_Ejercicio3 {
    public static void main(String[] args) {
        //Pedir el radio de una circunferencia y calcular su longitud. L=2*PI*r.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = entrada.nextDouble();

        if (radio < 0) {
            System.out.println("El radio no puede ser negativo");
        } else {
            double area = 2 * Math.PI * radio;
            System.out.println("El area del circunferencia es: " + area);
        }
    }
}
