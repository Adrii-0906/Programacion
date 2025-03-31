import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio09 {
    public static void main(String[] args) {
        //Realiza un conversor de Mb a Kb.
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        double Mb;
        double kb = 1000;

        try {
            System.out.println("Ingrese el valor en Mb: ");
            Mb = Double.parseDouble(lector.readLine());

            double conversor = Mb * kb;

            System.out.println(Mb+"Mb son: "+conversor);

        } catch (Exception e) {
            System.out.println("Error en la lectura de los datros"+e.getMessage());
        }
    }
}
