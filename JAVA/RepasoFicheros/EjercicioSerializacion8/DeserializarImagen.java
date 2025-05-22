package EjercicioSerializacion8;

import java.io.*;

public class DeserializarImagen {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("EjercicioSerializacion8/naruto.ser");
            byte[] datosRecuperados = (byte[]) fis.readAllBytes();
            fis.close();

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("EjercicioSerializacion8/naruto1.jpg"));
            oos.writeObject(datosRecuperados);
            oos.close();

        } catch (IOException e) {
            System.out.println("Error al leer imagen: " + e.getMessage());
        }
    }
}
