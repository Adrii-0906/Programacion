package Serializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializarCoche {

    public static void main(String[] args) {

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("/home/adrian/Documentos/1DAM/Programación/JAVA/RepasoFicheros/Serializacion/Coche.ser"));
             Coche coche = (Coche) in.readObject();
            System.out.println(coche.toString());
            in.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
