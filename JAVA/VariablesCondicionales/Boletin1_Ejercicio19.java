import java.util.Scanner;

public class Boletin1_Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la primera fecha
        System.out.println("Fecha 1");
        System.out.println("Ingrese el dia: ");
        int dia1 = scanner.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes1 = scanner.nextInt();
        System.out.println("Ingrese el ano: ");
        int ano1 = scanner.nextInt();

        // Leer la segunda fecha
        // Leer la primera fecha
        System.out.println("Fecha 2");
        System.out.println("Ingrese el dia: ");
        int dia2 = scanner.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes2 = scanner.nextInt();
        System.out.println("Ingrese el ano: ");
        int ano2 = scanner.nextInt();

        // Calcular la diferencia en días
        int diferenciaDias = (dia2 - dia1) + 30 * (mes2 - mes1) + 365 * (ano2 - ano1);
        System.out.println("La diferencia en días es: " + diferenciaDias);
    }
}
