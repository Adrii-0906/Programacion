package EjercicioSerializacion6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarComida {

    public static void main(String[] args) {

        Comida comida = new Comida(1, "Solomillo", "Carne");

        try {
            ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("EjercicioSerializacion6/comida.ser"));

            fos.writeObject(comida);
            fos.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
