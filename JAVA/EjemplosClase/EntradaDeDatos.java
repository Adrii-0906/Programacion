import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
        //Importamos Scanner para que escane la entrada por teclado
        Scanner prueba =new Scanner(System.in);

        //Ingrsar numero entero
        System.out.print("Ingrese un numero entero: ");
        int num_entero = prueba.nextInt();

        //Ingresar numero decimal con double
        System.out.print("Ingrese un numero: ");
        double num_decimal = prueba.nextDouble();

        //Ingresar una cadena de texto
        System.out.print("Ingrese una frase: ");
        //Ingresar una frase con nextLine
        String frase = prueba.next();

        //Igresar un caracter
        System.out.print("Ingrese un caracter: ");
        // Ingresar un caracter con char
        char caracter = prueba.next().charAt(0);

        //Imprimimos la entrada de datos
        System.out.println("El numero entero es "+ num_entero);
        System.out.println("El numero decimal es "+ num_decimal);
        System.out.println("La frase es "+ frase);
        System.out.println("El caracter es "+ caracter);

        //Crear un lector del Buffer
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        //Creamos tres variables
        String nombre;
        int edad;
        float numDec;


        try {
            System.out.println("Ingrese tu nombre: ");
            nombre = lector.readLine();

            System.out.println("Ingrese tu edad: ");
            edad = Integer.parseInt(lector.readLine()); //ParseInt(): Convierte una cadena de texto en un numero entero

            System.out.println("Ingrese un un numero decimal: ");
            numDec = Float.parseFloat(lector.readLine());

            System.out.println("Nombre: "+ nombre);
            System.out.println("Edad: "+ edad);
            System.out.println("Numero de decimal: "+ numDec);

        }   catch (Exception e) {
            System.out.println("Error al ingresar el nombre "+ e.getMessage());
        }
    }
}
