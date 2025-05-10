package Serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarCoche {

    public static void main(String[] args) {
        Coche coche = new Coche("Ford", "Focus", 10000);

        try {
            FileOutputStream fileout = new FileOutputStream("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/Serializacion/Coche.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);

            out.writeObject(coche);
            out.close();
            fileout.close();
            System.out.println("Objeto guardado");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
