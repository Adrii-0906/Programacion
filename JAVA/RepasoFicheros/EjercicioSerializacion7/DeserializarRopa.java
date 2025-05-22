package EjercicioSerializacion7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializarRopa {

    public static void main(String[] args) {
        List<Ropa> ropaRecuperada = new ArrayList<>();
        try {
            ObjectInputStream fis = new ObjectInputStream(new FileInputStream("EjercicioSerializacion7/ropa.dat"));

            ropaRecuperada = (ArrayList<Ropa>) fis.readObject();
            System.out.println(ropaRecuperada.toString());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
