import java.util.Scanner;

public class Boletin1_Ejercicio2 {
    public static void main(String[] args) {
        //Pedir el radio de un círculo y calcular su área. A=PI*r^2.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo: ");
        double radio = entrada.nextDouble();

        if (radio < 0){
            System.out.println("El radio del circulo no es valido");
        } else {
            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("El area del circulo es: " + area);
        }
    }
}
