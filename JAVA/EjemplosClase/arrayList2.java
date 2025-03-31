import java.util.ArrayList;

public class arrayList2 {
    public static void main(String[] args) {
        // Realizar operaciones de:
        // iteracion y multiplicacion de elementos

        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Platanos");
        frutas.add("Cereza");
        frutas.add("Aceituna");

        // Metodo tradicional
        for (int i = 0; i < frutas.size(); i++) { // size es igual a length, pero se usa en ArrayList
            System.out.println("Fruta "+ (i + 1)+ ": " + frutas.get(i));
        }

        // Utilizando for each
        for (String item : frutas) {
            System.out.println("Fruta: " + item);
        }

        // Eliminar un elemento
        frutas.remove(1);
        frutas.remove("Cereza");
        System.out.println(frutas);

        // ArrayList de enteros donde se emplee lo siguiente:
        //Buscar un elemento
        // Clonar o copiar el ArrayList
        // Vaciar a limpiar los elementos del ArrayList

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Buscar un elemento. Si exsiste
        int numeroBuscado = 5;
        if (numeros.contains(numeroBuscado)) {
            System.out.println("El numero "+ numeroBuscado + " esta en la lista");
        } else {
            System.out.println("El numero "+ numeroBuscado + " no esta en la lista");
        }

        // Clonar o copiar el ArrayList
        ArrayList<Integer> copiaNumeros = (ArrayList<Integer>) numeros.clone();
        System.out.println("Copia de la lista numeros: "+ copiaNumeros);

        // Vaciar o limpiar el ArrayList
        numeros.clear();
        System.out.println("Lista original de la lista vacia: "+numeros);
    }
}
