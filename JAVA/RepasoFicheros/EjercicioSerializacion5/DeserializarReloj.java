package EjercicioSerializacion5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializarReloj {

    public static void main(String[] args) {

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("EjercicioSerializacion5/reloj.dat"));

            Reloj reloj = (Reloj) ois.readObject();
            System.out.println(reloj.toString());

            ois.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
