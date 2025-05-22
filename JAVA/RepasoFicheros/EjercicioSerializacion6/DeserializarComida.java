package EjercicioSerializacion6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializarComida {

    public static void main(String[] args) {

        try {
            ObjectInputStream fis = new ObjectInputStream(new FileInputStream("EjercicioSerializacion6/comida.ser"));

            Comida comida = (Comida) fis.readObject();
            System.out.println(comida.toString());
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
