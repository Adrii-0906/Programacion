import java.util.Scanner;

public class Boletin1_Ejercicio17 {
    public static void main(String[] args) {
        //Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos los meses tienen 30 días
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

        if (dia == 30 && mes == 12) {
            diaNuevo = 1;
            mesNuevo = 1;
            anoNuevo = ano + 1;
            fechaNueva = diaNuevo + "/" + mesNuevo + "/" + anoNuevo;
            System.out.println(fechaNueva);
        } else if (dia == 30) {
            diaNuevo = 1;
            mesNuevo = mes + 1;
            anoNuevo = ano;
            fechaNueva = diaNuevo + "/" + mesNuevo + "/" + anoNuevo;
            System.out.println("La nueva fecha es: "+fechaNueva);
        } else {
            diaNuevo = dia + 1;
            mesNuevo = mes;
            anoNuevo = ano;
            fechaNueva = diaNuevo + "/" + mesNuevo + "/" + anoNuevo;
            System.out.println("La nueva fecha es: "+fechaNueva);
        }
    }
}
