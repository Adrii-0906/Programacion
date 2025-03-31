import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio06 {
    public static void main(String[] args) {
        //Escribe un programa que calcule el área de un triángulo.
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double base;
        double altura;

        try {

            System.out.println("Ingrese el valor de base del triangulo: ");
            base = Double.parseDouble(leer.readLine());

            System.out.println("Ingrese el valor de altura del triangulo: ");
            altura = Double.parseDouble(leer.readLine());

            double area = (base*altura)/2;
            System.out.println("El area del triangulo es: "+area);

        } catch (Exception e) {
            System.out.println("Error al introducir los valores");
        }
    }
}
