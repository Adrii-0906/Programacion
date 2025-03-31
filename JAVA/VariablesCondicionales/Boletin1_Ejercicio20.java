import java.util.Scanner;

public class Boletin1_Ejercicio20 {
    public static void main(String[] args) {
        //Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
        Scanner entrada = new Scanner(System.in);

        int hora, horaNueva;
        int minuto, minutoNuevo;
        int segundo, segundoNuevo;
        String time, NewTime;

        System.out.println("Ingrese la hora del dia  ");
        hora = entrada.nextInt();
        System.out.println("Ingrese la minuto de la hora: ");
        minuto = entrada.nextInt();
        System.out.println("Ingrese la segundo del minuto: ");
        segundo = entrada.nextInt();

        time = hora+":"+minuto+":"+segundo;

        if (hora == 23 && minuto == 59 && segundo == 59) {
            segundoNuevo = 0;
            minutoNuevo = 0;
            horaNueva = 0;
            NewTime = horaNueva+":"+minutoNuevo+":"+segundoNuevo;
            System.out.println("Pasado un segundo la hora es: "+NewTime);
        } else if (minuto == 59 && segundo == 59) {
            segundoNuevo = 0;
            minutoNuevo = 0;
            horaNueva = hora + 1;
            NewTime = horaNueva+":"+minutoNuevo+":"+segundoNuevo;
            System.out.println("Pasado un segundo la hora es: "+NewTime);
        } else if (segundo == 59) {
            segundoNuevo = 0;
            minutoNuevo = minuto + 1;
            horaNueva = hora;
            NewTime = horaNueva+":"+minutoNuevo+":"+segundoNuevo;
            System.out.println("Pasado un segundo la hora es: "+NewTime);
        } else {
            segundoNuevo = segundo + 1;
            minutoNuevo = minuto;
            horaNueva = hora;
            NewTime = horaNueva+":"+minutoNuevo+":"+segundoNuevo;
            System.out.println("Pasado un segundo la hora es: "+NewTime);
        }
    }
}
