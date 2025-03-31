import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación.

        //Hacemos un scanner para leer los datos
        Scanner a = new Scanner(System.in);

        //Introducimos los datos por teclado
        System.out.println("Ingrese el primer numero: ");
        int num1 = a.nextInt();
        //Volvemos a introducir datos
        System.out.println("Ingrese el segundo numero: ");
        int num2 = a.nextInt();

        //Creamos la variable operacion para almacenar el resultado de la operación
        int operacion = num1 * num2;
        //Imprimimos la la variable operación con el resultado
        System.out.println("El resultado de la operación "+num1+" * "+num2+" = "+operacion);
    }
}
