package EjercicioSerializacion9;

import java.io.*;

public class SerializacionImagen1 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("EjercicioSerializacion9/naruto.jpg");

            byte[] datos = (byte[]) fis.readAllBytes();
            fis.close();


            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("EjercicioSerializacion9/naruto.ser"));
            oos.writeObject(datos);
            oos.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
