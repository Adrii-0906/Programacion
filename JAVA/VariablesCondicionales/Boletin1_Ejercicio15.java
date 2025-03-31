import java.util.Scanner;

public class Boletin1_Ejercicio15 {
    public static void main(String[] args) {
        //Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.
        Scanner entrada = new Scanner(System.in);

        int dia;
        int mes;
        int ano;

        System.out.println("Ingrese el dia del mes: ");
        dia = entrada.nextInt();
        System.out.println("Ingrese el mes del ano: ");
        mes = entrada.nextInt();
        System.out.println("Ingrese el ano: ");
        ano = entrada.nextInt();

        String fecha = dia + "/" + mes + "/" + ano;

        if (dia >= 1 && dia <= 30) {
            System.out.println(fecha);
        } else if (mes >= 1 && mes <=12) {
            System.out.println(fecha);
        } else {
            System.out.println("La fecha no es valida");
        }
    }
}
