import java.util.Random;
import java.util.Scanner;

public class ColoresRandom {
    public static void main(String[] args) {
        //Crear una bandera con colores random
        Scanner entrada = new Scanner(System.in); // Importamos Scanner para poder hacer entradad de datos por teclado

        String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"}; //Creamos la array con los colores que queremos en la bandera
        System.out.println("Ingrese las franjas que quieres que contenga la bandera: ");
        int franja = entrada.nextInt(); // A la variable franja le asignamos le valor por teclado

        for (int i = 0; i < franja; i++) { // Ahora hacemos el for para que recorra todas las franjas que hemos indicado que tenga la bandera
            System.out.println("---------");
            System.out.println(color[(int) (Math.random() * color.length)]); // Imprimimos el color random en la badera  creada
            System.out.println("---------");
        }
    }
}
