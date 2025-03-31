import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        //Escribe un programa que calcule el total de una factura a partir de la base imponible.
        Scanner a =  new Scanner(System.in);

        double factura;
        double iva = 0.21;

        System.out.println("Ingrese el valor del factura: ");
        factura = a.nextDouble();
        double total = (factura * iva) + factura;

        System.out.println("El valor de la factura es: " + total+"€");
    }
}
