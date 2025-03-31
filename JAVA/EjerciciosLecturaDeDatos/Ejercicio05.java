import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio05 {
    public static void main(String[] args) {
        //Escribe un programa que calcule el área de un rectángulo.
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        double base;
        double altura;

        try {
            System.out.println("Dime la base del rectangulo: ");
            base = Double.parseDouble(leer.readLine());

            System.out.println("Dime la altura del rectangulo: ");
            altura = Double.parseDouble(leer.readLine());

            double area = base*altura;
            System.out.println("El area del rectangulo es:"+area);

        } catch (Exception e) {
            System.out.println("Error al introducir la base o la altura del rectangulo");
        }
    }
}
