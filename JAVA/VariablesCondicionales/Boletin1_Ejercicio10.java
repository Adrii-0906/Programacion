
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Boletin1_Ejercicio10 {
    public static void main(String[] args) {
        //Pedir tres números y mostrarlos ordenados de mayor a menor.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = entrada.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(num1);
        arrayList.add(num2);
        arrayList.add(num3);
        Collections.sort(arrayList, Collections.reverseOrder());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
