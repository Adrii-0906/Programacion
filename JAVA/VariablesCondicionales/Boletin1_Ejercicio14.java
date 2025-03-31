import java.util.Scanner;

public class Boletin1_Ejercicio14 {
    public static void main(String[] args) {
        //Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una nota: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 1,2,3,4: System.out.println("INSUFICIENTE");
                break;
            case 5: System.out.println("SUFICIENTE");
                break;
            case 6: System.out.println("BIEN");
                break;
            case 7,8: System.out.println("NOTABLE");
                break;
            case 9,10: System.out.println("SOBRESALIENTE");
            break;
        }

    }
}
