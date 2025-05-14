package EjercicioSerializacion2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializacionVape {

    public static void main(String[] args) {
        Vaper vaper = new Vaper(1, "VapSolo", 20000);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("EjercicioSerializacion2/vaper.dat"));

            out.writeObject(vaper);

            out.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
