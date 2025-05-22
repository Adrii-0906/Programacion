package EjercicioSerializacion9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DeserializacionImagen {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("EjercicioSerializacion9/naruto.ser");

            byte[] datos = fis.readAllBytes();
            fis.close();

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("EjercicioSerializacion9/naruto1.jpg"));
            oos.writeObject(datos);
            oos.close();


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
