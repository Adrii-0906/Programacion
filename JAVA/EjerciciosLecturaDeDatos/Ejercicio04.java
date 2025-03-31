import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado.
        Scanner a = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        double num1 = a.nextDouble();

        System.out.println("Ingrese otro numero: ");
        double num2 = a.nextDouble();

        System.out.println(num1+" + "+num2+" = " + (num1+num2));
        System.out.println(num1+" - "+num2+" = " + (num1-num2));
        System.out.println(num1+" * "+num2+" = " + (num1*num2));
        System.out.println(num1+" / "+num2+" = " + (num1/num2));
    }
}
