package EjercicioSerializacion3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializacionAnimal {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Animal(1, "gato", "Ron"));
        animales.add(new Animal(1, "perro", "Terry"));

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("EjercicioSerializacion3/animal.dat"));

            out.writeObject(animales);

            out.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
