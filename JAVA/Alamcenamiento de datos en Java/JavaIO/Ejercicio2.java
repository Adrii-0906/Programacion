import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Argumento encontrado: " + args[0]);
        } else {
            System.out.println("Argumento no entontrado");
        }
    }
}
