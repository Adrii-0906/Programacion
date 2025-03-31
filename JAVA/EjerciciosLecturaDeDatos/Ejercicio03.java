import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        //Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir debe ser introducida por teclado.
        Scanner a =  new Scanner(System.in);

        System.out.println("Ingrese la cantidad en pesetas: ");
        double pesetas = a.nextDouble();

        double euros = 0.00601;

        double conversion = pesetas * euros;

        System.out.println(pesetas+" en euros son: "+conversion);
    }
}
