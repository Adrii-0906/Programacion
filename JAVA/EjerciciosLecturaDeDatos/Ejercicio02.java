import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser introducida por teclado.
        //Implementamos el Scanner para leer los datos
        Scanner a = new Scanner(System.in);

        //Introducimos los euros que queremos convertir a pesetas
        System.out.println("Ingrese la cantidad en € que quieres convertir: ");
        double euros = a.nextDouble();

        //Creamos la variable pesetas con la cantidad de pesetas que es un euro
        double pesetas = 166.386;

        //Ahora creamos la variable conversion para hacer la conversion de euros a pesetas, multiplicando los euros * pesetas
        double conversion = euros * pesetas;

        //Por ultimo imprimimos el resultado de la conversion, es decir, la variable conversion
        System.out.println(euros+" en pesetas es: "+conversion);
    }
}
