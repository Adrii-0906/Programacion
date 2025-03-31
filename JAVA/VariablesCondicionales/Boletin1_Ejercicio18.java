import java.util.Scanner;

public class Boletin1_Ejercicio18 {
    public static void main(String[] args) {
        //Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 días).
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
        System.out.println("Fecha de hoy: " + fecha);

        String fechaNueva;
        int diaNuevo;
        int mesNuevo;
        int anoNuevo;

        if (dia == 31 && mes == 12) {
            diaNuevo = 1;
            mesNuevo = 1;
            anoNuevo = ano + 1;
            fechaNueva = diaNuevo + "/" + mesNuevo + "/" + anoNuevo;
            System.out.println("La nueva fecha es: " + fechaNueva);
        } else if (dia == 30) {
            diaNuevo = 1;
            mesNuevo = mes + 1;
            anoNuevo = ano;
            fechaNueva = diaNuevo + "/" + mesNuevo + "/" + anoNuevo;
            System.out.println("La nueva fecha es: " + fechaNueva);

        } else if (mes == 2 && dia == 28) {
            diaNuevo = 1;
            mesNuevo = mes + 1;
            anoNuevo = ano;
            fechaNueva = diaNuevo + "/" + mesNuevo + "/" + anoNuevo;
            System.out.println("La nueva fecha es: " + fechaNueva);
        } else if (dia == 31 && mes == 1 ||dia == 31 && mes == 3 ||dia == 31 && mes == 5 ||dia == 31 && mes == 7 ||dia == 31 && mes == 8 ||dia == 31 && mes == 10) {
            diaNuevo = 1;
            mesNuevo = mes + 1;
            anoNuevo = ano;
            fechaNueva = diaNuevo + "/" + mesNuevo + "/" + anoNuevo;
            System.out.println("La nueva fecha es: " + fechaNueva);
        } else if (dia == 30 && mes == 4 ||dia == 30 && mes == 6 ||dia == 30 && mes == 9 ||dia == 30 && mes == 11) {
            diaNuevo = 1;
            mesNuevo = mes + 1;
            anoNuevo = ano;
            fechaNueva = diaNuevo + "/" + mesNuevo + "/" + anoNuevo;
            System.out.println("La nueva fecha es: " + fechaNueva);
        } else {
            diaNuevo = dia + 1;
            mesNuevo = mes;
            anoNuevo = ano;
            fechaNueva = diaNuevo + "/" + mesNuevo + "/" + anoNuevo;
            System.out.println("La nueva fecha es: "+fechaNueva);
        }
    }
}
