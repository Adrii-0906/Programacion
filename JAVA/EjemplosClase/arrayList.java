import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static void main(String[] args) {
        // Un arrayLista es lo que conociamos en Py como LISTA
        // ArrayList es una estructura de datos en Java que permite almacenar elementos de forma dinamica
        // Ventaja sobre Array: No necesita definir su tamaño de antemano

        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos en ArrayList
        nombres.add("Adrian");
        nombres.add("Salva");
        nombres.add("Ana");
        nombres.add("Oscar");

        // Imprimir el ArrayList con un System.out.println (sout)
        System.out.println("Lista de nombres: " + nombres);

        // Otro ejempplo
        String[] n = {"Adrian", "Salva", "Ana", "Oscar"};

        System.out.println("La lista de nombre es: "+Arrays.toString(n));

        // Acceder a un elemento especifico
        System.out.println("Primer nombre: "+nombres.get(0));
        System.out.println("Segundo nombre: "+nombres.get(1));

        // Cambiar un elemento
        nombres.set(1, "Javi");
        System.out.println("Nombre cambiado: "+nombres.get(1));

        /*
        add(): Metodo pra agregar item
        get(): Permite acceder a un elemento por su indice
        set(): Permite cambiar el elemento a traves de su indice
         */

    }
}
