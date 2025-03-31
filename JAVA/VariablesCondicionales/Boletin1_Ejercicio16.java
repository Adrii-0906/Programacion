import java.util.Scanner;

public class Boletin1_Ejercicio16 {
    public static void main(String[] args) {
        //Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un dia: ");
        int dia = entrada.nextInt();
        System.out.println("Ingrese un mes: ");
        int mes = entrada.nextInt();
        System.out.println("Ingrese un año: ");
        int año = entrada.nextInt();

        String fecha = dia+"/"+mes+"/"+año;

        if (dia < 1) {
            System.out.println("La dia debe ser mayor que 1, la fecha es incorrecta");
        } else if (dia > 31) {
            System.out.println("El mes no tiene mas dias");
        } else if (mes < 1 && mes > 12) {
            System.out.println("El año no tiene mas meses");
        } else if (mes == 1 && mes == 3 && mes == 5 && mes == 7 && mes == 8 && mes == 10 && mes == 12 && dia <= 30) {
            System.out.println("El mes tiene 31 dias");
            System.out.println(fecha);
        } else if (mes == 2 && dia <= 28) {
            System.out.println("El mes tiene 28 dias");
            System.out.println(fecha);
        } else if (mes == 4 && mes == 6 && mes == 9 && mes == 11 && dia <= 30) {
            System.out.println("El mes tiene 30 dias");
            System.out.println(fecha);
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
}
