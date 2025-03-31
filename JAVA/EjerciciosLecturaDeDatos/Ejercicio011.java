import java.util.Scanner;

public class Ejercicio011 {
    public static void main(String[] args) {
        //Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%
        Scanner a =  new Scanner(System.in);

        System.out.println("Ingresa la nota del primer examen: ");
        double nota1 = a.nextDouble();
        System.out.println("¿Que nota quieres sacar al final de curso? ");
        double notaDeseada = a.nextDouble();

        double nota2 = ((notaDeseada * 100) - (nota1 * 40)) / 60;

        System.out.println("Para obtener un "+notaDeseada+" necesitas un "+nota2+".");
    }
}
