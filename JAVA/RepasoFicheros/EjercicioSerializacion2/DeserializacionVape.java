package EjercicioSerializacion2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializacionVape {

    public static void main(String[] args) {
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("EjercicioSerializacion2/vaper.dat"));
            Vaper vaper = (Vaper) input.readObject();
            System.out.println(vaper.toString());

        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
