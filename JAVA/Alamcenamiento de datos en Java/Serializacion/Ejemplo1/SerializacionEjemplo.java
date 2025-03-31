package Serializacion.Ejemplo1;

import java.io.*;

public class SerializacionEjemplo {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan",38);

        // Serializar (Guardar un objecto en un archivo binario)
        String archivo = "src/persona.dat";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(p1);
            System.out.println("Objeto serializado: " + p1);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Deserializar un objeto de un archivo binario

//        try(ObjectInputStream in = new ObjectInputStream((new FileInputStream(archivo)))) {
//            System.out.println(in.readObject(archivo));
//            Persona p2 = new Persona("Pepi", 69);
//
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());;
//        }
    }
}
