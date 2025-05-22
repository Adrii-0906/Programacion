package src.examen;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que permite serializar y deserializar una lista de objetos Persona.
 */
public class SerializadorObjetos {

    /**
     * Serializa una lista de personas en un archivo binario.
     */
    public static void guardarPersonas(List<Persona> personas, String rutaArchivo) {
        // TODO: Implementar serialización con ObjectOutputStream
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
            oos.writeObject(personas);
            oos.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Deserializa una lista de personas desde un archivo binario.
     */
    public static List<Persona> cargarPersonas(String rutaArchivo) {
        // TODO: Implementar deserialización con ObjectInputStream

        List<Persona> personasRucuperadas = new ArrayList<>();

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo));

            personasRucuperadas = (ArrayList<Persona>) ois.readObject();

            System.out.println(personasRucuperadas.toString());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return personasRucuperadas;
    }

    public static void main(String[] args) {
        String ruta = "resources/personas.dat";

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Luis", 30));

        guardarPersonas(personas, ruta);
        List<Persona> cargadas = cargarPersonas(ruta);

        for (Persona p : cargadas) {
            System.out.println(p);
        }
    }
}

