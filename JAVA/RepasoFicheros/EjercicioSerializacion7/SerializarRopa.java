package EjercicioSerializacion7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializarRopa {

    public static void main(String[] args) {
        ArrayList<Ropa> ropas = new ArrayList<>();
        ropas.add(new Ropa(1, "Berska", "Camiseta"));
        ropas.add(new Ropa(2,"Celopman", "Chinos"));

        try {
            ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("EjercicioSerializacion7/ropa.dat"));

            fos.writeObject(ropas);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
