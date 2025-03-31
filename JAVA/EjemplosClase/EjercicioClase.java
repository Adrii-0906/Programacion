import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjercicioClase {
    public static void main(String[] args) {
        //Pedir el radio de un circulo y calcular su área. A=PI*r^2.

        //HAcemos el escaner para leer la entrada
        Scanner entrada = new Scanner(System.in);

        //Creamos la variable double pi, para asignarle a pi su valor
        double pi = Math.PI;

        //Hacemos una entrada por teclado, para introducir el radio
        System.out.println("Ingrese el radio del círculo: ");
        double radio =entrada.nextDouble();

        //Creamos la variable area donde hacemos la formula para calcular el área de un círculo
        double area;
        area = pi*radio*radio;
        //Imprimimos la variable área donde tenemos guardado el valor del área de un círculo
        System.out.println("El área del circulo es: "+area);

        //Ahora con Buffer

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        //Creamos las variables
        double r;
        double Pi = Math.PI;

        try { //Hacemos el try catch para verificar los datos sino el buffer no funciona
            //Introducimos por teclado el radio del circulo
            System.out.println("Ingrese el radio del circulo");
            r = Double.parseDouble(leer.readLine());

            //Creamos la varibale area par guardar la formula
            area = Pi*(r*r);
            System.out.println(area);

        } catch (Exception e) {
            System.out.println("Error al ingresar el radio");
        }
    }
}
