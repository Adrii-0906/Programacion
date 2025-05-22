package EjercicioSerializacion8;

import java.io.*;

public class SerializacionImagen {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("EjercicioSerializacion9/naruto.jpg");
            byte[] datos = (byte[]) fis.readAllBytes();
            fis.close();

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("EjercicioSerializacion8/naruto.ser"));
            oos.writeObject(datos);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error al serializar: " + e.getMessage());
        }
    }
}
