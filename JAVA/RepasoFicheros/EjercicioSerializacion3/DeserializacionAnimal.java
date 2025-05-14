package EjercicioSerializacion3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializacionAnimal {

    public static void main(String[] args) {
        List<Animal> animalesRecuperados;
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("EjercicioSerializacion3/animal.dat"));

            animalesRecuperados = (ArrayList<Animal>) input.readObject();

            for (Animal a : animalesRecuperados) {
                System.out.println(a);
            }

            input.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
