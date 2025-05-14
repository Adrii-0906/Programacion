package EjercicioSerializacion5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarReloj {

    public static void main(String[] args) {
        Reloj reloj = new Reloj(1, "Lotus", 119.99);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("EjercicioSerializacion5/reloj.dat"));

            oos.writeObject(reloj);

            oos.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
