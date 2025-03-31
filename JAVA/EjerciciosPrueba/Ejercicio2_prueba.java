import java.util.ArrayList;

public class Ejercicio2_prueba {
    public static void main(String[] args) {
        // Escribe un programa que genere 20 numeros aleatorios entre 0 y 100 y que los almacene en un array. El programa debe ser capaz de pasar todos los numeros pares a las primeras posiciones del array ( del 0 adelante) y todos los numeros impares alas celdas restantes. Utiliza array auxiliares si es necesario

        ArrayList<Integer> lista = new ArrayList<>();
        int num;

        for (num = 0; num < 20; num++) {
            lista.add((int) ((Math.random() * 100)+1));
            System.out.println(lista);
            if (num % 2 == 0) {
                lista.set(0, num);

            }else {
                lista.set(1, num);
            }
        }


    }
}
