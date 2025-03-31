import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        //Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.

        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese las horas de trabajadas: ");
        int horasTrabajadas = a.nextInt();
        double salarioSemanal = horasTrabajadas * 12;

        System.out.println("Su salario trabajando "+horasTrabajadas+" horas, es de "+salarioSemanal+"€");
    }
}
