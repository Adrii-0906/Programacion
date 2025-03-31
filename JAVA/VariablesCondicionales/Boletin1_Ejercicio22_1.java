import java.util.Scanner;

public class Boletin1_Ejercicio22_1 {
    public static void main(String[] args) {
        //Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56 mostrar: cincuenta y seis.
        Scanner entrada = new Scanner(System.in);

        int numero;
        int unidades, decenas;

        System.out.println("Ingrese un numero(0-99)");
        numero = entrada.nextInt();

        unidades = numero % 10;
        decenas = numero / 10;

        if (numero >= 0 && numero < 10) {
            switch (unidades) {
                case 0:
                    System.out.print("cero");
                    break;
                case 1:
                    System.out.print("uno");
                    break;
                case 2:
                    System.out.print("dos");
                    break;
                case 3:
                    System.out.print("tres");
                    break;
                case 4:
                    System.out.print("cuatro");
                    break;
                case 5:
                    System.out.print("cinco");
                    break;
                case 6:
                    System.out.print("seis");
                    break;
                case 7:
                    System.out.print("siete");
                    break;
                case 8:
                    System.out.print("ocho");
                    break;
                case 9:
                    System.out.print("nueve");
                    break;
            }
        } else if (numero > 10 && numero < 20) {
            switch (unidades) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("once");
                    break;
                case 2:
                    System.out.print("doce");
                    break;
                case 3:
                    System.out.print("trece");
                    break;
                case 4:
                    System.out.print("catorce");
                    break;
                case 5:
                    System.out.print("quince");
                    break;
                case 6:
                    System.out.print("dieciseis");
                    break;
                case 7:
                    System.out.print("diecisiete");
                    break;
                case 8:
                    System.out.print("dieciocho");
                    break;
                case 9:
                    System.out.print("diecinueve");
                    break;
            }
        } else if (numero > 20 && numero < 99) {
            switch (decenas) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("diez");
                    break;
                case 2:
                    System.out.print("veinte");
                    break;
                case 3:
                    System.out.print("treinta");
                    break;
                case 4:
                    System.out.print("cuarenta");
                    break;
                case 5:
                    System.out.print("cincuenta");
                    break;
                case 6:
                    System.out.print("sesenta");
                    break;
                case 7:
                    System.out.print("setenta");
                    break;
                case 8:
                    System.out.print("ochenta");
                    break;
                case 9:
                    System.out.print("noventa");
                    break;
            }
            System.out.print(" y ");
            switch (unidades) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("uno");
                    break;
                case 2:
                    System.out.print("dos");
                    break;
                case 3:
                    System.out.print("tres");
                    break;
                case 4:
                    System.out.print("cuatro");
                    break;
                case 5:
                    System.out.print("cinco");
                    break;
                case 6:
                    System.out.print("seis");
                    break;
                case 7:
                    System.out.print("siete");
                    break;
                case 8:
                    System.out.print("ocho");
                    break;
                case 9:
                    System.out.print("nueve");
                    break;
            }
        }
    }
}
