import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio010 {
    public static void main(String[] args) {
        //Realiza un conversor de Kb a Mb.

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        double Kb;
        double Mb = 1000;

        try {
            System.out.println("Dime el valor en Kb: ");
            Kb = Double.parseDouble(lector.readLine());

            double conversor = Kb / Mb;
            System.out.println(Kb+"Kb son "+conversor+"Mb");

        }  catch (Exception e) {
            System.out.println("Error en la entrada de datos"+e.getMessage());
        }
    }
}
